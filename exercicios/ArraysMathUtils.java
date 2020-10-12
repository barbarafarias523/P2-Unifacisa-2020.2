public class ArrayMathUtils {
	
	public static int[] calculaDivisores(int num) {
		int cont = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				cont++;
			}
		}
		int[] divisores = new int[cont];
		cont = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				divisores[cont] = i;
				cont++;
			}
		}
		return divisores;
	}
	public static double computaMaior(double[] numeros) {
		double numeroMaior = numeros[0];
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > numeroMaior) {
				numeroMaior = numeros[i];
			}
		}
		return numeroMaior;
	}
	public static double computaMenor(double[] numeros) {
		double numeroMenor = numeros[0];
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > numeroMenor) {
				numeroMenor = numeros[i];
			}
		}
		return numeroMenor;
	}
	public static double computaMedia(double[] numeros) {
		int aux = 0;
		for(int i = 0; i < numeros.length; i++) {
			aux += numeros[i];
		}
		return(aux/numeros.length);
	}
	public static boolean temNumRepetido(double[] numeros) {
		boolean numRepetido = false;
		int aux = 0;
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros.length; j++) {
				if(numeros[i] == numeros[j] && i != j) {
					aux++;
				}
			}
			if(aux > 0) {
				numRepetido = true;
			}
		}
		return numRepetido;
	}

}
