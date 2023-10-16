
package cn.mcxkly.foodcraft.block;

import java.util.List;
import java.util.Collections;

public class PearLeavesBlock extends LeavesBlock {
	public PearLeavesBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().sound(SoundType.GRAVEL).strength(1f, 10f).noOcclusion());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
