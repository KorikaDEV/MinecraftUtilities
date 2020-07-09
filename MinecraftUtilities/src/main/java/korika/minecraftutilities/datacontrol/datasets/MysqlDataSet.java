package korika.minecraftutilities.datacontrol.datasets;

import korika.minecraftutilities.datacontrol.input.DataColumnConstructor;
import korika.minecraftutilities.datacontrol.input.DataIndicator;
import korika.minecraftutilities.datacontrol.input.DataSet;
import korika.minecraftutilities.datacontrol.input.DataStorageType;
import korika.minecraftutilities.datacontrol.output.ResponseDataRow;

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
