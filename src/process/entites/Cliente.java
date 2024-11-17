package process.entites;

public abstract class Cliente {
	protected String nome;
	protected int idade;
	protected String tipoPessoa;
	// protected produto[] carrinho;
	
	
	Cliente() {
	}
	public Cliente(String nome, int idade, String tipoPessoa) {
		this.nome = nome;
		this.idade = idade;
		this.tipoPessoa = tipoPessoa;
	}
	
	protected abstract void tipop();
	
}	
