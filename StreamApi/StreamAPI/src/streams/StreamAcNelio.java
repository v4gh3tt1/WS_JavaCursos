package streams;

import java.util.Arrays;
//import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAcNelio {

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(3, 7, 9, 2, 12, 52, 36, 99, 1);
		
		Stream <Integer> myStream1 = myList.stream();
		System.out.println( Arrays.toString(myStream1.toArray()) );

		Stream <Integer> myStream2 = myList.stream().map(x -> x +1);
		System.out.println( Arrays.toString(myStream2.toArray()) );
		
				
		Stream<String> myStreamString = Stream.of("Ze", "Bob", "Ivo", "Ana", "Lex");
		System.out.println(Arrays.toString(myStreamString.toArray()));
		
		Stream< Integer > myStreamInterate = Stream.iterate( 0, x -> x + 2 );
		System.out.println(Arrays.toString(myStreamInterate.limit(10).toArray()));
		
		int sum = myList.stream().reduce(0, (x,y) -> x + y);
		System.out.println(sum);
		
		List<Integer> myNewList = myList.stream()
				//.filter(x -> x % 2 ==0)
				.map(x -> x * 10)
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(myNewList.toArray()));
		
		
		
		//myNewList.sort(Comparator<Integer> comp = (x, y) -> x.compareTo(y));
		
		//static Comparator <Product> comp = (p1, p2) -> {
			//return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		

		
				


	}

}

/*
 * Stream
• É uma sequencia de elementos advinda de uma fonte de dados que
oferece suporte a "operações agregadas".
• Fonte de dados: coleção, array, função de iteração, recurso de E/S
• Sugestão de leitura:
http://www.oracle.com/technetwork/pt/articles/java/streams-api-java-8-3410098-ptb.html

Características
• Stream é uma solução para processar sequências de dados de forma: • Declarativa (iteração interna: escondida do programador)
• Parallel-friendly (imutável -> thread safe)
• Sem efeitos colaterais
• Sob demanda (lazy evaluation)
• Acesso sequencial (não há índices)
• Single-use: só pode ser "usada" uma vez
• Pipeline: operações em streams retornam novas streams.
Então é possível criar uma cadeia de operações (fluxo de processamento).

Operações intermediárias e terminais
• O pipeline é composto por zero ou mais operações intermediárias e
uma terminal.
• Operação intermediária:
• Produz uma nova streams (encadeamento)
• Só executa quando uma operação terminal é invocada (lazy evaluation)
• Operação terminal:
• Produz um objeto não-stream (coleção ou outro)
• Determina o fim do processamento da stream

Operações intermediárias
• filter
• map
• flatmap
• peek
• distinct
• sorted
• skip
• limit (*)
* short-circuit
* 
* Operações terminais
• forEach
• forEachOrdered
• toArray
• reduce
• collect
• min
• max
• count
• anyMatch (*)
• allMatch (*)
• noneMatch (*)
• findFirst (*)
• findAny (*)
* short-circuit
* 
* Criar uma stream
• Basta chamar o método stream() ou parallelStream() a partir
de qualquer objeto Collection.
https://docs.oracle.com/javase/10/docs/api/java/util/Collection.html
• Outras formas de se criar uma stream incluem:
• Stream.of
• Stream.ofNullable
• Stream.iterate

Demo - pipeline
List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
Stream<Integer> st1 = list.stream().map(x -> x * 10);
System.out.println(Arrays.toString(st1.toArray()));
int sum = list.stream().reduce(0, (x, y) -> x + y);
System.out.println("Sum = " + sum);
List<Integer> newList = list.stream()
.filter(x -> x % 2 == 0)
.map(x -> x * 10)
.collect(Collectors.toList());
System.out.println(Arrays.toString(newList.toArray()));

 * */
