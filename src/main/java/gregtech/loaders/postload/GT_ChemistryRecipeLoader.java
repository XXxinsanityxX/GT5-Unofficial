package gregtech.loaders.postload;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class GT_ChemistryRecipeLoader implements Runnable {

    public void run() {

        //Sulfur Dioxide and Trioxide
        GT_Values.RA.addChemicalRecipeForBasicMachineOnly(Materials.Sulfur.getDust(1), GT_Utility.getIntegratedCircuit(2), Materials.Oxygen.getGas(2000), Materials.SulfurDioxide.getGas(3000), GT_Values.NI, GT_Values.NI, 60, 8);
        GT_Values.RA.addChemicalRecipeForBasicMachineOnly(Materials.Oxygen.getCells(1), GT_Utility.getIntegratedCircuit(1), Materials.SulfurDioxide.getGas(3000), Materials.SulfurTrioxide.getGas(4000), Materials.Empty.getCells(1), GT_Values.NI, 200,30);
        GT_Values.RA.addChemicalRecipeForBasicMachineOnly(Materials.SulfurDioxide.getCells(3), GT_Utility.getIntegratedCircuit(1), Materials.Oxygen.getGas(1000), Materials.SulfurTrioxide.getGas(4000), Materials.Empty.getCells(3), GT_Values.NI, 200,30);
        GT_Values.RA.addChemicalRecipeForBasicMachineOnly(Materials.Oxygen.getCells(1), Materials.Empty.getCells(3), Materials.SulfurDioxide.getGas(3000), GT_Values.NF, Materials.SulfurTrioxide.getCells(4), GT_Values.NI, 200,30);
        GT_Values.RA.addChemicalRecipeForBasicMachineOnly(Materials.SulfurDioxide.getCells(3), Materials.Empty.getCells(1), Materials.Oxygen.getGas(1000), GT_Values.NF, Materials.SulfurTrioxide.getCells(4), GT_Values.NI, 200,30);
        GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{Materials.Sulfur.getDust(1), GT_Utility.getIntegratedCircuit(1)}, new FluidStack[]{Materials.Oxygen.getGas(2000)}, new FluidStack[]{Materials.SulfurDioxide.getGas(3000)}, null, 60, 8);
        GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{GT_Utility.getIntegratedCircuit(1)}, new FluidStack[]{Materials.SulfurDioxide.getGas(3000), Materials.Oxygen.getGas(1000)}, new FluidStack[]{Materials.SulfurTrioxide.getGas(4000)}, null, 200, 30);

        //Sulfuric Acid
        GT_Values.RA.addChemicalRecipeForBasicMachineOnly(Materials.Water.getCells(3), GT_Utility.getIntegratedCircuit(1), Materials.SulfurTrioxide.getGas(4000), Materials.SulfuricAcid.getFluid(7000), Materials.Empty.getCells(3), GT_Values.NI, 320, 30);
        GT_Values.RA.addChemicalRecipeForBasicMachineOnly(Materials.HydricSulfide.getCells(1), GT_Utility.getIntegratedCircuit(1), Materials.Oxygen.getGas(4000), Materials.SulfuricAcid.getFluid(1000), Materials.Empty.getCells(1), GT_Values.NI, 240, 30);
        GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{GT_Utility.getIntegratedCircuit(24)}, new FluidStack[]{Materials.HydricSulfide.getGas(1000), Materials.Oxygen.getGas(4000)}, new FluidStack[]{Materials.SulfuricAcid.getFluid(1000)}, null, 480, 30);
        GT_Values.RA.addMultiblockChemicalRecipe(new ItemStack[]{GT_Utility.getIntegratedCircuit(24)}, new FluidStack[]{Materials.SulfurTrioxide.getGas(4000), Materials.Water.getFluid(3000)}, new FluidStack[]{Materials.SulfuricAcid.getFluid(7000)}, null, 480, 30);

    }
}
