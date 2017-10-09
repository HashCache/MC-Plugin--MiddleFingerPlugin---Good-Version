package net.codexcraftmc.hashcache;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandListener implements CommandExecutor {
	
    private final Effyou plugin;

	public CommandListener(Effyou plugin) {
    	this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    Player p = (Player) sender;
   if (args.length == 1) { 	
    	
        if (cmd.getName().equalsIgnoreCase("fuckyou") && p.hasPermission("fuck.you")) {
        	Player target = Bukkit.getPlayer(args[0]);

        	if (target != null) {
        		String message1 = "§4....................../´¯/)";
        		String message2 = "§4....................,/¯../";
        		String message3 = "§4.................../..../";
        		String message4 = "§4............./´¯/'...'/´¯¯`·¸";
        		String message5 = "§4........../'/.../..../......./¨¯`";
        		String message6 = "§4........('(...´...´.... ¯~/'...')";
        		String message7 = "§4.........`.................'...../";
        		String message8 = "§4..........''...`.......... _.·´";
        		String message9 = "§4............`..............(";
        		String message10  = "§4..............`.............`...";
        		String message11 =  "§4┌∩┐(◣_◢)┌∩┐";
        		for (int i = 1; i != args.length; i++);
        		target.sendMessage(message1);
        		target.sendMessage(message2);
        		target.sendMessage(message3);
        		target.sendMessage(message4);
        		target.sendMessage(message5);
        		target.sendMessage(message6);
        		target.sendMessage(message7);
        		target.sendMessage(message8);
        		target.sendMessage(message9);
        		target.sendMessage(message10);
        		target.sendMessage(message11 + " from " + sender.getName() + " " + message11);
        	} else if(!(target != null)) {
        		sender.sendMessage("§4That player isn't online :(");
        	}
        	
            return true;
        }
   
    } else if (p.hasPermission("fuck.you")) {sender.sendMessage("§4 usage: /fuckyou <playername>");
    return true;
    } else {
    	sender.sendMessage("§4You do not have permission!");
    	return true;
    }
return false;
   }
}