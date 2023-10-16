
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.mcxkly.foodcraft.init;

import cn.mcxkly.foodcraft.item.OvercookedFoodItem;
import cn.mcxkly.foodcraft.item.KinkoraItem;
import cn.mcxkly.foodcraft.FoodcraftStarMod;

public class FoodcraftStarModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FoodcraftStarMod.MODID);
	public static final RegistryObject<Item> OVERCOOKED_FOOD = REGISTRY.register("overcooked_food", () -> new OvercookedFoodItem());
	public static final RegistryObject<Item> KINKORA = REGISTRY.register("kinkora", () -> new KinkoraItem());
	public static final RegistryObject<Item> FRUIT_LEAVES = block(FoodcraftStarModBlocks.FRUIT_LEAVES);
	public static final RegistryObject<Item> PEAR_LEAVES = block(FoodcraftStarModBlocks.PEAR_LEAVES);
	public static final RegistryObject<Item> LYCHEE_LEAVES = block(FoodcraftStarModBlocks.LYCHEE_LEAVES);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
