public class NightWolf extends Lutador{

	public NightWolf() {
		super("NightWolf");
	}
	
	public void atirar(Lutador l) {
		if(l != null) {
			super.atirar(l);
			l.vida -= 5;
		}
	}
	
	public void lancarMagia(Lutador l) {
		if(l != null) {
			super.lancarMagia(l);
			l.vida -= 6;
		}
	}
}
