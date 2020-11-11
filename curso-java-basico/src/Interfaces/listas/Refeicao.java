package Interfaces.listas;

public class Refeicao implements Item{
	
	protected Proteina proteina;
	protected Carboidrato carboidrato;
	
	public Refeicao(Proteina proteina, Carboidrato carboidrato) {
		this.proteina = proteina;
		this.carboidrato = carboidrato;
	}
	
	public double getPreco() {
		return proteina.getValor() + carboidrato.getValor();
	}

	public String getDescricao() {
		return proteina.name()+" com "+carboidrato.name();
	}
	
	public boolean equals(Object o) {
		if(o != null) {
			if(o instanceof Refeicao) {
				Refeicao refeicao = (Refeicao) o;
				if(refeicao.carboidrato.equals(this.carboidrato) &&
					refeicao.proteina.equals(this.proteina)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public Proteina getProteina(){
		return proteina;
	}
	
	public Carboidrato getCarboidrato() {
		return carboidrato;
	}
	
	

}
