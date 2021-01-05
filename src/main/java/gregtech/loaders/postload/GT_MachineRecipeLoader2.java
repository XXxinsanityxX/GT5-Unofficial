package gregtech.loaders.postload;

import cpw.mods.fml.common.Loader;
import gregtech.api.enums.*;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class GT_MachineRecipeLoader2 implements Runnable {

    public void run() {
        if (Loader.isModLoaded("EnderIO")) {
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("EnderIO", "itemBasicCapacitor", 1L, 0), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{" GR", "GCG", "RG ", 'G', GT_OreDictUnificator.get(OrePrefixes.wireGt02, Materials.Gold, 1L), 'R', GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.RedAlloy, 1L), 'C', GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Copper, 1L) });
            GT_ModHandler.addCraftingRecipe(GT_ModHandler.getModItem("EnderIO", "itemMachinePart", 1L, 0), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"FS", "SC", 'F', GT_OreDictUnificator.get(OrePrefixes.frameGt, Materials.Steel, 1L), 'S', GT_OreDictUnificator.get(OrePrefixes.gearGt, Materials.Steel, 1L), 'C', OreDictNames.capacitorBasic});

            GT_Values.RA.addForgeHammerRecipe(GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 2), GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 11), 20, 16);
            GT_Values.RA.addForgeHammerRecipe(GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 3), GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 12), 20, 16);
            GT_Values.RA.addForgeHammerRecipe(GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 4), GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 13), 20, 16);
            GT_Values.RA.addForgeHammerRecipe(GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 10), GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 14), 20, 16);

            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Steel, 3L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Silicon, 1L), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.ElectricalSteel, 4L), GT_Values.NI, 1000, 120, 1100);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Obsidian, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.ElectricalSteel, 1L), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.DarkSteel, 1L), GT_Values.NI, 4000, 120, 2000);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tungsten, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.DarkSteel, 1L), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EndSteel, 1L), GT_Values.NI, 1800, 1920, 3600);

            GT_Values.RA.addAlloySmelterRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Silicon, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.RedstoneAlloy, 1L), 400, 24);
            GT_Values.RA.addAlloySmelterRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Iron, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.ConductiveIron, 1L), 400, 24);
            GT_Values.RA.addAlloySmelterRecipe(new ItemStack(Blocks.soul_sand), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Gold, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Soularium, 1L), 400, 48);
            GT_Values.RA.addAlloySmelterRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EnderPearl, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Iron, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.PulsatingIron, 1L), 400, 48);
            GT_Values.RA.addAlloySmelterRecipe(ItemList.Energium_Dust.get(1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Electrum, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EnergeticAlloy, 1L), 195, 120);
            GT_Values.RA.addAlloySmelterRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EnderPearl, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EnergeticAlloy, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.VibrantAlloy, 1L), 330, 480);

            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.ElectricalSteel, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.ElectricalSteel, 1L), null, 1200, 120, 1100);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.ElectricalSteel, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.ElectricalSteel, 1L), null, 1200, 120, 1100);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.ElectricalSteel, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.ElectricalSteel, 1L), null, 1200, 120, 1100);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.DarkSteel, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.DarkSteel, 1L), null, 4100, 120, 2000);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.DarkSteel, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.DarkSteel, 1L), null, 4100, 120, 2000);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.DarkSteel, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.DarkSteel, 1L), null, 4100, 120, 2000);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.EndSteel, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EndSteel, 1L), null, 900, 1920, 3600);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.EndSteel, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EndSteel, 1L), null, 900, 1920, 3600);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.EndSteel, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EndSteel, 1L), null, 900, 1920, 3600);
        }

        if (Loader.isModLoaded("exnihilo")) {
            GT_ModHandler.addCraftingRecipe(new ItemStack(Blocks.end_portal_frame, 1), new Object[]{"X X", " X ", 'X', OrePrefixes.plate.get(Materials.Tungsten)});

            GT_Values.RA.addForgeHammerRecipe(new ItemStack(Blocks.netherrack, 1), GT_ModHandler.getModItem("exnihilo", "exnihilo.gravel_nether", 1L), 100, 16);
            GT_Values.RA.addForgeHammerRecipe(new ItemStack(Blocks.end_stone, 1), GT_ModHandler.getModItem("exnihilo", "exnihilo.gravel_ender", 1L), 100, 16);

            GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Sulfur, 1L), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Redstone, 1L), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Coal, 1L), GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Gold, 1L), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Netherrack, 1L), 400, 30);
            GT_Values.RA.addMixerRecipe(new ItemStack(Blocks.sand, 1), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungstate, 1L), GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Platinum, 1L), GT_Values.NI, GT_Values.NF, Materials.Helium.getFluid(120L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Endstone, 1L), 400, 60);
            GT_Values.RA.addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Netherrack, 1L), new ItemStack(Blocks.netherrack, 1), 600, 16);
            GT_Values.RA.addCompressorRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Endstone, 1L), new ItemStack(Blocks.end_stone, 1), 600, 16);
        }

        //Energy and lapotron crystals
        GT_ModHandler.addCraftingRecipe(ItemList.Energium_Dust.get(9L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{"RDR", "DRD", "RDR", 'R', OrePrefixes.dust.get(Materials.Redstone), 'D', OrePrefixes.dust.get(Materials.Ruby)});
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 5L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Ruby, 4L), GT_Values.NI, GT_Values.NI, GT_Values.NF, GT_Values.NF, ItemList.Energium_Dust.get(9L, new Object[0]), 100, 120);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(ItemList.Energium_Dust.get(3L,new Object[0])), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Lapis, 2L), GT_Values.NI, GT_Values.NI, GT_Values.NF, GT_Values.NF, ItemList.Lapotron_Dust.get(5L, new Object[0]), 100, 480);
        GT_Values.RA.addAutoclaveRecipe(ItemList.Energium_Dust.get(9L,new Object[0]), Materials.Water.getFluid(1000L), ItemList.Energy_Crystal.get(1L,new Object[0]), 10000, 500, 120);
        GT_Values.RA.addAutoclaveRecipe(ItemList.Energium_Dust.get(9L,new Object[0]), GT_ModHandler.getDistilledWater(1000L), ItemList.Energy_Crystal.get(1L,new Object[0]), 10000, 600, 120);
        GT_Values.RA.addAutoclaveRecipe(ItemList.Lapotron_Dust.get(20L,new Object[0]), Materials.VibrantAlloy.getMolten(36L), ItemList.Inert_Lapotron_Crystal.get(1L,new Object[0]), 10000, 480, 256);
        GT_Values.RA.addAutoclaveRecipe(ItemList.Lapotron_Dust.get(20L,new Object[0]), Materials.EnergeticAlloy.getMolten(144L), ItemList.Inert_Lapotron_Crystal.get(1L,new Object[0]), 10000, 560, 256);
        GT_Values.RA.addAssemblerRecipe(ItemList.Inert_Lapotron_Crystal.get(1L,new Object[0]), GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 2L), ItemList.Lapotron_Crystal.get(1L,new Object[0]), 300, 1920);

        //Blast Furnace main materials
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Titanium, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Titanium, 1L), null, 1980, 480, Materials.Titanium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Titanium, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Titanium, 1L), null, 1980, 480, Materials.Titanium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Titanium, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Titanium, 1L), null, 1980, 480, Materials.Titanium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Vanadium, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Vanadium, 1L), null, 2180, 120, Materials.Vanadium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Vanadium, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Vanadium, 1L), null, 2180, 120, Materials.Vanadium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Vanadium, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Vanadium, 1L), null, 2180, 120, Materials.Vanadium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Yttrium, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Yttrium, 1L), null, 3600, 120, Materials.Yttrium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Yttrium, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Yttrium, 1L), null, 3600, 120, Materials.Yttrium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Yttrium, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Yttrium, 1L), null, 3600, 120, Materials.Yttrium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Niobium, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Niobium, 1L), null, 5500, 120, Materials.Niobium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Niobium, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Niobium, 1L), null, 5500, 120, Materials.Niobium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Niobium, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Niobium, 1L), null, 5500, 120, Materials.Niobium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Palladium, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Palladium, 1L), null, 3640, 120, Materials.Palladium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Palladium, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Palladium, 1L), null, 3640, 120, Materials.Palladium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Palladium, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Palladium, 1L), null, 3640, 120, Materials.Palladium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Lutetium, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Lutetium, 1L), null, 7700, 120, Materials.Lutetium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Lutetium, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Lutetium, 1L), null, 7700, 120, Materials.Lutetium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Lutetium, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Lutetium, 1L), null, 7700, 120, Materials.Lutetium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Tungsten, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Tungsten, 1L), null, 10960, 1920, Materials.Tungsten.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Tungsten, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Tungsten, 1L), null, 10960, 1920, Materials.Tungsten.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Tungsten, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Tungsten, 1L), null, 10960, 1920, Materials.Tungsten.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Osmium, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Osmium, 1L), null, 1020, 30720, Materials.Osmium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmium, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Osmium, 1L), null, 1020, 30720, Materials.Osmium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Osmium, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Osmium, 1L), null, 1020, 30720, Materials.Osmium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Iridium, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Iridium, 1L), null, 1100, 7680, Materials.Iridium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Iridium, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Iridium, 1L), null, 1100, 7680, Materials.Iridium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Iridium, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Iridium, 1L), null, 1100, 7680, Materials.Iridium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Nichrome, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Nichrome, 1L), null, 4380, 480, Materials.Nichrome.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Nichrome, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Nichrome, 1L), null, 4380, 480, Materials.Nichrome.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Nichrome, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Nichrome, 1L), null, 4380, 480, Materials.Nichrome.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Kanthal, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Kanthal, 1L), null, 1800, 120, Materials.Kanthal.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Kanthal, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Kanthal, 1L), null, 1800, 120, Materials.Kanthal.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Kanthal, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Kanthal, 1L), null, 1800, 120, Materials.Kanthal.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.TungstenSteel, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenSteel, 1L), null, 2740, 1920, Materials.TungstenSteel.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.TungstenSteel, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenSteel, 1L), null, 2740, 1920, Materials.TungstenSteel.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.TungstenSteel, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenSteel, 1L), null, 2740, 1920, Materials.TungstenSteel.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Osmiridium, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Osmiridium, 1L), null, 1500, 30720, Materials.Osmiridium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Osmiridium, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Osmiridium, 1L), null, 1500, 30720, Materials.Osmiridium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Osmiridium, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Osmiridium, 1L), null, 1500, 30720, Materials.Osmiridium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Naquadah, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Naquadah, 1L), null, 620, 7680, Materials.Naquadah.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadah, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Naquadah, 1L), null, 620, 7680, Materials.Naquadah.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Naquadah, 1L), null, 620, 7680, Materials.Naquadah.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.NaquadahAlloy, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NaquadahAlloy, 1L), null, 1240, 62880, Materials.NaquadahAlloy.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.NaquadahAlloy, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NaquadahAlloy, 1L), null, 1240, 62880, Materials.NaquadahAlloy.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.NaquadahAlloy, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NaquadahAlloy, 1L), null, 1240, 62880, Materials.NaquadahAlloy.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.NaquadahEnriched, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NaquadahEnriched, 1L), null, 1240, 7680, Materials.NaquadahEnriched.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.NaquadahEnriched, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NaquadahEnriched, 1L), null, 1240, 7680, Materials.NaquadahEnriched.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.NaquadahEnriched, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NaquadahEnriched, 1L), null, 1240, 7680, Materials.NaquadahEnriched.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Naquadria, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Naquadria, 1L), null, 620, 122880, Materials.Naquadria.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Naquadria, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Naquadria, 1L), null, 620, 122880, Materials.Naquadria.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadria, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Naquadria, 1L), null, 620, 122880, Materials.Naquadria.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Ultimet, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Ultimet, 1L), null, 2700, 120, Materials.Ultimet.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Ultimet, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Ultimet, 1L), null, 2700, 120, Materials.Ultimet.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ultimet, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Ultimet, 1L), null, 2700, 120, Materials.Ultimet.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.VanadiumGallium, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.VanadiumGallium, 1L), null, 4100, 480, Materials.VanadiumGallium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.VanadiumGallium, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.VanadiumGallium, 1L), null, 4100, 480, Materials.VanadiumGallium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.VanadiumGallium, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.VanadiumGallium, 1L), null, 4100, 480, Materials.VanadiumGallium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.YttriumBariumCuprate, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.YttriumBariumCuprate, 1L), null, 4500, 120, Materials.YttriumBariumCuprate.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.YttriumBariumCuprate, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.YttriumBariumCuprate, 1L), null, 4500, 120, Materials.YttriumBariumCuprate.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.YttriumBariumCuprate, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.YttriumBariumCuprate, 1L), null, 4500, 120, Materials.YttriumBariumCuprate.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.NiobiumTitanium, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NiobiumTitanium, 1L), null, 4100, 480, Materials.NiobiumTitanium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.NiobiumTitanium, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NiobiumTitanium, 1L), null, 4100, 480, Materials.NiobiumTitanium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.NiobiumTitanium, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NiobiumTitanium, 1L), null, 4100, 480, Materials.NiobiumTitanium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.TungstenCarbide, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenCarbide, 1L), null, 5500, 480, Materials.TungstenCarbide.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.TungstenCarbide, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenCarbide, 1L), null, 5500, 480, Materials.TungstenCarbide.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.TungstenCarbide, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenCarbide, 1L), null, 5500, 480, Materials.TungstenCarbide.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSG, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSG, 1L), null, 1980, 1920, Materials.HSSG.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.HSSG, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSG, 1L), null, 1980, 1920, Materials.HSSG.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.HSSG, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSG, 1L), null, 1980, 1920, Materials.HSSG.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSE, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSE, 1L), null, 2560, 1920, Materials.HSSE.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.HSSE, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSE, 1L), null, 2560, 1920, Materials.HSSE.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.HSSE, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSE, 1L), null, 2560, 1920, Materials.HSSE.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSS, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSS, 1L), null, 3080, 1920, Materials.HSSS.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.HSSS, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSS, 1L), null, 3080, 1920, Materials.HSSS.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.HSSS, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSS, 1L), null, 3080, 1920, Materials.HSSS.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.TitaniumNiobiumCarbide, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TitaniumNiobiumCarbide, 1L), null, 4100, 1920, Materials.TitaniumNiobiumCarbide.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.TitaniumNiobiumCarbide, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TitaniumNiobiumCarbide, 1L), null, 4100, 1920, Materials.TitaniumNiobiumCarbide.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.TitaniumNiobiumCarbide, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TitaniumNiobiumCarbide, 1L), null, 4100, 1920, Materials.TitaniumNiobiumCarbide.mBlastFurnaceTemp);



        //Vacuum Freezer main materials
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Titanium, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Titanium, 1L), 140, 480);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Vanadium, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Vanadium, 1L), 160, 120);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Yttrium, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Yttrium, 1L), 260, 120);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Niobium, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Niobium, 1L), 280, 120);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Palladium, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Palladium, 1L), 320, 480);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Lutetium, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Lutetium, 1L), 520, 120);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Tungsten, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Tungsten, 1L), 540, 1920);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Osmium, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Osmium, 1L), 560, 1920);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Iridium, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Iridium, 1L), 580, 1920);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Nichrome, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Nichrome, 1L), 160, 480);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Kanthal, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Kanthal, 1L), 140, 120);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenSteel, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.TungstenSteel, 1L), 360, 1920);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Osmiridium, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Osmiridium, 1L), 580, 1920);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Naquadah, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Naquadah, 1L), 1000, 7680);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NaquadahAlloy, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.NaquadahAlloy, 1L), 300, 7680);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NaquadahEnriched, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.NaquadahEnriched, 1L), 300, 7680);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Naquadria, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Naquadria, 1L), 300, 7680);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Ultimet, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Ultimet, 1L), 180, 120);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.VanadiumGallium, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.VanadiumGallium, 1L), 160, 480);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.YttriumBariumCuprate, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.YttriumBariumCuprate, 1L), 160, 1920);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.NiobiumTitanium, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.NiobiumTitanium, 1L), 220, 480);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenCarbide, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.TungstenCarbide, 1L), 300, 1920);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSG, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.HSSG, 1L), 300, 7860);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSE, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.HSSE, 1L), 300, 7860);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSS, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.HSSS, 1L), 300, 7860);

        //CustomStuff
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Enderium, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Enderium, 1L), 140, 480);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TitaniumNiobiumCarbide, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.TitaniumNiobiumCarbide, 1L), 300, 1920);

        //Pyro & Cryo Stuff
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Coal, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Blaze, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Pyrotheum, 1L), 400, 256);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Saltpeter, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Snow, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Blizz, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Cryotheum, 1L), 400, 256);
        GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Niter, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Snow, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Blizz, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Cryotheum, 1L), 400, 256);
        GT_Values.RA.addVacuumFreezerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Blaze, 3L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Blizz, 1L), 400, 48);

    }
}