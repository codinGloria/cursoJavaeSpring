package seção09.enums;

public enum DescontoEnum {

	ALUNO(10),EXTERNO(6), FUNCIONARIO(20) ;
	int valor;
	
	DescontoEnum(int valor){
		this.valor = valor;
	}
	
	public static void main(String[] args) {
		
		for(DescontoEnum descontoEnum:DescontoEnum.values()) {
			System.out.println("Tipo de desconto: " + descontoEnum + "  Valor: " + descontoEnum.valor);
		}
	}
	
}
