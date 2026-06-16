package com.prisonlife;

import com.prisonlife.commands.JoinCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class PrisonLifePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        new JoinCommand(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
