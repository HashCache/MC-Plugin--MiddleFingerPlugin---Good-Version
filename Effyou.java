package net.codexcraftmc.hashcache;

import org.bukkit.plugin.java.JavaPlugin;

public class Effyou extends JavaPlugin {
	
    @Override
    public void onEnable() {
    	this.getCommand("fuckyou").setExecutor(new CommandListener(this));
    	getLogger().info("HashCache's Plugin has been enabled");
    }
   
    @Override
    public void onDisable() {
       getLogger().info("HashCache's Plugin has been disabled");
    }

}
