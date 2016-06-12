package me.taahanis.AdvancedUtilities;

import me.taahanis.AdvancedUtilities.Commands.Command_au;
import net.pravian.aero.command.handler.AeroCommandHandler;
import net.pravian.aero.command.handler.SimpleCommandHandler;
import net.pravian.aero.config.YamlConfig;
import net.pravian.aero.plugin.AeroPlugin;
import net.pravian.aero.util.Loggers;

public class AdvancedUtils extends AeroPlugin<AdvancedUtils> {
    
    public static AdvancedUtils plugin;
    public AeroCommandHandler handler;
    public static YamlConfig config;
    
    @Override
    public void load() {
        AdvancedUtils.plugin = this;
        this.config = new YamlConfig(plugin, "config.yml", true);
        Loggers.info("[AU] Loading v" + plugin.getVersion() + " made by " + plugin.getAuthor());
    }

    @Override
    public void enable() {
        handler = new SimpleCommandHandler(plugin);
        handler.setCommandClassPrefix("Command_");
        handler.loadFrom(Command_au.class.getPackage());
        handler.registerAll(handler.getCommandClassPrefix(), true);
        
        config.load();
        
        Loggers.info("[AU] Enabled v" + plugin.getVersion() + " made by " + plugin.getAuthor());
    }

    @Override
    public void disable() {
        
        Loggers.info("[AU] Disabled v" + plugin.getVersion() + " made by " + plugin.getAuthor());
        config.save();
        AdvancedUtils.plugin = null;
        
    }

    
}
