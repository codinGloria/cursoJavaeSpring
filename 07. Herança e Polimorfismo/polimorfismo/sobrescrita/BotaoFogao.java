package seção07.polimorfismo.sobrescrita;

public class BotaoFogao extends Botao {

	@Override
	public void ligar() {
		System.out.println("Hora de esquentar a comida");
	}
	
	@Override
	public void desligar() {
		super.desligar();
	}
}
