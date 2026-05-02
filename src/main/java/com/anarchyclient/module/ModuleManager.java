package com.anarchyclient.module;

import com.anarchyclient.module.modules.*;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    public static final List<Module> modules = new ArrayList<>();

    public static void init() {
        // Movement
        modules.add(new Fly());
        modules.add(new Speed());
        // Combat
        modules.add(new KillAura());
        // Player
        modules.add(new Dupe());
        // Render
        modules.add(new ESP());
        modules.add(new HUD());
    }
}