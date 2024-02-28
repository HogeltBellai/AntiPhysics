package ru.hogeltbellai.antiphysics;

import org.bukkit.plugin.java.JavaPlugin;

public final class AntiPhysics extends JavaPlugin {

    private static AntiPhysics instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {

    }

    public static AntiPhysics getInstance() {
        return instance;
    }
}
