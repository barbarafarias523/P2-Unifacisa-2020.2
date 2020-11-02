import java.util.ArrayList;

public class UberVip extends Corrida{

	public UberVip(Data inicio, Data fim, double km, ArrayList<Passageiro> passageiros) {
		super(inicio, fim, km, passageiros);
	}
	
	public UberVip(Data inicio, Data fim, double km) {
		super(inicio, fim, km);
	}
	
	@Override
	protected double getPrecoBase(){
		return 5;
	}
	
	protected double getKm(){
		return 2.3;
	}
	
	@Override
	public String toString() {
		String desc = "Uber Vip" + "\n";
		desc += super.toString();
		return desc;
	}

}
