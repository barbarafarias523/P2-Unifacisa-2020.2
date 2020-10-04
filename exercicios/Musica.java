public class Musica {
	
	public enum Genero{
		
		AXE, BLUES, COUNTRY, ELETRONICA, FORRO, FUNK, GOSPEL, HIPHOP, JAZZ, MPB, CLASSICA, PAGODE, POP, RAP, REGGAE, ROCK, SAMBA, SERTANEJO
	}
	
	private String nome;
	private String artista;
	private String letra;
	private Genero genero;
	private int anoLancamento;
	private double duracao;
	private int reproduzida;
	
	public Musica(String nome, String artista, String letra, Genero genero, int anoLancamento, double duracao){
		
		this.nome = nome;
		this.artista = artista;
		this.letra = letra;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.duracao = duracao;
		this.reproduzida = 0;
		
	}
	public String getnome() {
		return nome;
	}
	public String getartista() {
		return artista;
	}
	public String getletra() {
		return letra;
	}
	public Genero getgenero() {
		return genero;
	}
	public int getanoLancamento() {
		return anoLancamento;
	}
	public double getduracao() {
		return duracao;
	}
	public int getreproduzida() {
		return reproduzida;
	}
	public void tocarMusica() {
		this.reproduzida++;
	}
	
	public String toString() {
		String des = "";
		des += "Nome da música: " + this.nome + "\n";
		des += "Artista: " + this.artista + "\n";
		des += "Letra: " + this.letra + "\n";
		des += "Gênero: " + this.genero + "\n";
		des += "Ano de lançamento: " + this.anoLancamento + "\n";
		des += "Duração: " + this.duracao + "\n";
		des += "Número de vezes reproduzida: " + this.reproduzida + "\n";
		return des;
	}
	

}
