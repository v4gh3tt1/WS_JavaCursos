package streams;

import java.util.Comparator;

public class MyComparator implements Comparator <Product> {

	//implementação da interface comparator para usar o sort na outra classe MuComparatorTest
	// pode declarator um comparator com sintaxe de classe anonima
	
	@Override
	public int compare(Product p1, Product p2) {
		
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}
	
	//sintaxe01	
	static Comparator <Product> comp = (p1, p2) -> {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	};
	
	/*
	 * sintaxe02	
	Comparator <Product> comp = p1, p2 -> 
			p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	 */
}
