package program;
import process.*;
import process.entites.*;

public class Main {
	public static void main(String[] args) {
		Gestao gestao = new Gestao();
		Pf p1 = new Pf("Lucas", "S", null, null, 0, null);
		gestao.adcCliente(p1);
	}
}

