package Set;

import java.util.*;

/*
 * Dadas as seguintes informações sobre minhas séries favoritas,
 * crie um conjunto e ordene este conjunto exibindo: 
 * (nome - genero  - tempo de epsódio);
 * 
 * Série 1 = Nome: got, genero: fantasia, tempoEpsodio: 60
 * Série 2 = Nome: dark, genero: drama, tempoEpsodio: 60
 * Série 3 = Nome: that '70s show, genero: comédia, tempoEpsodio: 25
 */


@SuppressWarnings("serial")
public class OrdenandoSet {

	public static void main(String[] args) {
		System.out.println("--\tOrdem aleatória\t--");
		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comédia", 25));
		}};
		
		for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " 
				+ serie.getTempoEpsodio()); 
		
		System.out.println("--\tOrdem de inserção\t--");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Serie("got", "fantasia", 60));
			add(new Serie("dark", "drama", 60));
			add(new Serie("that '70s show", "comédia", 25));
		}};
		
		for (Serie serie : minhasSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " 
				+ serie.getTempoEpsodio()); 
		
		System.out.println("--\tOrdem natural (tempoEpsodio)\t--");
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
		for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " 
				+ serie.getTempoEpsodio()); 
		
		System.out.println("--\tOrdem Nome/Gênero/tempoEpsodio");
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempo());
		minhasSeries3.addAll(minhasSeries);
		for (Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " 
				+ serie.getTempoEpsodio()); 
		
		
}

}

class Serie implements Comparable <Serie>{
	private String nome;
	private String genero;
	private Integer tempoEpsodio;
	public Serie(String nome, String genero, Integer tempoEpsodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpsodio = tempoEpsodio;
	}
	public String getNome() {
		return nome;
	}
	public String getGenero() {
		return genero;
	}
	public Integer getTempoEpsodio() {
		return tempoEpsodio;
	}
	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpsodio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpsodio, other.tempoEpsodio);
	}
	@Override
	public String toString() {
		return "[nome=" + nome + ", genero=" + genero + ", tempoEpsodio=" + tempoEpsodio + "]";
	}
	@Override
	public int compareTo(Serie serie) {
		int tempoEpsodio =  Integer.compare(this.getTempoEpsodio(), serie.getTempoEpsodio());
		if(tempoEpsodio != 0) return tempoEpsodio;
		return this.getGenero().compareTo(serie.getGenero());
	}
	
	 
}

class ComparatoNomeGeneroTempo implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if(nome != 0) return nome;
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0) return genero;
		
		return  Integer.compare(s1.getTempoEpsodio(), s2.getTempoEpsodio());
		
		
	}
	
}