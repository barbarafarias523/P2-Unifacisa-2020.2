package Interfaces;

public class Rayden extends Lutador implements Bruxo{
	
	public Rayden() {
		super("Rayden");
	}
	public void lancarMagia(Lutador l) {
		if(l != null) {
			l.vida -= 19;
		}
	}


}
