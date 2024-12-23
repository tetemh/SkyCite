package fr.skyserver.adminplugin.guis;

import fr.mrmicky.fastinv.FastInv;
import fr.skyserver.coreplugin.customclass.CPlayer;
import org.bukkit.entity.Player;

public class AdminPlayerGui extends FastInv {

    public AdminPlayerGui(CPlayer cPlayer) {
        super(3*9, "Dashboard de " + cPlayer.getPlayer().getName());
    }
}
