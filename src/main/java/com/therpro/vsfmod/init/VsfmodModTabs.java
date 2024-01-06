
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.therpro.vsfmod.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import com.therpro.vsfmod.VsfmodMod;

public class VsfmodModTabs {
	public static ResourceKey<CreativeModeTab> TAB_THE_VSF_MOD = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(VsfmodMod.MODID, "the_vsf_mod"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_THE_VSF_MOD, FabricItemGroup.builder().title(Component.translatable("item_group." + VsfmodMod.MODID + ".the_vsf_mod")).icon(() -> new ItemStack(Blocks.WATER)).build());
	}
}
