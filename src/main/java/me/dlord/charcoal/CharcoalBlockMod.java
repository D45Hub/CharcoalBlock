package me.dlord.charcoal;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;


/**
 * Main class of this mod which starts the initialization of everything inside
 * this mod.
 * 
 * @author D-Lord
 */
@Mod(CharcoalBlockMod.MODID)
public class CharcoalBlockMod
{
    public static final String MODID = "charcoal";

    public CharcoalBlockMod()
    {        
        MinecraftForge.EVENT_BUS.register(RegistryHandler.class);
    }

}
