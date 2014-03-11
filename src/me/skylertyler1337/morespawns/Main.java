package me.skylertyler1337.morespawns;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Main extends JavaPlugin implments Listener{
	
	@Override
	public void onEnable() {
	System.out.println("[MoreSpawns] is Enabled!");
	getServer().getPluginManager().registerEvents(this,this);
	}

	@Override
	public void onDisable() {
	System.out.println("[MoreSpawns] is Disabled!");
	}
	
	public void TeleportinWorld(Player player, int x, int y, int z){
		 player.teleport(new Location(player.getWorld(), x, y, z));
	}
	
	//little note it don't work with something like TeleportinWorld(player, -5.2,50,-5.2)
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args){
	    Player player = (Player) sender;
	  if(label.equalsIgnoreCase("spawn")){
		  if(!(args.length == 1)){
			  sender.sendMessage(ChatColor.RED+"/spawn [1,2]");
		  }
		  if(args.length ==1){
			  if(args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("one")){
				  TeleportinWorld(player, -7, 64, -69);
				  player.sendMessage(ChatColor.GREEN+"You Teleported to the First Spawn");
			  }
			  if(args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("two")){
				  TeleportinWorld(player, -30, 68, 5);
				  player.sendMessage(ChatColor.GOLD+"You Teleported to the Second Spawn");
			  }
		  }
	  }
		return false;
	   
	}
	
}

