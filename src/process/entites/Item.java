package process.entites;

public class Item extends Produto {
	
	private int qtd;
	private String codProduto;
	private boolean promo;
	private boolean compraPJ;
	
	Item(){
		
	}
	
	Item(String nome, double preco, int qtd, String codP, boolean promo, boolean compraPJ){
		super(nome, preco);
		this.qtd = qtd;
		this.codProduto = codP;
		this.promo = promo;
		this.compraPJ = compraPJ;
	}
	
	protected String printProduto() {
		return 	"cod" + codProduto
				+"Nome: " + nome
				+ "Valor: " + preco
				+ "Quantidade: " + qtd;
	}

	
	protected int getQtd() {
		return qtd;
	}

	protected void setQtd(int qtd) {
		this.qtd = qtd;
	}

	protected String getCodProduto() {
		return codProduto;
	}

	protected void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}
}



	
	
	
