
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package cn.mcxkly.foodcraft.init;

import cn.mcxkly.foodcraft.FoodcraftStarMod;

public class FoodcraftStarModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FoodcraftStarMod.MODID);
	public static final RegistryObject<CreativeModeTab> FOODCRAFTSTAR = REGISTRY.register("foodcraftstar",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.foodcraft_star.foodcraftstar")).icon(() -> new ItemStack(Blocks.REDSTONE_LAMP)).displayItems((parameters, tabData) -> {
				tabData.accept(FoodcraftStarModItems.OVERCOOKED_FOOD.get());
				tabData.accept(FoodcraftStarModItems.KINKORA.get());
				tabData.accept(FoodcraftStarModBlocks.FRUIT_LEAVES.get().asItem());
				tabData.accept(FoodcraftStarModBlocks.PEAR_LEAVES.get().asItem());
				tabData.accept(FoodcraftStarModBlocks.LYCHEE_LEAVES.get().asItem());
			})

					.build());
}
