package seção10.queueJava;

import java.util.Comparator;

// ordena por uma determinada prioridade e não por FIFO (First In, First Out)
public class EquipeComparator implements Comparator<Equipe> {

	@Override
	public int compare(Equipe equipe1, Equipe equipe2) {
		if(equipe1.saldoDePontos < equipe2.saldoDePontos) {
			return 1;
		} else if (equipe1.saldoDePontos > equipe2.saldoDePontos) {
			return -1;
		} else {
			return 0;
		}
	}
	
}
