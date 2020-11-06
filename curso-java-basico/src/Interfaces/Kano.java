package Interfaces;
public class Kano extends Lutador implements Bruxo{

	public Kano() {
		super("Kano");
	}
	
	public void socar(Lutador l) {
		if(l != null) {
			super.socar(l);
			l.vida -= 7;
		}
	}
	
	public void lancarMagia(Lutador l) {
		if(l != null) {
			l.vida -= 16;
		}
	}

}
