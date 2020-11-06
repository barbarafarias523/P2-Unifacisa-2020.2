package Interfaces;
public class SubZero extends Lutador implements Bruxo{
	
	public SubZero() {
		super("SubZero");
	}
	
	public void lancarMagia(Lutador l) {
		l.vida -= 18;
	}

}
