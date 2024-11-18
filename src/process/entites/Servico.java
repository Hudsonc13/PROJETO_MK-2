package process.entites;

public class Servico extends Produto{
	
	private String descProblema;
	private boolean resolvido;
	private String solucao;
	
	
	public Servico(String nome, String descP) {
		super(nome);
		this.descProblema = descP;
	}
	
	
	//ADM
	public Servico(boolean resolvido, String solucao) {
		this.resolvido = resolvido;
		this.solucao = solucao;
	}
	
	
	
}
