package excecao;

public class CausaDeExcecao {

	public static void main(String[] args) {

		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if (e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
			
		}
	}

	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causadora) {
			throw new IllegalArgumentException(causadora);
			
		}
	}
	static void metodoB(Aluno aluno) {
		if (aluno==null) {
			throw new NullPointerException("Aluno Nulo");
			
		}
		System.out.println(aluno.getNome());
	}
}
