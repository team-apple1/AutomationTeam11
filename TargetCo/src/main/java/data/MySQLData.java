package data;

import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySQLData {
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    static String filepath = "C:\\Users\\Manju\\IdeaProjects\\AutomationTeam11-\\TargetCo\\src\\test\\resources\\secret.properties";

    public static List<String> getPhoneCardsFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("phonecard", "link", filepath);
        return list;
    }

    public static List<String> getRedCardBenefitsFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("redcard", "link", filepath);
        return list;
    }
}
