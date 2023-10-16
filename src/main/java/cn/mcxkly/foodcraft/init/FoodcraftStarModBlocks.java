
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.mcxkly.foodcraft.init;

import cn.mcxkly.foodcraft.block.PearLeavesBlock;
import cn.mcxkly.foodcraft.block.LycheeLeavesBlock;
import cn.mcxkly.foodcraft.block.FruitLeavesBlock;
import cn.mcxkly.foodcraft.FoodcraftStarMod;

public class FoodcraftStarModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FoodcraftStarMod.MODID);
	public static final RegistryObject<Block> FRUIT_LEAVES = REGISTRY.register("fruit_leaves", () -> new FruitLeavesBlock());
	public static final RegistryObject<Block> PEAR_LEAVES = REGISTRY.register("pear_leaves", () -> new PearLeavesBlock());
	public static final RegistryObject<Block> LYCHEE_LEAVES = REGISTRY.register("lychee_leaves", () -> new LycheeLeavesBlock());
}
