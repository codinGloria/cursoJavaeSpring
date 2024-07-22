package seção07.polimorfismo.sobrescrita;

public class BotaoTV extends Botao{

	@Override
	public void ligar() {
		System.out.println("Ligando a TV...");
	}
	
	@Override
	public void desligar() {
		super.desligar();
	}
}
