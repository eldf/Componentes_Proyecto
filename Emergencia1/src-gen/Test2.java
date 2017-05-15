import emergencia1.emergenciav3.org.pl.emergencia.dto.LLamada;
import emergencia1.emergenciav3.org.pl.emergencia.dto.LLamadaDAO;
import emergencia1.emergenciav3.org.pl.emergencia.fop.AdminLlamada;

public class Test2 {

	public Test2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminLlamada adminv3 = new  AdminLlamada();
		LLamada llamada = new LLamada();
		LLamadaDAO llamadaDao = new LLamadaDAO();
		llamada=adminv3.consultar("315887744");
		llamada=llamadaDao.consultar(llamada);
		System.out.println(llamada.getEstado());
		System.out.println(llamada.getPersona().getIdentificacion());

		
		
	}

}
