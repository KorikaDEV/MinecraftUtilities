package de.minecraftutilities.guihelper;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.command.Commands;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.Website;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

@Plugin(name = "GuiHelper", version = "1.0")
@Author("dasanten")
@Website("dasanten.de")
@Commands(value =
        {@org.bukkit.plugin.java.annotation.command.Command(name = "openGui",
                desc = "TestGui",
                aliases = "tg",
                permissionMessage = "You do not have permission",
                usage = "/<command> size")})
public final class GuiHelper extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("openGui")) {
            Gui gui = new Gui("TestGui", "TestGui", Integer.parseInt(args[0]));
            sender.sendMessage(args[0]);
            GuiItem test = new GuiItem(Material.DIAMOND_SWORD, "Schwert oder so", "Penis");
            gui.addItem(test, 1);
            gui.openGui((HumanEntity)sender);
            return true;
        }
        return false;
    }
}
