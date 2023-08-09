package generation_poo_fundamentos;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente Erick = new Cliente("Erick", "Masculino", 27, 12345678922L, 11948189794L);
		Cliente Richard = new Cliente("Richard", "Masculino", 30, 98765432122L, 11960277277L);

		Erick.visualizar();
		Richard.visualizar();

	}

}
