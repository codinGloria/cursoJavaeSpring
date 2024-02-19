package seção10.listJava;

import java.util.Vector;

public class VectorListCollections {

	public static void main(String[] args) {
		
		// também muito semelhante ao ArrayList mas é mais thread safe
		// alocação dinâmica -> aumenta 100% o tamanho quando está cheia
		
		Vector<Integer> meuVector = new Vector<>();
		
		for(int i=1; i<=10; i++) {
			// adicionando itens no Vector
			meuVector.add(i);	
		}
		
		System.out.println(meuVector.elementAt(2));
		System.out.println(meuVector.firstElement());
		meuVector.add(20);
		System.out.println(meuVector);
		
		meuVector.add(1, 10);
		System.out.println(meuVector);
		
	}

}
