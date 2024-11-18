package process.entites;

public abstract class Cliente implements TrocaDados {
	protected String nome;
	protected String senha;
	protected int idCliente;
	protected static int contador = 1;

	public Cliente() {
	}

	public Cliente(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
		idCliente = contador;
		contador++;
	}

	public String getNome() {
		return nome;
	}

	public int getIdCliente() {
		return idCliente;
	}

}
