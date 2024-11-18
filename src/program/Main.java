package program;
import process.*;
import process.entites.*;

public class Main {
	public static void main(String[] args) {
		//Testes
		
		Gestao gestao = new Gestao();
		Pf p1 = new Pf("Lucas", "S", null, null, 0, null);
		gestao.adcCliente(p1);
		System.out.println(gestao.clientes.get(0));
		Pj pj1 = new Pj("Kabum", "ti", "123", "132", "312312", "1323123", "123132", "12313");
		gestao.adcCliente(pj1);
		System.out.println(gestao.clientes.get(1));
	}
}

