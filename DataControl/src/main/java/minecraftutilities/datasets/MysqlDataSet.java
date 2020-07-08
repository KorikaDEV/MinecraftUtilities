package minecraftutilities.datasets;

import minecraftutilities.input.DataColumnConstructor;
import minecraftutilities.input.DataIndicator;
import minecraftutilities.input.DataSet;
import minecraftutilities.input.DataStorageType;
import minecraftutilities.output.ResponseDataRow;

import java.util.ArrayList;

public class MysqlDataSet extends DataSet {

    public MysqlDataSet(ArrayList<DataColumnConstructor> columns) {
        super(DataStorageType.MYSQL, columns);
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
