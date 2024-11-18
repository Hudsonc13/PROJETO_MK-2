package process.entites;

import java.util.Scanner;

public class Pj extends Cliente {
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String endereco;
	private String contato;

	public Pj() {
	}

	public Pj(String nome, String senha, String cnpj, String razaoSocial, String nomeFantasia, String endereco,
			String contato) {
		super(nome, senha);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Pj [cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", endereco="
				+ endereco + ", contato=" + contato + ", nome=" + nome + ", senha=" + senha + ", idCliente=" + idCliente
				+ "]";
	}

	@Override
	public void mudancaDados() {
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		while (continuar) {
			System.out.println("\nEscolha o atributo que deseja alterar:");
			System.out.println("1. Nome");
			System.out.println("2. Senha");
			System.out.println("3. CNPJ");
			System.out.println("4. Razão Social");
			System.out.println("5. Nome Fantasia");
			System.out.println("6. Endereço");
			System.out.println("7. Contato");
			System.out.println("8. Sair");
			System.out.print("Digite a opção: ");

			int opcao;
			if (sc.hasNextInt()) {
				opcao = sc.nextInt();
			} else {
				System.out.println("Entrada inválida. Por favor, digite um número entre 1 e 8.");
				sc.next();
				continue;
			}
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o novo nome: ");
				nome = sc.nextLine();
				break;
			case 2:
				System.out.print("Digite a nova senha: ");
				senha = sc.nextLine();
				break;
			case 3:
				System.out.print("Digite o novo CNPJ: ");
				cnpj = sc.nextLine();
				break;
			case 4:
				System.out.print("Digite a nova razão social: ");
				razaoSocial = sc.nextLine();
				break;
			case 5:
				System.out.print("Digite o novo nome fantasia: ");
				nomeFantasia = sc.nextLine();
				break;
			case 6:
				System.out.print("Digite o novo endereço: ");
				endereco = sc.nextLine();

				break;
			case 7:
				System.out.print("Digite o novo contato: ");
				contato = sc.nextLine();
				break;
			case 8:
				continuar = false;
				System.out.println("Encerrando a atualização de atributos.");
				break;
			default:
				System.out.println("Opção inválida. Por favor, tente novamente.");
			}
		}

	}

	@Override
	public String primirDados() {
		return "nome: " + nome + "\n" + "senha: " + senha + "\n" + "cnpj: " + cnpj + "\n" + "razaoSocial: "
				+ razaoSocial + "\n" + "nomeFantasia: " + nomeFantasia + "\n" + "endereco: " + endereco + "\n"
				+ "contato: " + contato;

	}

}
