package minecraftutilities.datacontroll;

import minecraftutilities.datasets.YmlDataSet;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;

public final class DataControll extends JavaPlugin {

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
