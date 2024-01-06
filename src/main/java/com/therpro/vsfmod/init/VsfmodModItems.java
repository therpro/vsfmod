/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.therpro.vsfmod.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import com.therpro.vsfmod.item.ScrifitualKnifeItem;
import com.therpro.vsfmod.item.RevolverItem;
import com.therpro.vsfmod.item.RevolverBulletItem;
import com.therpro.vsfmod.item.BloodItem;
import com.therpro.vsfmod.VsfmodMod;

public class VsfmodModItems {
	public static Item REVOLVER;
	public static Item REVOLVER_BULLET;
	public static Item BLOOD;
	public static Item SCRIFITUAL_KNIFE;
	public static Item T_1_WORKBANCH;

	public static void load() {
		REVOLVER = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(VsfmodMod.MODID, "revolver"), new RevolverItem());
		REVOLVER_BULLET = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(VsfmodMod.MODID, "revolver_bullet"), new RevolverBulletItem());
		BLOOD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(VsfmodMod.MODID, "blood"), new BloodItem());
		SCRIFITUAL_KNIFE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(VsfmodMod.MODID, "scrifitual_knife"), new ScrifitualKnifeItem());
		T_1_WORKBANCH = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(VsfmodMod.MODID, "t_1_workbanch"), new BlockItem(VsfmodModBlocks.T_1_WORKBANCH, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(VsfmodModTabs.TAB_THE_VSF_MOD).register(content -> content.accept(T_1_WORKBANCH));
	}

	public static void clientLoad() {
	}
}
