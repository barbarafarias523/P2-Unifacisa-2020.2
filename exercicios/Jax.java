public class Jax extends Lutador{

	public Jax() {
		super("Jax");
	}
	
	public void socar(Lutador l) {
		if(l != null) {
			super.socar(l);
			l.vida -= 10;
		}
	}
	
	

}