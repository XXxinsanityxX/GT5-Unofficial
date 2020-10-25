package gregtech.common.tileentities.machines.multi;

import gregtech.api.GregTech_API;
import gregtech.api.enums.Textures;
import gregtech.api.interfaces.ITexture;
import gregtech.api.interfaces.metatileentity.IMetaTileEntity;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import gregtech.api.metatileentity.implementations.GT_MetaTileEntity_MultiBlockBase;
import gregtech.api.objects.GT_RenderedTexture;
import gregtech.api.util.GT_Recipe;
import gregtech.api.util.GT_Utility;
import gregtech.common.tileentities.machines.multi.gui.GT_GUIContainer_CokeOven;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidStack;

import java.util.ArrayList;


public class GT_MetaTileEntity_CokeOven extends GT_MetaTileEntity_MultiBlockBase {
    public GT_MetaTileEntity_CokeOven(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    public GT_MetaTileEntity_CokeOven(String aName) {
        super(aName);
    }

    public IMetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
        return new GT_MetaTileEntity_CokeOven(this.mName);
    }

    public String[] getDescription() {
        return new String[]{
                "Controller Block for the Coke Oven",
                "Size(WxHxD): 3x3x3 (Hollow), Controller (Front centered)",
                "1x Primitive Input Bus (Any casing)",
                "1x Primitive Output Bus (Any casing)",
                "1x Primitive Output Hatch (Any casing)",
                "Coke Oven Bricks for the rest"
        };
    }

    public ITexture[] getTexture(IGregTechTileEntity aBaseMetaTileEntity, byte aSide, byte aFacing, byte aColorIndex, boolean aActive, boolean aRedstone) {
        if (aSide == aFacing) {
            return new ITexture[]{Textures.BlockIcons.casingTexturePages[1][50], new GT_RenderedTexture(aActive ? Textures.BlockIcons.OVERLAY_COKE_OVEN_BRICK_ACTIVE : Textures.BlockIcons.OVERLAY_COKE_OVEN_BRICK)};
        }
        return new ITexture[]{Textures.BlockIcons.casingTexturePages[1][50]};
    }

    public Object getClientGUI(int aID, InventoryPlayer aPlayerInventory, IGregTechTileEntity aBaseMetaTileEntity) {
        return new GT_GUIContainer_CokeOven(aPlayerInventory, aBaseMetaTileEntity, getLocalName(), "CokeOven.png", GT_Recipe.GT_Recipe_Map.sCokeOvenRecipes.mNEIName);
    }

    public GT_Recipe.GT_Recipe_Map getRecipeMap() {
        return GT_Recipe.GT_Recipe_Map.sCokeOvenRecipes;
    }

    public boolean isCorrectMachinePart(ItemStack aStack) {
        return true;
    }

    public boolean isFacingValid(byte aFacing) {
        return aFacing > 1;
    }

    @Override
    public boolean checkRecipe(ItemStack aStack) {
        ArrayList<ItemStack> tInputList = getStoredInputs();
        int tInputList_sS = tInputList.size();
        for (int i = 0; i < tInputList_sS - 1; i++) {
            for (int j = i + 1; j < tInputList_sS; j++) {
                if (GT_Utility.areStacksEqual(tInputList.get(i),tInputList.get(j))) {
                    if ((tInputList.get(i)).stackSize >= (tInputList.get(j)).stackSize) {
                        tInputList.remove(j--);
                        tInputList_sS = tInputList.size();
                    } else {
                        tInputList.remove(i--);
                        tInputList_sS = tInputList.size();
                        break;
                    }
                }
            }
        }
        tInputList.add(mInventory[1]);
        ItemStack[] inputs = tInputList.toArray(new ItemStack[tInputList.size()]);

        ArrayList<FluidStack> tFluidList = getStoredFluids();
        int tFluidList_sS = tFluidList.size();
        for (int i = 0; i < tFluidList_sS - 1; i++) {
            for (int j = i + 1; j < tFluidList_sS; j++) {
                if (GT_Utility.areFluidsEqual(tFluidList.get(i), tFluidList.get(j))) {
                    if (tFluidList.get(i).amount >= tFluidList.get(j).amount) {
                        tFluidList.remove(j--);
                        tFluidList_sS = tFluidList.size();
                    } else {
                        tFluidList.remove(i--);
                        tFluidList_sS = tFluidList.size();
                        break;
                    }
                }
            }
        }
        FluidStack[] fluids = tFluidList.toArray(new FluidStack[tFluidList.size()]);

        if (inputs.length > 0 || fluids.length > 0) {
            GT_Recipe recipe = GT_Recipe.GT_Recipe_Map.sCokeOvenRecipes.findRecipe(getBaseMetaTileEntity(), false,
                    false, 0, fluids, inputs);
            if (recipe != null && recipe.isRecipeInputEqual(true, fluids, inputs)) {
                this.mEfficiency = 10000;
                this.mEfficiencyIncrease = 10000;

                int maxProgresstime = recipe.mDuration;
                this.mEUt = 0;
                this.mMaxProgresstime = maxProgresstime;
                mOutputItems = new ItemStack[recipe.mOutputs.length];
                for (int i = 0; i < recipe.mOutputs.length; i++) {
                    if (getBaseMetaTileEntity().getRandomNumber(10000) < recipe.getOutputChance(i)) {
                        this.mOutputItems[i] = recipe.getOutput(i);
                    }
                }
                this.mOutputFluids = recipe.mFluidOutputs;
                this.updateSlots();
                return true;
            }
        }
        return false;
    }

    public boolean checkMachine(IGregTechTileEntity aBaseMetaTileEntity, ItemStack aStack) {
        int xDir = ForgeDirection.getOrientation(aBaseMetaTileEntity.getBackFacing()).offsetX;
        int zDir = ForgeDirection.getOrientation(aBaseMetaTileEntity.getBackFacing()).offsetZ;
        if (!aBaseMetaTileEntity.getAirOffset(xDir, 0, zDir)) {
            return false;
        }
        int tAmount = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                for (int h = -1; h < 2; h++) {
                    if ((h != 0) || (((xDir + i != 0) || (zDir + j != 0)) && ((i != 0) || (j != 0)))) {
                        IGregTechTileEntity tTileEntity = aBaseMetaTileEntity.getIGregTechTileEntityOffset(xDir + i, h, zDir + j);
                        if ((!addPrimInputToMachineList(tTileEntity, 181)) && (!addPrimOutputToMachineList(tTileEntity, 181))) {
                            if (aBaseMetaTileEntity.getBlockOffset(xDir + i, h, zDir + j) != GregTech_API.sBlockCasings8) {
                                return false;
                            }
                            if (aBaseMetaTileEntity.getMetaIDOffset(xDir + i, h, zDir + j) != 2) {
                                return false;
                            }

                            mWrench = true;
                            mScrewdriver = true;
                            mSoftHammer = true;
                            mHardHammer = true;
                            mSolderingTool = true;
                            mCrowbar = true;
//                            return true;
                            tAmount++;
                        }
                    }
                }
            }
        }
        return tAmount >= 16;
    }

    public int getMaxEfficiency(ItemStack aStack) {
        return 10000;
    }

    public int getPollutionPerTick(ItemStack aStack) {
        return 0;
    }

    public int getDamageToComponent(ItemStack aStack) {
        return 0;
    }

    public boolean explodesOnComponentBreak(ItemStack aStack) {
        return false;
    }
}