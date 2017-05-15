package emergencia1.emergenciav1.org.pl.emergencia.fop;

import emergencia1.emergenciav1.org.pl.emergencia.dto.LLamada;
import emergencia1.emergenciav1.org.pl.emergencia.dto.LLamadaDAO;
import emergencia1.emergenciav1.org.pl.emergencia.dto.Persona;
import emergencia1.emergenciav1.org.pl.emergencia.dto.PersonaDAO;
/*** added by dAdminLlamada
 */
public class AdminLlamada {
	LLamadaDAO llamadaDAO = new LLamadaDAO();
	LLamada llamada = new LLamada();
	PersonaDAO personaDAO = new PersonaDAO();
	Persona persona = new Persona();
}