package fun.mcbee.plugins.beecreative;

import fun.mcbee.api.honeyapi.HoneyAPI;
import fun.mcbee.plugins.beecreative.scoreboard.ScoreBoard;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BeeCreative extends JavaPlugin {
private static BeeCreative instance;
    @Override
    public void onEnable() {
    instance = this;
        Bukkit.getPluginManager().registerEvents(new ScoreBoard(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static BeeCreative getInstance() {
        return instance;
    }
}
