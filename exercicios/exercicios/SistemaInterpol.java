public class SistemaInterpol {
	String[] procurados;
	
	public void adicionarProcurados(String nomes) {
		procurados = nomes.split(" ");
		
	}
		
	boolean ehProcurado(String nome) {
		for(int i = 0; i < procurados.length; i++) {
			if(procurados[i].equals(nome)) {
				return true;
			}
		}
		return false;
	}
}
