package generation_poo_fundamentos;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente Erick = new Cliente("Erick", "Masculino", 27, "erick@gmail.com", 11948189794L);
		Cliente Richard = new Cliente("Richard", "Masculino", 30, "richard@gmail.com", 11960277277L);

		Erick.visualizar();
		Richard.visualizar();

		PessoaFisica Alessandro = new PessoaFisica("Alessandro", "Masculino", 25, "Alessandro@gmail.com", 11930307070L,
				453627183025L);
		PessoaFisica Carolina = new PessoaFisica("Carolina", "Feminino", 23, "carolina@gmail.com", 11970707070L,
				23456789112L);
		Carolina.visualizar();
		Alessandro.visualizar();
		
		PessoaJuridica Gustavo = new PessoaJuridica("Gustavo", "Masculino", 26, "Gustavo@gmail.com", 11950302698L,
				453627183025001L);
		PessoaJuridica Gabriela = new PessoaJuridica("Gabriela", "Feminino", 27, "Gabriela@gmail.com", 11930407676L,
				23456789112002L);
		
		Gustavo.visualizar();
		Gabriela.visualizar();
	}

}
