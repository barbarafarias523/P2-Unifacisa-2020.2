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
		
		Carros carro5 = new Carros("Gol", "Volkswagem", Cor.BRANCA, 4, true, true, true, true, 55000);
		System.out.println(carro5.toString());
		
		System.out.println();
		
		carro1.promocao = true;
		System.out.println(carro1);
		carro2.promocao = true;
		System.out.println(carro2);
		carro3.promocao = true;
		System.out.println(carro3);
		carro4.promocao = true;
		System.out.println(carro4);
		carro5.promocao = true;
		System.out.println(carro5);
	}

}
