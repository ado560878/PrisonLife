package com.prisonlife.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import com.prisonlife.PrisonLifePlugin;

public class JoinCommand implements CommandExecutor {

    private final PrisonLifePlugin plugin;

    // Constructor: Plugin referansı al
    public JoinCommand(PrisonLifePlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Sadece oyuncular bu komutu kullanabilir!");
            return true;
        }

        Player player = (Player) sender;

        // Örnek: Bir ItemStack oluştur (ItemBuilder yerine doğrudan ItemStack kullan)
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        player.getInventory().addItem(item);

        player.sendMessage("§aBaşarıyla katıldın!");
        return true;
    }
}
