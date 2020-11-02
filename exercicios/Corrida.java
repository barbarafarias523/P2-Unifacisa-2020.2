import java.util.ArrayList;
import java.util.List;

public class Corrida {
	
	//composição
	private Data inicio;
	private Data fim;
	private double km;
	
	protected ArrayList<Passageiro> passageiros;
	
	public Corrida(Data inicio, Data fim, double km, List<Passageiro> passageiros) {
		this.inicio = inicio;
		this.fim = fim;
		this.passageiros = (ArrayList<Passageiro>) passageiros;
		this.km = km;
	}
	
	public Corrida(Data inicio, Data fim, double km) {
		this.inicio = inicio;
		this.fim = fim;
		this.km = km;
		this.passageiros = new ArrayList<Passageiro>();				
	}
	
	public void adicionarPassageiro(Passageiro passageiro) {
		this.passageiros.add(passageiro);
	}
	
	protected double getPrecoBase(){
		return 5;
	}
	
	protected double getKm(){
		return 1.6;
	}
	
	public double getCusto(){
		return getPrecoBase() + getKm() * this.km;
	}
	
	@Override
	public String toString() {
		String desc = "";
		desc += "Inicio: " + inicio + "\n";
		desc += "Fim: " + fim + "\n";
		desc += "Km: " + km + "\n";
		desc += "Passageiros: " + passageiros + "\n";
		desc += "Custo: " + getCusto() + "\n";
		return desc;
	}
}
