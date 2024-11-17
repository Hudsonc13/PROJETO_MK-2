package process.entites;

public abstract class Produto {

	
	protected String nome;
	protected double preco;
	
	
	Produto(){
		
	}
	
	Produto(String nome, double preco){
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	
	protected String printProduto() {
		return null;
	}
	
	
	
	
}



