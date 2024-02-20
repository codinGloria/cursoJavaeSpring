package seção11;

public class toStringMain {

	public static void main(String[] args) {
		
		Funcionaria funcionaria = new Funcionaria();
		funcionaria.setCargo("Desenvolvedora");
		funcionaria.setIdade(22);
		funcionaria.setNome("Glória");
		funcionaria.setSetor("Bancário");
		funcionaria.setSalario(2100.80);
		
		System.out.println(funcionaria);
		
		System.out.println(funcionaria.getNome().equals("Java"));
	
		System.out.println(funcionaria.hashCode());
		System.out.println(funcionaria.getNome().hashCode());
		System.out.println(funcionaria.getCargo().hashCode());
		System.out.println(funcionaria.getSetor().hashCode());
		System.out.println(funcionaria.getIdade().hashCode());
		System.out.println(funcionaria.getSalario().hashCode());
	
	}

}
