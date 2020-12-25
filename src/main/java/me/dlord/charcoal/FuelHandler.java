package me.dlord.charcoal;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;


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
