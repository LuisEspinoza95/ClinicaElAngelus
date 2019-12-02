
package test;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.SQLException;
import util.ConectaDb;


public class ConexionDb {

    public static void main(String[] args) {
        ConectaDb conectaDb = new ConectaDb();            
            try (Connection cn = conectaDb.getConnection()) {
                out.print("Todo ok");
            } catch (SQLException e) {
                out.print("Falló: "+e.getMessage());
            }
    }  

    
}