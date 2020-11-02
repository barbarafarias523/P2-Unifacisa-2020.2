import java.util.ArrayList;
import java.util.List;

public class UberPool extends Corrida{
	
	public UberPool(Data inicio, Data fim, double km, List<Passageiro> passageiros) {
		super(inicio, fim, km);
	}
	
	public UberPool(Data inicio, Data fim, double km) {
		super(inicio, fim, km);
	}
	
	@Override
	protected double getPrecoBase(){
		return 4.5;
	}
	
	@Override
	protected double getKm(){
		return 1.3;
	}
	
	@Override
	public double getCusto(){
		double custo = super.getCusto();
	    return custo = (super.passageiros.size()/10 * custo);
	}
	
	@Override
	public String toString() {
		String desc = "Uber Pool" + "\n";
		desc += super.toString();
		return desc;
	}

}
