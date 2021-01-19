
public class CaixaNumberTeste {

	public static void main(String[] args) {

		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(1.3);
		System.out.println(caixaA.abir());

		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guardar(134);
		System.out.println(caixaB.abir());

	}

}
