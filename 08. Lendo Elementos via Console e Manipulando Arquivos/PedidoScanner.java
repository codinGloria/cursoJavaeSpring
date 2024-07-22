package seção08;

import java.util.Scanner;

public class PedidoScanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, insira o código do produto: ");
		String codigo = sc.nextLine();
		System.out.println("Agora, insira a quantidade de itens que deseja: ");
		Integer quantidade = sc.nextInt();
		System.out.println("Insira o valor desse produto: ");
		Double valor = sc.nextDouble();
		
		Double total = valor * quantidade;
		
		System.out.println("O valor total da sua conta é " + total);
		
	}

}
