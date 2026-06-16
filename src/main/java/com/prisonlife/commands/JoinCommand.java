package com.prisonlife.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import com.prisonlife.PrisonLifePlugin;

public class JoinCommand implements CommandExecutor {
    private final PrisonLifePlugin plugin;

    public JoinCommand(PrisonLifePlugin plugin) {
        this.plugin = plugin;
        plugin.getCommand("pb").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) return false;

        Player player = (Player) sender;
        Inventory gui = Bukkit.createInventory(null, 27, "🔒 PrisonLife Katıl");

        // Mahkum butonu
        gui.setItem(11, new ItemBuilder(Material.IRON_BARS).setName("🔨 Mahkum Ol").build());

        // Gardiyan butonu
        gui.setItem(15, new ItemBuilder(Material.IRON_SWORD).setName("🛡️ Gardiyan Ol").build());

        player.openInventory(gui);
        return true;
    }
}
