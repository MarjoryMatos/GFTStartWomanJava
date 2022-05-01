package Map;

import java.util.*;
import java.util.Map.Entry;

/*
Dada as seguintes informa��es sobre meus livros favoritos e seus autores, crie um dicion�rio e ordene este dicion�rio:
exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen - Livro = nome: Uma Breve Hist�ria do tempo. P�ginas: 256
Autor = Duhigg, Charles - Livro =  nome: O Poder do Habito. P�ginas: 408
Autor = Harari, Yuval Noah = Livro =  nome: 21 Li��es Para o S�culo 21. P�ginas 432

*/

public class OrdenandoMap {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		
		System.out.println("--\tOrdem aleat�ria\t--");
		
		Map<String, Livro> meusLivros = new HashMap<>() {{
			put("Hawking, Stephen", new Livro("Uma Breve Hist�ria do tempo", 256));
			put("Duhigg, Charles", new Livro("O Poder do Habito", 408)); 
			put("Harari, Yuval Noah", new Livro("21 Li��es Para o S�culo 21", 432)); 
		}};
		
		for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println("--\tOrdem Inser��o\t--");
		Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
			put("Hawking, Stephen", new Livro("Uma Breve Hist�ria do tempo", 256));
			put("Duhigg, Charles", new Livro("O Poder do Habito", 408)); 
			put("Harari, Yuval Noah", new Livro("21 Li��es Para o S�culo 21", 432)); 
		}};
		
		for(Map.Entry<String, Livro> livro : meusLivros1.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		
		System.out.println("--\tOrdem alfab�tica autores\t--");
		Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
		for(Map.Entry<String, Livro> livro : meusLivros2.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println("--\tOrdem alfab�tica nome dos livros\t--");
		
		Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
		meusLivros3.addAll(meusLivros.entrySet());
		System.out.println(meusLivros3);
		for(Map.Entry<String, Livro> livro : meusLivros3)
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
	}

}

class Livro {
	private String nome;
	private Integer paginas;
	
	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
	}
	

	
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}
	 
}
