
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.therpro.vsfmod.init;

import com.therpro.vsfmod.procedures.ScrifitualKnifeLivingEntityIsHitWithItemProcedure;
import com.therpro.vsfmod.procedures.RevolverRightclickedProcedure;
import com.therpro.vsfmod.procedures.RevolverPlayerFinishesUsingItemProcedure;
import com.therpro.vsfmod.procedures.RevolverCraftingProcedure;
import com.therpro.vsfmod.procedures.RevolverBulletCraftingProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class VsfmodModProcedures {
	public static void load() {
		new RevolverPlayerFinishesUsingItemProcedure();
		new RevolverRightclickedProcedure();
		new RevolverCraftingProcedure();
		new RevolverBulletCraftingProcedure();
		new ScrifitualKnifeLivingEntityIsHitWithItemProcedure();
	}
}
