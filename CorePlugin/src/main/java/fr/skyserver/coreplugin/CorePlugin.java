package fr.skyserver.coreplugin;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class CorePlugin extends JavaPlugin {

    @Getter
    private static CorePlugin instance;

    @Getter
    private String text = "OK BG";

    @Override
    public void onEnable() {
        System.out.println("Core Plugin OK !");
        instance = this;
    }

}
