public class UberBlack extends UberX{

	public UberBlack(double km) {
		super(km);
	}
	
	public double getValor() {
		return 1.1 * super.getValor();
	}

}