package me.sciguymjm.Creep;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;



public class Creep extends JavaPlugin{
	public static Creep plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " is now disabled.");
	}
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " version " + pdfFile.getVersion() + " is now enabled.");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		World world = player.getWorld();
		if(commandLabel.equalsIgnoreCase("creep")) {
			if(args.length == 0){
				Block targetblock = player.getTargetBlock(null, 50);
				Location location = targetblock.getLocation();
				world.spawn(location, Creeper.class);
				
			} else if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					/*Player targetplayer = player.getServer().getPlayer(args[0]);
					Location location = targetplayer.getLocation();
					world.spawn(location, Creeper.class);*/
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location Creeper1 = new Location(currentTargetWorld, x + 2.0D, y, z);
		            Location Creeper2 = new Location(currentTargetWorld, x - 2.0D, y, z);
		            Location Creeper3 = new Location(currentTargetWorld, x, y, z + 2.0D);
		            Location Creeper4 = new Location(currentTargetWorld, x, y, z - 2.0D);

		            Creeper s1 = (Creeper)targetPlayer.getWorld().spawn(Creeper1, Creeper.class);
		            Creeper s2 = (Creeper)targetPlayer.getWorld().spawn(Creeper2, Creeper.class);
		            Creeper s3 = (Creeper)targetPlayer.getWorld().spawn(Creeper3, Creeper.class);
		            Creeper s4 = (Creeper)targetPlayer.getWorld().spawn(Creeper4, Creeper.class);

		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);

		            sender.sendMessage(ChatColor.RED + "You spawned Creepers near " + args[0] + "!");
				} else {
					player.sendMessage(ChatColor.RED + "Error: The player is offline.");
				}
			} else if (args.length > 1){
				player.sendMessage(ChatColor.RED + "Error: Too many arguments!");
			}
			
		}
		return false;
	}
}
