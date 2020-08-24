import java.util.Scanner;

public class MoedasNotas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		
		double valor = scan.nextDouble();
		valor += 0.001;
		int notas100, notas50, notas20, notas10, notas5, notas2;
		int moedas1, moedas50, moedas25, moedas10, moedas5, moedas001;
		
		notas100 = (int) (valor / 100);
		valor = valor - (notas100 * 100);
		notas50 = (int) (valor / 50);
		valor = valor - (notas50 * 50);
		notas20 = (int) (valor / 20);
		valor = valor - (notas20 * 20);
		notas10 = (int) (valor / 10);
		valor = valor - (notas10 * 10);
		notas5 = (int) (valor / 5);
		valor = valor - (notas5 * 5);
		notas2 = (int) (valor / 2);
		valor = valor - (notas2 * 2);
		
		
		moedas1 = (int) (valor / 1);
		valor = valor - (moedas1 * 1);
		moedas50 = (int) (valor / 0.50);
		valor = valor - (moedas50 * 0.50);
		moedas25 = (int) (valor / 0.25);
		valor = valor - (moedas25 * 0.25);
		moedas10 = (int) (valor / 0.10);
		valor = valor - (moedas10 * 0.10);
		moedas5 = (int) (valor / 0.05);
		valor = valor - (moedas5 *0.05);
		moedas001 = (int) (valor / 0.01);
		valor = valor - (moedas001 * 0.01);
		
		System.out.println("NOTAS:");
		System.out.println(notas100 + " nota (s) de R$ 100.00");
		System.out.println(notas50 + " nota (s) de R$ 50.00");
		System.out.println(notas20 + " nota (s) de R$ 20.00");
		System.out.println(notas10 + " nota (s) de R$ 10.00");
		System.out.println(notas5 + " nota (s) de R$ 5.00");
		System.out.println(notas2 + " nota (s) de R$ 2.00");
		System.out.println("Moedas:");
		System.out.println(moedas1 + " moeda (s) de R$ 1.00");
		System.out.println(moedas50 + " moeda (s) de R$ 0.50");
		System.out.println(moedas25 + " moeda (s) de R$ 0.25");
		System.out.println(moedas10 + " moeda (s) de R$ 0.10");
		System.out.println(moedas5 + " moeda (s) de R$ 0.05");
		System.out.println(moedas001 + " moeda (s) de R$ 0.01");
		
		

	}

}
