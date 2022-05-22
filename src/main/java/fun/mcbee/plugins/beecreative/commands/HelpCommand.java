package fun.mcbee.plugins.beecreative.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.of("#738291")+""+ChatColor.BOLD+"=======================================");
            player.sendMessage(ChatColor.of("#FFBF00")+""+ChatColor.BOLD + "Creative Help Center");
            player.sendMessage("");
            player.sendMessage(ChatColor.of("#FAD5A5")+""+ChatColor.BOLD +"Plot Commands:");
            player.sendMessage(ChatColor.of("#F28C28")+"/"+ChatColor.of("#FAD5A5")+"plot auto");
            player.sendMessage(ChatColor.of("#738291")+""+ChatColor.BOLD+"=======================================");
        }
        return false;
    }
}
