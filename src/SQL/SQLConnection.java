package src.SQL;


import java.sql.*;

/**
 * Created by Miquel on 21/08/2017.
 */
public class SQLConnection {

    String connectionUrl = "jdbc:sqlserver://";
    String IP = "" ;
    String dataBaseName = "";
    String user = "";
    String password = "";
    Connection con;
    //"jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks;user=UserName;password=*****";

    public SQLConnection( String IP, String dataBaseName, String user, String password) {

        con = null;
        Statement stmt = null;
        ResultSet rs = null;
        this.IP = IP;
        this.dataBaseName = dataBaseName;
        this.user = user;
        this.password = password;

    }

    public SQLConnection(){}

    public void setConnection(String [] server){
        con = null;
        Statement stmt = null;
        ResultSet rs = null;
        this.IP = server[0];
        this.dataBaseName = server[1];
        this.user = server[2];
        this.password = server[3];

    }

    private String getConnectionUrl(){
        return (connectionUrl+"localhost:" + IP+ ";databaseName=" + dataBaseName + ";user=" + user + ";password=" + password );
    }
    public void openConnection() {
        try {
            // Establish the connection.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(getConnectionUrl());
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
            System.out.println(e1.getCause());
        } catch (SQLException e1) {
            e1.printStackTrace();
            System.out.println(e1.getCause());
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