package me.sciguymjm.Creep;

import java.io.IOException;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
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
	public boolean onCommand(CommandSender cs, Command cmd, String string, String[] args) {
		Player player = (Player) cs;
		if(string.equalsIgnoreCase("creep")) {
			if(player.hasPermission("creep.creep") || player.isOp() || player.hasPermission("creep.*"))
			{
			if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location a1 = new Location(currentTargetWorld, x + 2.0D, y, z);
		            Location a2 = new Location(currentTargetWorld, x - 2.0D, y, z);
		            Location a3 = new Location(currentTargetWorld, x, y, z + 2.0D);
		            Location a4 = new Location(currentTargetWorld, x, y, z - 2.0D);

		            Creeper s1 = (Creeper)targetPlayer.getWorld().spawn(a1, Creeper.class);
		            Creeper s2 = (Creeper)targetPlayer.getWorld().spawn(a2, Creeper.class);
		            Creeper s3 = (Creeper)targetPlayer.getWorld().spawn(a3, Creeper.class);
		            Creeper s4 = (Creeper)targetPlayer.getWorld().spawn(a4, Creeper.class);
		            
		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);

		            cs.sendMessage(ChatColor.GRAY + "You creeped " + targetPlayer.getDisplayName() + "!");
				} else {
					cs.sendMessage(ChatColor.RED + "Error: The player is offline.");
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
		if(string.equalsIgnoreCase("Zombie")) {
			if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location b1 = new Location(currentTargetWorld, x + 2.0D, y, z);
		            Location b2 = new Location(currentTargetWorld, x - 2.0D, y, z);
		            Location b3 = new Location(currentTargetWorld, x, y, z + 2.0D);
		            Location b4 = new Location(currentTargetWorld, x, y, z - 2.0D);

		            Zombie s1 = (Zombie)targetPlayer.getWorld().spawn(b1, Zombie.class);
		            Zombie s2 = (Zombie)targetPlayer.getWorld().spawn(b2, Zombie.class);
		            Zombie s3 = (Zombie)targetPlayer.getWorld().spawn(b3, Zombie.class);
		            Zombie s4 = (Zombie)targetPlayer.getWorld().spawn(b4, Zombie.class);

		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);

		            cs.sendMessage(ChatColor.GRAY + "You spawned zombies around " + targetPlayer.getDisplayName() + "!");
				} else {
					cs.sendMessage(ChatColor.RED + "Error: The player is offline.");
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
		if(string.equalsIgnoreCase("skeleton")) {
			if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location c1 = new Location(currentTargetWorld, x + 2.0D, y, z);
		            Location c2 = new Location(currentTargetWorld, x - 2.0D, y, z);
		            Location c3 = new Location(currentTargetWorld, x, y, z + 2.0D);
		            Location c4 = new Location(currentTargetWorld, x, y, z - 2.0D);

		            Skeleton s1 = (Skeleton)targetPlayer.getWorld().spawn(c1, Skeleton.class);
		            Skeleton s2 = (Skeleton)targetPlayer.getWorld().spawn(c2, Skeleton.class);
		            Skeleton s3 = (Skeleton)targetPlayer.getWorld().spawn(c3, Skeleton.class);
		            Skeleton s4 = (Skeleton)targetPlayer.getWorld().spawn(c4, Skeleton.class);

		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);

		            cs.sendMessage(ChatColor.GRAY + "You spawned skeletons around " + targetPlayer.getDisplayName() + "!");
				} else {
					cs.sendMessage(ChatColor.RED + "Error: The player is offline.");
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
		if(string.equalsIgnoreCase("spider")) {
			if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location d1 = new Location(currentTargetWorld, x + 2.0D, y, z);
		            Location d2 = new Location(currentTargetWorld, x - 2.0D, y, z);
		            Location d3 = new Location(currentTargetWorld, x, y, z + 2.0D);
		            Location d4 = new Location(currentTargetWorld, x, y, z - 2.0D);

		            Spider s1 = (Spider)targetPlayer.getWorld().spawn(d1, Spider.class);
		            Spider s2 = (Spider)targetPlayer.getWorld().spawn(d2, Spider.class);
		            Spider s3 = (Spider)targetPlayer.getWorld().spawn(d3, Spider.class);
		            Spider s4 = (Spider)targetPlayer.getWorld().spawn(d4, Spider.class);

		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);

		            cs.sendMessage(ChatColor.GRAY + "You spawned Spiders around " + targetPlayer.getDisplayName() + "!");
				} else {
					cs.sendMessage(ChatColor.RED + "Error: The player is offline.");
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
		if(string.equalsIgnoreCase("enderman")) {
			if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location e1 = new Location(currentTargetWorld, x + 2.0D, y, z);
		            Location e2 = new Location(currentTargetWorld, x - 2.0D, y, z);
		            Location e3 = new Location(currentTargetWorld, x, y, z + 2.0D);
		            Location e4 = new Location(currentTargetWorld, x, y, z - 2.0D);

		            Enderman s1 = (Enderman)targetPlayer.getWorld().spawn(e1, Enderman.class);
		            Enderman s2 = (Enderman)targetPlayer.getWorld().spawn(e2, Enderman.class);
		            Enderman s3 = (Enderman)targetPlayer.getWorld().spawn(e3, Enderman.class);
		            Enderman s4 = (Enderman)targetPlayer.getWorld().spawn(e4, Enderman.class);

		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);

		            cs.sendMessage(ChatColor.GRAY + "You spawned endermen around " + targetPlayer.getDisplayName() + "!");
				} else {
					cs.sendMessage(ChatColor.RED + "Error: The player is offline.");
				}
			} else if (args.length > 1){
				player.sendMessage(ChatColor.RED + "Error: Too many arguments!");
			} else if (args.length < 1){
				player.sendMessage(ChatColor.RED + "Error: Not enough arguments!");
			}
		}
		}
		if(string.equalsIgnoreCase("Swarm")) {
			if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location e1 = new Location(currentTargetWorld, x + 3.0D, y, z);
		            Location e2 = new Location(currentTargetWorld, x - 3.0D, y, z);
		            Location e3 = new Location(currentTargetWorld, x, y, z + 3.0D);
		            Location e4 = new Location(currentTargetWorld, x, y, z - 3.0D);
		            Location e5 = new Location(currentTargetWorld, x + 1.0D, y, z + 1.0D);
		            Location e6 = new Location(currentTargetWorld, x + 1.0D, y, z - 1.0D);
		            Location e7 = new Location(currentTargetWorld, x + 1.0D, y, z - 1.0D);
		            Location e8 = new Location(currentTargetWorld, x - 1.0D, y, z - 1.0D);

		            Enderman s1 = (Enderman)targetPlayer.getWorld().spawn(e1, Enderman.class);
		            Zombie s2 = (Zombie)targetPlayer.getWorld().spawn(e2, Zombie.class);
		            Blaze s3 = (Blaze)targetPlayer.getWorld().spawn(e3, Blaze.class);
		            PigZombie s4 = (PigZombie)targetPlayer.getWorld().spawn(e4, PigZombie.class);
		            Spider s5 = (Spider)targetPlayer.getWorld().spawn(e5, Spider.class);
		            Skeleton s6 = (Skeleton)targetPlayer.getWorld().spawn(e6, Skeleton.class);
		            Creeper s7 = (Creeper)targetPlayer.getWorld().spawn(e7, Creeper.class);
		            CaveSpider s8 = (CaveSpider)targetPlayer.getWorld().spawn(e8, CaveSpider.class);

		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);
		            s5.setTarget(targetPlayer);
		            s6.setTarget(targetPlayer);
		            s7.setTarget(targetPlayer);
		            s8.setTarget(targetPlayer);

		            cs.sendMessage(ChatColor.GRAY + "You spawned a swarm around " + targetPlayer.getDisplayName() + "!");
				} else {
					cs.sendMessage(ChatColor.RED + "Error: That player is offline.");
				}
			} else if (args.length > 1){
				player.sendMessage(ChatColor.RED + "Error: Too many arguments!");
			} else if (args.length < 1){
				player.sendMessage(ChatColor.RED + "Error: Not enough arguments!");
			}
		}
		if(player.hasPermission("creep.pigzombie") || player.isOp() || player.hasPermission("creep.*"))
		{
		if(string.equalsIgnoreCase("pigzombie")) {
			if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location f1 = new Location(currentTargetWorld, x + 2.0D, y, z);
		            Location f2 = new Location(currentTargetWorld, x - 2.0D, y, z);
		            Location f3 = new Location(currentTargetWorld, x, y, z + 2.0D);
		            Location f4 = new Location(currentTargetWorld, x, y, z - 2.0D);

		            PigZombie s1 = (PigZombie)targetPlayer.getWorld().spawn(f1, PigZombie.class);
		            PigZombie s2 = (PigZombie)targetPlayer.getWorld().spawn(f2, PigZombie.class);
		            PigZombie s3 = (PigZombie)targetPlayer.getWorld().spawn(f3, PigZombie.class);
		            PigZombie s4 = (PigZombie)targetPlayer.getWorld().spawn(f4, PigZombie.class);

		            s1.setAngry(true);
		            s2.setAngry(true);
		            s3.setAngry(true);
		            s4.setAngry(true);
		            
		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);

		            cs.sendMessage(ChatColor.GRAY + "You spawned Zombie Pigmen around " + targetPlayer.getDisplayName() + "!");
				} else {
					cs.sendMessage(ChatColor.RED + "Error: That player is offline.");
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