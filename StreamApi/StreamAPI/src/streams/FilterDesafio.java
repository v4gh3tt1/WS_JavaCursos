package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio {

	
	public static void main(String[] args) {
		
		Pessoa p01 = new Pessoa("Joao", 17, "brasileiro", 12);
		Pessoa p02 = new Pessoa("Pedro", 14, "brasileiro", 0);
		Pessoa p03 = new Pessoa("Javier", 19, "argentino", 6);
		Pessoa p04 = new Pessoa("Ernesto", 26, "uruguaio", 45);
		Pessoa p05 = new Pessoa("Maria", 46, "brasileiro", 02);
		Pessoa p06 = new Pessoa("Guevara", 78, "chileno", 65);
		Pessoa p07 = new Pessoa("Lula", 72, "cubano", 0);
		Pessoa p08 = new Pessoa("Dilma", 62, "brasileiro", 45);
		Pessoa p09 = new Pessoa("Hitler", 97, "alemao", 15);
		Pessoa p10 = new Pessoa("Daniel", 12, "brasileiro", 9);
		
		List <Pessoa> listaPessoas = 
				Arrays.asList(p01, p02, p03, p04, p05, p06, p07, p08, p09, p10);
		
		//teste se maior de idade
		Predicate<Pessoa> maiorIdade = 
				p -> p.idade >=18; // maior de 18 pode dirigir
				
		Predicate<Pessoa> menorIdade = 
						p -> p.idade <18; // 

		
		Predicate<Pessoa> cnhAtiva = 
				p -> p.ptsCnh < 20; // true pode dirigir, false não pode dirigir
				
		Predicate<Pessoa> cnhInativa = 
						p -> p.ptsCnh >= 20; // true pode dirigir, false não pode dirigir
				
		Predicate<Pessoa> naoEstrangeiro = 
				p -> p.nacionalidade == "brasileiro"; // true pode dirigir, nao é brasileiro precisa curso
		
		Predicate<Pessoa> estrangeiro = 
				p -> p.nacionalidade != "brasileiro"; // true precisa curso
		
		
		Function<Pessoa, String> aptoDirigir = 
				p -> p.nome + ", está apto a dirigir"; 
				
		Function<Pessoa, String> inaptoDirigir = 
				p -> p.nome + ", Inapto a Dirigir";
				
		Function<Pessoa, String> cursoParaDirgir = 
				p -> p.nome + ", Necessario curso de adaptacao";
				
				
				//pipeline


		listaPessoas.stream()
			.filter(maiorIdade)
			.filter(naoEstrangeiro)
			.filter(cnhAtiva)
			.map(aptoDirigir)
			.forEach(System.out::println);
		
		System.out.println("");
		
		listaPessoas.stream()
			.filter(maiorIdade)
			.filter(estrangeiro)
			.filter(cnhAtiva)
			.map(cursoParaDirgir)
			.forEach(System.out::println);
		
		
		System.out.println("");
		
		listaPessoas.stream()
			.filter(menorIdade)
			.map(inaptoDirigir)
			.forEach(System.out::println);
		
		listaPessoas.stream()
			.filter(cnhInativa)
			.map(inaptoDirigir)
			.forEach(System.out::println);
		
		
		
		
		
	}
}
