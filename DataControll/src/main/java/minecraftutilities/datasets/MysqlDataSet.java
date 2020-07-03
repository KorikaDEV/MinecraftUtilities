package minecraftutilities.datasets;

import minecraftutilities.datacontroll.DataIndicator;
import minecraftutilities.datacontroll.DataSet;
import minecraftutilities.datacontroll.DataStorageType;

public class MysqlDataSet extends DataSet {

    public MysqlDataSet(String name, String[] rows, String[] types) {
        super(name, DataStorageType.MYSQL, rows, types);
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
