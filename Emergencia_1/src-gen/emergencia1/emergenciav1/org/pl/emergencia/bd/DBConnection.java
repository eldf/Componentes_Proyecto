package emergencia1.emergenciav1.org.pl.emergencia.bd;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/*** added by dConexion
 */
public class DBConnection {
	public static Connection getConnection() {
		Properties props = new Properties();
		FileInputStream fis = null;
		Connection con = null;
		try {
			fis = new FileInputStream("bd.properties");
		}
		catch(FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			props.load(fis);
		}
		catch(IOException e1) {
			e1.printStackTrace();
		}
		try {
			DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost/proyecto",
				"root", "");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}