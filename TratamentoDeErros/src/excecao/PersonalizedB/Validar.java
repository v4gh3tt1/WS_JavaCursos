package excecao.PersonalizedB;

import excecao.Aluno;

public class Validar {
	
	private Validar() {
		
	}
	
	public static void aluno (Aluno aluno) 
			throws StringVaziaException, NumeroForaIntervaloException{
		
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
