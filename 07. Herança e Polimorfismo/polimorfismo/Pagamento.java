package seção07.polimorfismo;

// exemplo de sobrecarga
public class Pagamento {

	// pagamento à vista
	public Double pagamento(Double valor) {
		return valor;
	}
	
	// calcula o valor das parcelas
	public Integer pagamento(Integer valorInt, Integer parcelas) {
		return valorInt / parcelas;
	}
	
	// juros
	public long pagamento(Integer valorInt, Integer parcelas, Long juros) {
		return (valorInt / parcelas) + juros;
	}
}
