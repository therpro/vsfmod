/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package com.therpro.vsfmod;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

import com.therpro.vsfmod.init.VsfmodModTabs;
import com.therpro.vsfmod.init.VsfmodModProcedures;
import com.therpro.vsfmod.init.VsfmodModMenus;
import com.therpro.vsfmod.init.VsfmodModItems;
import com.therpro.vsfmod.init.VsfmodModBlocks;

public class VsfmodMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "vsfmod";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing VsfmodMod");

		VsfmodModTabs.load();

		VsfmodModBlocks.load();
		VsfmodModItems.load();

		VsfmodModProcedures.load();

		VsfmodModMenus.load();

	}
}
