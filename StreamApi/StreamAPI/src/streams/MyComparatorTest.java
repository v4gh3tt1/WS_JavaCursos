package streams;

import java.util.ArrayList;
import java.util.List;
//import java.util.Comparator;

public class MyComparatorTest {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Fone", 1900.00));
		list.add(new Product("Celular", 2900.00));
		list.add(new Product("Radio", 300.00));
		list.add(new Product("Antena", 90.00));
		list.add(new Product("Cadeira", 150.00));


		//versao final, com função anonima de 1a classe ( LAMBDA ) diretamente no argumento do list.sort()
		System.out.println("\nSort by name");
		list.sort ((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));


		for (Product p : list) {
			System.out.println(p);
		}


		System.out.println("\nSort by price");
		list.sort ((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

		list.forEach(System.out::println); // methodReference => (classe::metodo)

	}

}



//list.sort(MyComparator.comp); com Lambda na outra classe MyComparator (obs, precisa ser static)

//list.sort(new MyComparator()); // precisa implementar a interface comparator para usar o sort

/*
		 => outra possibilidade, usando classe anonima

		Comparator<Product> comp = new Comparator<Product>(){

			@Override
			public int compare(Product p1, Product p2) {

				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}

		};

		list.sort(comp);

		 => Usando função anonima *-*-* LAMBDA *-*-*- na propria classe

		 Comparator< Product > comp = (p1, p2) -> {
		 			return p1.getName().toUpperCase()
		 			.compareTo(p2.getName().toupperCase());
		 }		 
 */


