package emergencia1.emergenciav1.org.pl.emergencia.dto;

/*** added by dLlamada
 */
public class LLamada {
	public Boolean estado;
	public String Coddomtipollamada;
	public String idplantatelefonica;
	public String idLLamada;
	public String IdEmergencia;
	public Persona persona;
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public String getCoddomtipollamada() {
		return Coddomtipollamada;
	}
	public void setCoddomtipollamada(String Coddomtipollamada) {
		this.Coddomtipollamada = Coddomtipollamada;
	}
	public String getIdplantatelefonica() {
		return idplantatelefonica;
	}
	public void setIdplantatelefonica(String idplantatelefonica) {
		this.idplantatelefonica = idplantatelefonica;
	}
	public String getIdLLamada() {
		return idLLamada;
	}
	public void setIdLLamada(String idLLamada) {
		this.idLLamada = idLLamada;
	}
	public String getIdEmergencia() {
		return IdEmergencia;
	}
	public void setIdEmergencia(String IdEmergencia) {
		this.IdEmergencia = IdEmergencia;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
}