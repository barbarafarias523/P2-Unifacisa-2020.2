package Interfaces.listas;

public enum Proteina {
	
	PICANHA(20), MAMINHA(15), FRANGO(15), LINGUICA(10);
	
	private double valor;
	
	Proteina(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

}
