import java.util.ArrayList;
import java.util.List;

public class SistemaUber {
	
	private List<Corrida> corridas;
	
	public SistemaUber() {
		this.corridas = new ArrayList<Corrida>();
	}
	
	public void adicionarCorrida(Corrida corrida) {
		this.corridas.add(corrida);
	}
	
	public double getValorCorridas() {
		double aux = 0;
		for(Corrida corrida : corridas) {
			aux += corrida.getValor();
		}
		return aux;
	}
}
