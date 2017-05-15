package emergencia1.emergenciav3.org.pl.emergencia.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import emergencia1.emergenciav3.org.pl.emergencia.bd.DBConnection;
/*** added by dDaoPersona* modified by dAdminLlamadaConsultar
 */
public class PersonaDAO {
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	DBConnection dbConnection = null;
	/*** added by dAdminLlamadaConsultar
	 */
	public Persona consultar(Persona persona) {
		try {
			conn = dbConnection.getConnection();
			String query =
			"SELECT nombre,apellido FROM persona WHERE identificacion=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, persona.getIdentificacion());
			rs = ps.executeQuery();
			if(rs.next()) {
				persona.setNombre(rs.getString("nombre"));
				persona.setApellido(rs.getString("apellido"));
			}
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
		return persona;
	}
}