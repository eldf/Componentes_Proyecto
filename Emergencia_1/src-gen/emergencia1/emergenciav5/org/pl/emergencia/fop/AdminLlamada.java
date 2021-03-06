package emergencia1.emergenciav5.org.pl.emergencia.fop;

import emergencia1.emergenciav5.org.pl.emergencia.dto.LLamada;
import emergencia1.emergenciav5.org.pl.emergencia.dto.LLamadaDAO;
import emergencia1.emergenciav5.org.pl.emergencia.dto.Persona;
import emergencia1.emergenciav5.org.pl.emergencia.dto.PersonaDAO;
/*** added by dAdminLlamada* modified by dAdminLlamadaAdicionar* modified by
dAdminLlamadaConsultar* modified by dAdminLlamadaActualizar
 */
public class AdminLlamada {
	LLamadaDAO llamadaDAO = new LLamadaDAO();
	LLamada llamada = new LLamada();
	PersonaDAO personaDAO = new PersonaDAO();
	Persona persona = new Persona();
	/*** added by dAdminLlamadaAdicionar
	 */
	public LLamada agregar(String identificacion, String nombre, String apellido,
		String idLLamada, Boolean estado, String domtipollamada, String
		plantatelefonica, String emergencia) {
		Persona persona = new Persona();
		LLamada llamada = new LLamada();
		persona.setIdentificacion(identificacion);
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		llamada.setIdLLamada(idLLamada);
		llamada.setEstado(estado);
		llamada.setCoddomtipollamada(domtipollamada);
		llamada.setIdplantatelefonica(plantatelefonica);
		llamada.setIdEmergencia(emergencia);
		llamada.setPersona(persona);
		return llamada;
	}
	/*** added by dAdminLlamadaConsultar
	 */
	public LLamada consultar(String NroTelefonico) {
		Persona persona = new Persona();
		LLamada llamada = new LLamada();
		llamada.setIdplantatelefonica(NroTelefonico);
		return llamada;
	}
	/*** added by dAdminLlamadaActualizar
	 */
	public void modificar(String identificacion, String nombre, String apellido,
		String idLLamada, Boolean estado, String domtipollamada, String
		plantatelefonica, String emergencia) {
		Persona persona = new Persona();
		LLamada llamada = new LLamada();
		persona.setIdentificacion(identificacion);
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		llamada.setIdLLamada(idLLamada);
		llamada.setEstado(estado);
		llamada.setCoddomtipollamada(domtipollamada);
		llamada.setIdplantatelefonica(plantatelefonica);
		llamada.setIdEmergencia(emergencia);
		llamada.setPersona(persona);
	}
}