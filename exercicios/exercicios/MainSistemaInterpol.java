public class MainSistemaInterpol {

	public static void main(String[] args) {
		SistemaInterpol nomes = new SistemaInterpol();
		nomes.adicionarProcurados("Phulano Syckrano Bheltranno");
		System.out.println(nomes);
		
		System.out.println();
		
		System.out.println(nomes.ehProcurado("Fulano"));
		System.out.println(nomes.ehProcurado("Bheltranno"));

	}

}
