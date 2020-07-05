package minecraftutilities.datasets;

import minecraftutilities.datacontroll.DataIndicator;
import minecraftutilities.datacontroll.DataSet;
import minecraftutilities.datacontroll.DataStorageType;
import minecraftutilities.datacontroll.ResponseDataRow;

import java.util.ArrayList;

public class MysqlDataSet extends DataSet {

    public MysqlDataSet(String[] rows, String[] types) {
        super(DataStorageType.MYSQL, rows, types);
    }
    

    @Override
    public void save(String[] data) {

    }

    @Override
    public boolean contains(String row, String value) {
        return false;
    }

    @Override
    public ArrayList<ResponseDataRow> get(DataIndicator dataIndicator) {
        return null;
    }

    @Override
    public void init() {

    }
}
