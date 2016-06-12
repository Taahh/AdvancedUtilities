package me.taahanis.AdvancedUtilities.Listeners;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {
    
    
    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String name = player.getName();
        String developerJoin = ChatColor.AQUA + name + " is a " + ChatColor.DARK_PURPLE + "Developer";
        String joined = ChatColor.YELLOW + name + " joined the game";
        String developerTab = "§5§lDEV " + ChatColor.GOLD + name;
        String adminJoin = ChatColor.AQUA + name + " is an " + ChatColor.DARK_RED + "Admin";
        String adminTab = "§4§lADMIN " + ChatColor.GOLD + name;
        if (player.getName().equals("TheDankPhoenix")) {
            event.setJoinMessage(developerJoin);
            Bukkit.broadcastMessage(joined);
            player.setPlayerListName(developerTab);
        }
        else if (player.isOp()) {
            event.setJoinMessage(adminJoin);
            Bukkit.broadcastMessage(joined);
            player.setPlayerListName(adminTab);
        }
    }
    
}
