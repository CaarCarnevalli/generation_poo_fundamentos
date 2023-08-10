package generation_poo_fundamentos;

public class Cliente {

	private String nome;
	private String genero;
	private int idade;
	private String email;
	private long telefone;

	public Cliente(String nome, String genero, int idade, String email, long telefone) {
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public void visualizar() {

		final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
		final String TEXT_BLACK_BOLD = "\033[1;30m";

		System.out.println(
				TEXT_BLACK_BOLD + ANSI_PURPLE_BACKGROUND + "************************** CLIENTE **************************");

		System.out.println(this.formatarNome() + this.formatarGenero() + this.formatarIdade() + this.formatarEmail()
				+ this.formatarTelefone());
	}

	public String formatarNome() {
		return "Nome: " + nome+"                         ";
	}

	public String formatarGenero() {
		return "\n Genero: " + genero+"                         ";
	}

	public String formatarIdade() {
		return "\n Idade: " + idade+"                         ";
	}

	public String formatarEmail() {
		return "\n Email: " + email+"                         ";
	}

	public String formatarTelefone() {

		// Converter long para string
		String telefoneString = Long.toString(this.telefone);

		// Formata o telefone para o padrão (xx) x xxxx-xxxx
		String teleoneFormatado = telefoneString.replaceFirst("(\\d{2})(\\d{1})(\\d{4})(\\d+)", "($1) $2 $3-$4");

		// retorna o telefone formatado para exibição
		return "\n Telefone: " + teleoneFormatado+"                         ";
	}

}
