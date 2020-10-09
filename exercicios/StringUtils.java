public class StringUtils {
	
	public static String formataAtributo(String atributo) {
		// criar um array para fazer um split(dividir as strings)
		String[] palavra = atributo.split(" ");
		
		//recebe a primeira palavra (quantidade)
		String formatada = palavra[0];
		
		//precorre array de string
		for(int i = 1; i < palavra.length; i++) {
			char primeira = palavra[i].toUpperCase().charAt(0);
			String aux = String.valueOf(primeira);
			aux += palavra[i].substring(1);
			formatada += aux;
			
		}
		return formatada;
		
	}
	public static String formataMetodoGet(String metodo) {
		return formataAtributo(metodo);
		
	}
	public static String formataClasse(String classe) {
		String palavra = new String();
		classe.toLowerCase();
		String[] formatada = classe.split(" ");
		
		for(int i = 0; i < formatada.length; i++) {
			String primeiraLetra = formatada[i].substring(0, 1).toUpperCase();
			formatada[i] = primeiraLetra + formatada[i].substring(1);
			palavra += formatada[i];
			
		}
		return palavra;
	}
	
	public static String transformaParaCaixaAlta(String palavra) {
		return palavra.toUpperCase();
	}

}
