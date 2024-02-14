package seção08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class NotaFiscal {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, insira o código do produto: ");
		String codigo = sc.nextLine();
		System.out.println("Agora, insira a quantidade de itens que deseja: ");
		Integer quantidade = sc.nextInt();
		System.out.println("Insira o valor desse produto: ");
		Double valor = sc.nextDouble();
		
		Double total = valor * quantidade;
		
		System.out.println("O valor total da sua conta é " + total);
		
		System.out.println("Aguarde... Estamos emitindo sua nota fiscal");
		Path fileName = Path.of("C:\\Users\\Glória\\eclipse-workspace\\cursoJavaSpring\\notaFiscal" + codigo + ".txt");
		String text = "\n\nCódigo do produto: " + codigo + "\nQuantidade: " + quantidade + "\nValor do produto: " + valor + "\n\nTotal da compra: " + total;
		
		Files.writeString(fileName, text);
		String fileContent = Files.readString(fileName);
		System.out.println(fileContent);
		
	}

}
