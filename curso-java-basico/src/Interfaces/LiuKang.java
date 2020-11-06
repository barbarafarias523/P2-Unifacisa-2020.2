package Interfaces;
public class LiuKang extends Lutador implements Bruxo{
	
	public LiuKang() {
		super("LiuKang");
	}
	
	public void chutar(Lutador l) {
		if(l != null) {
			l.vida -= 19;
		}
	}
	
	public void lancarMagia(Lutador l) {
		if(l != null) {
			l.vida -= 18;
		}
	}


}
