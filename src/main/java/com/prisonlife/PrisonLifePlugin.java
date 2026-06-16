package com.prisonlife;

import com.prisonlife.commands.JoinCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class PrisonLifePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("join").setExecutor(new JoinCommand());
    }
}
