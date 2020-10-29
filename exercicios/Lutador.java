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
	
	public void atirar(Lutador l) {
		if(l != null) {
			l.vida -= 10;
		}
	}
	
	public void lancarMagia(Lutador l) {
		if(l != null) {
			l.vida -= 12;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getVida() {
		return vida;
	}
	public String toString() {
		return this.nome + "--- Vida " + this.vida;
	}

}
