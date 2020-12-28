package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;


/*
 A fun��o "map" (n�o confunda com a estrutura de dados Map) � uma fun��o que 
  aplica uma fun��o a todos elementos de uma stream.
� Convers�es:
� List para stream: .stream()
� Stream para List: .collect(Collectors.toList())
 */

public class FunctionAceNelio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("tv", 900.00));
		list.add(new Product("Fone", 1900.00));
		list.add(new Product("Celular", 2900.00));
		list.add(new Product("Radio", 300.00));
		list.add(new Product("Antena", 90.00));
		list.add(new Product("Cadeira", 150.00));
		
		System.out.println("\n ## valor original ## ");
		
		for ( Product p : list) {
			System.out.println(p);
		}
		

		
		System.out.println("\n ## implementa��o de interface ## ");
		
		List <String> listNames = // produ��o de uma nova lista do tipo String
				list.stream() // 1: conversao de lista em stream 1�
				.map(new FunctionUtil()) // intermediario: map executa a funcao em cada elemento da lista
				.collect(Collectors.toList());// final: transforma e lista de strings apos executar a Function
	
		listNames.forEach(System.out::println);
		
		
		System.out.println("\n ## metodo estatico e method reference ##");
		
		List <String> listNamesLower = // produ��o de uma nova lista do tipo String
				list.stream() // 1: conversao de lista em stream 1�
				.map(Product::staticLoweCaseName) // intermediario: map e method referente
				.collect(Collectors.toList());// final: transforma e lista de strings apos executar a Function
	
		listNamesLower.forEach(System.out::println);

		
		System.out.println("\n ## metodo nao estatico ##");
		
		List <String> listNamesUpper = 
				list.stream() 
				.map(Product::nonStaticUpperCaseName) 
				.collect(Collectors.toList());
	
		listNamesUpper.forEach(System.out::println);
		
	
		System.out.println("\n ## express�o labda declarada + FUNCTION ##");
		
		Function<Product, String> func = p -> p.getName().toLowerCase();
		List <String> newListNames = list.stream().map(func).collect(Collectors.toList());
		newListNames.forEach(System.out::println);


		System.out.println("\n ## lambda inLine ##");

		
		List <String> newListNamesPlus = 
				list.stream().map( p -> p.getName().toUpperCase())
				.collect(Collectors.toList());
		
		newListNamesPlus.forEach(System.out::println);
		
		
	
		
	}

}
