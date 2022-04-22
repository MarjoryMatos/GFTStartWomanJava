package Set;

import java.util.*;

/*
 * Dada uma lista com sete notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:
 
 */


public class ExerciciosSet {

	public static void main(String[] args) {
		
		System.out.println("Crie um conjunto e adicione as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6 ));
		System.out.println(notas);
		
		System.out.println("Confira se a nota 5 está no conjunto: " + notas.contains(5d));
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		//soma das notas
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;		
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Exiba a soma das notas: " + soma);

		
		System.out.println("Exiba a média das notas: " + (soma/notas.size()));
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
		Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6 ));
		System.out.println(notas2);
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		
		System.out.println("Apague todo o conjunto: ");
		notas.clear();
		
		System.out.println("Confira se o conjunto está vázio: ");
		System.out.println(notas2.isEmpty());
		
	}

}
