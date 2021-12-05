package com.matyrobbrt.lib.compat;

import com.matyrobbrt.lib.MatyLib;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Util;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

import vazkii.patchouli.api.PatchouliAPI;

public class PatchouliUtils {

	public static void openBookGUI(ServerPlayerEntity player, ResourceLocation id) {
		if (MatyLib.patchouliLoaded) {
			PatchouliAPI.get().openBookGUI(player, id);
		} else {
			player.sendMessage(new StringTextComponent(TextFormatting.RED + "Patchouli is missing! No manual present"),
					Util.NIL_UUID);
		}
	}

	public static void openBookEntry(ServerPlayerEntity player, ResourceLocation id, ResourceLocation entry, int page) {
		if (MatyLib.patchouliLoaded) {
			PatchouliAPI.get().openBookEntry(player, id, entry, page);
		} else {
			player.sendMessage(new StringTextComponent(TextFormatting.RED + "Patchouli is missing! No manual present"),
					Util.NIL_UUID);
		}
	}

}
