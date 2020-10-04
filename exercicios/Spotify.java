import Encapsulamento.Musica.Genero;

public class Spotify {
	
	private Musica[] musicas;
	private int qtd;
	
	public Spotify() {
		this(10);
		
	}public Spotify(int tamanho) {
		this.musicas = new Musica[tamanho];
		this.qtd = 0;
	}
	public void adicionarMusica(Musica m) {
		if(qtd == musicas.length) {
			Musica[] aux = new Musica[2 * musicas.length];
			for(int i = 0; i < musicas.length; i++) {
				aux[i] = musicas[i];
			}
			this.musicas = aux;
		}
		musicas[qtd] = m;
		qtd++;
	}
	
	public int getQtdMusicas() {
		return qtd;
	}
	public void removerMusica(String nome) {
		boolean deslocarEsquerda = false;
		for(int i = 0; i < this.qtd; i++) {
			if(musicas[i].getnome().equals(nome)) {
				deslocarEsquerda = true;
			}
			if(deslocarEsquerda) {
				this.musicas[i] = this.musicas[i + 1];
			}
		}
	}
	public Musica[] listarMusicas(String artista) {
		int cont = 0;
		for(Musica m : this.musicas) {
			if(m != null && m.getartista().equals(artista)) {
				cont++;
			}
			
		}
		if(cont > 0) {
			Musica[] musicaArtista = new Musica[cont];
			int i = 0;
			for(Musica m : this.musicas) {
				if(m != null && m.getartista().equals(artista)) {
					musicaArtista[i] = m;
					i++;
				}
			}
			return musicaArtista;
		}else {
			return null;
			
		}
	}
	
	public Musica[] listarMusica(int ano) {
		int cont = 0;
		for(Musica m : this.musicas) {
			if(m != null && m.getanoLancamento() == ano) {
				cont++;
			}
		}
		
		if(cont > 0) {
			Musica[] musicasAno = new Musica[cont];
			int i = 0;
			for(Musica m : this.musicas) {
				if( m != null && m.getanoLancamento() == ano) {
					musicasAno[i] = m;
					i++;
				}
			}
			
			return musicasAno;
		}else {
			return null;
		}
	}
	
	public Musica[] musicaPorGenero(Genero genero) {
		int cont = 0;
		for(Musica m : this.musicas) {
			if( m != null && m.getgenero().equals(genero)) {
				cont++;
			}
		}
		if(cont > 0) {
			Musica[] musicaGenero = new Musica[cont];
			int i = 0;
			for(Musica m : this.musicas) {
				if(m != null && m.getgenero().equals(genero)) {
					musicaGenero[i] = m;
					i++;
				}
			}
			return musicaGenero;
		}else {
			return null;
		}
	}
	
	public String MaiorMusica() {
		double cont = musicas[0].getduracao();
		int aux = 0;
		
		for(int i = 0; i < qtd; i++) {
			if(musicas[i].getduracao() > cont) {
				cont = musicas[i].getduracao();
				aux = i;
			}
		}
		return musicas[aux].getnome();
	}
	
	public String MenorMusica() {
		double cont = musicas[0].getduracao();
		int aux = 0;
		
		for(int i = 0; i < qtd; i++) {
			if(musicas[i].getduracao() < cont) {
				cont = musicas[i].getduracao();
				aux = i;
			}
		}
		return musicas[aux].getnome();
	}
	
	public static void main(String[] args) {
		Spotify spt = new Spotify(5);
		spt.adicionarMusica(new Musica("Lua de cristal", "Maria", "aaa", Genero.MPB, 1995,3.5));
		spt.adicionarMusica(new Musica("Mar", "João", "bbb", Genero.AXE, 2014,2.5));
		spt.adicionarMusica(new Musica("Xote dos milagres", "Falamansa", "ccc", Genero.FORRO, 2000,4.7));
		spt.adicionarMusica(new Musica("Glamurosa", "Mc Marcinho", "ddd", Genero.FUNK, 2003,3.7));
		spt.adicionarMusica(new Musica("Cheia de manias", "Raça negra", "eee", Genero.PAGODE, 1997,4.0));
		
		for(Musica m : spt.musicas) {
			System.out.println(m);
		}
		spt.adicionarMusica(new Musica("Céu e mar", "J&M", "fff", Genero.SERTANEJO, 2005, 2.7));
		
		for(Musica m : spt.musicas) {
			System.out.println(spt);
		}
		
		spt.removerMusica("Mar");
		
		for(Musica m : spt.musicas) {
			System.out.println(m);
		}
		
		Musica[] musicaArtista = spt.listarMusicas(new String("Raça negra"));
		for(Musica m : musicaArtista) {
			System.out.println(m);
		}
	}

}
