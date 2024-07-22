package seção06.abstracao.classeAbstrata;

public class ContaPoupanca extends Conta{

	@Override
	public void consultarSaldo() {
		System.out.println("O saldo da sua conta é 0");
	}

	@Override
	public void fazerPix() {
		System.out.println("Você não possui saldo para essa transferência :c");
	}

}
