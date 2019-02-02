package cursedflames.fossilfood.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
	public static Block breadstoneOre = null;

	public static void registerBlocks(Register<Block> event) {
		event.getRegistry().register(breadstoneOre = new BlockBreadstoneOre());

	}

	public static void registerItems(Register<Item> event) {
		event.getRegistry().register(
				new ItemBlock(breadstoneOre).setRegistryName(breadstoneOre.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	public static void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(breadstoneOre), 0,
				new ModelResourceLocation(breadstoneOre.getRegistryName(), "inventory"));
	}

}
