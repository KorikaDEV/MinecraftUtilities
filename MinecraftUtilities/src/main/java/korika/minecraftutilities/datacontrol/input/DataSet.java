package korika.minecraftutilities.datacontrol.input;

import korika.minecraftutilities.datacontrol.output.ResponseDataRow;

import java.util.ArrayList;

public abstract class DataSet {

    public DataStorageType type;
    public ArrayList<DataColumnConstructor> columns;

    public DataSet(DataStorageType type, ArrayList<DataColumnConstructor> columns){

        this.type = type;
        this.columns = columns;
    }

    public abstract void save(Object[] data);
    public abstract boolean contains(String row, Object value);
    public abstract ArrayList<ResponseDataRow> get(DataIndicator dataIndicator);
    public abstract void init();
}
