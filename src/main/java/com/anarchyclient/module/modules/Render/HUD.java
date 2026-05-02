package com.anarchyclient.module.modules;

import com.anarchyclient.module.Module;
import com.anarchyclient.module.Category;

public class HUD extends Module {
    public HUD() {
        super("HUD", Category.RENDER);
    }

    @Override
    public void onEnable() {
        System.out.println("[HUD] Enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("[HUD] Disabled");
    }
}