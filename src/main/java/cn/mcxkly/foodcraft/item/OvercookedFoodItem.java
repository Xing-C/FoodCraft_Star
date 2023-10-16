
package cn.mcxkly.foodcraft.item;

public class OvercookedFoodItem extends Item {
	public OvercookedFoodItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f).build()));
	}
}
