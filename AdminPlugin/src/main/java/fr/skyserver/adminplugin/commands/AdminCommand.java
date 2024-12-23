package fr.skyserver.adminplugin.commands;

import fr.skyserver.adminplugin.AdminPlugin;
import fr.skyserver.adminplugin.guis.AdminPlayerGui;
import fr.skyserver.adminplugin.guis.BaseGui;
import lombok.Getter;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class AdminCommand  implements CommandExecutor {

    @Getter
    private final AdminPlugin adminPlugin;

    public AdminCommand(AdminPlugin adminPlugin) {
        this.adminPlugin = adminPlugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String s, @NotNull String[] args) {
        if (sender instanceof Player player) {
            if(args.length == 0) {
                new BaseGui().open(player);
            } else {
                new AdminPlayerGui(this.getAdminPlugin().getCPlayerManager().get(String.valueOf(player.getUniqueId()))).open(player);
            }
        }
        return false;
    }
}
