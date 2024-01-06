package com.therpro.vsfmod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import com.therpro.vsfmod.init.VsfmodModItems;

public class ScrifitualKnifeLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(VsfmodModItems.BLOOD);
			_setstack.setCount(1);
			_player.getInventory().add(_setstack);
		}
	}
}
