package korika.minecraftutilities.datacontrol.datasets;

import korika.minecraftutilities.datacontrol.input.DataColumnConstructor;
import korika.minecraftutilities.datacontrol.input.DataIndicator;
import korika.minecraftutilities.datacontrol.input.DataSet;
import korika.minecraftutilities.datacontrol.input.DataStorageType;
import korika.minecraftutilities.datacontrol.output.ResponseDataRow;

import java.sql.*;
import java.util.ArrayList;

public class MysqlDataSet extends DataSet {

    Connection con;
    String table, adress, database, user, password;

    public MysqlDataSet(ArrayList<DataColumnConstructor> columns, String table, String adress, String database, String user, String password) {
            super(DataStorageType.MYSQL, columns);
            this.table = table;
            this.adress = adress;
            this.database = database;
            this.user = user;
            this.password = password;
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
            String connectionCommand = "jdbc:mysql://"+adress+"/"+database+"?user="+user+"&password="+password;
            try {
                con = DriverManager.getConnection(connectionCommand);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            String statement = "CREATE TABLE IF NOT EXISTS " + table + " (";
            for(DataColumnConstructor dcc : columns){
                switch(dcc.type){
                    case INT:
                        statement += dcc.name + " int(10)";
                        break;
                    case STRING:
                        statement += dcc.name + " varchar(255)";
                        break;
                    case DATE:
                        statement += dcc.name + "' date";
                        break;
                    default:
                        break;
                }
                if((columns.indexOf(dcc) + 1) != columns.size()){
                    statement += ",";
                }
            }
            statement += ")";
            try{
                Statement stmt = con.createStatement();
                stmt.executeUpdate(statement);
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
