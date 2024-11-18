package program;

import process.*;
import process.entites.*;

public class Main {
	public static void main(String[] args) {
		// Testes
		UserFace uf = new UserFace();
		Gestao gestao = new Gestao();
		gestao.adcCliente(uf.cadastrar());
		System.out.println(gestao.clientes.get(0).primirDados());
	}
}
