package process.entites;

import java.util.Scanner;

public class Pf extends Cliente {
	private String cpf;
	private String contato;
	private int idade;

	public Pf() {
	}

	public Pf(String nome, String senha, String cpf, int idade, String contato) {
		super(nome, senha);
		this.cpf = cpf;
		this.idade = idade;
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Pf [cpf=" + cpf + ", contato=" + contato + ", idade=" + idade + ", nome=" + nome + ", senha=" + senha
				+ ", idCliente=" + idCliente + "]";
	}

	@Override
	public void mudancaDados() {
		boolean continuar = true;
		Scanner scanner = new Scanner(System.in);
		while (continuar) {
			System.out.println("\nEscolha o atributo que deseja alterar:");
			System.out.println("1. Nome");
			System.out.println("2. Senha");
			System.out.println("3. CPF");
			System.out.println("4. Idade");
			System.out.println("5. Contato");
			System.out.println("6. Sair");
			System.out.print("Digite a opção: ");

			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o novo nome: ");
				nome = scanner.nextLine();
				break;
			case 2:
				System.out.print("Digite a nova senha: ");
				senha = scanner.nextLine();
				break;
			case 3:
				System.out.print("Digite o novo CPF: ");
				cpf = scanner.nextLine();
				break;
			case 4:
				System.out.print("Digite a nova idade: ");
				idade = scanner.nextInt();
				scanner.nextLine();
				break;
			case 5:
				System.out.print("Digite o novo contato: ");
				contato = scanner.nextLine();
				break;
			case 6:
				continuar = false;
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}

	}

	@Override
	public String primirDados() {
		return "nome: " + nome + "\n" + "senha: " + senha + "\n" + "cpf: " + cpf + "\n" + "idade: " + idade + "\n"
				+ "contato: " + contato;

	}
}
