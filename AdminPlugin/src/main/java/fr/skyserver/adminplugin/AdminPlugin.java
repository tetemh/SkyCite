package fr.skyserver.adminplugin;

import fr.mrmicky.fastinv.FastInvManager;
import fr.skyserver.adminplugin.commands.AdminCommand;
import fr.skyserver.coreplugin.CorePlugin;
import fr.skyserver.coreplugin.managers.CPlayerManager;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class AdminPlugin extends JavaPlugin {

    @Getter @Setter
    private static CorePlugin corePlugin;

    @Getter @Setter
    private CPlayerManager cPlayerManager;

    @Override
    public void onEnable() {
        this.getLogger().info("Starting AdminPlugin...");

        if (!Bukkit.getServer().getPluginManager().isPluginEnabled("CorePlugin")) {
            getLogger().severe("Erreur critique : Le plugin CorePlugin n'est pas chargé");
            throw new IllegalStateException("Le plugin ne peut pas démarrer correctement.");
        }

        FastInvManager.register(this);

        setCorePlugin((CorePlugin) Bukkit.getServer().getPluginManager().getPlugin("CorePlugin"));

        this.getCommand("admin").setExecutor(new AdminCommand(this));
    }
}
