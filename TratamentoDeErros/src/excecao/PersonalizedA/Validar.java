package excecao.PersonalizedA;

import excecao.Aluno;

public class Validar {
	
	private Validar() {
		
	}
	
	public static void aluno (Aluno aluno) {
		
		if (aluno==null) {
			throw new IllegalArgumentException("Aluno nulo");
		}
		
		if (aluno.getNome()== null || aluno.getNome().trim().isEmpty()) {
			throw new StringVaziaException("nome");
			
		}
		
		if (aluno.getNotaMedia() <0 || aluno.getNotaMedia() > 10) {
			throw new NumeroForaIntervaloException("nota");
			
		}
		
	}

}
