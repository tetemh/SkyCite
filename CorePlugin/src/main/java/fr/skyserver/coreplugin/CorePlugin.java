package fr.skyserver.coreplugin;

import fr.skyserver.coreplugin.managers.CPlayerManager;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

public class CorePlugin extends JavaPlugin {

    @Getter
    private static CorePlugin instance;

    @Getter @Setter
    private CPlayerManager cPlayerManager;

    @Override
    public void onEnable() {
        System.out.println("Core Plugin OK !");
        instance = this;

        this.setCPlayerManager(new CPlayerManager(this));
    }

}
