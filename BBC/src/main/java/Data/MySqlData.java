package Data;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlData {
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    static String filepath = "C:\\Users\\fazli\\IdeaProjects\\AutomationTeam11\\BBC\\src\\test\\resources\\secret.properties";

    public static List<String> getresultlistFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("Results", "resultlist", filepath);
        return list;
    }
}
