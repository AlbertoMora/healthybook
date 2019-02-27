/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriasExternas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alberto Mora
 */
public class DBManager {

    String Hostname = "den1.mssql8.gear.host";
    String dbName = "healthybookdb";
    String user = "healthybookdb";
    String password = "Lq4druZ4A~?7";
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;"
            + "hostNameInCertificate=*.database.windows.net;loginTimeout=30;trustServerCertificate=true;", Hostname, dbName, user, password);
    Connection connection = null;

    public boolean CallProcedure(String query) {
        try {
            connection = DriverManager.getConnection(this.url);
            CallableStatement statement = connection.prepareCall(query);
            int rows = statement.executeUpdate();
            if (rows > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }

    public ResultSet CallProcedureWResults(String query) {
        ResultSet result = null;
        try {
            connection = DriverManager.getConnection(this.url);
            CallableStatement statement = connection.prepareCall(query);
            result = statement.executeQuery();
            return result;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
