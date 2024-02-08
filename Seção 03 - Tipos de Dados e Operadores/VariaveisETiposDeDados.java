package seção03;

public class VariaveisETiposDeDados {

	public static void main(String[] args) {
		
		// valores inteiros ou negativos, requer 8 bits, maximo -128
		Byte meuByte = 127;
		System.out.println("Meu byte: " + meuByte);
		 
		// dobro de bit do byte, min -32767 e max 32767
		short meuShort = 32767;
		System.out.println("Meu short: " + meuShort);
		
		// usa 32 bits, min -2147483648 e max 2147483648
		int idade = 22;
		System.out.println("Meu int: " + idade);
		
		// 64 bits
		long meuLong = 10L;
		System.out.println("Meu long: " + meuLong);
		
		// dupla precisao, 64 bits
		double salario = 102.51;
		System.out.println("Meu double: " + salario);
		
		// precisao simples, 32 bits
		float meuFloat = 102.51F;
		System.out.println("Meu float: " + meuFloat);
		
		// 16 bits, um unicode
		char letra = 'A';
		System.out.println("Meu char: " + letra);
	
		// 1 bit
		boolean javaELegal = true;
		System.out.println("Java é legal: " + javaELegal);
	}

}
