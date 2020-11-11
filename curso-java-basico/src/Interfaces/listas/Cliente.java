package Interfaces.listas;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private int mesa;
	private List<Item> pedidos;
	
	public Cliente(int mesa) {
		this.mesa = mesa;
		this.pedidos = new ArrayList<Item>();
	}
	
	public double getConta() {
		double total = 0;
		for(Item item : pedidos) {
			total += item.getPreco();
		}
		return total;
	}
	
	public void adicionarPedido(Item i) {
		pedidos.add(i);
	}
	
	public void removerPedido(Item i) {
		pedidos.remove(i);
	}
	
	public int getMesa() {
		return mesa;
	}
	
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

}
