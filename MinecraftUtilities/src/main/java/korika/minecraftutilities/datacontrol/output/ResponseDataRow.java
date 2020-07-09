package korika.minecraftutilities.datacontrol.output;

import java.util.ArrayList;

public class ResponseDataRow {
    public ArrayList<DataColumn> columns;

    public ResponseDataRow(){
        columns = new ArrayList<>();
    }

    public void addColumn(DataColumn column){
        columns.add(column);
    }
}
