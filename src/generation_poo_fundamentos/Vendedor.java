package generation_poo_fundamentos;

public class Vendedor extends Funcionario {

	private int senha;

	public Vendedor(String nome, int idade, String genero, String cargo, double salario, int senha) {
		super(nome, idade, genero, cargo, salario);

		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public void visualizar() {

		System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nGenero: " + getGenero() + "\nCargo: "
				+ getCargo() + "\nSalario: " + formatarSalario() + "\nSenha: " + getSenha());
	}

}
