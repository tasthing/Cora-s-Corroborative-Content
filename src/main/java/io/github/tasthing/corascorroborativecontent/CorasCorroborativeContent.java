package io.github.tasthing.corascorroborativecontent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.tasthing.corascorroborativecontent.core.init.BlockInit;
import io.github.tasthing.corascorroborativecontent.core.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CorasCorroborativeContent.MOD_ID)
public class CorasCorroborativeContent
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "tascccmod";

    public CorasCorroborativeContent()
    {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        
    }
}
