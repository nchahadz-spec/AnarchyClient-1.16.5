package com.anarchyclient.module;

public abstract class Module {
    private final String name;
    private final Category category;
    protected boolean enabled = false;

    public Module(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public void toggle() {
        enabled = !enabled;
        if (enabled) onEnable();
        else onDisable();
    }

    public abstract void onEnable();
    public abstract void onDisable();
    public void onUpdate() {}

    public String getName() { return name; }
    public Category getCategory() { return category; }
    public boolean isEnabled() { return enabled; }
}

enum Category {
    MOVEMENT, COMBAT, PLAYER, RENDER
}