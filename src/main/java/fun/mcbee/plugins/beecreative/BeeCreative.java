package fun.mcbee.plugins.beecreative;

import fun.mcbee.plugins.beecreative.commands.HelpCommand;
import fun.mcbee.plugins.beecreative.scoreboard.ScoreBoard;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BeeCreative extends JavaPlugin {
private static BeeCreative instance;
    @Override
    public void onEnable() {
    instance = this;
        Bukkit.getPluginManager().registerEvents(new ScoreBoard(), this);
        getCommand("help").setExecutor(new HelpCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static BeeCreative getInstance() {
        return instance;
    }
}
//me: Will this plugin work now?
//ai: Yes, it will work now.
//me: I'm not sure if it will work now.
