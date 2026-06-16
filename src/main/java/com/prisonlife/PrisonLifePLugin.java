package com.prisonlife;

import org.bukkit.plugin.java.JavaPlugin;
import com.prisonlife.commands.JoinCommand;
import com.prisonlife.listeners.PrisonListener;
import com.prisonlife.listeners.GuardListener;

public class PrisonLifePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("PrisonLife Modu Aktif!");

        // Komutları kaydet
        new JoinCommand(this);

        // Listenerları kaydet
        getServer().getPluginManager().registerEvents(new PrisonListener(), this);
        getServer().getPluginManager().registerEvents(new GuardListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("PrisonLife Modu Kapatıldı.");
    }
}
