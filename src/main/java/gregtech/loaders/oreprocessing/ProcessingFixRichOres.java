package gregtech.loaders.oreprocessing;

import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;

public class ProcessingFixRichOres implements gregtech.api.interfaces.IOreRecipeRegistrator {
    private final OrePrefixes[] tIsRich = {OrePrefixes.oreNetherrack, OrePrefixes.oreNether, OrePrefixes.oreEndstone, OrePrefixes.oreBlackstone, OrePrefixes.oreEnd, OrePrefixes.oreRich, OrePrefixes.oreDense};

    public ProcessingFixRichOres() {
        for (OrePrefixes tPrefix : this.tIsRich) tPrefix.add(this);
    }

    public void registerOre(OrePrefixes aPrefix, Materials aMaterial, String aOreDictName, String aModName, ItemStack aStack) {
        switch (aMaterial.mName) {
            case "Tetrahedrite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Copper, 6L));
                break;
            case "Malachite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Copper, 2L));
                break;
            case "Chalcopyrite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Copper, 4L));
                break;
            case "Pentlandite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Nickel, 8L));
                break;
            case "Sphalerite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Zinc, 8L));
                break;
            case "Pyrite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Iron, 6L));
                break;
            case "BasalticMineralSand":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Iron, 4L));
                break;
            case "GraniticMineralSand":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Iron, 4L));
                break;
            case "YellowLimonite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Iron, 4L));
                break;
            case "BrownLimonite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Iron, 4L));
                break;
            case "BandedIron":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Iron, 6L));
                break;
            case "Magnetite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Iron, 6L));
                break;
            case "Cassiterite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Tin, 14L));
                break;
            case "CassiteriteSand":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Tin, 14L));
                break;
            case "Chromite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Chrome, 4L));
                break;
            case "Garnierite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Nickel, 6L));
                break;
            case "Cobaltite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Cobalt, 6L));
                break;
            case "Stibnite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Antimony, 4L));
                break;
            case "Pyrolusite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Manganese, 4L));
                break;
            case "Galena":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Lead, 6L));
                break;
            case "Molybdenite":
                GT_ModHandler.addSmeltingRecipe(GT_Utility.copyAmount(1L, aStack), GT_OreDictUnificator.get(OrePrefixes.nugget, Materials.Molybdenum, 4L));

                    }

                }
            }
