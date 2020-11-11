package Interfaces.listas;

import java.util.ArrayList;
import java.util.List;

public class SistemaRestaurante {
	
	private int mesas;
	private List<Cliente> clientes;
	
	public SistemaRestaurante() {
		this.mesas = 0;
		this.clientes = new ArrayList<Cliente>();
	}
	
	public void adicionarCliente() {
		Cliente c = new Cliente(mesas);
		this.clientes.add(c);
		this.mesas++;
	}
	
	public void adicionarPedido(int mesa, Item i) {
		Cliente cliente = this.clientes.get(mesa);
		cliente.adicionarPedido(i);
	}
	
	public void removerPedido(int mesa, Item i) {
		Cliente cliente = this.clientes.get(mesa);
		cliente.removerPedido(i);
	}
	
	public double computarPagamentoCliente(int mesa) {
		Cliente cliente = this.clientes.get(mesa);
		return cliente.getConta();
	}
	
	public void receberPagamentoCliente(int mesa, double pagamento) {
		double conta = computarPagamentoCliente(mesa);
		if(pagamento >= conta) {
			this.clientes.remove(mesa);
			this.mesas--;
			
			while(mesa < this.mesas) {
				Cliente c = this.clientes.get(mesa);
				int mes = c.getMesa();
				mes--;
				c.setMesa(mes);
				mesa++;
			}
		}
	}
}
