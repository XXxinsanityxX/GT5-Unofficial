package gregtech.common.tileentities.storage;

import gregtech.api.enums.Textures;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.implementations.GT_MetaTileEntity_BasicTank;
import gregtech.api.objects.GT_RenderedTexture;
import gregtech.api.util.GT_Utility;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidHandler;

public class GT_MetaTileEntity_TankBasic extends GT_MetaTileEntity_BasicTank {
    public boolean OutputFluid = false;

    public GT_MetaTileEntity_TankBasic(int aID, String aName, String aNameRegional, int aTier) {
        super(aID, aName, aNameRegional, aTier, 3, new String[]{
                "Stores " + CommonSizeCompute(aTier) + "L of fluid",
                "Use Screwdriver to enable output mode"});
    }

    public GT_MetaTileEntity_TankBasic(String aName, int aTier, String aDescription, ITexture[][][] aTextures) {
        super(aName, aTier, 3, aDescription, aTextures);
    }

    @Override
    public MetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new GT_MetaTileEntity_TankBasic(mName, mTier, mDescription, mTextures);
    }

    @Override
    public ITexture[][][] getTextureSet(ITexture[] aTextures) {
        return new ITexture[0][0][0];
    }

    @Override
    public ITexture[] getTexture(IGregTechTileEntity aBaseMetaTileEntity, byte aSide, byte aFacing, byte aColorIndex, boolean aActive, boolean aRedstone) {
        return aSide != aFacing
                ? aSide == 1
                ? new ITexture[]{Textures.BlockIcons.STORAGESTUFF[mTier][aColorIndex + 1]}
                : new ITexture[]{Textures.BlockIcons.STORAGESTUFF[mTier][aColorIndex + 1]}
                : aActive
                ? getTexturesActive(Textures.BlockIcons.STORAGESTUFF[mTier][aColorIndex + 1])
                : getTexturesInactive(Textures.BlockIcons.STORAGESTUFF[mTier][aColorIndex + 1]);
    }

    public ITexture[] getTexturesActive(ITexture aBaseTexture) {
        return new ITexture[]{aBaseTexture, new GT_RenderedTexture(Textures.BlockIcons.OVERLAY_PIPE_OUT)};
    }

    public ITexture[] getTexturesInactive(ITexture aBaseTexture) {
        return new ITexture[]{aBaseTexture, new GT_RenderedTexture(Textures.BlockIcons.OVERLAY_PIPE_OUT)};
    }

    public void onPostTick(IGregTechTileEntity aBaseMetaTileEntity, long aTick) {
        super.onPostTick(aBaseMetaTileEntity, aTick);
        if (aBaseMetaTileEntity.isServerSide() && aBaseMetaTileEntity.isAllowedToWork() && (aTick&0x7)==0){
            IFluidHandler tTank = aBaseMetaTileEntity.getITankContainerAtSide(aBaseMetaTileEntity.getFrontFacing());
            if (tTank != null) {
                if (this.OutputFluid) {
                    FluidStack tDrained = aBaseMetaTileEntity.drain(ForgeDirection.getOrientation(aBaseMetaTileEntity.getFrontFacing()), Math.max(1, mFluid.amount), false);
                    if (tDrained != null) {
                        int tFilledAmount = tTank.fill(ForgeDirection.getOrientation(aBaseMetaTileEntity.getBackFacing()), tDrained, false);
                        if (tFilledAmount > 0) {
                            tTank.fill(ForgeDirection.getOrientation(aBaseMetaTileEntity.getBackFacing()), aBaseMetaTileEntity.drain(ForgeDirection.getOrientation(aBaseMetaTileEntity.getFrontFacing()), tFilledAmount, true), true);
                        }
                    }
                }
            }
        }
    }

    public void saveNBTData(NBTTagCompound aNBT) {
        aNBT.setBoolean("OutputFluid", this.OutputFluid);
        super.saveNBTData(aNBT);
    }

    public void loadNBTData(NBTTagCompound aNBT) {
        super.loadNBTData(aNBT);
        this.OutputFluid = aNBT.getBoolean("OutputFluid");
    }

    public void onScrewdriverRightClick(byte aSide, EntityPlayer aPlayer, float aX, float aY, float aZ) {
        super.onScrewdriverRightClick(aSide, aPlayer, aX, aY, aZ);
        this.OutputFluid = !OutputFluid;
        if (!this.OutputFluid) {
            GT_Utility.sendChatToPlayer(aPlayer, "Fluid Output Disabled");
        } else {
            GT_Utility.sendChatToPlayer(aPlayer, "Fluid Output Enabled");
        }
    }

    @Override
    public boolean onRightclick(IGregTechTileEntity aBaseMetaTileEntity, EntityPlayer aPlayer) {
        if (aBaseMetaTileEntity.isClientSide()) return true;
        aBaseMetaTileEntity.openGUI(aPlayer);
        return true;
    }

    @Override
    public boolean allowPullStack(IGregTechTileEntity aBaseMetaTileEntity, int aIndex, byte aSide, ItemStack aStack) {
        return aIndex == 1;
    }

    @Override
    public boolean allowPutStack(IGregTechTileEntity aBaseMetaTileEntity, int aIndex, byte aSide, ItemStack aStack) {
        return aIndex == 0;
    }

    @Override
    public boolean isLiquidInput(byte aSide) {
        if (this.OutputFluid) {
            return aSide != getBaseMetaTileEntity().getFrontFacing();
        }
        return true;
    }

    @Override
    public boolean isLiquidOutput(byte aSide) {
        return aSide == getBaseMetaTileEntity().getFrontFacing() && OutputFluid;
    }

    @Override
    public boolean isSimpleMachine() {
        return true;
    }

    @Override
    public boolean isFacingValid(byte aFacing) {
        return true;
    }

    @Override
    public boolean isAccessAllowed(EntityPlayer aPlayer) {
        return true;
    }

    @Override
    public final byte getUpdateData() {
        return 0x00;
    }

    @Override
    public boolean doesFillContainers() {
        return true;
    }

    @Override
    public boolean doesEmptyContainers() {
        return true;
    }

    @Override
    public boolean canTankBeFilled() {
        return true;
    }

    @Override
    public boolean canTankBeEmptied() {
        return true;
    }

    @Override
    public boolean displaysItemStack() {
        return true;
    }

    @Override
    public boolean displaysStackSize() {
        return false;
    }

    @Override
    public String[] getInfoData() {

        if (mFluid == null) {
            return new String[]{
                    EnumChatFormatting.BLUE + "Basic Tank" + EnumChatFormatting.RESET, "Stored Fluid:",
                    EnumChatFormatting.GOLD + "No Fluid" + EnumChatFormatting.RESET,
                    EnumChatFormatting.GREEN + Integer.toString(0) + " L" + EnumChatFormatting.RESET + " " +
                            EnumChatFormatting.YELLOW + getCapacity() + " L" + EnumChatFormatting.RESET
            };
        }
        return new String[]{
                EnumChatFormatting.BLUE + "Basic Tank" + EnumChatFormatting.RESET, "Stored Fluid:",
                EnumChatFormatting.GOLD + mFluid.getLocalizedName() + EnumChatFormatting.RESET,
                EnumChatFormatting.GREEN + Integer.toString(mFluid.amount) + " L" + EnumChatFormatting.RESET + " " +
                        EnumChatFormatting.YELLOW + getCapacity() + " L" + EnumChatFormatting.RESET
        };
    }

    @Override
    public boolean isGivingInformation() {
        return true;
    }

    private static int CommonSizeCompute(int tier) {
        switch (tier) {
            case 0:
                return 16000;
            case 1:
                return 32000;
            case 2:
                return 64000;
            case 3:
                return 128000;
            case 4:
                return 256000;
            default:
                return 0;
        }
    }

    @Override
    public int getCapacity() {
        return CommonSizeCompute(mTier);
    }

    @Override
    public int getTankPressure() {
        return 100;
    }
}