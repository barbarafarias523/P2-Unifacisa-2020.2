public class LiuKang extends Lutador{

	public LiuKang() {
		super("LiuKang");
	}
	
	public void chutar(Lutador l) {
		if(l != null) {
			super.chutar(l);
			l.vida -= 9;
		}
	}
	
	public void lancarMagia(Lutador l) {
		if(l != null) {
			super.lancarMagia(l);
			l.vida -= 8;
		}
	}
}