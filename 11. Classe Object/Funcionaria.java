package seção11;

import java.util.Objects;

public class Funcionaria {

	private Integer idade;
	private String nome;
	private String cargo;
	private String setor;
	private Double salario;
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Funcionaria com o nome " + nome + ", tem " + idade + " anos, trabalhando como: " + cargo + ", no setor: " + setor + ", recebendo "
				+ salario + " reais.";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionaria other = (Funcionaria) obj;
		return Objects.equals(cargo, other.cargo) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome) && Objects.equals(salario, other.salario)
				&& Objects.equals(setor, other.setor);
	}
	
}
