package com.patulacci.votifier;

import org.bukkit.plugin.java.JavaPlugin;

public final class Votifier extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new VotifierEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
