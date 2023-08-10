package generation_poo_fundamentos;

public class PessoaFisica extends Cliente {

	private long cpf;

	public PessoaFisica(String nome, String genero, int idade, String email, long telefone, long cpf) {
		super(nome, genero, idade, email, telefone);

		this.cpf = cpf;

	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {
		
		final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
		final String TEXT_BLACK_BOLD = "\033[1;30m";

		System.out.println(
				TEXT_BLACK_BOLD + ANSI_PURPLE_BACKGROUND + "************************** PESSOA FÍSICA **************************");

		System.out.println(formatarNome() + formatarGenero() + formatarIdade() + formatarEmail() + formatarTelefone()
				+ this.formatarCpf());
	}

	public String formatarCpf() {

		// Converter long para string
		String cpfString = Long.toString(this.cpf);

		// Formata o cpf para o padrão XXX.XXX.XXX-XX
		String cpfFormatado = cpfString.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d+)", "$1.$2.$3-$4");

		// retorna o telefone formatado para exibição
		return "\n CPF: " + cpfFormatado;
	}
}
