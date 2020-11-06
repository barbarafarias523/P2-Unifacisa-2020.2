package Interfaces;

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
			if(lAtacante instanceof Atirador) {
				Atirador lAtirador = (Atirador) lAtacante;
				lAtirador.atirar(lApanhando);
			}
			else {
				golpear(lAtacante, lApanhando);
			}
		
		else
			if(lAtacante instanceof Bruxo) {
				Bruxo lBruxo = (Bruxo) lAtacante;
				lBruxo.lancarMagia(lApanhando);
			}
			else {
				golpear(lAtacante, lApanhando);
			}
	}
	
	public static void main(String[] args) {
		
		int luta = 1;
		
		Lutador l1 = new Jax();
		Lutador l2 = new Rayden();		
		Lutador vencedor1 = luta(l1, l2, luta);
		
		luta++;		
		l1 = new NightWolf();
		l2 = new LiuKang();
		Lutador vencedor2 = luta(l1, l2, luta);
		
		luta++;
		l1 = new SubZero();
		l2 = new Sonia();
		Lutador vencedor3 = luta(l1, l2, luta);
		
		luta++;
		l1 = new JohnyCage();
		l2 = new Kano();
		Lutador vencedor4 = luta(l1, l2, luta);	
		
		System.out.println("\n --Semi-finais---");		
		luta++;
		l1 = vencedor1;
		l2 = vencedor2;
		Lutador vencedorSemi1 = luta(l1, l2, luta);
		
		luta++;
		l1 = vencedor3;
		l2 = vencedor4;
		Lutador vencedorSemi2 = luta(l1, l2, luta);
		
		System.out.println("\n\n ---Finais---");		
		luta++;
		l1 = vencedorSemi1;
		l2 = vencedorSemi2;
		Lutador vencedorFinal = luta(l1, l2, luta);
		
		
	}
	
	public static Lutador luta(Lutador l1, Lutador l2, int numLuta) {
		System.out.println("Luta "+ numLuta + ": "+l1+" vs "+l2);
		MortalKombat mk = new MortalKombat(l1, l2);
		mk.fight();
		Lutador vencedor = mk.vencedor;
		System.out.println("Vencedor "+ numLuta +": "+ mk.vencedor);
		return vencedor;		
	}

}
