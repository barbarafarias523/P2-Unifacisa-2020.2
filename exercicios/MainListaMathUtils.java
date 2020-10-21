import java.util.ArrayList;

import com.barbara.cursojava.aula20.Arrays;

public class MainListaMathUtils {

	public static void main(String[] args) {
		
		ListaMathUtils numero = new ListaMathUtils();
        System.out.println(numero.calculaDivisores(32));
        
        System.out.println();
        
        ArrayList<Double> maior = new ArrayList<Double>();
        maior.add(10.8);
        maior.add(68.3);
        maior.add(0.0);
        maior.add(21.1);
        maior.add(1.1);
        System.out.println(numero.computaMaior(maior));
        
        System.out.println();
        
        ArrayList<Double> menor = new ArrayList<Double>();
        menor.add(5.1);
        menor.add(10.5);
        menor.add(39.4);
        menor.add(0.5);
        menor.add(0.1);
        System.out.println(numero.computaMenor(menor));
        
        System.out.println();
        
        ArrayList<Double> media = new ArrayList<Double>();
        media.add(25.5);
        media.add(40.0);
        media.add(55.8);
        media.add(2.2);
        media.add(5.68);
        System.out.println(numero.computaMedia(media));
	}

}
