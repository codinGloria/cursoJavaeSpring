package seção06.encapsulamento;

public class Cachorro {

	// private só acessa dentro da classe
	private Double peso;
	private Integer idade;

	// todo o projeto tem acesso
	public Double pesoPublic;
	public Integer idadePublic;
	
	// somente dentro do pacote
	protected Double pesoProtected;
	protected Integer idadeProtected;
	
	// todo o projeto acessa
	public String latir() {
		return "AUAU";
	}
	
	// só o pacote acessa
	protected String dormir() {
		return "O cachorro está dormindo";
	}
	
	private String comer() {
		return "Hora da ração!";
	}
}
