public class Carros {
	
	public enum Cor{
		BRANCA,PRETA,VERMELHA,AZUL,PRATA,CINZA
	}
	
	String nome, marca;
	Cor cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	double precoBase;
	
	public Carros(String nome, String marca, double precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		this.portas = 2;
		this.cor = Cor.BRANCA;
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;
	}
	
	public Carros(String nome, String marca, Cor cor, int portas, boolean vidroEletrico, boolean arCondicionado, boolean cambioAutomatico, boolean direcaoEletrica, double precoBase) {
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
	}
	
	public Carros() {
		}
	
	
	double calculaPreco() {
		double preco = precoBase;
		
		switch(cor) {
		case BRANCA:
		case AZUL:
		case VERMELHA:
		case PRETA: break;
		default: preco +=1000;
		}
		
		if(vidroEletrico == true) {
			preco+= 1250;
		}if(arCondicionado == true) {
			preco += 1250;
		}if(cambioAutomatico == true) {
			preco += 1250;
		}if(direcaoEletrica == true) {
			preco += 1250;
		}
	return preco;
	}
	public String toString() {
		String descricao = "";
		descricao += "Nome do carro: " + this.nome + "\n";
		descricao += "Marca: " + this.marca + "\n";
		descricao += "Cor: " + this.cor + "\n";
		descricao += "Vidros elétricos: " + (this.vidroEletrico ? "sim" : "não") + "\n";
		descricao += "Ar condicionado: " + (this.arCondicionado ? "sim" : "não") + "\n";
		descricao += "Cambio Automatico: " + (this.cambioAutomatico ? "sim" : "não") + "\n";
		descricao += "Direção elétrica: " + (this.direcaoEletrica ? "sim" : "não") + "\n";
		descricao += "Total: " + calculaPreco() + "\n";
		return descricao;
		
		}
	
}
	
