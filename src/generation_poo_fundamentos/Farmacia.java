package generation_poo_fundamentos;

import java.text.NumberFormat;

public class Farmacia {

	private String nome;
	private float valor;
	private int codigo;
	private String composição;
	private int quantidade;

	public Farmacia(String nome, float valor, int codigo, String composição, int quantidade) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.codigo = codigo;
		this.composição = composição;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getComposição() {
		return composição;
	}

	public void setComposição(String composição) {
		this.composição = composição;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void visualizar() {

		System.out.println("\nNome: " + nome + "\nValor: " + formatarValor()+ "\nCodigo: " +codigo + "\nComposição: " + composição
				+ "\nQuantidade: " +quantidade);
	}

	public String formatarValor() {
		// método para pegar a moeda do país
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		// método para estipular a quantidade de casas decimais
		moeda.setMinimumFractionDigits(2);
		// método para formatar o salário
		String formatoMoeda = moeda.format(valor);

		return formatoMoeda;
	}

}
