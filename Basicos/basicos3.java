package github.java;

import java.util.Scanner;

public class Basicos3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto: ");
		String produto = entrada.next();
		
		System.out.println("Digite o preço do produto: ");
		double preco = entrada.nextDouble();
		
		if(preco > 0 && preco < 100) {
			preco *= 0.95;
		}else if(preco >= 100 && preco < 500) {
			preco *= 0.90;
		}else {
			preco *= 0.85;
		}
		
		System.out.println(produto + "R$" + preco);

	}

}