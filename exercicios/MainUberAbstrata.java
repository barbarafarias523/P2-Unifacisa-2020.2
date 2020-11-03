public class MainUber {

	public static void main(String[] args) {
	
		SistemaUber uber = new SistemaUber();
		uber.adicionarCorrida(new UberX(10));
		uber.adicionarCorrida(new UberBlack(5));
		uber.adicionarCorrida(new UberXVip(15));
		
		System.out.println("Total: " + uber.getValorCorridas());
	}

}
