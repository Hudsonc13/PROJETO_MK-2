package process.entites;

public class Pj extends Cliente {
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String endereco;
	private String contato;
	
	
	
	
	public Pj() {
	}

	public Pj(String nome, int idade, String tipoPessoa, String cnpj, String razaoSocial, String nomeFantasia, String endereco, String contato) {
		super(nome, idade, tipoPessoa);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.contato = contato;
	}




	@Override
	public void tipop() {
		// TODO Auto-generated method stub
		
	}

}
