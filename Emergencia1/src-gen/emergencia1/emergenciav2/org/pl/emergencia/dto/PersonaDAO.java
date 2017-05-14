package emergencia1.emergenciav2.org.pl.emergencia.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import emergencia1.emergenciav2.org.pl.emergencia.bd.DBConnection;
/*** added by dDaoPersona* modified by dAdminLlamadaAdicionar
 */
public class PersonaDAO {
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	DBConnection dbConnection = null;
	/*** added by dAdminLlamadaAdicionar
	 */
	public void agregar(Persona persona) {
		try {
			conn = dbConnection.getConnection();
			String query =
			"INSERT INTO persona (identificacion,nombre,apellido) values (?,?,?)";
			ps = conn.prepareStatement(query);
			ps.setString(1, persona.getIdentificacion());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
			}
		}
	}
}