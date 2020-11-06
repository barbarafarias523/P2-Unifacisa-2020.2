package Interfaces;

public class Lutador {
	
	protected String nome;
	protected int vida;
	
	public Lutador(String nome) {
		this.nome = nome;
		this.vida = 100;
	}
	
	public void socar(Lutador l) {
		if(l != null) {
			l.vida -= 7;
		}
	}
	
	public void chutar(Lutador l) {
		if(l != null) {
			l.vida -= 5;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public String toString() {
		return this.nome + "--- Vida " + this.vida;
	}

}
