package excecao;

public class Basic {
	
	public static void main(String[] args) {
				
		Aluno a1 = null;
			
		try {
			imprimeNomeAluno(a1);

		} catch (Exception excecao) {
			System.out.println("Ocorreu um erro ao imprimir aluno nulo");
		}
		
		try {
			System.out.println(7/0); //surround with -> try-catch block
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Erro: " + e.getMessage());
		}	
		
		/*try {
			System.out.println(7/0);		
		} catch (Exception e) {
			System.err.println("Erro de divisão por zero");
		}*/
		System.out.println("Fim");
		
	}
		public static void imprimeNomeAluno(Aluno aluno) {
			System.out.println(aluno.getNome());
	}
}
