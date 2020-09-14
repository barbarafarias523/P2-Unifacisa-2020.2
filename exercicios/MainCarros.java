import classesObjetos.Carros.Cor;

public class MainCarro {
	
	public static void main(String[] args) {
		Carros carro1 = new Carros("Pálio", "Fiat", 35000);
		System.out.println(carro1.toString());
		
		Carros carro2 = new Carros("Pálio", "Fiat", Cor.PRATA, 2, false, false,false,false, 35000);
		System.out.println(carro2.toString());
		
		Carros carro3 = new Carros("Civic", "Honda",Cor.CINZA, 4, true, true, true, true, 110000);
		System.out.println(carro3.toString());
		
		Carros carro4 = new Carros("Corolla", "Toyota", Cor.PRETA, 4, true, true,false, true, 110000);
		System.out.println(carro4.toString());
		
		Carros carro5 = new Carros();
		System.out.println(carro5.toString());
	}

}