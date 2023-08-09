package generation_poo_fundamentos;

public class Cliente {

	private String nome;
	private String genero;
	private int idade;
	private long cpf;
	private long telefone;

	public Cliente(String nome, String genero, int idade, long cpf, long telefone) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.cpf = cpf;
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

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public void visualizar() {
		System.out.println(this.formatarNome() + this.formatarGenero() + this.formatarIdade() + this.formatarCpf()
				+ this.formatarTelefone());
	}

	public String formatarNome() {
		return "\n Nome: " + nome;
	}

	public String formatarGenero() {
		return "\n Genero: " + genero;
	}

	public String formatarIdade() {
		return "\n Idade: " + idade;
	}

	public String formatarCpf() {

		// Converter long para string
		String cpfString = Long.toString(this.cpf);

		// Formata o cpf para o padrão XXX.XXX.XXX-XX
		String cpfFormatado = cpfString.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d+)", "$1.$2.$3-$4");

		// retorna o telefone formatado para exibição
		return "\n CPF: " + cpfFormatado;
	}

	public String formatarTelefone() {

		// Converter long para string
		String telefoneString = Long.toString(this.telefone);

		// Formata o telefone para o padrão (xx) x xxxx-xxxx
		String teleoneFormatado = telefoneString.replaceFirst("(\\d{2})(\\d{1})(\\d{4})(\\d+)", "($1) $2 $3-$4");

		// retorna o telefone formatado para exibição
		return "\n Telefone: " + teleoneFormatado;
	}

}
