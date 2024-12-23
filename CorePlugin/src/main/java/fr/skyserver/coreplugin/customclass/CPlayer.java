package fr.skyserver.coreplugin.customclass;

import lombok.Data;
import org.bukkit.entity.Player;

@Data
public class CPlayer {

    private Player player;

    public CPlayer(Player player) {
        this.setPlayer(player);
    }

}
