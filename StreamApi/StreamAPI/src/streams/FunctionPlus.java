package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FunctionPlus {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Fone", 1900.00));
		list.add(new Product("Celular", 2900.00));
		list.add(new Product("Radio", 300.00));
		list.add(new Product("Antena", 90.00));
		list.add(new Product("Cadeira", 150.00));
		
		System.out.println("\n ## valor original ## ");
		
		for ( Product p : list) {
			System.out.println(p);
		}
		
		System.out.println("\n ## implementação de classe e metodo simples ## ");
		
		FunctionPlusUtil productService = new FunctionPlusUtil();
		double sum = productService.filteredSum(list);
		
		System.out.println("Sum = " + String.format("%.2f",sum));
		
		
		System.out.println("\n ## expressão lambda passada para predicate como argumento ## ");
		
		FunctionPlusUtil productService2 = new FunctionPlusUtil();
		double sum2 = productService2.filteredSumPredicate(list, p -> p.getName().charAt(0) == 'C' );
		
		System.out.println("Sum = " + String.format("%.2f",sum2));


		FunctionPlusUtil productService3 = new FunctionPlusUtil();
		double sum3 = productService3.filteredSumPredicate(list, p -> p.getPrice() <= 1250 );
		
		System.out.println("Sum = " + String.format("%.2f",sum3));

		FunctionPlusUtil productService4 = new FunctionPlusUtil();
		double sum4 = productService4.filteredSumPredicate(list, p -> p.getName() == "Celular" );
		
		System.out.println("Sum = " + String.format("%.2f",sum4));

		
	}

}
