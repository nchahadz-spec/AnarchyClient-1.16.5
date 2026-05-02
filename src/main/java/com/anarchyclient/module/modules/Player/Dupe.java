package com.anarchyclient.module.modules;

import com.anarchyclient.module.Module;
import com.anarchyclient.module.Category;

public class Dupe extends Module {
    public Dupe() {
        super("Dupe", Category.PLAYER);
    }

    @Override
    public void onEnable() {
        System.out.println("[Dupe] Enabled - Use on supported servers");
    }

    @Override
    public void onDisable() {
        System.out.println("[Dupe] Disabled");
    }
}