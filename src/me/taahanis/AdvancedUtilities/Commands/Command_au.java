package me.taahanis.AdvancedUtilities.Commands;

import me.taahanis.AdvancedUtilities.AdvancedUtils;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.SimpleCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Command_au extends SimpleCommand<AdvancedUtils> {
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        sender.sendMessage(ChatColor.RED + "AdvancedUtils v" + plugin.getVersion() + " made by " + plugin.getAuthor());
        return true;
    }
    
}
