package com.anarchyclient.module.modules;

import com.anarchyclient.module.Module;
import com.anarchyclient.module.Category;

public class ESP extends Module {
    public ESP() {
        super("ESP", Category.RENDER);
    }

    @Override
    public void onEnable() {
        System.out.println("[ESP] Enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("[ESP] Disabled");
    }
}