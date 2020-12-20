package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterAndMap {

	public static void main(String[] args) {


		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bob", 5.4);
		Aluno a3 = new Aluno("Gui", 9.1);
		Aluno a4 = new Aluno("Edi", 9.4);
		Aluno a5 = new Aluno("Edu", 8.5);
		Aluno a6 = new Aluno("Ivo", 6.3);


		List< Aluno > alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> isAprovado = a -> a.nota >=7; // teste se aprovado
		Predicate<Aluno> isReprovado = a -> a.nota <7; // teste se reprovado
		
		Function<Aluno, String> msgAprovado = 
				a -> "Parabéns " + a.nome + "! Você foi aprovado(a)";

		Function<Aluno, String> msgReprovado = 
				a -> a.nome + ", Você está em recuperação";
				
		alunos.stream()
			.filter(isAprovado) //uso do filtro se aprovado
			.map(msgAprovado)
			.forEach(System.out::println);
		
		alunos.stream()
			.filter(isReprovado)
			.map(msgReprovado)
			.forEach(System.out::println);
			
		
	}
	

}
