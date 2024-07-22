package seção06;

public class Objetos {

	public static void main(String[] args) {
		
		Estudante codinGloria = new Estudante();
		
		codinGloria.setNome("Glória");
		codinGloria.setStack("Java, Angular e Spring");
		
		codinGloria.estudar();
		codinGloria.dormir();
		
		System.out.println(codinGloria.getNome());
		System.out.println(codinGloria.getStack());
	
	}
}
