package Interfaces.listas;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
	
	private List<Bebidas> bebidas;
	private List<Refeicao> refeicoes;
	
	public Cardapio() {
		this.bebidas = new ArrayList<Bebidas>();		
		SaborBebida[] sabores = SaborBebida.values();
		Tamanho[] tamanhos = Tamanho.values();		
		for(SaborBebida sabor : sabores) {
			for(Tamanho tamanho : tamanhos) {
				this.bebidas.add(new Bebidas(sabor, tamanho));
			}
		}
		
		
		this.refeicoes = new ArrayList<Refeicao>();
		Proteina[] proteinas = Proteina.values();
		Carboidrato[] carboidratos = Carboidrato.values();
		for(Proteina proteina : proteinas) {
			for(Carboidrato carboidrato : carboidratos) {
				this.refeicoes.add(new Refeicao(proteina, carboidrato));
			}
		}
		
	}
	
	public List<Refeicao> getRefeicoes() {
		return refeicoes;
	}
	
	public List<Bebidas> getBebidas() {
		return bebidas;
	}
	
	public List<Item> getCardapio(){
		List<Item> cardapio = new ArrayList<Item>();
		cardapio.addAll(refeicoes);
		cardapio.addAll(bebidas);
		return cardapio;
	}

}
