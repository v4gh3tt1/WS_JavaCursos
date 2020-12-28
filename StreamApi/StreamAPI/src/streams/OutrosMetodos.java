package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {

	public static void main(String[] args) {


		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Bob", 4.1);
		Aluno a3 = new Aluno("Ivo", 5.1);
		Aluno a4 = new Aluno("Lex", 9.1);
		Aluno a5 = new Aluno("Anne", 7.2);
		Aluno a6 = new Aluno("Bob", 4.1);
		Aluno a7 = new Aluno("Rex", 5.1);
		Aluno a8 = new Aluno("Lua", 2.1);
		
		List<Aluno> alunos = 
				Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println); // efetua a distinção entre elementos repetidos

		System.out.println("\nSkip/Limit...");
		alunos.stream()
			.distinct()
			.skip(4) // pula elementos
			.limit(1) // limita o numero de elementos
			.forEach(System.out::println);

		System.out.println("\nTakewhile...");
		alunos.stream()
			.distinct()
			.skip(1) // pula elementos
			.limit(3) // limita o numero de elementos
			.takeWhile(a ->a.nota>4) // retorna apenas elementos que tenham nota maior que 4
			.forEach(System.out::println);
	}

}
