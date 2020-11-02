public class Motorista extends Pessoa{

	public Motorista(String nome, int senha) {
		super(nome, senha);
	}
	
	@Override
	public String toString() {
		String desc = "Motorista" + "\n";
		desc += super.toString();
		return desc;			
	}	

}