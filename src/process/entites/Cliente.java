package process.entites;

public abstract class Cliente {
	protected String nome;
	protected String tipoPessoa;
	protected String senha;
	protected int idCliente;
	protected static int contador = 1;
	// protected produto carrinho[];

	public Cliente(){
	}

	public Cliente(String nome, String tipoPessoa, String senha) {
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
		this.senha = senha;
		idCliente = contador;
		contador++;
	}
	public String getNome() {
		return nome;
	}
}
