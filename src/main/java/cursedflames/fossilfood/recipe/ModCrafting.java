package cursedflames.fossilfood.recipe;

import cursedflames.fossilfood.block.ModBlocks;
import cursedflames.fossilfood.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModCrafting {
	@SubscribeEvent
	public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
		// @formatter:off
		IForgeRegistry<IRecipe> r = event.getRegistry();
		GameRegistry.addSmelting(ModBlocks.breadstoneOre, new ItemStack(ModItems.fossilToast, 2), 0.5f);
	}
}
