
/**
 * Clase de prueba de conexión con una base de datos MySQL
 */
import java.sql.*;

public class PruebaMySQL {
    
    /** 
     * Crea una instancia de la clase MySQL y realiza todo el código 
     * de conexión, consulta y muestra de resultados.
     */
    public PruebaMySQL() 
    {
        // Se mete todo en un try por los posibles errores de MySQL
        try
        {
            // Se registra el Driver de MySQL
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            
            // Se obtiene una conexión con la base de datos. Hay que
            // cambiar el usuario "root" y la clave "la_clave" por las
            // adecuadas a la base de datos que estemos usando.
            Connection conexion = DriverManager.getConnection (
                "jdbc:mysql://localhost/proyecto","root", "");
            
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();
            
            // Se realiza la consulta. Los resultados se guardan en el 
            // ResultSet rs
            ResultSet rs = s.executeQuery ("select * from persona");
            
            // Se recorre el ResultSet, mostrando por pantalla los resultados.
            while (rs.next())
            {
                System.out.println (rs.getInt ("Id") + " " + rs.getString (2)+ 
                    " " + rs.getDate(3));
            }
            
            // Se cierra la conexión con la base de datos.
            conexion.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * Método principal, instancia una clase PruebaMySQL
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        new PruebaMySQL();
    }
    
}
