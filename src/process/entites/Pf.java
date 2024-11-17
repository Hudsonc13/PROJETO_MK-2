package process.entites;

public class Pf extends Cliente {
	private String cpf;
	private String contato;
	
	
	
	public Pf() {
	}

	public Pf(String nome, int idade, String tipoPessoa, String cpf, String contato) {
		super(nome, idade, tipoPessoa);
		this.cpf = cpf;
		this.contato = contato;
	}



	@Override
	public void tipop() {
		// TODO Auto-generated method stub
		
	}

}
