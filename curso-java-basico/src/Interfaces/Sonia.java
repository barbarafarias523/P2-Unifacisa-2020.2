package Interfaces;
public class Sonia extends Lutador{
	
	public Sonia() {
		super("Sonia");
	}
	
	public void chutar(Lutador l) {
		if(l != null) {
			super.chutar(l);
			l.vida -= 8;
		}
	}
	
	public void socar(Lutador l) {
		if(l != null) {
			super.socar(l);
			l.vida -= 8;
		}
	}

}
