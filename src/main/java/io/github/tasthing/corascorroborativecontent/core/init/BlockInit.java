package io.github.tasthing.corascorroborativecontent.core.init;

import io.github.tasthing.corascorroborativecontent.CorasCorroborativeContent;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			CorasCorroborativeContent.MOD_ID);
	
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block",
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLACK)
					.harvestTool(ToolType.PICKAXE)
					.harvestLevel(1)
					.hardnessAndResistance(15f, 30f)
					.sound(SoundType.METAL)));
}
