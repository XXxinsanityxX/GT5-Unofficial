package gregtech.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import gregtech.api.GregTech_API;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.items.GT_Generic_Item;
import gregtech.api.util.GT_LanguageManager;
import gregtech.api.util.GT_Log;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_Utility;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import java.util.List;

import static gregtech.api.util.GT_Utility.ItemNBT.getIntegratedAmount;
import static gregtech.api.util.GT_Utility.ItemNBT.setIntegratedAmount;

public class GT_IntegratedCircuit_Item extends GT_Generic_Item {
    public GT_IntegratedCircuit_Item() {
        super("integrated_circuit", "Programmed Circuit", "");
        setHasSubtypes(true);
        setMaxDamage(0);
        ItemList.Circuit_Integrated.set(this);
        GT_ModHandler.addShapelessCraftingRecipe(ItemList.Circuit_Integrated.getWithDamage(1L, 0L), GT_ModHandler.RecipeBits.NOT_REMOVABLE, new Object[]{OrePrefixes.circuit.get(Materials.Basic)});
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World aWorld, EntityPlayer aPlayer) {
        int toolMode = getIntegratedAmount(stack);
        if (!aPlayer.isSneaking()) {
            ++toolMode;
            if (toolMode > 24) toolMode = 0;
        } else {
            --toolMode;
            if (toolMode < 0) toolMode = 24;
        }
        setIntegratedAmount(stack, toolMode);
        GT_Utility.sendChatToPlayer(aPlayer, GT_LanguageManager.addStringLocalization("gt.behaviour.Integrated", "Configuration") +": " + EnumChatFormatting.YELLOW + toolMode);
        setDamage(stack, toolMode);
        return super.onItemRightClick(stack, aWorld, aPlayer);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addInformation(ItemStack aStack, EntityPlayer aPlayer, List aList, boolean p_77624_4_) {
        super.addInformation(aStack, aPlayer, aList, p_77624_4_);
        aList.add("Configuration: " + getDamage(aStack));
        aList.add("Rightclick to set number (+1)");
        aList.add("Rightclick + Shift to set number (-1)");
    }

    public String getUnlocalizedName(ItemStack aStack) {
        return getUnlocalizedName();
    }
    @SuppressWarnings("unchecked")
    @SideOnly(Side.CLIENT)
    public final void getSubItems(Item var1, CreativeTabs aCreativeTab, List aList) {
        aList.add(new ItemStack(this, 1, 0));
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister aIconRegister) {
        super.registerIcons(aIconRegister);
        if (GregTech_API.sPostloadFinished) {
            GT_Log.out.println("GT_Mod: Starting Item Icon Load Phase");
            System.out.println("GT_Mod: Starting Item Icon Load Phase");
            GregTech_API.sItemIcons = aIconRegister;
            try {
                for (Runnable tRunnable : GregTech_API.sGTItemIconload) {
                    tRunnable.run();
                }
            } catch (Throwable e) {e.printStackTrace(GT_Log.err);}
            GT_Log.out.println("GT_Mod: Finished Item Icon Load Phase");
            System.out.println("GT_Mod: Finished Item Icon Load Phase");
        }
    }
}