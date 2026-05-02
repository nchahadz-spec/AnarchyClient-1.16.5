package com.anarchyclient;

import net.fabricmc.api.ModInitializer;
import com.anarchyclient.module.ModuleManager;
import com.anarchyclient.gui.ClickGUI;

public class AnarchyClient implements ModInitializer {

    public static AnarchyClient INSTANCE;
    public static final String NAME = "AnarchyClient";
    public static final String VERSION = "1.0.0";

    @Override
    public void onInitialize() {
        INSTANCE = this;
        System.out.println("[" + NAME + " v" + VERSION + "] Loading...");

        ModuleManager.init();
        ClickGUI.init();

        System.out.println("[" + NAME + "] Loaded! Nhấn Right Shift để mở GUI.");
    }
}