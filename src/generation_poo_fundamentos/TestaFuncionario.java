package generation_poo_fundamentos;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario[] funcionarios = new Funcionario[2];

		funcionarios[0] = new Funcionario("Alessandro", 26, "Masculino", "Dev junior", 3500);
		funcionarios[1] = new Funcionario("Richard", 29, "Masculino", "Pleno Dev", 8500);
       
		for (Funcionario funcionario:funcionarios) {
			
			funcionario.visualizar();
		}
		
	}

}
