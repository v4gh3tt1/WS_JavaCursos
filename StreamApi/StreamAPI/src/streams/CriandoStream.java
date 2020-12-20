package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {

	public static void main(String[] args) {
		
		// usando methodReference de print
		Consumer <String> print = System.out::print;
		
		// formas de criar stream
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print); 
		
		String[] moreLangs = { "Python ", "Lisp ", "Pearl ", "Go\n"};
		Stream.of(moreLangs).forEach(print);
		
		Arrays.stream(moreLangs, 1, 3).forEach(print); // com intervalo de dados
		
		Arrays.stream(moreLangs).forEach(print); // toda lista
		
		List<String> otherLangs = Arrays.asList("C ", "C# ", "C++ ", "PHP\n");
		otherLangs.stream().forEach(print);
	

	}

}
