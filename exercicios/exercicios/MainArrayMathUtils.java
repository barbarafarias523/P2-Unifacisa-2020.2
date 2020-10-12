public class MainArrayMathUtils {

	public static void main(String[] args) {
		
		int[] divisores = ArrayMathUtils.calculaDivisores(32);
		System.out.println("Divisores: " + divisores);
		
		System.out.println();
		
		double[] numeros = new double[] {20.1, 18.2, 6.1, 8.7, 1.5, 5.5};
		System.out.println("Maior número: " + ArrayMathUtils.computaMaior(numeros));
		
		System.out.println();
		
		System.out.println("Menor número: " + ArrayMathUtils.computaMenor(numeros));
		
		System.out.println();
		
		System.out.println("Média: " + ArrayMathUtils.computaMedia(numeros));
		
		System.out.println();
		
		System.out.println("Números repetidos: " + ArrayMathUtils.temNumRepetido(numeros));
	}

}
