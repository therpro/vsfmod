
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.therpro.vsfmod.init;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;

import com.therpro.vsfmod.world.inventory.T1WorkbenchguiMenu;
import com.therpro.vsfmod.VsfmodMod;

public class VsfmodModMenus {
	public static MenuType<T1WorkbenchguiMenu> T_1_WORKBENCHGUI;

	public static void load() {
		T_1_WORKBENCHGUI = Registry.register(BuiltInRegistries.MENU, new ResourceLocation(VsfmodMod.MODID, "t_1_workbenchgui"), new ExtendedScreenHandlerType<>(T1WorkbenchguiMenu::new));
		T1WorkbenchguiMenu.screenInit();
	}
}
