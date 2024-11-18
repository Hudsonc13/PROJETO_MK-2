package process.entites;

public class Pj extends Cliente {
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String endereco;
	private String contato;

	public Pj() {
	}

	public Pj(String nome, String tipoPessoa,String senha, String cnpj, String razaoSocial, String nomeFantasia,
			String endereco, String contato) {
		super(nome, tipoPessoa, senha);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Pj [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", endereco="
				+ endereco + ", contato=" + contato + ", nome=" + nome + ", tipoPessoa=" + tipoPessoa + ", senha="
				+ senha + ", idCliente=" + idCliente + "]";
	}

	
}
