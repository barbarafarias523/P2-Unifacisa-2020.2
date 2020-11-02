public class Pessoa {
	
	protected String nome;
	protected ContaCorrente conta;
	
	public Pessoa(String nome, int senha) {
		super();
		this.nome = nome;
		this.conta = new ContaCorrente(senha);
	}
	
	@Override
	public String toString() {
		String desc = "";
		desc += "Nome: " + nome + "\n";
		desc += conta.toString() + "\n";
		return desc;
	}
}