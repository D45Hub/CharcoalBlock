package me.dlord.charcoal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


/**
 * Class for the Charcoal Block which contains the block's properties.
 * 
 * @author D-Lord
 */

public class CharcoalBlock extends Block
{

    protected CharcoalBlock()
    {
        super(Material.rock);

        setBlockName("charcoal_block");
        setBlockTextureName("charcoal:charcoal_block");
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(5.0f);
        setHarvestLevel("pickaxe", 0);
        setResistance(6.0f);
        setStepSound(soundTypeStone);
    }

}
