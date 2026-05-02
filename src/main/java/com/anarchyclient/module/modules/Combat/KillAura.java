package com.anarchyclient.module.modules;

import com.anarchyclient.module.Module;
import com.anarchyclient.module.Category;

public class KillAura extends Module {
    public KillAura() {
        super("KillAura", Category.COMBAT);
    }

    @Override
    public void onEnable() {
        System.out.println("[KillAura] Enabled");
    }

    @Override
    public void onDisable() {
        System.out.println("[KillAura] Disabled");
    }

    @Override
    public void onUpdate() {
        if (isEnabled()) {
            // Code tìm entity + attack ở đây
        }
    }
}