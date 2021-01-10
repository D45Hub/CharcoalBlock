package me.dlord.charcoal;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


/**
 * Class for the Charcoal Blockitem which also contains the Blockitem's
 * properties and other properties like the burn time of the Charcoal Block.
 * 
 * @author D-Lord
 */
public class CharcoalBlockItem extends BlockItem
{

    public CharcoalBlockItem(Block charcoalBlock)
    {
        super(charcoalBlock, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
    }

    @Override
    public int getBurnTime(ItemStack itemStack)
    {
        return 720;
    }

}
