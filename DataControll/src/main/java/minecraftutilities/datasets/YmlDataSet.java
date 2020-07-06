package minecraftutilities.datasets;

import minecraftutilities.datacontrol.*;
import minecraftutilities.input.DataColumnConstructor;
import minecraftutilities.input.DataIndicator;
import minecraftutilities.input.DataSet;
import minecraftutilities.input.DataStorageType;
import minecraftutilities.output.DataColumn;
import minecraftutilities.output.ResponseDataRow;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class YmlDataSet extends DataSet {

    File ymlFile;
    String configName;
    FileConfiguration config;

    public YmlDataSet(ArrayList<DataColumnConstructor> columns, String configName) {
        super(DataStorageType.YML, columns, null);
        this.configName = configName;
    }

    @Override
    public void save(Object[] data) {
        if(data.length == columns.size()){
            ConfigurationSection configData = config.getConfigurationSection("data");
            if(configData != null){
                int index = configData.getKeys(false).toArray().length;
                AddConfigDataAndSave(index, data);
            }else{
                AddConfigDataAndSave(0, data);
            }
        }
    }

    private void AddConfigDataAndSave(int index, Object[] data){
        for (DataColumnConstructor column : columns) {
            config.addDefault("data." + index + "." + column.name, data[Arrays.asList(columns).indexOf(column)]);
            config.options().copyDefaults(true);
            try{
                config.save(ymlFile);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean contains(String row, String value) {
        Iterator<String> iter = config.getConfigurationSection("data").getKeys(false).iterator();
        while(iter.hasNext()){
            String resultvalue = config.getString("data." + iter.next() + "." + row);
            if(resultvalue.equalsIgnoreCase(value)){
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<ResponseDataRow> get(DataIndicator dataIndicator) {
        ArrayList<ResponseDataRow> result = new ArrayList<>();
        Iterator<String> iter = config.getConfigurationSection("data").getKeys(false).iterator();
        while(iter.hasNext()){
            String index = iter.next();
            String data = config.getString("data." + index + "." + dataIndicator.indicatorRow);
            if(data.equalsIgnoreCase(dataIndicator.searchedObject)){
                ResponseDataRow row = new ResponseDataRow();
                for(String s : dataIndicator.rows){
                    String rowcontent = config.getString("data." + index + "." + s);
                    DataColumn column = new DataColumn(s, rowcontent);
                    row.addColumn(column);
                }
                result.add(row);
            }
        }
        return result;
    }

    @Override
    public void init() {
        ymlFile = new File(DataControl.dcplugin.getDataFolder()+"/"+ configName + ".yml");
        config = YamlConfiguration.loadConfiguration(ymlFile);
        try {
            config.save(ymlFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
