package com.anarchyclient.module.modules;

import com.anarchyclient.module.Module;
import com.anarchyclient.module.Category;

public class Fly extends Module {
    public Fly() {
        super("Fly", Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        System.out.println("[Fly] Enabled - Add PacketFly logic here");
    }

    @Override
    public void onDisable() {
        System.out.println("[Fly] Disabled");
    }

    @Override
    public void onUpdate() {
        if (isEnabled()) {
            // Viết code bay ở đây (packet, velocity...)
        }
    }
}