package me.dlord.charcoal;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


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

        Item charcoalBlockItem = Item.getItemFromBlock(charcoalBlock);

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(charcoalBlockItem, 0,
                new ModelResourceLocation(
                        MODID + ":" + charcoalBlockItem.getUnlocalizedName().substring(5),
                        "inventory"));
    }
}
