package excecao.PersonalizedA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {


		try {
			Aluno aluno = new Aluno("Bob", "Endereco", 6);
			
			Validar.aluno(aluno);
			
			Validar.aluno(null);
			
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");

	}

}