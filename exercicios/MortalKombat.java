import java.util.Random;

public class MortalKombat {
	
	private Random rand = new Random();
	private Lutador l1,l2;
	private Lutador vencedor;
	
	public MortalKombat(Lutador l1, Lutador l2) {
		this.l1 = l1;
		this.l2 = l2;
	}
	
	public void fight() {
		while(l1.getVida() > 0 && l2.getVida() > 0) {
			Lutador lAtacante = sorteiaLutador(l1, l2);
			Lutador lApanhando = null;
			if(this.l1 ==lAtacante)
				lApanhando = l2;
			else
				lApanhando = l1;
			golpear(lAtacante, lApanhando);
		}
		if(l1.getVida() > 0)
			vencedor = l1;
		else
			vencedor = l2;
	}
	
	private Lutador sorteiaLutador(Lutador l1, Lutador l2) {
		double num = rand.nextDouble();
		if(num <= 0.5) 
			return l1;
		else
			return l2;
		
	}
	

	private void golpear(Lutador lApanhando, Lutador lAtacante) {
		double num = rand.nextDouble();
		if(num <= 0.25)
			lAtacante.socar(lApanhando);
		else if(num <= 0.5)
			lAtacante.chutar(lApanhando);
		else if(num <= 0.75)
			lAtacante.atirar(lApanhando);
		else
			lAtacante.lancarMagia(lApanhando);
	}
	
	public static void main(String[] args) {
		
		Lutador l1 = new LiuKang();
		Lutador l2 = new SubZero();
		MortalKombat mk = new MortalKombat(l1, l2);
		
		for(int i = 0; i < 10; i++) {
			mk.fight();
			System.out.println("Vencedor: " + mk.vencedor);
			l1.vida = 100;
			l2.vida = 100;
		}
	}
}
