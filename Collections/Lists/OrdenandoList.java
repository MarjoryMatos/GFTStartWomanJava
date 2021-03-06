package Lists;

import java.util.*;

/*
 * Dadas as seguintes informa??es sobre meus gatos, crie uma lista e ordene
 * esta lista exibindo:
 * (nome - idade - cor)
 * 
 * Gato 1 = nome: Jon, idade: 18, cor: preto
 * Gato 1 = nome: Simba, idade: 6, cor: tigrado
 * Gato 1 = nome: Jon, idade: 12, cor: amarelo
 */

@SuppressWarnings("serial")
public class OrdenandoList {
	
	public static void main(String[] args) {
		System.out.println("--\tOrdem de Inser??o\t--");
		List<Gato> meusGatos = new ArrayList<>() {{
			add(new Gato("Jon", 18, "preto"));
			add(new Gato("Simba", 6, "togrado"));
			add(new Gato("Jon", 12, "amarelo"));
		}};
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem de Inser??o\t--");
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Aleat?ria\t--");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Narutal (Nome)\t--");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Idade\t--");
		Collections.sort(meusGatos, new ComparatorIdade());
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Cor\t--");
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Nome/Cor/Idade\t--");
		meusGatos.sort(new ComparatorNomeCorIdade());
		System.out.println(meusGatos);
		
		
		
}
}
class Gato implements Comparable<Gato>{
	
	private String nome;
	private Integer idade;
	private String cor;
	public Gato(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	public String getNome() {
		return nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public String getCor() {
		return cor;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}
	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
	
}

class ComparatorIdade implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}

class ComparatorCor implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
	
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if(nome != 0 ) return nome;
		
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if(cor != 0) return cor;
		
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
	
}