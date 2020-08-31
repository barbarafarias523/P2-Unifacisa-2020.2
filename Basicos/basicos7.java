package github.java;

import java.util.Scanner;

public class Basicos7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int cont = 0;
		int soma = 0;
		
		while(num != 100) {
			System.out.println("Entre com um número: ");
			num = entrada.nextInt();
			if(num % 2 == 0 &&  num != 0 && num != 100) {
				soma += num;
				cont += 1;
				
			}
			
		}if(cont == 0) {
			System.out.println("0");
		}else {
			double media = soma / cont;
			System.out.println("A média é : " + media);

		}
	}
}