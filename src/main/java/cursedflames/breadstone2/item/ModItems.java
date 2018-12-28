package cursedflames.breadstone2.item;

import cursedflames.breadstone2.Breadstone;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;

public class ModItems {
	public static Item fossilBread = null;
	public static Item fossilToast = null;

	public static void registerItems(Register<Item> event) {
		event.getRegistry()
				.register(fossilBread = new ItemFood(5, 6, false).setRegistryName("fossilbread")
						.setUnlocalizedName(Breadstone.MODID+".fossilbread"));
		event.getRegistry()
				.register(fossilToast = new ItemFood(8, 9, false).setRegistryName("fossiltoast")
						.setUnlocalizedName(Breadstone.MODID+".fossiltoast"));
	}

	public static void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(fossilBread, 0,
				new ModelResourceLocation(fossilBread.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(fossilToast, 0,
				new ModelResourceLocation(fossilToast.getRegistryName(), "inventory"));
	}
}
