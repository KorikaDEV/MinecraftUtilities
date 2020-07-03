package minecraftutilities.datacontroll;

public abstract class DataSet {

    String name;
    DataStorageType type;
    String[] rows;
    String[] types;

    public DataSet(String name, DataStorageType type, String[] rows, String[] types){
        this.name = name;
        this.type = type;
        this.rows = rows;
        this.types = types;
    }

    public abstract void save(String[] data);
    public abstract void get(DataIndicator dataIndicator);
    public abstract void init();
}
