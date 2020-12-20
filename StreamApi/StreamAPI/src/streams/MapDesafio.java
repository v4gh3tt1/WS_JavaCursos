package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class MapDesafio {

	public static void main(String[] args) {
		
		Consumer <String> print = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		
		//numero para String binaria
		Function<Integer, String> numInt = 
				numIntBinary -> numIntBinary.toBinaryString(numIntBinary);
		
		//inverter a string
		UnaryOperator<String> inverter = 
				s -> new StringBuilder(s).reverse().toString();
		
		//converter binario para inteiro
		Function<String, Integer> converte = 
				n -> Integer.parseInt(n, 2);
		
		//convert to String
		//Function<Integer, String> letras = l -> Integer.toString(l);
		
		System.out.println(nums);
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(converte)
			.forEach(System.out::println);
	/*	
		nums.stream()
			.map(numInt)
			.map(inverter)
			.map(converte)
			.forEach(System.out::println);
	*/	

	}

}
