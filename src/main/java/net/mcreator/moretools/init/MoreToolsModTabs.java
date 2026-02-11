/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moretools.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.moretools.MoreToolsMod;

@EventBusSubscriber
public class MoreToolsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreToolsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MoreToolsModItems.COPPER_SWORD.get());
			tabData.accept(MoreToolsModItems.COPPER_ARMOR_HELMET.get());
			tabData.accept(MoreToolsModItems.COPPER_ARMOR_CHESTPLATE.get());
			tabData.accept(MoreToolsModItems.COPPER_ARMOR_LEGGINGS.get());
			tabData.accept(MoreToolsModItems.COPPER_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MoreToolsModItems.COPPER_PICKAXE.get());
			tabData.accept(MoreToolsModItems.COPPER_AXE.get());
			tabData.accept(MoreToolsModItems.COPPER_SHOVEL.get());
			tabData.accept(MoreToolsModItems.COPPER_HOE.get());
		}
	}
}