public class Classificados {

	public static void main(String[] args) {
		
		imovel casa = new imovel("Falcão", 3, 1, 2, 120, true, false);
		System.out.println(casa.toString());
		
		imovel ape = new imovel("Falcão", 15, 8, 3, 2, 3, 82, true, false, false);
		System.out.println(ape.toString());
		
		imovel casa2 = new imovel("Altaman", 4, 2, 3, 240, true, true);
		System.out.println(casa2.toString());
		
		imovel casa3 = new imovel("Leblon", 6, 3, 5, 540, true, true);
		System.out.println(casa3.toString());
		
		imovel ape2 = new imovel("Alto Branco", 3, 2, 2, 1, 2, 60, false, true, true);
		System.out.println(ape2.toString());
	}

}
