package minecraftutilities.datacontroll;

import org.bukkit.plugin.java.JavaPlugin;

public final class DataControll extends JavaPlugin {

    DataSet[] dataSets;

    @Override
    public void onEnable() {
        dataSets = new DataSet[]{};

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
