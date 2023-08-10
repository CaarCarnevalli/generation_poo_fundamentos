package generation_poo_fundamentos;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class Curso {

	private String nome;
	private String instituição; 
	private Float valor;
	private Date data;
	private String iniciação;
	public Curso(String nome, String instituição, Float valor, Date data, String iniciação) {
		super();
		this.nome = nome;
		this.instituição = instituição;
		this.valor = valor;
		this.data = data;
		this.iniciação = iniciação;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInstituição() {
		return instituição;
	}
	public void setInstituição(String instituição) {
		this.instituição = instituição;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getIniciação() {
		return iniciação;
	}
	public void setIniciação(String iniciação) {
		this.iniciação = iniciação;
	}
	
	
	public void visualizar() {

		System.out.println("\nNome: " + nome + "\nInstituição: " + instituição+ "\nValor: " +formatarValor() + "\nData: " + formatarData()
				+ "\nIniciação: " +iniciação);
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
