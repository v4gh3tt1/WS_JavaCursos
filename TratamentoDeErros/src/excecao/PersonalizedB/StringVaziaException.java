package excecao.PersonalizedB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception{
	
	private String nomeAtributo;
	
	public StringVaziaException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;

	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo %s está vazio", 
				nomeAtributo);
	}

}
