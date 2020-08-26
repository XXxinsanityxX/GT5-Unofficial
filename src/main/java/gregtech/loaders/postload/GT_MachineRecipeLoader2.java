package gregtech.loaders.postload;

import cpw.mods.fml.common.Loader;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GT_MachineRecipeLoader2 implements Runnable {

    public void run() {
        if (Loader.isModLoaded("EnderIO")) {
            GT_Values.RA.addForgeHammerRecipe(GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 5), GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 14), 20, 16);
            GT_Values.RA.addForgeHammerRecipe(GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 6), GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 15), 20, 16);
            GT_Values.RA.addForgeHammerRecipe(GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 8), GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 16), 20, 16);
            GT_Values.RA.addForgeHammerRecipe(GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 13), GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 17), 20, 16);

            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Steel, 3L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Silicon, 1L), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.ElectricalSteel, 4L), GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.DarkAsh, 2L), (int) Math.max(Materials.ElectricalSteel.getMass() / 40L, 1L) * Materials.ElectricalSteel.mBlastFurnaceTemp, 120, Materials.ElectricalSteel.mBlastFurnaceTemp);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Gold, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Glowstone, 1L), Materials.Redstone.getMolten(144), GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EnergeticAlloy, 1L), null, Materials.EnergeticAlloy.mBlastFurnaceTemp / 10, 120, Materials.EnergeticAlloy.mBlastFurnaceTemp);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EnergeticAlloy, 1L), GT_OreDictUnificator.get(OrePrefixes.gem, Materials.EnderPearl, 1L), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.VibrantAlloy, 1L), null, Materials.VibrantAlloy.mBlastFurnaceTemp / 10, 480, Materials.VibrantAlloy.mBlastFurnaceTemp);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Iron, 1L), GT_OreDictUnificator.get(OrePrefixes.gem, Materials.EnderPearl, 1L), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.PulsatingIron, 1L), null, Materials.PulsatingIron.mBlastFurnaceTemp / 10, 120, Materials.PulsatingIron.mBlastFurnaceTemp);
            GT_Values.RA.addAlloySmelterRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Silicon, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.RedstoneAlloy, 1L), 400, 24);
            GT_Values.RA.addAlloySmelterRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Redstone, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Iron, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.ConductiveIron, 1L), 400, 24);
            GT_Values.RA.addAlloySmelterRecipe(new ItemStack(Blocks.soul_sand), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Gold, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.Soularium, 1L), 400, 24);

            GT_Values.RA.addMixerRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Flint, 1L), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Fireclay, 1L), GT_Values.NI, GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.CrudeSteel, 1L), 100, 8);
            GT_Values.RA.addMixerRecipe(new ItemStack(Items.slime_ball), GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Diamond, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.CrystallineAlloy, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.CrystallinePinkSlime, 1L), 100, 8);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Endstone, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.DarkSteel, 1L), Materials.Tungsten.getMolten(144), GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EndSteel, 1L), null, Materials.StellarAlloy.mBlastFurnaceTemp / 10, 1920, Materials.StellarAlloy.mBlastFurnaceTemp);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.BlackSteel, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.SterlingSilver, 1L), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EnergeticSilver, 1L), null, Materials.EnergeticSilver.mBlastFurnaceTemp / 10, 120, Materials.EnergeticSilver.mBlastFurnaceTemp);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.gem, Materials.EnderEye, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EnergeticSilver, 1L), GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.VividAlloy, 1L), null, Materials.VividAlloy.mBlastFurnaceTemp / 10, 120, Materials.VividAlloy.mBlastFurnaceTemp);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Emerald, 1L), GT_ModHandler.getModItem("EnderIO", "itemMaterial", 1L, 14), Materials.RoseGold.getMolten(144), GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.CrystallineAlloy, 1L), null, Materials.CrystallineAlloy.mBlastFurnaceTemp / 10, 1920, Materials.CrystallineAlloy.mBlastFurnaceTemp);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.gem, Materials.EnderEye, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.EndSteel, 1L), Materials.Chrome.getMolten(144), GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.MelodicAlloy, 1L), null, Materials.MelodicAlloy.mBlastFurnaceTemp / 10, 1920, Materials.MelodicAlloy.mBlastFurnaceTemp);
            GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.gem, Materials.NetherStar, 1L), GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.MelodicAlloy, 1L), Materials.Naquadah.getMolten(144), GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingot, Materials.StellarAlloy, 1L), null, Materials.StellarAlloy.mBlastFurnaceTemp / 10, 30720, Materials.StellarAlloy.mBlastFurnaceTemp);
        }
        //Blast Furnace main materials
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Titanium, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Titanium, 1L), null, 1980, 1920, Materials.Titanium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Titanium, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Titanium, 1L), null, 1980, 1920, Materials.Titanium.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Titanium, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.Titanium, 1L), null, 1980, 1920, Materials.Titanium.mBlastFurnaceTemp);
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
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.TungstenCarbide, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenCarbide, 1L), null, 4380, 1920, Materials.TungstenCarbide.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.TungstenCarbide, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenCarbide, 1L), null, 4380, 1920, Materials.TungstenCarbide.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.TungstenCarbide, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.TungstenCarbide, 1L), null, 4380, 1920, Materials.TungstenCarbide.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSG, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSG, 1L), null, 1980, 1920, Materials.HSSG.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.HSSG, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSG, 1L), null, 1980, 1920, Materials.HSSG.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.HSSG, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSG, 1L), null, 1980, 1920, Materials.HSSG.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSE, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSE, 1L), null, 2560, 1920, Materials.HSSE.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.HSSE, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSE, 1L), null, 2560, 1920, Materials.HSSE.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.HSSE, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSE, 1L), null, 2560, 1920, Materials.HSSE.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dust, Materials.HSSS, 1L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSS, 1L), null, 3080, 1920, Materials.HSSS.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.HSSS, 4L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSS, 1L), null, 3080, 1920, Materials.HSSS.mBlastFurnaceTemp);
        GT_Values.RA.addBlastRecipe(GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.HSSS, 9L), GT_Values.NI, GT_Values.NF, GT_Values.NF, GT_OreDictUnificator.get(OrePrefixes.ingotHot, Materials.HSSS, 1L), null, 3080, 1920, Materials.HSSS.mBlastFurnaceTemp);

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
    }
}