public class UberPool extends UberX{

	private int numPassageiros;
	
	public UberPool(double km, int numPassageiros) {
		super(km);
		this.numPassageiros = numPassageiros;
	}
	
	public double getValor() {
		return super.getValor() / numPassageiros;
	}
}
