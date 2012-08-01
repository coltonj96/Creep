package me.sciguymjm.Creep;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
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
		if(player.isOp() || player.hasPermission("creep.*")){
			
		if(commandLabel.equalsIgnoreCase("creep")) {
			/*if(args.length == 0){
				Block targetblock = player.getTargetBlock(null, 50);
				Location location = targetblock.getLocation();
				world.spawn(location, Creeper.class);
				} else */
			if(player.hasPermission("creep.creep"))
			{
			if (args.length == 1) {
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

		            sender.sendMessage(ChatColor.GRAY + "You creeped " + args[0] + "!");
				} else {
					player.sendMessage(ChatColor.RED + "Error: The player is offline.");
				}
			} else if (args.length > 1){
				player.sendMessage(ChatColor.RED + "Error: Too many arguments!");
			} else if (args.length < 1){
				player.sendMessage(ChatColor.RED + "Error: Not enough arguments!");
			}
		}
		}
		if(player.hasPermission("creep.zombie"))
		{
		if(commandLabel.equalsIgnoreCase("Zombie")) {
			/*if(args.length == 0){
				Block targetblock = player.getTargetBlock(null, 50);
				Location location = targetblock.getLocation();
				world.spawn(location, Zombie.class);
				} else */
			if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					/*Player targetplayer = player.getServer().getPlayer(args[0]);
					Location location = targetplayer.getLocation();
					world.spawn(location, Zombie.class);*/
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location Zombie1 = new Location(currentTargetWorld, x + 2.0D, y, z);
		            Location Zombie2 = new Location(currentTargetWorld, x - 2.0D, y, z);
		            Location Zombie3 = new Location(currentTargetWorld, x, y, z + 2.0D);
		            Location Zombie4 = new Location(currentTargetWorld, x, y, z - 2.0D);

		            Zombie s1 = (Zombie)targetPlayer.getWorld().spawn(Zombie1, Zombie.class);
		            Zombie s2 = (Zombie)targetPlayer.getWorld().spawn(Zombie2, Zombie.class);
		            Zombie s3 = (Zombie)targetPlayer.getWorld().spawn(Zombie3, Zombie.class);
		            Zombie s4 = (Zombie)targetPlayer.getWorld().spawn(Zombie4, Zombie.class);

		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);

		            sender.sendMessage(ChatColor.GRAY + "You spawned zombies around " + args[0] + "!");
				} else {
					player.sendMessage(ChatColor.RED + "Error: The player is offline.");
				}
			} else if (args.length > 1){
				player.sendMessage(ChatColor.RED + "Error: Too many arguments!");
			} else if (args.length < 1){
				player.sendMessage(ChatColor.RED + "Error: Not enough arguments!");
			}
		}
		}
		if(player.hasPermission("creep.creep"))
		{
		if(commandLabel.equalsIgnoreCase("skeleton")) {
			/*if(args.length == 0){
				Block targetblock = player.getTargetBlock(null, 50);
				Location location = targetblock.getLocation();
				world.spawn(location, Skeleton.class);
				} else */
			if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					/*Player targetplayer = player.getServer().getPlayer(args[0]);
					Location location = targetplayer.getLocation();
					world.spawn(location, Skeleton.class);*/
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location Skeleton1 = new Location(currentTargetWorld, x + 2.0D, y, z);
		            Location Skeleton2 = new Location(currentTargetWorld, x - 2.0D, y, z);
		            Location Skeleton3 = new Location(currentTargetWorld, x, y, z + 2.0D);
		            Location Skeleton4 = new Location(currentTargetWorld, x, y, z - 2.0D);

		            Skeleton s1 = (Skeleton)targetPlayer.getWorld().spawn(Skeleton1, Skeleton.class);
		            Skeleton s2 = (Skeleton)targetPlayer.getWorld().spawn(Skeleton2, Skeleton.class);
		            Skeleton s3 = (Skeleton)targetPlayer.getWorld().spawn(Skeleton3, Skeleton.class);
		            Skeleton s4 = (Skeleton)targetPlayer.getWorld().spawn(Skeleton4, Skeleton.class);

		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);

		            sender.sendMessage(ChatColor.GRAY + "You spawned skeletons around " + args[0] + "!");
				} else {
					player.sendMessage(ChatColor.RED + "Error: The player is offline.");
				}
			} else if (args.length > 1){
				player.sendMessage(ChatColor.RED + "Error: Too many arguments!");
			} else if (args.length < 1){
				player.sendMessage(ChatColor.RED + "Error: Not enough arguments!");
			}
		}
		}
		}
		return false;
	}
}
