package korika.minecraftutilities.datacontrol.input;

public class DataColumnConstructor {
    public DataColumnType type;
    public String name;

    public DataColumnConstructor(DataColumnType type, String name){
        this.type = type;
        this.name = name;
    }
}
