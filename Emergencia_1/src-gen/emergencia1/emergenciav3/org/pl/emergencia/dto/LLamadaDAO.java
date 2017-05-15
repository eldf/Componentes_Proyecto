package emergencia1.emergenciav3.org.pl.emergencia.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import emergencia1.emergenciav3.org.pl.emergencia.bd.DBConnection;
/*** added by dDaoLlamada* modified by dAdminLlamadaConsultar
 */
public class LLamadaDAO {
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	DBConnection dbConnection = null;
	/*** added by dAdminLlamadaConsultar
	 */
	public LLamada consultar(LLamada llamada) {
		Persona persona = new Persona();
		try {
			conn = dbConnection.getConnection();
			st = conn.createStatement();
			String query =
			"SELECT Estado,Fk_Id_Llamada_Tipo,Numero_Telefonico,Fk_Id_emergencia,Fk_Id_cedula from llamadas where Numero_Telefonico= '"
			+ llamada.getIdplantatelefonica() + "'";
			rs = st.executeQuery(query);
			while(rs.next()) {
				llamada.setEstado(rs.getBoolean("Estado"));
				persona.setIdentificacion(rs.getString("Fk_Id_cedula"));
				llamada.setPersona(persona);
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
		return llamada;
	}
}