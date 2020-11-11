package Interfaces.listas;

public class Bebidas implements Item{
	
	private SaborBebida sabor;
	private Tamanho tamanho;
	
	public Bebidas(SaborBebida sabor, Tamanho tamanho) {
		this.sabor = sabor;
		this.tamanho = tamanho;
	}

	public double getPreco() {
		return sabor.getValor() + tamanho.getValor();
	}

	public String getDescricao() {
		return sabor.name()+" - "+tamanho.name();
	}
	
	public boolean equals(Object o) {
		if(o != null) {
			if(o instanceof Bebidas) {
				Bebidas bebida = (Bebidas) o;
				if(bebida.sabor.equals(this.sabor) &&
					bebida.tamanho.equals(this.tamanho)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public SaborBebida getSabor() {
		return sabor;
	}
	
	public Tamanho getTam() {
		return tamanho;
	}
	


}
