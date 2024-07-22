package seção10.listJava;

import java.util.LinkedList;

public class LinkedListCollections {

	public static void main(String[] args) {

		// igual o array list porem com melhor peformance para os métodos add e remove
		
		LinkedList<Integer> minhaLinkedList = new LinkedList<>();
		
		for(int i=1; i<=10; i++) {
			// adicionando itens na LinkedList
			minhaLinkedList.add(i);	
		}
		
		System.out.println(minhaLinkedList);
		
		// imprime e remove o primeiro
		System.out.println(minhaLinkedList.pop());
		System.out.println(minhaLinkedList);
		
		// retorna o primeiro elemento
		System.out.println(minhaLinkedList.peek());
		System.out.println(minhaLinkedList);
		
		// retorna e remove o primeiro elemento
		System.out.println(minhaLinkedList.poll());
		System.out.println(minhaLinkedList);
		
		// limpa
		minhaLinkedList.clear();
		System.out.println(minhaLinkedList);
	}

}
