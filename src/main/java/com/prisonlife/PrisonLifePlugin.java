package com.prisonlife;

import org.bukkit.plugin.java.JavaPlugin;
import com.prisonlife.commands.JoinCommand;

public final class PrisonLifePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin enable logic
        getLogger().info("PrisonLifePlugin enabled!");

        // JoinCommand'ı kaydet
        getCommand("join").setExecutor(new JoinCommand(this));
    }

    @Override
    public void onDisable() {
        // Plugin disable logic
        getLogger().info("PrisonLifePlugin disabled!");
    }
}
