package seção10.listJava;

import java.util.ArrayList;

public class ArrayListCollections {

	public static void main(String[] args) {
		
		// nos fornece arrays dinâmicos em java
		// pode ser mais lento que os arrays padrão
		// aumenta 50% quando estiver cheio
		// quando aumenta o tamanho faz cópia do array atual para um novo array com o mesmo tamanho
		
		ArrayList<Integer> meuArrayList = new ArrayList<>();
		
		for(int i=1; i<=10; i++) {
			// adicionando itens no arrayList
			meuArrayList.add(i);	
		}
		
		// remove de um indice
		meuArrayList.remove(1);
		System.out.println(meuArrayList);
		
		// acessando um indice especifico
		System.out.println(meuArrayList.get(3));	
				
		// retorna se está vazio
		System.out.println(meuArrayList.isEmpty());
		
		// valida se encontra algum valor específico no array
		System.out.println(meuArrayList.contains(3));
		
		// copia
		System.out.println(meuArrayList.clone());
		
		// retorna qual indice está o valor procurado
		System.out.println(meuArrayList.indexOf(3));
		
		// limpa
		meuArrayList.clear();
		System.out.println(meuArrayList.isEmpty());
	}
}
