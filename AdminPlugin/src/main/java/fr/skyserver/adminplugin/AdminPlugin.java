package fr.skyserver.adminplugin;

import fr.skyserver.coreplugin.CorePlugin;
import org.bukkit.plugin.java.JavaPlugin;

public class AdminPlugin extends JavaPlugin {

    private static CorePlugin corePlugin;

    @Override
    public void onEnable() {
        corePlugin = CorePlugin.getInstance();
        System.out.println("Admin Plugin OK !");
        System.out.println(corePlugin.getText());
    }
}
