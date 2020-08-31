package github.java;

import java.util.Scanner;

public class Basicos6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int cont = 0;
		
		for(int i = 0; i <= 50; i++) {
			System.out.println("Entre com um número: ");
			
			int num = entrada.nextInt();
			if(i % 3 == 0) {
				cont += num;
			}
		}
		System.out.println("A soma dos múltiplos de 3 são: " + cont);
	}

}
