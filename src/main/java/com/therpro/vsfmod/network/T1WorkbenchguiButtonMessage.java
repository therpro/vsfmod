
package com.therpro.vsfmod.network;

import net.minecraft.world.level.Level;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.FriendlyByteBuf;

import net.fabricmc.fabric.api.networking.v1.PacketSender;

import java.util.HashMap;

import io.netty.buffer.Unpooled;

import com.therpro.vsfmod.world.inventory.T1WorkbenchguiMenu;
import com.therpro.vsfmod.procedures.RevolverCraftingProcedure;
import com.therpro.vsfmod.procedures.RevolverBulletCraftingProcedure;

public class T1WorkbenchguiButtonMessage extends FriendlyByteBuf {
	public T1WorkbenchguiButtonMessage(int buttonID, int x, int y, int z) {
		super(Unpooled.buffer());
		writeInt(buttonID);
		writeInt(x);
		writeInt(y);
		writeInt(z);
	}

	public static void apply(MinecraftServer server, ServerPlayer entity, ServerGamePacketListenerImpl handler, FriendlyByteBuf buf, PacketSender responseSender) {
		int buttonID = buf.readInt();
		double x = buf.readInt();
		double y = buf.readInt();
		double z = buf.readInt();
		server.execute(() -> {
			Level world = entity.level();
			HashMap guistate = T1WorkbenchguiMenu.guistate;
			if (buttonID == 0) {

				RevolverCraftingProcedure.execute();
			}
			if (buttonID == 1) {

				RevolverBulletCraftingProcedure.execute(entity);
			}
		});
	}
}
