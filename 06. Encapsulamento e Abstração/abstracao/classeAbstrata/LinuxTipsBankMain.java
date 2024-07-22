package seção06.abstracao.classeAbstrata;

public class LinuxTipsBankMain {

	public static void main(String[] args) {
		
		System.out.println("Seja bem-vindx ao Linux Tips Bank :]");
		
		ContaCorrente ccGloria = new ContaCorrente();
		ccGloria.consultarSaldo();
		ccGloria.fazerPix();
		
		ContaPoupanca cpGloria = new ContaPoupanca();
		cpGloria.consultarSaldo();
		cpGloria.fazerPix();
	}

}
