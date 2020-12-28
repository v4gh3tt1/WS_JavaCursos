package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {


		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Bob", 8.1);
		Aluno a3 = new Aluno("Ivo", 5.1);
		Aluno a4 = new Aluno("Lex", 9.1);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >=7.0;
		
							// PIPELINE - funcao inicial * funcao intermediaria * funcao terminal
		
		System.out.println("todos aprovados?: " + alunos.stream().allMatch(aprovado)); //todos aprovados?
		System.out.println("algum aprovado?: " + alunos.stream().anyMatch(aprovado)); // algum aprovado?
		System.out.println("nenhum aprovado?: " +alunos.stream().noneMatch(aprovado)); // nenhum aprovado?
		System.out.println("'negacao' nenhum aprovado?: " +alunos.stream().noneMatch(aprovado.negate())); // nenhum aprovado?

	}

}
