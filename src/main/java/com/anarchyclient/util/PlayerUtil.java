package com.anarchyclient.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;

public class PlayerUtil {

    private static final MinecraftClient mc = MinecraftClient.getInstance();

    public static ClientPlayerEntity getPlayer() {
        return mc.player;
    }

    public static boolean isMoving() {
        return mc.player != null && (mc.player.forwardSpeed != 0 || mc.player.sidewaysSpeed != 0);
    }

    public static void setMotion(double x, double y, double z) {
        if (mc.player != null) {
            mc.player.setVelocity(x, y, z);
        }
    }

    public static double getSpeed() {
        if (mc.player == null) return 0;
        double xz = Math.sqrt(mc.player.getVelocity().x * mc.player.getVelocity().x + mc.player.getVelocity().z * mc.player.getVelocity().z);
        return xz;
    }
}