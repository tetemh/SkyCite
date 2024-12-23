package fr.skyserver.coreplugin.events.player;

import fr.skyserver.coreplugin.CorePlugin;
import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

@Getter
public class OnQuitEvent implements Listener {

    private final CorePlugin corePlugin;

    public OnQuitEvent(CorePlugin corePlugin) {
        this.corePlugin = corePlugin;
    }

    @EventHandler
    void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

    }
}
