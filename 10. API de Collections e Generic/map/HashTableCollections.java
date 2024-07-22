package seção10.map;

import java.util.Hashtable;

public class HashTableCollections {

	public static void main(String[] args) {
		
		// chave valor
		// não permite valores nulos
		// não permite valores duplicados
		
		Hashtable<String, Double> notas = new Hashtable<String,Double>();
		notas.put("Lógica de Programação", 8.0);
		notas.put("Orientação a Objetos", 10.0);
		notas.put("Bancos de Dados", 7.4);
		System.out.println(notas);
		
		System.out.println(notas.values());
		System.out.println(notas.replace("Bancos de dados", 10.0));
		System.out.println(notas);
		
		System.out.println(notas.putIfAbsent("Java", 10.0));
		System.out.println(notas);
		
	}

}
