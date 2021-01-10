package me.dlord.charcoal;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;


/**
 * Class for the Charcoal Block which contains the block's properties.
 * 
 * @author D-Lord
 */
public class CharcoalBlock extends Block
{

    public CharcoalBlock()
    {
        super(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0f, 6.0f)
                .sound(SoundType.STONE).harvestLevel(1).harvestTool(ToolType.PICKAXE));
    }

}
