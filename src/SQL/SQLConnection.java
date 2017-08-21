package src.SQL;


import java.sql.*;

/**
 * Created by Miquel on 21/08/2017.
 */
public class SQLConnection {

    String connectionUrl = "";
    String IP = "" ;
    String dataBaseName = "";
    String user = "";
    String password = "";
    Connection con;
    //"jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks;user=UserName;password=*****";

    public SQLConnection(String connectionUrl, String IP, String dataBaseName, String user, String password) {

        con = null;
        Statement stmt = null;
        ResultSet rs = null;
        this.connectionUrl = connectionUrl;
        this.IP = IP;
        this.dataBaseName = dataBaseName;
        this.user = user;
        this.password = password;

    }

    private String getConnectionUrl(){
        return (connectionUrl+IP+ ";databaseName=" + dataBaseName + ";user=" + user + ";password=" + password );
    }
    public void openConnection() {
        try {
            // Establish the connection.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(getConnectionUrl());
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }

    public Connection getCon() {
        return con;
    }

    public void closeConnection() throws SQLException {
        con.close();
    }
}

/*



            // Create and execute an SQL statement that returns some data.
            String SQL = "SELECT TOP 10 * FROM Person.Contact";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString(4) + " " + rs.getString(6));
            }
        }

        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
 */