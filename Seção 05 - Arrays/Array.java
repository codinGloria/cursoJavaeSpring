package seção05;

import java.util.Arrays;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		
		// estrtura de dados simples para armazenar uma coleção de elementos
		
		// forma mais comum de declarar arrays
		int[] arrayDeInt;
		
		// forma menos comum
		int arrayDeInt5[];
		
		// inicializando um array - caso você já saiba o número de elementos
		int[] arrayDeInt3 = new int[10];
		
		// preenchendo o array
		Integer[] arrayDeInt4 = {1,2,3,4,5,6,7,8,9,10};
		
		// descobrindo o tamanho do array
		int arraySize = arrayDeInt4.length;
		System.out.println("O tamanho do array é " + arraySize);
		
		// percorrendo o array
		List<Integer> items = Arrays.asList(arrayDeInt4);
		items.forEach(System.out::println);
		
		// copiando um array - copyOfRange
		String[] treinamento = new String[] {
				"treinamento", 
				"descomplicando",
				"java",
				"e",
				"spring",
				"da",
				"linux",
				"tipx"
		};
		String[] treinamentoNome = Arrays.copyOfRange(treinamento, 1, 5); // nome do array , from , to
		
		List<String> treinamentoNomeList = List.of(treinamentoNome);
		treinamentoNomeList.forEach(System.out::println);
		
		List<String> treinamentoList = List.of(treinamento);
		treinamentoList.forEach(System.out::println);
		
		// não consegue escolher o range
		String[] arrayCom3 = Arrays.copyOf(treinamento, 3);
		List<String> arrayCom3List = List.of(arrayCom3);
		arrayCom3List.forEach(System.out::println);

		// preenchendo um array - fill
		String[] java = new String[10];
		Arrays.fill(java, "java");
		List<String> javaList = List.of(java);
		javaList.forEach(System.out::println);
		
		// euquals - verificando se são iguais
		int[] arrayDeInt1 = {
				1,2,3,4,5,6,7,8,9,10
		};
		int[] arrayDeInt2 = {
				1,2,3,4,5,6,7,8,9,12
		};
		System.out.println("Os arrays são iguais? " + Arrays.equals(arrayDeInt1, arrayDeInt2));
	
		// sorted - ordenação
		String[] sorted = Arrays.copyOf(treinamento, 8);
		Arrays.sort(sorted);
		List<String> sortedList = List.of(sorted);
		sortedList.forEach(System.out::println);
	}
}