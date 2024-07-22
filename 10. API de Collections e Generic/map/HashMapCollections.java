package seção10.map;

import java.util.HashMap;

public class HashMapCollections {

	public static void main(String[] args) {
		
		// armazena chave valor
		// chave -> indice
		// objeto -> valor
		// permite chaves nulas
		// não garante a ordem
		
		HashMap<String, Double> notas = new HashMap<String,Double>();
		notas.put("Lógica de Programação", 8.0);
		notas.put("Orientação a Objetos", 10.0);
		notas.put("Bancos de Dados", 7.4);
		System.out.println(notas);
		
		System.out.println(notas.get("Bancos de Dados"));
		System.out.println(notas.getOrDefault("Banco de Dados", 0.0));
		System.out.println(notas.put("Java", 8.8));
		System.out.println(notas);
		System.out.println(notas.containsKey("Java"));
		System.out.println(notas.containsValue(8.0));
	}

}
