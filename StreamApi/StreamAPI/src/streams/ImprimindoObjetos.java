package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		// percorrer lista e imprimir dados
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		//forma mais simples de percorrer os elementos com laço for
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
			
		}
		System.out.println("\n*-*-*-*-*-*-*-*-*");
		
		// usando o foreach
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\n*-*-*-*-*-*-*-*-*");
		
		// usando o Iterator, quando nao sabe a quantidade certa, usar while
		Iterator<String> it = aprovados.iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
		// usando strem ->laço interno
		System.out.println("\n*-*-*-*-*-*-*-*-*");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println); // laço interno
		
	}

}
