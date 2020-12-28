package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class PredicateAceNelio {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Fone", 1900.00));
		list.add(new Product("Celular", 2900.00));
		list.add(new Product("Radio", 300.00));
		list.add(new Product("Antena", 90.00));
		list.add(new Product("Cadeira", 150.00));
		
		for ( Product p : list) {
			System.out.println(p);
		}
		
		System.out.println("");
		
		list.removeIf(p -> p.getPrice() < 100); // lambda passada diretamente na referencia
		
		for ( Product p : list) {
			System.out.println(p);
		}
		
		System.out.println("");
		
		list.removeIf(new ProductPredicate()); // implementação manual de uma interface funcional
		
		for ( Product p : list) {
			System.out.println(p);
		}
		
		System.out.println("");
		
		list.removeIf(Product:: staticProductPredicate); // Method reference com metodo estatico
		
		for ( Product p : list) {
			System.out.println(p);
		}

		System.out.println("");
		
		list.removeIf(Product:: nonStaticProductPredicate); // Method reference com metodo nao estatico
		
		for ( Product p : list) {
			System.out.println(p);
		}
		
		System.out.println("");
		
		double varPrice = 2000; // pode capturar valores fornecidos pelo usuario
		
		Predicate<Product> pred = p -> p.getPrice() >= varPrice; // Lambda declarada em predicate
		list.removeIf(pred); // valor forncedio armazenado em variavel
		
		for ( Product p : list) {
			System.out.println(p);
		}
		

	}

}
