package me.sciguymjm.Creep;

import java.io.IOException;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Zombie;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.mcstats.MetricsLite;



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
		try {
		    MetricsLite metrics = new MetricsLite(this);
		    metrics.start();
		} catch (IOException e) {
		    // Failed to submit the stats :-(
		}
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		Player player = (Player) sender;
		if(commandLabel.equalsIgnoreCase("creep")) {
			/*if(args.length == 0){
				Block targetblock = player.getTargetBlock(null, 50);
				Location location = targetblock.getLocation();
				world.spawn(location, Creeper.class);
				} else */
			if(player.hasPermission("creep.creep") || player.isOp() || player.hasPermission("creep.*"))
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
		if(player.hasPermission("creep.zombie") || player.isOp() || player.hasPermission("creep.*"))
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
		if(player.hasPermission("creep.skeleton") || player.isOp() || player.hasPermission("creep.*"))
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
		if(player.hasPermission("creep.spider") || player.isOp() || player.hasPermission("creep.*"))
		{
		if(commandLabel.equalsIgnoreCase("spider")) {
			/*if(args.length == 0){
				Block targetblock = player.getTargetBlock(null, 50);
				Location location = targetblock.getLocation();
				world.spawn(location, Spider.class);
				} else */
			if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					/*Player targetplayer = player.getServer().getPlayer(args[0]);
					Location location = targetplayer.getLocation();
					world.spawn(location, Spider.class);*/
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location Spider1 = new Location(currentTargetWorld, x + 2.0D, y, z);
		            Location Spider2 = new Location(currentTargetWorld, x - 2.0D, y, z);
		            Location Spider3 = new Location(currentTargetWorld, x, y, z + 2.0D);
		            Location Spider4 = new Location(currentTargetWorld, x, y, z - 2.0D);

		            Spider s1 = (Spider)targetPlayer.getWorld().spawn(Spider1, Spider.class);
		            Spider s2 = (Spider)targetPlayer.getWorld().spawn(Spider2, Spider.class);
		            Spider s3 = (Spider)targetPlayer.getWorld().spawn(Spider3, Spider.class);
		            Spider s4 = (Spider)targetPlayer.getWorld().spawn(Spider4, Spider.class);

		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);

		            sender.sendMessage(ChatColor.GRAY + "You spawned Spiders around " + args[0] + "!");
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
		if(player.hasPermission("creep.enderman") || player.isOp() || player.hasPermission("creep.*"))
		{
		if(commandLabel.equalsIgnoreCase("enderman")) {
			/*if(args.length == 0){
				Block targetblock = player.getTargetBlock(null, 50);
				Location location = targetblock.getLocation();
				world.spawn(location, Enderman.class);
				} else */
			if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					/*Player targetplayer = player.getServer().getPlayer(args[0]);
					Location location = targetplayer.getLocation();
					world.spawn(location, Enderman.class);*/
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location Enderman1 = new Location(currentTargetWorld, x + 2.0D, y, z);
		            Location Enderman2 = new Location(currentTargetWorld, x - 2.0D, y, z);
		            Location Enderman3 = new Location(currentTargetWorld, x, y, z + 2.0D);
		            Location Enderman4 = new Location(currentTargetWorld, x, y, z - 2.0D);

		            Enderman s1 = (Enderman)targetPlayer.getWorld().spawn(Enderman1, Enderman.class);
		            Enderman s2 = (Enderman)targetPlayer.getWorld().spawn(Enderman2, Enderman.class);
		            Enderman s3 = (Enderman)targetPlayer.getWorld().spawn(Enderman3, Enderman.class);
		            Enderman s4 = (Enderman)targetPlayer.getWorld().spawn(Enderman4, Enderman.class);

		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);

		            sender.sendMessage(ChatColor.GRAY + "You spawned endermen around " + args[0] + "!");
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
		if(player.hasPermission("creep.pigzombie") || player.isOp() || player.hasPermission("creep.*"))
		{
		if(commandLabel.equalsIgnoreCase("pigzombie")) {
			/*if(args.length == 0){
				Block targetblock = player.getTargetBlock(null, 50);
				Location location = targetblock.getLocation();
				world.spawn(location, PigZombie.class);
				} else */
			if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					/*Player targetplayer = player.getServer().getPlayer(args[0]);
					Location location = targetplayer.getLocation();
					world.spawn(location, PigZombie.class);*/
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location PigZombie1 = new Location(currentTargetWorld, x + 2.0D, y, z);
		            Location PigZombie2 = new Location(currentTargetWorld, x - 2.0D, y, z);
		            Location PigZombie3 = new Location(currentTargetWorld, x, y, z + 2.0D);
		            Location PigZombie4 = new Location(currentTargetWorld, x, y, z - 2.0D);

		            PigZombie s1 = (PigZombie)targetPlayer.getWorld().spawn(PigZombie1, PigZombie.class);
		            PigZombie s2 = (PigZombie)targetPlayer.getWorld().spawn(PigZombie2, PigZombie.class);
		            PigZombie s3 = (PigZombie)targetPlayer.getWorld().spawn(PigZombie3, PigZombie.class);
		            PigZombie s4 = (PigZombie)targetPlayer.getWorld().spawn(PigZombie4, PigZombie.class);

		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);

		            sender.sendMessage(ChatColor.GRAY + "You spawned Zombie Pigmen around " + args[0] + "!");
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
		return false;
	}
}
