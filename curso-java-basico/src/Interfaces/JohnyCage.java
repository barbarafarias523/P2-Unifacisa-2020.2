package Interfaces;

public class JohnyCage extends Lutador{

	public JohnyCage() {
		super("JohnyCage");
	}
	
	public void chutar(Lutador l) {
		if(l != null) {
			super.chutar(l);
			l.vida -= 6;
		}
	}
	
	public void socar(Lutador l) {
		if(l != null) {
			super.socar(l);
			l.vida -= 10;
		}
	}
}
