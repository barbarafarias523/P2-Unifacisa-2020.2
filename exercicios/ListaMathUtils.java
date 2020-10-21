import java.awt.List;
import java.util.ArrayList;

public class ListaMathUtils {
	
	public static ArrayList<Integer> calculaDivisores(int num) {
		ArrayList<Integer> divisores = new ArrayList<Integer>();
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				divisores.add(i);
			}
		}
		divisores.add(num);
		return divisores;
	}
	
	public double computaMaior(ArrayList<Double> numero) {
        double maior = numero.get(0);
        
        for (int i = 0; i < numero.size(); i++) {
            if(numero.get(i) > maior) {
                maior = numero.get(i);
            }
            
        }
        return maior;
    }
	
	public double computaMenor(ArrayList<Double> numero) {
        double menor = numero.get(0);
        
        for (int i = 0; i < numero.size(); i++) {
            if(numero.get(i) < menor) {
                menor = numero.get(i);
            }
            
        }
        return menor;
    }
	
	public double computaMedia(ArrayList<Double> numero) {
        int aux = 0;
        double calcula = 0;
        double media = 0;
        
        for (int i = 0; i < numero.size(); i++) {
            calcula+= numero.get(i);
            aux++;
        }
        return media = calcula/aux;
    }

}
