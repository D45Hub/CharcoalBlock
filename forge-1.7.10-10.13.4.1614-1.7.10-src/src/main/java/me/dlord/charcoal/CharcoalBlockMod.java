package me.dlord.charcoal;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


@Mod(modid = CharcoalBlockMod.MODID, version = CharcoalBlockMod.VERSION)
public class CharcoalBlockMod
{
    public static final String MODID = "charcoal";
    public static final String VERSION = "1.0";

    public static CharcoalBlock charcoalBlock;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        charcoalBlock = new CharcoalBlock();

        GameRegistry.registerBlock(charcoalBlock, charcoalBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerFuelHandler(new FuelHandler());
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        GameRegistry.addRecipe(new ItemStack(charcoalBlock),
                new Object[] {"CCC", "CCC", "CCC", 'C', new ItemStack(Items.coal, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 9, 1),
                new Object[] {charcoalBlock});
    }
}