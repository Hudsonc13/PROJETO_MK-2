package process;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import process.entites.Item;

public class Met_Utilitario {
	public Scanner sc = new Scanner(System.in);
	static Item i = new Item("Bike", 1800, 2, "001", true);
	Item i2 = new Item("Pedal de Ferro", 120, 60, "002", false);
	Item i3 = new Item("Guidão", 65, 25, "003", true);
	
	 static List<Item> esc = new ArrayList<Item>();
	//ArrayList so pode ser usado dentro da main?? -> não
	public static void main(String[] args) {
		esc.add(i);
	}

}
