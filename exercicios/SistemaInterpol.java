import java.awt.List;
import java.util.ArrayList;

public class SistemaInterpol {
	private ArrayList<String> procurados;
	
	public SistemaInterpol() {
		this.procurados = new ArrayList<String>();
	}
	
	public void adicionarProcurado(String nome) {
		this.procurados.add(nome);
	}
	public boolean ehProcurado(String nome) {
		for(String procurado : this.procurados) {
			if(procurado.equals(nome)) {
				return true;
			}
		}
		return false;
	}

}