package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerAceNelio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Fone", 1900.00));
		list.add(new Product("Celular", 2900.00));
		list.add(new Product("Radio", 300.00));
		list.add(new Product("Antena", 90.00));
		list.add(new Product("Cadeira", 150.00));
		
		System.out.println("\n## valor original ## ");
		
		for ( Product p : list) {
			System.out.println(p);
		}
		
		System.out.println("\n## Usando Interface implementada ## ");
		
		list.forEach(new ConsumerUtil()); // implementação de interface
		list.forEach(System.out::println);

		System.out.println("\n## usando metodo estatico e method referente ##");
		
		list.forEach(Product::staticPriceUpdate); // usando metodo estatico e method referente
		list.forEach(System.out::println);

		System.out.println("\n## metodo nao estatico ##");
		
		list.forEach(Product::nonStaticPriceUpdate); // usando metodo nao estatico
		list.forEach(System.out::println); //method reference
		
		System.out.println("\n ## labda declarada + consumer ##");
		//expressao lambda declarada - consumer
		Double factor = 0.5;
		Consumer<Product> upDateprice = p -> p.setPrice( p.getPrice() * factor );
		list.forEach(upDateprice);
		list.forEach(System.out::println);

		System.out.println("\n ## lambda inLine ##");

		Double factor2 = 2.0;
		list.forEach(p -> p.setPrice(p.getPrice() * factor2));
		list.forEach(System.out::println);
	
		}

}
