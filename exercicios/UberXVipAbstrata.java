public class UberXVip extends UberX{
	
	public UberXVip(double km) {
		super(km);
	}
	
	public double getValor() {
		return 0.9 * super.getValor();
	}

}
