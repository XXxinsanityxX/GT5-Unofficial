package gregtech.common.covers;

import gregtech.api.interfaces.tileentity.ICoverable;
import gregtech.api.interfaces.tileentity.IMachineProgress;
import gregtech.api.util.GT_CoverBehavior;
import gregtech.api.util.GT_Utility;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fluids.Fluid;

public class GT_Cover_Arm
        extends GT_CoverBehavior {
    public final int mTickRate;
    //msb converted, 2nd : direction (1=export)
    //right 14 bits: internalSlot, next 14 bits adjSlot, 0 = all, slot = -1
    protected final static int EXPORT_MASK = 0x40000000;
    protected final static int SLOT_ID_MASK = 0x3FFF;
    protected final static int SLOT_ID_MIN = 0;
    protected final static int CONVERTED_BIT = 0x80000000;

    public GT_Cover_Arm(int aTickRate) {
        this.mTickRate = aTickRate;
    }

    public int doCoverThings(byte aSide, byte aInputRedstone, int aCoverID, int aCoverVariable, ICoverable aTileEntity, long aTimer) {
        if ((((aTileEntity instanceof IMachineProgress)) && (!((IMachineProgress) aTileEntity).isAllowedToWork()))) {
            return aCoverVariable;
        }

        //Convert from ver. 5.09.33.50, check if 3 last bits are equal
        if ((aCoverVariable >>> 29) == 0) {
            aCoverVariable = CONVERTED_BIT | (((aCoverVariable + 1) & SLOT_ID_MASK) << 14) | EXPORT_MASK;
        } else if ((aCoverVariable >>> 29) == 7) {
            aCoverVariable = CONVERTED_BIT | Math.min(Math.abs(aCoverVariable - 1), SLOT_ID_MASK);
        }

        TileEntity toTile, fromTile;
        int toSlot, fromSlot;

        if ((aCoverVariable & EXPORT_MASK) > 0) {
            fromTile = (TileEntity) aTileEntity;
            toTile = aTileEntity.getTileEntityAtSide(aSide);
            fromSlot = aCoverVariable & SLOT_ID_MASK;
            toSlot = (aCoverVariable >> 14) & SLOT_ID_MASK;
        } else {
            fromTile = aTileEntity.getTileEntityAtSide(aSide);
            toTile = (TileEntity) aTileEntity;
            fromSlot = (aCoverVariable >> 14) & SLOT_ID_MASK;
            toSlot = aCoverVariable & SLOT_ID_MASK;
        }

        byte movedItems = 0;
        if (fromSlot > 0 && toSlot > 0) {
            if (fromTile instanceof IInventory && toTile instanceof IInventory)
                movedItems = GT_Utility.moveFromSlotToSlot((IInventory) fromTile, (IInventory) toTile, fromSlot - 1, toSlot - 1, null, false, (byte) 64, (byte) 1, (byte) 64, (byte) 1);
        } else if (toSlot > 0) {
            byte side;
            if ((aCoverVariable & EXPORT_MASK) > 0)
                side = aSide;
            else
                side = GT_Utility.getOppositeSide(aSide);
            movedItems = GT_Utility.moveOneItemStackIntoSlot(fromTile, toTile, side, toSlot - 1, null, false, (byte) 64, (byte) 1, (byte) 64, (byte) 1);
        } else if (fromSlot > 0) {
            byte toSide;
            if ((aCoverVariable & EXPORT_MASK) > 0)
                toSide = aSide;
            else
                toSide = GT_Utility.getOppositeSide(aSide);
            if (fromTile instanceof IInventory)
                movedItems = GT_Utility.moveFromSlotToSide((IInventory) fromTile, toTile, fromSlot - 1, toSide, null, false, (byte) 64, (byte) 1, (byte) 64, (byte) 1);
        } else {
            byte fromSide, toSide;
            if ((aCoverVariable & EXPORT_MASK) > 0) {
                fromSide = aSide;
                toSide = GT_Utility.getOppositeSide(aSide);
            } else {
                fromSide = GT_Utility.getOppositeSide(aSide);
                toSide = aSide;
            }
            movedItems = GT_Utility.moveOneItemStack(fromTile, toTile, fromSide, toSide, null, false, (byte) 64, (byte) 1, (byte) 64, (byte) 1);
        }

        return aCoverVariable;
    }

    public int onCoverScrewdriverclick(byte aSide, int aCoverID, int aCoverVariable, ICoverable aTileEntity, EntityPlayer aPlayer, float aX, float aY, float aZ) {
        int step = 0;
        if (GT_Utility.getClickedFacingCoords(aSide, aX, aY, aZ)[0] >= 0.5F) {
            step += aPlayer.isSneaking() ? 256 : 16;
        } else {
            step -= aPlayer.isSneaking() ? 256 : 16;
        }
        aCoverVariable = getNewVar(aCoverVariable, step);
        sendMessageToPlayer(aPlayer, aCoverVariable);
        return aCoverVariable;
    }

    public boolean onCoverRightclick(byte aSide, int aCoverID, int aCoverVariable, ICoverable aTileEntity, EntityPlayer aPlayer, float aX, float aY, float aZ) {
        int step = (GT_Utility.getClickedFacingCoords(aSide, aX, aY, aZ)[0] >= 0.5F) ? 1 : -1;
        aCoverVariable = getNewVar(aCoverVariable, step);
        sendMessageToPlayer(aPlayer, aCoverVariable);
        aTileEntity.setCoverDataAtSide(aSide, aCoverVariable);
        return true;
    }

    private void sendMessageToPlayer(EntityPlayer aPlayer, int var) {
        if ((var & EXPORT_MASK) != 0)
            GT_Utility.sendChatToPlayer(aPlayer, trans("001", "Puts out into adjacent Slot #") + (((var >> 14) & SLOT_ID_MASK) - 1));
        else
            GT_Utility.sendChatToPlayer(aPlayer, trans("002", "Grabs in for own Slot #") + ((var & SLOT_ID_MASK) - 1));
    }

    private int getNewVar(int var, int step) {
        int intSlot = (var & SLOT_ID_MASK);
        int adjSlot = (var >> 14) & SLOT_ID_MASK;
        if ((var & EXPORT_MASK) == 0) {
            int x = (intSlot + step);
            if (x > SLOT_ID_MASK)
                return createVar(0, SLOT_ID_MASK, 0);
            else if (x < 1)
                return createVar(-step - intSlot + 1, 0, EXPORT_MASK);
            else
                return createVar(0, x, 0);
        } else {
            int x = (adjSlot - step);
            if (x > SLOT_ID_MASK)
                return createVar(SLOT_ID_MASK, 0, EXPORT_MASK);
            else if (x < 1)
                return createVar(0, +step - adjSlot + 1, 0);
            else
                return createVar(x, 0, EXPORT_MASK);
        }
    }

    private int createVar(int adjSlot, int intSlot, int export) {
        return CONVERTED_BIT | export | ((adjSlot & SLOT_ID_MASK) << 14) | (intSlot & SLOT_ID_MASK);
    }

    public boolean letsRedstoneGoIn(byte aSide, int aCoverID, int aCoverVariable, ICoverable aTileEntity) {
        return true;
    }

    public boolean letsRedstoneGoOut(byte aSide, int aCoverID, int aCoverVariable, ICoverable aTileEntity) {
        return true;
    }

    public boolean letsEnergyIn(byte aSide, int aCoverID, int aCoverVariable, ICoverable aTileEntity) {
        return true;
    }

    public boolean letsEnergyOut(byte aSide, int aCoverID, int aCoverVariable, ICoverable aTileEntity) {
        return true;
    }

    public boolean letsFluidIn(byte aSide, int aCoverID, int aCoverVariable, Fluid aFluid, ICoverable aTileEntity) {
        return true;
    }

    public boolean letsFluidOut(byte aSide, int aCoverID, int aCoverVariable, Fluid aFluid, ICoverable aTileEntity) {
        return true;
    }

    public boolean letsItemsIn(byte aSide, int aCoverID, int aCoverVariable, int aSlot, ICoverable aTileEntity) {
        return true;
    }

    public boolean letsItemsOut(byte aSide, int aCoverID, int aCoverVariable, int aSlot, ICoverable aTileEntity) {
        return true;
    }

    public boolean alwaysLookConnected(byte aSide, int aCoverID, int aCoverVariable, ICoverable aTileEntity) {
        return true;
    }

    public int getTickRate(byte aSide, int aCoverID, int aCoverVariable, ICoverable aTileEntity) {
        return this.mTickRate;
    }
}