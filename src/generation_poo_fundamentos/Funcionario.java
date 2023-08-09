package generation_poo_fundamentos;

import java.text.NumberFormat;

public class Funcionario {

	private String nome;
	private int idade;
	private String genero;
	private String cargo;
	private double salario;

	public Funcionario(String nome, int idade, String genero, String cargo, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.genero = genero;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void visualizar() {

		System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\nGenero: " + genero + "\nCargo: " + cargo
				+ "\nSalario: " + formatarSalario());
	}

	public String formatarSalario() {
		// método para pegar a moeda do país
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		// método para estipular a quantidade de casas decimais
		moeda.setMinimumFractionDigits(2);
		// método para formatar o salário
		String formatoMoeda = moeda.format(salario);

		return formatoMoeda;
	}
}


