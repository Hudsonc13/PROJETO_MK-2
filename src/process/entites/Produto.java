package process.entites;

public abstract class Produto {
	protected String nome;
	protected double preco;
	protected boolean compraPJ;
	protected int idProduto;
	protected static int contador = 100;

	public Produto() {

	}

	public Produto(String nome) {
		super();
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		idProduto = contador;
		contador++;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public String printProduto() {
		return null;
	}

}
