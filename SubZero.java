public class SubZero extends Lutador{

	public SubZero() {
		super("SubZero");
	}
	
	public void lancarMagia(Lutador l) {
		super.lancarMagia(l);
		l.vida -= 8;
	}
}
