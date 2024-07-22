package seção03;

public class Operadores {

	public static void main(String[] args) {
		
		// operador de atribuicao
		int idade = 22;
		System.out.println("Valor atribuido a idade: " + idade);
		
		// operadores matematicos
		int soma = idade + 6;
		System.out.println("Resultado da soma: " + soma);
		int multiplicacao = soma * 2;
		System.out.println("Resultado da multiplicacao: " + multiplicacao);
		int divisao = multiplicacao / 2;
		System.out.println("Resultado da divisao: " + divisao);
		int modulo = divisao % 4;
		System.out.println("Resultado do modulo: " + modulo);
		
		// incremento e decremento
		int incremento = 14;
		System.out.println("Valor original antes do incremento: " + incremento);
		incremento++;
		System.out.println("Valor após o incremento: " + incremento);
	
		int decremento = 14;
		System.out.println("Valor original antes do decremento: " + decremento);
		decremento--;
		System.out.println("Valor após o decremento: " + decremento);
	
		// operadores de igualdade
		long valor1 = 1L;
		long valor2 = 2L;
		
		if(valor1 == valor2) {
			System.out.println("Valores iguais");
		} else {
			System.out.println("Valores diferentes");
		}
		
		double valor3 = 10.2;
		double valor4 = 100.2;
		
		if(valor3 != valor4) {
			System.out.println("Valores diferentes");
		} else {
			System.out.println("Valores iguais");
		}
			
		// operadores relacionais
		int primeiroValor = 1234;
		int segundoValor = 12345;
		
		if(primeiroValor > segundoValor) {
			System.out.println(primeiroValor + " é maior que " + segundoValor);
		}
		if(primeiroValor >= segundoValor) {
			System.out.println(primeiroValor + " é maior ou igual que " + segundoValor);
		}
		if(primeiroValor < segundoValor) {
			System.out.println(primeiroValor + " é menor que " + segundoValor);
		}
		if(primeiroValor <= segundoValor) {
			System.out.println(primeiroValor + " é menor ou igual que " + segundoValor);
		}
		
		// operadores lógicos
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro && falso);
	}

}
