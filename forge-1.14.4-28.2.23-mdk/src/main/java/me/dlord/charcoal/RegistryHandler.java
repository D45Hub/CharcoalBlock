package me.dlord.charcoal;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;


/**
 * Handles all of the registry events and registers the nessesary objects in
 * each event.
 * 
 * @author D-Lord
 */
@Mod.EventBusSubscriber(modid = CharcoalBlockMod.MODID, bus = Bus.MOD)
public class RegistryHandler
{

    private static CharcoalBlock charcoalBlock;

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        charcoalBlock = new CharcoalBlock();
        charcoalBlock.setRegistryName(CharcoalBlockMod.MODID, "charcoal_block");

        event.getRegistry().register(charcoalBlock);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        CharcoalBlockItem charcoalBlockItem = new CharcoalBlockItem(charcoalBlock);
        charcoalBlockItem.setRegistryName(charcoalBlock.getRegistryName());

        event.getRegistry().register(charcoalBlockItem);
    }

}
