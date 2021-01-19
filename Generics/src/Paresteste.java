
public class Paresteste {

	public static void main(String[] args) {


		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria1");
		resultadoConcurso.adicionar(2, "Maria2");
		resultadoConcurso.adicionar(3, "Maria3");
		resultadoConcurso.adicionar(4, "Maria4");
		resultadoConcurso.adicionar(2, "Maria1-2");
		resultadoConcurso.adicionar(5, "Maria5");
		resultadoConcurso.adicionar(6, "Maria6");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(3));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(5));
		System.out.println(resultadoConcurso.getValor(6));

	}

}
