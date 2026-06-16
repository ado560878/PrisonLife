// Dosya ismi: JoinCommand.java
package com.prisonlife.commands;

import com.prisonlife.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class JoinCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Sadece oyuncular kullanabilir!");
            return true;
        }

        Player player = (Player) sender;
        ItemStack item = new ItemBuilder(Material.DIAMOND_SWORD)
                .setName("§aKatılım Kılıcı")
                .build();

        player.getInventory().addItem(item);
        return true;
    }
}
