package src.SQL;

import src.Interfaces.Constants;
import src.Interfaces.Servers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLStatements implements Constants {

    private static String rutaCierresPath = "SELECT RUTA_POLICIA FROM HOTELCONFIG";

    private static SQLConnection connection = new SQLConnection();

    public static ResultSet getRutaArchivosCierre(int cadenaJComboIndex, String codigohot) throws SQLException {

        connection.setConnection(allServer[cadenaJComboIndex]);

        connection.openConnection();

        Statement stm = connection.getCon().createStatement();
        ResultSet rset = stm.executeQuery(rutaCierresPath);

        connection.closeConnection();

        return rset;



    }
}
