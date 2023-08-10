package generation_poo_fundamentos;



public class Gerente extends Funcionario {

	private String chefe;

	public Gerente(String nome, int idade, String genero, String cargo, double salario, String chefe) {
		super(nome, idade, genero, cargo, salario);
		this.chefe = chefe;

	}

	public String getChefe() {
		return chefe;
	}

	public void setChefe(String chefe) {
		this.chefe = chefe;
	}

	public void visualizar() {
		System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nGenero: " + getGenero() + "\nCargo: "
				+ getCargo() + "\nSalario: " + formatarSalario()+"\nChefe"+getChefe());

	}
}
