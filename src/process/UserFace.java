package process;

import java.util.Scanner;

import process.entites.*;

public class UserFace {
	
	public void login() {
		System.out.println("Bem vindo ao sistema de Vendas");
		System.out.println("Escolha sua opção: ");
		System.out.println("1. Entrar");
		System.out.println("2. Cadastrar");
	}
	public Pf cadastrarPf() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        
        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();
        
        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Contato: ");
        String contato = sc.nextLine();
        
        Pf cliente = new Pf(nome,senha,cpf,idade,contato);
        return cliente;
	}
	public Pj cadastrarPj() {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        System.out.print("Digite o CNPJ: ");
        String cnpj = scanner.nextLine();

        System.out.print("Digite a Razão Social: ");
        String razaoSocial = scanner.nextLine();

        System.out.print("Digite o Nome Fantasia: ");
        String nomeFantasia = scanner.nextLine();

        System.out.print("Digite o Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite o Contato: ");
        String contato = scanner.next();
        
        Pj cliente = new Pj(nome, senha, cnpj, razaoSocial, nomeFantasia, endereco, contato);
        return cliente;
	}
	
	public Cliente cadastrar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja cadastrar uma pessoa uma pessoa fisica ou juridica? (F/J)");
		char opc = sc.next().toLowerCase().charAt(0);
		if(opc == 'f') {
			return cadastrarPf();
		}else if(opc == 'j') {
			return cadastrarPj();
		}
		return null;
	}
}
