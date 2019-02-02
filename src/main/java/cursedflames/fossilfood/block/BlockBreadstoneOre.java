package cursedflames.fossilfood.block;

import cursedflames.fossilfood.FossilFood;
import cursedflames.fossilfood.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBreadstoneOre extends Block {
	public BlockBreadstoneOre() {
		super(Material.ROCK);
		setUnlocalizedName(FossilFood.MODID+".breadstone_ore");
		setRegistryName("breadstone_ore");
		this.blockHardness = 2.5F;
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

	@Override
	public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos,
			IBlockState state, int fortune) {
		drops.add(
				new ItemStack(ModItems.fossilBread, (int) (Math.floor(Math.random()*2+1)+fortune)));
	}

	@Override
	public boolean isToolEffective(String type, IBlockState state) {
		return enableStats;
	}
}
