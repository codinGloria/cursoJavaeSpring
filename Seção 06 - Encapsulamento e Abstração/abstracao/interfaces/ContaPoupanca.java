package seção06.abstracao.interfaces;

public class ContaPoupanca implements Conta {

	@Override
	public void consultarSaldo() {
		System.out.println("Seu saldo é 0");
	}

	@Override
	public void fazerPix() {
		System.out.println("Não possui saldo para transferir");
	}

}
