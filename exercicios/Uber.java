import java.util.ArrayList;
import java.util.List;

public class Uber {

	public static void main(String[] args) {
		
		Passageiro passageiro = new Passageiro("João", 123456);
		Passageiro passageiro2 = new Passageiro("José", 456123);
		Passageiro passageiro3 = new Passageiro("Maria", 789654);
		
		System.out.println();
		
		Motorista motorista = new Motorista("Ana", 456789);
		Motorista motorista2 = new Motorista("Luiz", 123689);
		Motorista motorista3 = new Motorista("Joana", 147852);
		
		System.out.println();
		
		Data inicio = new Data(1,2,2019,15,12,2020);
		Data fim = new Data(1,2,2019,15,12,2020);
		ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();
		passageiros.add(passageiro);
		passageiros.add(passageiro2);
		passageiros.add(passageiro3);
		
		List<Motorista> motoristas = new ArrayList<Motorista>();
		motoristas.add(motorista);
		motoristas.add(motorista2);
		motoristas.add(motorista3);
		
		Corrida c1 = new UberVip(inicio, fim, 5, passageiros);
		System.out.println();
		Corrida c2 = new UberPool(inicio,fim, 10, passageiros);
		
		System.out.println(c1);
		System.out.println(c2);

	}

}
