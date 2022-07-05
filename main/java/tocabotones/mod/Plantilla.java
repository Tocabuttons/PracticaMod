package tocabotones.mod;

import tocabotones.mod.proxy.CommonProxy;
import tocabotones.mod.util.References;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = References.MOD_ID, version = References.VERSION, name = References.NAME)
public class Plantilla {

    @Instance
    public static Plantilla instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        
    }

    @EventHandler
    public void init(FMLInitializationEvent event){

    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }


}
