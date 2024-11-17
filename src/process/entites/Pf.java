package process.entites;

public class Pf extends Cliente {
	private String cpf;
	private String contato;
	private int idade;
	public Pf() {
	}

	public Pf(String nome, String tipoPessoa, String senha, String cpf, int idade, String contato) {
		super(nome, tipoPessoa, senha);
		this.cpf = cpf;
		this.idade = idade;
		this.contato = contato;
	}

}
