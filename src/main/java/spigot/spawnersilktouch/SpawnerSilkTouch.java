package spigot.spawnersilktouch;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import spigot.spawnersilktouch.events.BlockBreak;

public final class SpawnerSilkTouch extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new BlockBreak(), this);
    }
}
