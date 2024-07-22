package seção10.generic;

// vieram para facilitar principalmente casos de casting entre tipos
// reduzindo a complexidade e volume de código escrito dados
// podemos usar um tipo genérico de dados.

public class GenericExample<T> {

	T name;
	
	public GenericExample(T mensagem) {
		this.name = mensagem;
	}

	public T getName() {
		return name;
	}
	
	public void setName(T name) {
		this.name = name;
	}
	
	public void escrever() {
		System.out.println(name);
	}
}
