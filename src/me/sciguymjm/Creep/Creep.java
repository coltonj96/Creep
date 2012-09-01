package me.sciguymjm.Creep;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Animals;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Flying;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Giant;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Monster;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Pig;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.entity.Villager;
import org.bukkit.entity.WaterMob;
import org.bukkit.entity.Wolf;
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
			if(player.hasPermission("creep.creep") || player.isOp() || player.hasPermission("creep.*")) {
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

		            Creeper s1 = (Creeper)targetPlayer.getWorld().spawnEntity(a1, EntityType.CREEPER);
		            Creeper s2 = (Creeper)targetPlayer.getWorld().spawnEntity(a2, EntityType.CREEPER);
		            Creeper s3 = (Creeper)targetPlayer.getWorld().spawnEntity(a3, EntityType.CREEPER);
		            Creeper s4 = (Creeper)targetPlayer.getWorld().spawnEntity(a4, EntityType.CREEPER);

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
		if(player.hasPermission("creep.zombie") || player.isOp() || player.hasPermission("creep.*")) {
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

		            Zombie s1 = (Zombie)targetPlayer.getWorld().spawnEntity(b1, EntityType.ZOMBIE);
		            Zombie s2 = (Zombie)targetPlayer.getWorld().spawnEntity(b2, EntityType.ZOMBIE);
		            Zombie s3 = (Zombie)targetPlayer.getWorld().spawnEntity(b3, EntityType.ZOMBIE);
		            Zombie s4 = (Zombie)targetPlayer.getWorld().spawnEntity(b4, EntityType.ZOMBIE);

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
		if(player.hasPermission("creep.skeleton") || player.isOp() || player.hasPermission("creep.*")) {
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

		            Skeleton s1 = (Skeleton)targetPlayer.getWorld().spawnEntity(c1, EntityType.SKELETON);
		            Skeleton s2 = (Skeleton)targetPlayer.getWorld().spawnEntity(c2, EntityType.SKELETON);
		            Skeleton s3 = (Skeleton)targetPlayer.getWorld().spawnEntity(c3, EntityType.SKELETON);
		            Skeleton s4 = (Skeleton)targetPlayer.getWorld().spawnEntity(c4, EntityType.SKELETON);

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
		if(player.hasPermission("creep.spider") || player.isOp() || player.hasPermission("creep.*")) {
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

		            Spider s1 = (Spider)targetPlayer.getWorld().spawnEntity(d1, EntityType.SPIDER);
		            Spider s2 = (Spider)targetPlayer.getWorld().spawnEntity(d2, EntityType.SPIDER);
		            Spider s3 = (Spider)targetPlayer.getWorld().spawnEntity(d3, EntityType.SPIDER);
		            Spider s4 = (Spider)targetPlayer.getWorld().spawnEntity(d4, EntityType.SPIDER);

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
		if(player.hasPermission("creep.enderman") || player.isOp() || player.hasPermission("creep.*")) {
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

		            Enderman s1 = (Enderman)targetPlayer.getWorld().spawnEntity(e1, EntityType.ENDERMAN);
		            Enderman s2 = (Enderman)targetPlayer.getWorld().spawnEntity(e2, EntityType.ENDERMAN);
		            Enderman s3 = (Enderman)targetPlayer.getWorld().spawnEntity(e3, EntityType.ENDERMAN);
		            Enderman s4 = (Enderman)targetPlayer.getWorld().spawnEntity(e4, EntityType.ENDERMAN);

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
		if(player.hasPermission("creep.power") || player.isOp() || player.hasPermission("creep.*")) {
		if(string.equalsIgnoreCase("power")) {
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

		            Creeper s1 = (Creeper)targetPlayer.getWorld().spawnEntity(e1, EntityType.CREEPER);
		            Creeper s2 = (Creeper)targetPlayer.getWorld().spawnEntity(e2, EntityType.CREEPER);
		            Creeper s3 = (Creeper)targetPlayer.getWorld().spawnEntity(e3, EntityType.CREEPER);
		            Creeper s4 = (Creeper)targetPlayer.getWorld().spawnEntity(e4, EntityType.CREEPER);

		            s1.setTarget(targetPlayer);
		            s1.setPowered(true);
		            s2.setTarget(targetPlayer);
		            s2.setPowered(true);
		            s3.setTarget(targetPlayer);
		            s3.setPowered(true);
		            s4.setTarget(targetPlayer);
		            s4.setPowered(true);

		            cs.sendMessage(ChatColor.GRAY + "You spawned powered creepers around " + targetPlayer.getDisplayName() + "!");
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
		if(player.hasPermission("creep.rid") || player.isOp() || player.hasPermission("creep.*")) {
			if(string.equalsIgnoreCase("rid")) {
				List<Entity> mobs = player.getNearbyEntities(60, 512, 60);
				if (args[0].equalsIgnoreCase("all")) {
					for (Entity mob : mobs) {
						if (mob instanceof MagmaCube) {
							mob.remove();
						}else if (mob instanceof Slime) {
							mob.remove();
						}else if (mob instanceof Animals){
							mob.remove();
						}else if (mob instanceof Chicken) {
							mob.remove();
						}else if (mob instanceof Cow) {
							mob.remove();
						}else if (mob instanceof MushroomCow) {
							mob.remove();
						}else if (mob instanceof Ocelot) {
							mob.remove();
						}else if (mob instanceof Pig) {
							mob.remove();
						}else if (mob instanceof Sheep) {
							mob.remove();
						}else if (mob instanceof Wolf) {
							mob.remove();
						}else if (mob instanceof Monster) {
							mob.remove();
						}else if (mob instanceof CaveSpider) {
							mob.remove();
						}else if (mob instanceof Creeper) {
							mob.remove();
						}else if (mob instanceof Enderman) {
							mob.remove();
						}else if (mob instanceof Giant) {
							mob.remove();
						}else if (mob instanceof PigZombie) {
							mob.remove();
						}else if (mob instanceof Silverfish) {
							mob.remove();
						}else if (mob instanceof Skeleton) {
							mob.remove();
						}else if (mob instanceof Spider) {
							mob.remove();
						}else if (mob instanceof Zombie) {
							mob.remove();
						}else if (mob instanceof Flying) {
							mob.remove();
						}else if (mob instanceof Blaze) {
							mob.remove();
						}else if (mob instanceof Ghast) {
							mob.remove();
						}else if (mob instanceof WaterMob) {
							mob.remove();
						}else if (mob instanceof Squid) {
							mob.remove();
						}else if (mob instanceof IronGolem) {
							mob.remove();
						}else if (mob instanceof Villager) {
							mob.remove();
						}
					}
			        cs.sendMessage(ChatColor.GRAY + "You just rid the area of all mobs");
			    }else if (args[0].equalsIgnoreCase("blaze")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Blaze) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of blazes");
			    }else if (args[0].equalsIgnoreCase("caveSpider")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof CaveSpider) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of cavespiders");
			    }else if (args[0].equalsIgnoreCase("chicken")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Chicken) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of chicken");
			    }else if (args[0].equalsIgnoreCase("cow")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Cow) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of cows");
			    }else if (args[0].equalsIgnoreCase("creeper")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Creeper) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of creepers");
			    }else if (args[0].equalsIgnoreCase("enderman")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Enderman) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of endermen");
			    }else if (args[0].equalsIgnoreCase("ghast")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Ghast) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of ghasts");
			    }else if (args[0].equalsIgnoreCase("giant")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Giant) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of giants");
			    }else if (args[0].equalsIgnoreCase("irongolem")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof IronGolem) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of irongolems");
			    }else if (args[0].equalsIgnoreCase("magmacube")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof MagmaCube) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of magmacubes");
			    }else if (args[0].equalsIgnoreCase("mushroomcow")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof MushroomCow) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of mushroomcows");
			    }else if (args[0].equalsIgnoreCase("ocelot")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Ocelot) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of ocelots");
			    }else if (args[0].equalsIgnoreCase("pig")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Pig) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of pigs");
			    }else if (args[0].equalsIgnoreCase("pigzombie")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof PigZombie) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of pigzombies");
			    }else if (args[0].equalsIgnoreCase("sheep")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Sheep) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of sheep");
			    }else if (args[0].equalsIgnoreCase("silverfish")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Silverfish) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of silverfish");
			    }else if (args[0].equalsIgnoreCase("skeleton")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Skeleton) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of skeletons");
			    }else if (args[0].equalsIgnoreCase("slime")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Slime) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of slimes");
			    }else if (args[0].equalsIgnoreCase("spider")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Spider) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of spiders");
			    }else if (args[0].equalsIgnoreCase("squid")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Squid) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of squid");
			    }else if (args[0].equalsIgnoreCase("villager")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Villager) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of villagers");
			    }else if (args[0].equalsIgnoreCase("wolve")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Wolf) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of wolves");
			    }else if (args[0].equalsIgnoreCase("zombie")) {
			    	for (Entity mob : mobs) {
			    		if (mob instanceof Zombie) {
			    			mob.remove();
			    		}
			    	}
			    	cs.sendMessage("You just rid the area of zombies");
			    }else if(args[0].equalsIgnoreCase("moblist")) {
			    	cs.sendMessage("|::::::::::::::[Mobs-List]::::::::::::::|");
			    	cs.sendMessage("|---------------------------------------|");
			    	cs.sendMessage("|=[blaze]======[giant]=======[skeleton]=|");
			    	cs.sendMessage("|=[cavespider]=[magmacube]===[slime]====|");
			    	cs.sendMessage("|=[chicken]====[mushroomcow]=[spider]===|");
			    	cs.sendMessage("|=[cow]========[pig]=========[squid]====|");
			    	cs.sendMessage("|=[creeper]====[pigzombie]===[villager]=|");
			    	cs.sendMessage("|=[enderman]===[sheep]=======[wolf]=====|");
			    	cs.sendMessage("|=[ghast]======[silverfish]==[zombie]===|");
			    	cs.sendMessage("|:::::::::::::::::::::::::::::::::::::::|");
			    }
			} else if (args.length > 2){
				player.sendMessage(ChatColor.RED + "Error: Too many arguments!");
			} else if (args.length < 1){
				player.sendMessage(ChatColor.RED + "Error: Not enough arguments!");
			}
		}
		if(player.hasPermission("creep.distract") || player.isOp() || player.hasPermission("creep.*")) {
		if(string.equalsIgnoreCase("distract")) {
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

		            Villager s1 = (Villager)targetPlayer.getWorld().spawnEntity(e1, EntityType.VILLAGER);
		            Villager s2 = (Villager)targetPlayer.getWorld().spawnEntity(e2, EntityType.VILLAGER);
		            Villager s3 = (Villager)targetPlayer.getWorld().spawnEntity(e3, EntityType.VILLAGER);
		            Villager s4 = (Villager)targetPlayer.getWorld().spawnEntity(e4, EntityType.VILLAGER);

		            
		            s1.setAdult();
		            s2.setAdult();
		            s3.setAdult();
		            s4.setAdult();
		            
		            s1.setTarget(targetPlayer);
		            s2.setTarget(targetPlayer);
		            s3.setTarget(targetPlayer);
		            s4.setTarget(targetPlayer);
		            

		            cs.sendMessage(ChatColor.GRAY + "You distracted " + targetPlayer.getDisplayName() + "!");
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
		if(player.hasPermission("creep.skittles") || player.isOp() || player.hasPermission("creep.*")) {
		if(string.equalsIgnoreCase("skittles")) {
			if (args.length == 1) {
				if(player.getServer().getPlayer(args[0]) != null) {
					Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);

		            Location playerLocation = targetPlayer.getLocation();
		            double y = playerLocation.getBlockY();
		            double x = playerLocation.getBlockX();
		            double z = playerLocation.getBlockZ();

		            World currentTargetWorld = targetPlayer.getWorld();

		            Location e1 = new Location(currentTargetWorld, x + 4.0D, y, z);
		            Location e2 = new Location(currentTargetWorld, x - 4.0D, y, z);
		            Location e3 = new Location(currentTargetWorld, x, y, z + 4.0D);
		            Location e4 = new Location(currentTargetWorld, x, y, z - 4.0D);
		            Location e5 = new Location(currentTargetWorld, x + 2.0D, y, z + 2.0D);
		            Location e6 = new Location(currentTargetWorld, x + 2.0D, y, z - 2.0D);
		            Location e7 = new Location(currentTargetWorld, x - 2.0D, y, z + 2.0D);
		            Location e8 = new Location(currentTargetWorld, x - 2.0D, y, z - 2.0D);

		            Sheep s1 = (Sheep)targetPlayer.getWorld().spawnEntity(e1, EntityType.SHEEP);
		            Sheep s2 = (Sheep)targetPlayer.getWorld().spawnEntity(e2, EntityType.SHEEP);
		            Sheep s3 = (Sheep)targetPlayer.getWorld().spawnEntity(e3, EntityType.SHEEP);
		            Sheep s4 = (Sheep)targetPlayer.getWorld().spawnEntity(e4, EntityType.SHEEP);
		            Sheep s5 = (Sheep)targetPlayer.getWorld().spawnEntity(e5, EntityType.SHEEP);
		            Sheep s6 = (Sheep)targetPlayer.getWorld().spawnEntity(e6, EntityType.SHEEP);
		            Sheep s7 = (Sheep)targetPlayer.getWorld().spawnEntity(e7, EntityType.SHEEP);
		            Sheep s8 = (Sheep)targetPlayer.getWorld().spawnEntity(e8, EntityType.SHEEP);

		            s1.setTarget(targetPlayer);
		            s1.setAdult();
		            s1.setColor(DyeColor.RED);
		            s2.setTarget(targetPlayer);
		            s2.setAdult();
		            s2.setColor(DyeColor.BLUE);
		            s3.setTarget(targetPlayer);
		            s3.setAdult();
		            s3.setColor(DyeColor.GREEN);
		            s4.setTarget(targetPlayer);
		            s4.setAdult();
		            s4.setColor(DyeColor.YELLOW);
		            s5.setTarget(targetPlayer);
		            s5.setAdult();
		            s5.setColor(DyeColor.CYAN);
		            s6.setTarget(targetPlayer);
		            s6.setAdult();
		            s6.setColor(DyeColor.LIME);
		            s7.setTarget(targetPlayer);
		            s7.setAdult();
		            s7.setColor(DyeColor.ORANGE);
		            s8.setTarget(targetPlayer);
		            s8.setAdult();
		            s8.setColor(DyeColor.PURPLE);

		            cs.sendMessage(ChatColor.GRAY + "You sheared the rainbow with" + targetPlayer.getDisplayName() + "!");
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
		if(player.hasPermission("creep.steak") || player.isOp() || player.hasPermission("creep.*")) {
		if(string.equalsIgnoreCase("steak")) {
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

		            Cow s1 = (Cow)targetPlayer.getWorld().spawnEntity(e1, EntityType.COW);
		            Cow s2 = (Cow)targetPlayer.getWorld().spawnEntity(e2, EntityType.COW);
		            Cow s3 = (Cow)targetPlayer.getWorld().spawnEntity(e3, EntityType.COW);
		            Cow s4 = (Cow)targetPlayer.getWorld().spawnEntity(e4, EntityType.COW);

		            s1.setTarget(targetPlayer);
		            s1.setAdult();
		            s2.setTarget(targetPlayer);
		            s2.setAdult();
		            s3.setTarget(targetPlayer);
		            s3.setAdult();
		            s4.setTarget(targetPlayer);
		            s4.setAdult();

		            cs.sendMessage(ChatColor.GRAY + "You spawned steak around " + targetPlayer.getDisplayName() + "!");
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
		if(player.hasPermission("creep.bacon") || player.isOp() || player.hasPermission("creep.*")) {
		if(string.equalsIgnoreCase("bacon")) {
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

		            Pig s1 = (Pig)targetPlayer.getWorld().spawnEntity(e1, EntityType.PIG);
		            Pig s2 = (Pig)targetPlayer.getWorld().spawnEntity(e2, EntityType.PIG);
		            Pig s3 = (Pig)targetPlayer.getWorld().spawnEntity(e3, EntityType.PIG);
		            Pig s4 = (Pig)targetPlayer.getWorld().spawnEntity(e4, EntityType.PIG);

		            s1.setTarget(targetPlayer);
		            s1.setAdult();
		            s2.setTarget(targetPlayer);
		            s2.setAdult();
		            s3.setTarget(targetPlayer);
		            s3.setAdult();
		            s4.setTarget(targetPlayer);
		            s4.setAdult();

		            cs.sendMessage(ChatColor.GRAY + "You spawned bacon around " + targetPlayer.getDisplayName() + "!");
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
		if(player.hasPermission("creep.smash") || player.isOp() || player.hasPermission("creep.*")) {
		if(string.equalsIgnoreCase("smash")) {
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

		            IronGolem s1 = (IronGolem)targetPlayer.getWorld().spawnEntity(e1, EntityType.IRON_GOLEM);
		            IronGolem s2 = (IronGolem)targetPlayer.getWorld().spawnEntity(e2, EntityType.IRON_GOLEM);
		            IronGolem s3 = (IronGolem)targetPlayer.getWorld().spawnEntity(e3, EntityType.IRON_GOLEM);
		            IronGolem s4 = (IronGolem)targetPlayer.getWorld().spawnEntity(e4, EntityType.IRON_GOLEM);

		            s1.setTarget(targetPlayer);
		            s1.setPlayerCreated(false);
		            s1.damage(1, targetPlayer);
		            s2.setTarget(targetPlayer);
		            s2.setPlayerCreated(false);
		            s2.damage(1, targetPlayer);
		            s3.setTarget(targetPlayer);
		            s3.setPlayerCreated(false);
		            s3.damage(1, targetPlayer);
		            s4.setTarget(targetPlayer);
		            s4.setPlayerCreated(false);
		            s4.damage(1, targetPlayer);

		            cs.sendMessage(ChatColor.GRAY + "You smashed " + targetPlayer.getDisplayName() + "!");
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
		if(player.hasPermission("creep.swarm")) {
			if(string.equalsIgnoreCase("Swarm")) {
				if (args.length == 1) {
					if(player.getServer().getPlayer(args[0]) != null) {
						Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
	
			            Location playerLocation = targetPlayer.getLocation();
			            double y = playerLocation.getBlockY();
			            double x = playerLocation.getBlockX();
			            double z = playerLocation.getBlockZ();
	
			            World currentTargetWorld = targetPlayer.getWorld();
	
			            Location e1 = new Location(currentTargetWorld, x + 4.0D, y, z);
			            Location e2 = new Location(currentTargetWorld, x - 4.0D, y, z);
			            Location e3 = new Location(currentTargetWorld, x, y, z + 4.0D);
			            Location e4 = new Location(currentTargetWorld, x, y, z - 4.0D);
			            Location e5 = new Location(currentTargetWorld, x + 2.0D, y, z + 2.0D);
			            Location e6 = new Location(currentTargetWorld, x + 2.0D, y, z - 2.0D);
			            Location e7 = new Location(currentTargetWorld, x - 2.0D, y, z + 2.0D);
			            Location e8 = new Location(currentTargetWorld, x - 2.0D, y, z - 2.0D);
	
			            Enderman s1 = (Enderman)targetPlayer.getWorld().spawnEntity(e1, EntityType.ENDERMAN);
			            Zombie s2 = (Zombie)targetPlayer.getWorld().spawnEntity(e2, EntityType.ZOMBIE);
			            Blaze s3 = (Blaze)targetPlayer.getWorld().spawnEntity(e3, EntityType.BLAZE);
			            PigZombie s4 = (PigZombie)targetPlayer.getWorld().spawnEntity(e4, EntityType.PIG_ZOMBIE);
			            Spider s5 = (Spider)targetPlayer.getWorld().spawnEntity(e5, EntityType.SPIDER);
			            Skeleton s6 = (Skeleton)targetPlayer.getWorld().spawnEntity(e6, EntityType.SKELETON);
			            Creeper s7 = (Creeper)targetPlayer.getWorld().spawnEntity(e7, EntityType.CREEPER);
			            CaveSpider s8 = (CaveSpider)targetPlayer.getWorld().spawnEntity(e8, EntityType.CAVE_SPIDER);
	
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
		}
		if(player.hasPermission("creep.glue")) {
			if(string.equalsIgnoreCase("glue")) {
				if (args.length == 1) {
					if(player.getServer().getPlayer(args[0]) != null) {
						Player targetPlayer = Bukkit.getServer().getPlayer(args[0]);
	
			            Location playerLocation = targetPlayer.getLocation();
	
			            TNTPrimed s1 = (TNTPrimed)targetPlayer.getWorld().spawnEntity(playerLocation, EntityType.PRIMED_TNT);
	
			            targetPlayer.setPassenger(s1);
			            s1.setYield(5/2);
	
			            cs.sendMessage(ChatColor.GRAY + "You glued TNT to " + targetPlayer.getDisplayName() + "!");
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
		if(player.hasPermission("creep.pigzombie") || player.isOp() || player.hasPermission("creep.*")) {
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

		            	PigZombie s1 = (PigZombie)targetPlayer.getWorld().spawnEntity(f1, EntityType.PIG_ZOMBIE);
		            	PigZombie s2 = (PigZombie)targetPlayer.getWorld().spawnEntity(f2, EntityType.PIG_ZOMBIE);
		            	PigZombie s3 = (PigZombie)targetPlayer.getWorld().spawnEntity(f3, EntityType.PIG_ZOMBIE);
		            	PigZombie s4 = (PigZombie)targetPlayer.getWorld().spawnEntity(f4, EntityType.PIG_ZOMBIE);

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