package me.taahanis.AdvancedUtilities.Modules;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdminChat {
    
    public static void staffChat(CommandSender sender, String message) {
        
        for (Player player : Bukkit.getOnlinePlayers()) {
            String name = sender.getName();
            message = ChatColor.translateAlternateColorCodes('&', message);
            if (player.hasPermission("advancedutils.staffchat.view")) {
                player.sendMessage("§8[§4AU§8] " + name + "§f: " + message);
            }
        }
        
    }
    
}
