package pl.kasperskiweb.kaspitrading;

import org.bukkit.plugin.java.JavaPlugin;

public class KaspiTrading extends JavaPlugin {

    @Override
    public void onEnable(){
        getLogger().info("KaspiTrading plugin enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("KaspiTrading plugin disabled");
    }

}
