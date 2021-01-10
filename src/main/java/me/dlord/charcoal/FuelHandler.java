package me.dlord.charcoal;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;


public class FuelHandler implements IFuelHandler
{

    @Override
    public int getBurnTime(ItemStack fuel)
    {
        Item fuelItem = fuel.getItem();

        if (fuelItem instanceof ItemBlock && Block
                .getBlockFromItem(fuelItem) == CharcoalBlockMod.charcoalBlock)
        {
            return 16000;
        }
        return 0;
    }

}
