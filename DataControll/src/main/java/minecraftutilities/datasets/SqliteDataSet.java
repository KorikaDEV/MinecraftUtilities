package minecraftutilities.datasets;

import minecraftutilities.in.DataColumnConstructor;
import minecraftutilities.in.DataIndicator;
import minecraftutilities.in.DataSet;
import minecraftutilities.in.DataStorageType;
import minecraftutilities.out.ResponseDataRow;

import java.util.ArrayList;

public class SqliteDataSet extends DataSet {

    public SqliteDataSet(ArrayList<DataColumnConstructor> columns, String[] types) {
        super(DataStorageType.SQLITE, columns, types);
    }

    @Override
    public void save(Object[] data) {

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
