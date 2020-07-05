package minecraftutilities.datacontroll;

import java.util.ArrayList;

public abstract class DataSet {

    public DataStorageType type;
    public String[] rows;
    public String[] types;

    public DataSet(DataStorageType type, String[] rows, String[] types){

        this.type = type;
        this.rows = rows;
        this.types = types;
    }

    public abstract void save(String[] data);
    public abstract boolean contains(String row, String value);
    public abstract ArrayList<ResponseDataRow> get(DataIndicator dataIndicator);
    public abstract void init();
}
