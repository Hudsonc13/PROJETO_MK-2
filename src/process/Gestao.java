package process;

import java.util.ArrayList;
import java.util.List;

import process.entites.Cliente;
import process.entites.Item;

public class Gestao {
	protected ArrayList<Item> estoque;
	protected ArrayList<Cliente> clientes;
	
	public Gestao(){
		estoque = new ArrayList<>();
		clientes = new ArrayList<>();
	}
	

    public void adcEstoque(Item produto) {
        estoque.add(produto);
        System.out.println("Produto adicionado: " + produto);
    }

    
    public void rmvEstoque(int idProduto) {
        estoque.removeIf(estoque -> estoque.getIdProduto() == idProduto);
        System.out.println("Produto removido com ID: " + idProduto);
    }

    
    public void adcCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente adicionado: " + cliente.getNome());
    }

}
