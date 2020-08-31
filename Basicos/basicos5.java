package github.java;

import java.util.Scanner;

public class Basicos5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int cont = 0;
		
		for(int i = 0; i <= 25; i++) {
			System.out.println("Entre com um número: ");
			
			int num = entrada.nextInt();
			if(num % 2 == 0 && num > 0) {
				cont += 1;
			}
		}
		
		System.out.println("Os números pares e positivos são: " + cont);
		
	}
}	