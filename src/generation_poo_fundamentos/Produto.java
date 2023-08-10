package generation_poo_fundamentos;

import java.text.NumberFormat;

public class Produto {

	private String descrição;
	private double preço;
	private int quantidade;
	private String marca;
	private int codigo;

	public Produto(String descrição, double preço, int quantidade, String marca, int codigo) {
		super();
		this.descrição = descrição;
		this.preço = preço;
		this.quantidade = quantidade;
		this.marca = marca;
		this.codigo = codigo;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void visualizar() {

		System.out.println("\nDescrição: " + descrição + "\nPreço: " + formatarPreço() + "\nQuantidade: " + quantidade
				+ "\nMarca: " + marca + "\nCodigo: " + codigo);
	}

	public String formatarPreço() {
		// método para pegar a moeda do país
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		// método para estipular a quantidade de casas decimais
		moeda.setMinimumFractionDigits(2);
		// método para formatar o salário
		String formatoMoeda = moeda.format(preço);

		return formatoMoeda;
	}
}
