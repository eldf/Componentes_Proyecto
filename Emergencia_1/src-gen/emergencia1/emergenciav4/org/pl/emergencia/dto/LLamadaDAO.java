package emergencia1.emergenciav4.org.pl.emergencia.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import emergencia1.emergenciav4.org.pl.emergencia.bd.DBConnection;
/*** added by dDaoLlamada* modified by dAdminLlamadaActualizar
 */
public class LLamadaDAO {
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	DBConnection dbConnection = null;
	/*** added by dAdminLlamadaActualizar
	 */
	public void modificar(LLamada llamada) {
		try {
			conn = dbConnection.getConnection();
			String query =
			"UPDATE llamadas set Estado=?,Fk_Id_Llamada_Tipo=?,Numero_Telefonico=? where Pk_Id=?  ";
			ps = conn.prepareStatement(query);
			ps.setBoolean(1, llamada.getEstado());
			ps.setString(2, llamada.getCoddomtipollamada());
			ps.setString(3, llamada.getIdplantatelefonica());
			ps.setString(4, llamada.getIdLLamada());
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