import java.util.ArrayList;
import java.util.List;

public class Zoologico {
		
		private List<Animal> jaula;
		
		public Zoologico() {
			this.jaula = new ArrayList<Animal>(5);
		}
		
		public void adiciona(Animal a) {
			jaula.add(a);
		}
		
		public void cutucar() {
			for(int i = 0; i <jaula.size(); i ++) {
				jaula.get(i).emitirSom();
			}
		}
		
		public void correr() {
			for(int i = 0; i <jaula.size(); i ++) {
				if(jaula.get(i) instanceof Cavalo) {
					Cavalo cavalo = (Cavalo)jaula.get(i);
					cavalo.correr();
					
				}else if (jaula.get(i) instanceof Cachorro){
					Cachorro cachorro = (Cachorro)jaula.get(i);
					cachorro.correr();
				}else {
					System.out.println("O animal não corre");
				}
			}
		}
		
		public static void main(String[] args) {
			Zoologico zoologico = new Zoologico();
			
			zoologico.adiciona(new Cavalo("Trovão", 1));
			zoologico.adiciona(new Cachorro("Nick", 2));
			zoologico.adiciona(new Preguica("Soneca", 3));
			
			zoologico.correr();
			zoologico.cutucar();
		}
	}


