package fun.mcbee.plugins.beecreative.scoreboard;

import fun.mcbee.api.honeyapi.ScoreBoard.BeeScoreboard;
import fun.mcbee.plugins.beecreative.BeeCreative;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Statistic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ScoreBoard implements Listener {
    private final Map<UUID, BeeScoreboard> boards = new HashMap<>();

    public ScoreBoard() {
        Bukkit.getServer().getScheduler().runTaskTimer(BeeCreative.getInstance(), () -> {
            for (BeeScoreboard board : this.boards.values()) {
                updateBoard(board);
            }
        }, 0, 20);
    }

    @EventHandler

    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        BeeScoreboard lobbysb = new BeeScoreboard(player);

        lobbysb.updateTitle(ChatColor.of("#0F7AD9")+""+ChatColor.BOLD + "McBee");

        this.boards.put(player.getUniqueId(), lobbysb);


    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();

        BeeScoreboard lobbysb = this.boards.remove(player.getUniqueId());

        if (lobbysb != null) {
            lobbysb.delete();
        }

    }

    //TODO do a scoreboard
    private void updateBoard(BeeScoreboard lobbysb) {
        lobbysb.updateLines(
                "",
                ChatColor.of("#738291")+"» "+ChatColor.of("#89B6DE")+"Kills: " + ChatColor.of("#C4CDD6")+lobbysb.getPlayer().getStatistic(Statistic.PLAYER_KILLS),
                "",
                ChatColor.of("#738291")+"» "+ChatColor.of("#89B6DE")+"Time left: " + ChatColor.of("#C4CDD6")+"",
                "",
                ChatColor.of("#0F7AD9")+""+ChatColor.BOLD + "discord.gg/mcbee"


        );


    }
}
