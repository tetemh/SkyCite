package fr.skyserver.coreplugin.managers;

import fr.skyserver.coreplugin.CorePlugin;
import fr.skyserver.coreplugin.customclass.CPlayer;
import fr.skyserver.coreplugin.events.player.OnJoinEvent;
import fr.skyserver.coreplugin.events.player.OnQuitEvent;

public class CPlayerManager extends Manager<CPlayer> {


    public CPlayerManager(CorePlugin plugin) {
        super(plugin);
    }

    @Override
    public String getId(CPlayer cPlayer) {
        return cPlayer.getPlayer().getUniqueId().toString();
    }

    @Override
    public void load() {
        this.getCorePlugin().getServer().getOnlinePlayers().forEach(player -> {
            this.add(new CPlayer(player));
        });
    }

    @Override
    public void save() {

    }

    @Override
    public void registerListeners() {
        this.getCorePlugin().getServer().getPluginManager().registerEvents(new OnJoinEvent(this.getCorePlugin()), this.getCorePlugin());
        this.getCorePlugin().getServer().getPluginManager().registerEvents(new OnQuitEvent(this.getCorePlugin()), this.getCorePlugin());
    }
}
