
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.therpro.vsfmod.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import com.therpro.vsfmod.block.T1WorkbanchBlock;
import com.therpro.vsfmod.VsfmodMod;

public class VsfmodModBlocks {
	public static Block T_1_WORKBANCH;

	public static void load() {
		T_1_WORKBANCH = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(VsfmodMod.MODID, "t_1_workbanch"), new T1WorkbanchBlock());
	}

	public static void clientLoad() {
		T1WorkbanchBlock.clientInit();
	}
}
