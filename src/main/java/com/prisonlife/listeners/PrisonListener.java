package com.prisonlife.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class PrisonListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (!e.getView().getTitle().equals("🔒 PrisonLife Katıl")) return;

        e.setCancelled(true);
        if (e.getCurrentItem() == null) return;

        Player player = (Player) e.getWhoClicked();
        if (e.getSlot() == 11) { // Mahkum butonu
            player.sendMessage("✅ Mahkum olarak katıldın!");
            player.closeInventory();
            // TODO: Mahkum spawn ayarla
        }
    }
}
