package generation_poo_fundamentos;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class Ingresso {

	private String nome;
	private Date data;
	private float valor;
	private String lugar;
	private int codigo;

	public Ingresso(String nome, Date data, float valor, String lugar, int codigo) {
		super();
		this.nome = nome;
		this.data = data;
		this.valor = valor;
		this.lugar = lugar;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void visualizar() {

		System.out.println("\nNome: " + nome + "\nData: " + formatarData()+ "\nValor: " +formatarValor() + "\nLugar: " + lugar
				+ "\nCodigo: " +codigo);
	}
       public String formatarData() {
    	   DateFormat formataData = DateFormat.getDateTimeInstance();
    	   return formataData.format(data);
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
