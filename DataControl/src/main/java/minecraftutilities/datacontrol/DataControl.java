package minecraftutilities.datacontrol;

import minecraftutilities.datasets.YmlDataSet;
import minecraftutilities.input.DataColumnConstructor;
import minecraftutilities.input.DataColumnType;
import minecraftutilities.input.DataSet;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class DataControl extends JavaPlugin {

    public static JavaPlugin dcplugin;

    DataSet[] dataSets;

    @Override
    public void onEnable() {

        dcplugin = this;
        dataSets = new DataSet[]{};

        ArrayList<DataColumnConstructor> columns = new ArrayList<>();
        columns.add(new DataColumnConstructor(DataColumnType.STRING, "UUID"));
        columns.add(new DataColumnConstructor(DataColumnType.INT, "money"));

        YmlDataSet testset = new YmlDataSet(columns, "PlayerMoney");

        testset.init();

        testset.save(new Object[]{"StringBuffer", 12});

        System.out.println(testset.contains("UUID", "StringBuffer"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
