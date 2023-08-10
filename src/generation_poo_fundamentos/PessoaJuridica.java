package generation_poo_fundamentos;

public class PessoaJuridica extends Cliente {
	private long cnpj;

	public PessoaJuridica(String nome, String genero, int idade, String email, long telefone, long cnpj) {
		super(nome, genero, idade, email, telefone);
    this.cnpj = cnpj;
		
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
public void visualizar() {
		
		final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
		final String TEXT_BLACK_BOLD = "\033[1;30m";

		System.out.println(
				TEXT_BLACK_BOLD + ANSI_PURPLE_BACKGROUND + "************************** PESSOA JURIDICA **************************");

		System.out.println(formatarNome() + formatarGenero() + formatarIdade() + formatarEmail() + formatarTelefone()
				+ this.formatarCnpj());
	}

	public String formatarCnpj() {

		// Converter long para string
		String cnpjString = Long.toString(this.cnpj);

		// Formata o cpf para o padrão XX.XXX.XXX/XXXX-XX
		String cnpjFormatado = cnpjString.replaceFirst("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d+)", "$1.$2.$3/$4-$5");

		// retorna o telefone formatado para exibição
		return "\n Cnpj: " + cnpjFormatado;
	}
  
}
       