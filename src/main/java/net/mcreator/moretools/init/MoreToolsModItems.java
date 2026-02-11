/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moretools.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.moretools.item.*;
import net.mcreator.moretools.MoreToolsMod;

public class MoreToolsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MoreToolsMod.MODID);
	public static final DeferredItem<Item> COPPER_SWORD = REGISTRY.register("copper_sword", CopperSwordItem::new);
	public static final DeferredItem<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", CopperPickaxeItem::new);
	public static final DeferredItem<Item> COPPER_AXE = REGISTRY.register("copper_axe", CopperAxeItem::new);
	public static final DeferredItem<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", CopperShovelItem::new);
	public static final DeferredItem<Item> COPPER_HOE = REGISTRY.register("copper_hoe", CopperHoeItem::new);
	public static final DeferredItem<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", CopperArmorItem.Helmet::new);
	public static final DeferredItem<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate", CopperArmorItem.Chestplate::new);
	public static final DeferredItem<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", CopperArmorItem.Leggings::new);
	public static final DeferredItem<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", CopperArmorItem.Boots::new);
	// Start of user code block custom items
	// End of user code block custom items
}