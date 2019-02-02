package cursedflames.fossilfood;

import org.apache.logging.log4j.Logger;

import cursedflames.fossilfood.block.ModBlocks;
import cursedflames.fossilfood.item.ModItems;
import cursedflames.fossilfood.proxy.ISideProxy;
import cursedflames.fossilfood.recipe.ModCrafting;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = FossilFood.MODID, useMetadata = true)
@Mod.EventBusSubscriber
public class FossilFood {
	@Mod.Instance
	public static FossilFood instance;

	public static final String MODID = "fossilfood";

	public static Logger logger;

	@SidedProxy(clientSide = "cursedflames.fossilfood.proxy.ClientProxy", serverSide = "cursedflames.fossilfood.proxy.ServerProxy")
	public static ISideProxy proxy;

	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		MinecraftForge.EVENT_BUS.register(ModCrafting.class);
		GameRegistry.registerWorldGenerator(new OreGen(), 2);
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		ModBlocks.registerBlocks(event);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		ModBlocks.registerItems(event);
		ModItems.registerItems(event);
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		ModBlocks.registerModels(event);
		ModItems.registerModels(event);
	}

	@Mod.EventHandler
	public static void init(FMLInitializationEvent event) {
	}

	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
	}
}
