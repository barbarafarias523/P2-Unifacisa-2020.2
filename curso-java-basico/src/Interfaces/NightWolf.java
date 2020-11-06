package Interfaces;
public class NightWolf extends Lutador implements Bruxo, Atirador{
	
	public NightWolf() {
		super("NightWolf");
	}
	
	public void atirar(Lutador l) {
		if(l != null) {
			l.vida -= 15;
		}
	}
	
	public void lancarMagia(Lutador l) {
		if(l != null) {
			l.vida -= 16;
		}
	}
}
