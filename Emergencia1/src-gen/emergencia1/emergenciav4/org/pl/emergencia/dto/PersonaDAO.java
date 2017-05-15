package emergencia1.emergenciav4.org.pl.emergencia.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import emergencia1.emergenciav4.org.pl.emergencia.bd.DBConnection;
/*** added by dDaoPersona* modified by dAdminLlamadaActualizar
 */
public class PersonaDAO {
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	DBConnection dbConnection = null;
	/*** added by dAdminLlamadaActualizar
	 */
	public void modificar(Persona persona) {
		try {
			conn = dbConnection.getConnection();
			String query =
			"UPDATE personas set nombre=?,apellido=? where  identificacion= values=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setString(3, persona.getIdentificacion());
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