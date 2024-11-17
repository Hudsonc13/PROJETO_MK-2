package process.entites;

public abstract class Produto {

	
	protected String nome;
	protected double preco;
	protected boolean compraPJ;
	protected String codProduto;
	
	
	public Produto(){
		
	}
	
	public Produto(String nome){
		super();
	}
	
	public Produto(String nome, double preco){
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	
	public String printProduto() {
		return null;
	}
	
	
	
	
}



