package emergencia1.emergenciav1.org.pl.emergencia.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import emergencia1.emergenciav1.org.pl.emergencia.bd.DBConnection;
/*** added by dDaoPersona
 */
public class PersonaDAO {
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection conn = null;
	DBConnection dbConnection = null;
}