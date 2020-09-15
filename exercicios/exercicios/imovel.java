public class imovel {
	
	String tipo, imobiliaria;
	int pavimentos, pavimento,quartos, suites, banheiros, metrosQuadrados;
	boolean elevador, piscina, quadra;
	
	imovel(String imobiliaria, int quartos, int suites, int banheiros, int metrosQuadrado, boolean piscina, boolean quadra){
		this.tipo = "Casa";
		this.imobiliaria = imobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
	}
	
	imovel(String imobiliaria, int pavimentos, int pavimento, int quartos, int suites, int banheiros, int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra){
		this.tipo = "Apartamento";
		this.imobiliaria = imobiliaria;
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra = quadra;
	}
	
	double calculaPreco() {
		double add = 0;
		
		if(pavimento > 4) {
			add += 2000;
		}if(elevador == true) {
			add += 2500;
		}if(piscina == true) {
			add += 2500;
		}if(quadra == true) {
			add += 2500;
		}
		return (metrosQuadrados * 5000) + add;
	}
	
	public String toString() {
		String descricao = "";
		descricao += "Tipo: " + this.tipo + "\n";
		descricao += "Imobiliária: " + this.imobiliaria + "\n";
		descricao += "Pavimentos: " + this.pavimentos + "\n";
		descricao += "Pavimento: " + this.pavimento + "\n";
		descricao += "Quartos: " + this.quartos + "\n";
		descricao += "Suítes: " + this.suites + "\n";
		descricao += "Banheiros: " + this.banheiros + "\n";
		descricao += "Metros quadrados: " + this.metrosQuadrados + "\n";
		descricao += "Elevador: " + (this.elevador ? "sim" : "não") + "\n";
		descricao += "Piscina: " + (this.piscina ? "sim" : "não") + "\n";
		descricao += "Quadra: " + (this.quadra ? "sim" : "não") + "\n";
		descricao += "Total: " + calculaPreco() + "\n";
		return descricao;
	}

}
