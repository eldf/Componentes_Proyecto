package emergencia1.emergenciav2.org.pl.emergencia.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import emergencia1.emergenciav2.org.pl.emergencia.bd.DBConnection;
/*** added by dDaoLlamada* modified by dAdminLlamadaAdicionar
 */
public class LLamadaDAO {
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	DBConnection dbConnection = null;
	/*** added by dAdminLlamadaAdicionar
	 */
	public void agregar(LLamada llamada) {
		try {
			conn = dbConnection.getConnection();
			String query =
			"INSERT INTO llamadas(Estado,Fk_Id_Llamada_Tipo,Numero_Telefonico,Fk_Id_emergencia,Fk_Id_cedula) values (?,?,?,?,?)";
			ps = conn.prepareStatement(query);
			ps.setBoolean(1, llamada.getEstado());
			ps.setString(2, llamada.getCoddomtipollamada());
			ps.setString(3, llamada.getIdplantatelefonica());
			ps.setString(4, llamada.getIdEmergencia());
			ps.setString(5, llamada.getPersona().identificacion);
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