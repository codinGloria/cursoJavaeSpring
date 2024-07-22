package seção09;

import static seção09.StaticPedidos.*;

public class StaticMain {

	public static void main(String[] args) {
		
//		pedidosFeitos++; 
//		status.toUpperCase(Locale.ROOT);
		
		completarPedido();
		
		StaticPedidos sP = new StaticPedidos("28");
		StaticPedidos.completarPedido();
	}

}
