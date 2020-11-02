public class Passageiro extends Pessoa{

	public Passageiro(String nome, int senha) {
		super(nome, senha);
	}
	
	@Override
	public String toString() {
		String desc = "Passageiro" + "\n";
		desc += super.toString();
		return desc;			
	}

}
