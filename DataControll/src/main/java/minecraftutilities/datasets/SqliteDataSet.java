package minecraftutilities.datasets;

import minecraftutilities.datacontroll.DataIndicator;
import minecraftutilities.datacontroll.DataSet;
import minecraftutilities.datacontroll.DataStorageType;

public class SqliteDataSet extends DataSet {

    public SqliteDataSet(String name, String[] rows, String[] types) {
        super(name, DataStorageType.SQLITE, rows, types);
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
