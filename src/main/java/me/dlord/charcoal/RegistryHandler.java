package me.dlord.charcoal;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


/**
 * This class handles the registries we are modifiying inside this mod.
 * 
 * @author D-Lord
 */
public class RegistryHandler
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister
            .create(ForgeRegistries.ITEMS, CharcoalBlockMod.MODID);

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister
            .create(ForgeRegistries.BLOCKS, CharcoalBlockMod.MODID);

    public static void init()
    {
        // Initializes Deferred Registries
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

        // Initializes Blocks / Blockitems
        CharcoalBlock charcoalBlock = new CharcoalBlock();
        CharcoalBlockItem charcoalBlockItem = new CharcoalBlockItem(charcoalBlock);

        // Registers Blocks / Blockitems
        BLOCKS.register("charcoal_block", () -> charcoalBlock);
        ITEMS.register("charcoal_block", () -> charcoalBlockItem);
    }

}
