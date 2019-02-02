package cursedflames.fossilfood;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;

@Config(modid = FossilFood.MODID)
public class ModConfig {
	@Comment("The number of veins of breadstone ore that will try to spawn per chunk")
	public static int veinsPerChunk = 7;

	@Comment("The chance that a vein of breadstone ore will actually spawn")
	public static float probability = 0.25f;

	@Comment("The size of a vein of breadstone ore")
	public static int veinSize = 8;
}
