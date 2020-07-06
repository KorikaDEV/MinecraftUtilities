package minecraftutilities.input;

import minecraftutilities.output.ResponseDataRow;

import java.util.ArrayList;

public abstract class DataSet {

    public DataStorageType type;
    public ArrayList<DataColumnConstructor> columns;
    public String[] types;

    public DataSet(DataStorageType type, ArrayList<DataColumnConstructor> columns, String[] types){

        this.type = type;
        this.columns = columns;
        this.types = types;
    }

    public abstract void save(Object[] data);
    public abstract boolean contains(String row, String value);
    public abstract ArrayList<ResponseDataRow> get(DataIndicator dataIndicator);
    public abstract void init();
}
