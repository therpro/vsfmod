
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.therpro.vsfmod.init;

import net.minecraft.client.gui.screens.MenuScreens;

import com.therpro.vsfmod.client.gui.T1WorkbenchguiScreen;

public class VsfmodModScreens {
	public static void load() {
		MenuScreens.register(VsfmodModMenus.T_1_WORKBENCHGUI, T1WorkbenchguiScreen::new);
	}
}
