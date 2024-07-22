package seção08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ValidadorNotaFiscal {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:\\Users\\Glória\\eclipse-workspace\\cursoJavaSpring\\notaFiscal28.txt");
		Scanner sc = new Scanner(file);
		
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
}
