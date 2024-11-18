package process.entites;

public class Item extends Produto {
	
	
	
	
	
	private int qtd;
	private boolean promo;
	
	protected Item(){
		
	}
	
	//ADM!
	public Item(String nome, double preco, int qtd, String codP, boolean promo){
		super(nome, preco);
		this.qtd = qtd;
		this.promo = promo;
	}
	
	public String printProduto() {
		return 	"cod" + codProduto
				+"Nome: " + nome
				+ "Valor: " + preco
				+ "Quantidade: " + qtd;
	}

	
	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}
}



	
	
	
