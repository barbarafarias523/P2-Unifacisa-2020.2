public class Rayden extends Lutador{

	public Rayden() {
		super("Rayden");
	}
	public void lancarMagia(Lutador l) {
		if(l != null) {
			super.lancarMagia(l);
			l.vida -= 9;
		}
	}

}