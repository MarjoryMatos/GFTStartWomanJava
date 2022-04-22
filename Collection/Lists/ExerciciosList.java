package Lists;

import java.util.*;

/*
 * Dada uma lista com 7 notas de um aluno [7, 8.5, 5, 7, 0, 3.6], fa�a:
 */


public class ExerciciosList {
	public static void main(String[] args) {
		
		System.out.println("Crie uma lista e adicione as sete notas: ");
		List<Double> notas = new ArrayList<>();
		notas.add(7.0);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5d);
		notas.add(7.0);
		notas.add(0d);
		notas.add(3.6);
				
		System.out.println(notas);
		
		System.out.println("Exiba a posi��o da nota 5.0: " + notas.indexOf(5d));
		
		System.out.println("Adicione na lista a nota 8.0 na posi��o 4: ");
		notas.add(4, 8.0);
		System.out.println(notas);
		
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5d), 6.0);
		System.out.println(notas);
		
		System.out.println("Confira se a nota 5.0 est� na lista: " + notas.contains(5d));
		
		System.out.println("Exiba todas as notas na ordem em que foram informados: " + notas);
		
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		System.out.println(notas);
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		//soma
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		
		System.out.println("Exiba a soma dos valores: " + soma);
		
		System.out.println("Exiba a m�dia das notas: " + (soma/notas.size()));
		
		System.out.println("Remova a nota 0.0: ");
		notas.remove(0d);
		
		System.out.println(notas);
		
		System.out.println("Remova a nota na posi��o 0: ");
		notas.remove(0);
		
		System.out.println(notas);
		
		/*System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator.next();
			if(next < 7) iterator.remove();	
		}
		System.out.println(notas);
	}*/
		
		System.out.println("Aapague toda a lista: ");
		notas.clear();
		
		System.out.println("Confira se a lista est� vazia: ");
		System.out.println(notas);
}
}	
