public class MainSistemaInterpol {

	public static void main(String[] args) {
		
		SistemaInterpol sistema = new SistemaInterpol();
		sistema.adicionarProcurado("Ana");
		sistema.adicionarProcurado("Maria");
		sistema.adicionarProcurado("José");
		sistema.adicionarProcurado("João");
		
		System.out.println("Ana é procurada? " + sistema.ehProcurado("Ana"));
		System.out.println("Luiz é procurado? " + sistema.ehProcurado("Luiz"));
		
	}

}
