package generation_poo_fundamentos;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario[] funcionarios = new Funcionario[2];

		funcionarios[0] = new Funcionario("Alessandro", 26, "Masculino", "Dev junior", 3500);
		funcionarios[1] = new Funcionario("Richard", 29, "Masculino", "Pleno Dev", 8500);

		for (Funcionario funcionario : funcionarios) {

			funcionario.visualizar();
		}

		Gerente[] Gerentes = new Gerente[2];

		Gerentes[0] = new Gerente("Erick", 28, "Masculino", "Gerente diretor", 11000, "chefe");
		Gerentes[1] = new Gerente("Gustavo", 26, "Masculino", "Gerente regional", 9000, "chefe");

		for (Gerente gerente : Gerentes) {

			gerente.visualizar();

		}

		Vendedor[] vendedores = new Vendedor[2];

		vendedores[0] = new Vendedor("Richard", 29, "Masculino", "Vendedor pleno", 3500, 2698);
		vendedores[1] = new Vendedor("Alessandro", 26, "Masculino", "Vendedor VM", 3200, 4040);

		for (Vendedor vendedor : vendedores) {

			vendedor.visualizar();

		}

	}

}
