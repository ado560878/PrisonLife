package com.prisonlife.commands;

import com.prisonlife.PrisonLifePlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class JoinCommand implements CommandExecutor {

    private final PrisonLifePlugin plugin;

    public JoinCommand(PrisonLifePlugin plugin) {
        this.plugin = plugin;
        plugin.getCommand("join").setExecutor(this);
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        return true;
    }
}
