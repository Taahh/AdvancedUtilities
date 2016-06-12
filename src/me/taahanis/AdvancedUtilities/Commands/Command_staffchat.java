package me.taahanis.AdvancedUtilities.Commands;

import me.taahanis.AdvancedUtilities.AdvancedUtils;
import me.taahanis.AdvancedUtilities.Modules.AdminChat;
import net.md_5.bungee.api.ChatColor;
import net.pravian.aero.command.CommandOptions;
import net.pravian.aero.command.SimpleCommand;
import net.pravian.aero.command.SourceType;
import org.apache.commons.lang.StringUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

@CommandOptions(source = SourceType.ANY, permission = "advancedutils.staffchat", aliases = "o")
public class Command_staffchat extends SimpleCommand<AdvancedUtils> {
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        
        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Correct Usage: /staffchat <message>");
            return true;
        }
        
        if (!sender.hasPermission("advancedutils.staffchat")) {
            sender.sendMessage(ChatColor.RED + "You have no permissions to execute this command!");
            return true;
        }
        
        AdminChat.staffChat(sender, StringUtils.join(args, " "));
        
        return true;
    }
    
}
