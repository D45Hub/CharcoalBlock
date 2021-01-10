package me.dlord.charcoal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class CharcoalBlock extends Block
{

    protected CharcoalBlock()
    {
        super(Material.rock);

        setUnlocalizedName("charcoal_block");
        setCreativeTab(CreativeTabs.tabBlock);
        setHardness(5.0f);
        setHarvestLevel("pickaxe", 0);
        setResistance(6.0f);
        setStepSound(soundTypeStone);
    }

}
