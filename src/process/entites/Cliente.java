package process.entites;

public abstract class Cliente {
	protected String nome;
	protected String tipoPessoa;
	protected String senha;
	// protected produto carrinho[];

	Cliente() {
	}

	public Cliente(String nome, String tipoPessoa, String senha) {
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
		this.senha = senha;
	}

}
