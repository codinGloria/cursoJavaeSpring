package seção10.queueJava;

public class Equipe {

	public String nome;
	public int saldoDePontos;
	
	public Equipe(String nome, int saldoDePontos) {
		this.nome = nome;
		this.saldoDePontos = saldoDePontos;
	}
	
	@Override
	public String toString() {
		return "Equipe " + nome + " está com " + saldoDePontos + " pontos." ;
	}
	
}
