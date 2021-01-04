package excecao.PersonalizedA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException{
	
	private String nomeAtributo;
	
	public NumeroForaIntervaloException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;

	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo %s est� fora do intervalo", 
				nomeAtributo);
	}

}
