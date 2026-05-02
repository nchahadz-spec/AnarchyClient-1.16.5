package com.anarchyclient.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;

public class RenderUtil {

    private static final MinecraftClient mc = MinecraftClient.getInstance();

    public static void drawRect(MatrixStack matrices, int x, int y, int width, int height, int color) {
        DrawableHelper.fill(matrices, x, y, x + width, y + height, color);
    }

    public static void drawOutline(MatrixStack matrices, int x, int y, int width, int height, int color) {
        // Vẽ viền đơn giản
        drawRect(matrices, x, y, width, 1, color);           // top
        drawRect(matrices, x, y + height - 1, width, 1, color); // bottom
        drawRect(matrices, x, y, 1, height, color);          // left
        drawRect(matrices, x + width - 1, y, 1, height, color); // right
    }
}