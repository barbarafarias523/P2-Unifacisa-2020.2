public class ContaCorrente {
	
	private String nome;
	private int cpf, senha;
	private double saldo;
	
	public ContaCorrente(int senha) {
		this.saldo = 500;
		this.senha = senha;
	}
	
	public void transferirValores(int senha, double valor, ContaCorrente conta) {
		if(conta != null && this.senha == senha
		   && valor > 0 && valor < saldo) {
			saldo -= valor;
			conta.saldo += valor;
		}
		
	}
	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "Saldo: " + saldo;
	}

}
