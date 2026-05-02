package com.anarchyclient.module.modules;

import com.anarchyclient.module.Module;
import com.anarchyclient.module.Category;
import com.anarchyclient.util.PlayerUtil;

public class Speed extends Module {
    public Speed() {
        super("Speed", Category.MOVEMENT);
    }

    @Override
    public void onEnable() {
        System.out.println("[Speed] Enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("[Speed] Disabled");
    }

    @Override
    public void onUpdate() {
        if (isEnabled() && PlayerUtil.isMoving()) {
            double speed = 0.5; // chỉnh tốc độ
            double yaw = Math.toRadians(PlayerUtil.getPlayer().yaw);
            PlayerUtil.getPlayer().setVelocity(-Math.sin(yaw) * speed, PlayerUtil.getPlayer().getVelocity().y, Math.cos(yaw) * speed);
        }
    }
}