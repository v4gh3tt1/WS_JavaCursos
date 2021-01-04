package excecao;

public class CheckVsNonCheck {

	public static void main(String[] args) {

		try {
			geraErro1();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim");

	}

	// Exceção nao checada ou nao verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #01"); // throw "lanca" o erro
		
	}
	// Exceção checada /verificada

	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu outro erro #02");
		
	}
}
