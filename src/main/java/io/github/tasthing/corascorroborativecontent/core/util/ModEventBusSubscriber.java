package io.github.tasthing.corascorroborativecontent.core.util;


import io.github.tasthing.corascorroborativecontent.CorasCorroborativeContent;
import io.github.tasthing.corascorroborativecontent.core.init.BlockInit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = CorasCorroborativeContent.MOD_ID, bus = Bus.MOD)
public class ModEventBusSubscriber
{

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			final Item.Properties properties = new Item.Properties().group(ItemGroup.MISC);
			final BlockItem blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			registry.register(blockItem);
		});
	}
}