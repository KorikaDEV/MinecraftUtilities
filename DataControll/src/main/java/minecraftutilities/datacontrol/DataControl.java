package minecraftutilities.datacontrol;

import minecraftutilities.input.DataSet;
import org.bukkit.plugin.java.JavaPlugin;

public final class DataControl extends JavaPlugin {

    public static JavaPlugin dcplugin;

    DataSet[] dataSets;

    @Override
    public void onEnable() {

        dcplugin = this;
        dataSets = new DataSet[]{};

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
