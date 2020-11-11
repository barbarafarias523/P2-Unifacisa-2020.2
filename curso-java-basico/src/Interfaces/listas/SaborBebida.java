package Interfaces.listas;

public enum SaborBebida {
	
	CERVEJA(6), REFRIGERANTE(5), SUCO(4), CAFE(2.5);
	
	private double valor;
	
	SaborBebida(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

}
