package seção10.set;

import java.util.LinkedHashSet;

public class LinkedHashSetCollections {

	public static void main(String[] args) {
		
		// implementação de HashTable e lista vinculada da interface set
		// herda da hashset e implementa a set
		// elementos devem ser unicos
		// mantem a ordem de inserção
		
		LinkedHashSet<String> linguagens = new LinkedHashSet<>();
		linguagens.add("Java");
		linguagens.add("Python");
		linguagens.add("Javascript");
		linguagens.add("Ruby");
		linguagens.add("Kotlin");
		linguagens.add("Rust");
		linguagens.add("Scala");
		linguagens.add("C#");
		
		System.out.println(linguagens.remove("Javascript"));
	}

}
