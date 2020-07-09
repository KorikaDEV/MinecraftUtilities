package korika.minecraftutilities.datacontrol.datasets;

import korika.minecraftutilities.datacontrol.input.DataColumnConstructor;
import korika.minecraftutilities.datacontrol.input.DataIndicator;
import korika.minecraftutilities.datacontrol.input.DataSet;
import korika.minecraftutilities.datacontrol.input.DataStorageType;
import korika.minecraftutilities.datacontrol.output.ResponseDataRow;

import java.util.ArrayList;

public class SqliteDataSet extends DataSet {

    public SqliteDataSet(ArrayList<DataColumnConstructor> columns) {
        super(DataStorageType.SQLITE, columns);
    }

    @Override
    public void save(Object[] data) {

    }

    @Override
    public boolean contains(String row, Object value) {
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
