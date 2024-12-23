package fr.skyserver.coreplugin.events.player;

import fr.skyserver.coreplugin.CorePlugin;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

@Getter
public class OnJoinEvent implements Listener {

    private final CorePlugin corePlugin;

    public OnJoinEvent(CorePlugin corePlugin) {
        this.corePlugin = corePlugin;
    }

    @EventHandler
    void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

    }
}
