package seção04;

import java.util.Scanner;

public class Repetição {

	public static void main(String[] args) {
		
		// for
		for (int i=0; i<=100; i++) {
			System.out.println("Nessa repetição i está valendo " + i);
		}
		
		// while 
		Scanner sc = new Scanner(System.in);
		var valorSecreto = 0;
		while (valorSecreto != 1234) {
			System.out.println("Adivinhe o valor secreto");
			valorSecreto = sc.nextInt();
			if (valorSecreto == 1234) {
				System.out.println("PARABÉNS! VC ACERTOU :]");
			} else {
				System.out.println("Não é esse o valor, tente novamente :c");
			}
		}
		
		// do-while
		int valor = 10;
		do {
			System.out.println(valor);
			valor++;
		} while (valor <=50);
		
	}

}