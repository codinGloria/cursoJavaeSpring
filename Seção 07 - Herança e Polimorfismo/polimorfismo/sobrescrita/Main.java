package seção07.polimorfismo.sobrescrita;

public class Main {

	public static void main(String[] args) {
		
		BotaoFogao bf = new BotaoFogao();
		bf.ligar();
		bf.desligar();
		
		BotaoTV bTV = new BotaoTV();
		bTV.ligar();
		bTV.desligar();
	}

}
