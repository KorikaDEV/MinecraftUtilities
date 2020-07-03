package minecraftutilities.datasets;

import minecraftutilities.datacontroll.DataIndicator;
import minecraftutilities.datacontroll.DataSet;
import minecraftutilities.datacontroll.DataStorageType;

public class YmlDataSet extends DataSet {

    public YmlDataSet(String name, String[] rows, String[] types) {
        super(name, DataStorageType.YML, rows, types);
    }

    @Override
    public void save(String[] data) {

    }

    @Override
    public void get(DataIndicator dataIndicator) {

    }

    @Override
    public void init() {

    }
}
