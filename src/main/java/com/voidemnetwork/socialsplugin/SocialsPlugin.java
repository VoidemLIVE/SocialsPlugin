package com.voidemnetwork.socialsplugin;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.Callable;


public final class SocialsPlugin extends JavaPlugin {



    @Override

    public void onEnable() {

        System.out.println("Socials Plugin ONLINE");

        getConfig().options().copyDefaults();

        saveDefaultConfig();
    }



    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        String denymsg = getConfig().getString("disabledmsg");

        if(command.getName().equals("discord")){
            if (this.getConfig().getBoolean("discord")) {
                Player player = (Player)sender;
                String discord = getConfig().getString("discordmsg");
                player.sendMessage(ChatColor.LIGHT_PURPLE + "Join our Discord: " + ChatColor.DARK_PURPLE + discord);
            }

            else {
                Player player = (Player)sender;
                player.sendMessage(ChatColor.RED + denymsg);
            }

        }

        if(command.getName().equals("youtube")) {
            if (this.getConfig().getBoolean("youtube")) {
                Player player = (Player) sender;
                String youtube = getConfig().getString("youtubemsg");
                player.sendMessage(ChatColor.RED + "Check out our Youtube Channel: " + ChatColor.WHITE + youtube);
            }

            else {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.RED + denymsg);
            }
        }

        if(command.getName().equals("twitter")) {
            if (this.getConfig().getBoolean("twitter")) {
                Player player = (Player) sender;
                String twitter = getConfig().getString("twittermsg");
                player.sendMessage(ChatColor.AQUA + "Follow our Twitter: " + ChatColor.WHITE + twitter);
            }

            else {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.RED + denymsg);
            }
        }


        if(command.getName().equals("twitch")){
            if (this.getConfig().getBoolean("twitch")) {
                Player player = (Player)sender;
                String twitch = getConfig().getString("twitchmsg");
                player.sendMessage(ChatColor.DARK_PURPLE + "Watch our Twitch streams: " + ChatColor.LIGHT_PURPLE + twitch);
            }

            else {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.RED + denymsg);
            }
        }

        if(command.getName().equals("instagram")){
            if (this.getConfig().getBoolean("instagram")) {
                Player player = (Player)sender;
                String instagram = getConfig().getString("instagrammsg");
                player.sendMessage(ChatColor.GOLD + "Follow our Instagram: " + ChatColor.YELLOW + instagram);
            }

            else {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.RED + denymsg);
            }
        }

        if(command.getName().equals("reddit")){
            if (this.getConfig().getBoolean("instagram")) {
                Player player = (Player)sender;
                String reddit = getConfig().getString("redditmsg");
                player.sendMessage(ChatColor.GOLD + "Check out our Reddit: " + ChatColor.GOLD + reddit);
            }

            else {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.RED + denymsg);
            }
        }

        if(command.getName().equals("socialreload")){

            Player player = (Player)sender;
            String reloadmessage = getConfig().getString("reloadmsg");
            reloadConfig();
            player.sendMessage(ChatColor.RED + reloadmessage);
        }
        return true;

    }
}