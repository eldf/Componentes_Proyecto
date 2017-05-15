package emergencia1.emergenciav3.org.pl.emergencia.fop;

import emergencia1.emergenciav3.org.pl.emergencia.dto.LLamada;
import emergencia1.emergenciav3.org.pl.emergencia.dto.LLamadaDAO;
import emergencia1.emergenciav3.org.pl.emergencia.dto.Persona;
import emergencia1.emergenciav3.org.pl.emergencia.dto.PersonaDAO;
/*** added by dAdminLlamada* modified by dAdminLlamadaConsultar
 */
public class AdminLlamada {
	LLamadaDAO llamadaDAO = new LLamadaDAO();
	LLamada llamada = new LLamada();
	PersonaDAO personaDAO = new PersonaDAO();
	Persona persona = new Persona();
	/*** added by dAdminLlamadaConsultar
	 */
	public LLamada consultar(String NroTelefonico) {
		Persona persona = new Persona();
		LLamada llamada = new LLamada();
		llamada.setIdplantatelefonica(NroTelefonico);
		return llamada;
	}
}