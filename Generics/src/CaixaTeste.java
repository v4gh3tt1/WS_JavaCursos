
public class CaixaTeste {

	public static void main(String[] args) {


		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Mensagem");

		
		String coisaA = caixaA.abir();
		System.out.println(coisaA);
	
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(3.14);
		
		Double coisaB = caixaB.abir();
		System.out.println(coisaB);
		

	}

}
