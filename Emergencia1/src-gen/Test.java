import emergencia1.emergenciav2.org.pl.emergencia.dto.LLamada;
import emergencia1.emergenciav2.org.pl.emergencia.dto.LLamadaDAO;
import emergencia1.emergenciav2.org.pl.emergencia.fop.AdminLlamada;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminLlamada admin = new  AdminLlamada();
		LLamadaDAO llamadadao = new  LLamadaDAO();
		LLamada llamada = new LLamada();
		llamada=admin.agregar("123", "juan", "perez", "1", true, "1", "315887744", "12");
		System.out.println(llamada.getIdEmergencia());
		llamadadao.agregar(llamada);
		
		//Pk_Id	Estado 1: Efectiva; 0: no efectiva (ociosa)	Fk_Id_Llamada_Tipo	Numero_Telefonico

			
		

	}

}
