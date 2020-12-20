package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Mapa {

	public static void main(String[] args) {
		
		//metodo Consumer pra print		
		Consumer<String> print = System.out::print;
		
		// geracao de lista		
		List<String> marcasCarros = Arrays.asList("VW ", "GM ", "Fiat ", "Ford");
		
		//Construindo a strem -*- build (1ª etapa); operações intermediarias .map(); operação final ->for each
		marcasCarros.stream().map(m -> m.toUpperCase()).forEach(print);
		
		//Composição -*-*-
		
		UnaryOperator< String > minuscula = n -> n.toLowerCase() + "\n";
		UnaryOperator< String > maiuscula = n -> n.toUpperCase() + "\n";
		UnaryOperator< String > primeiraLetra = n -> n.charAt(0) + "\n";
		UnaryOperator<String> grito = n -> n + "!!!\n";
		
		
		//Usando os metodos ou funções na propria classe
		marcasCarros.stream().map(minuscula).forEach(print);
		marcasCarros.stream().map(maiuscula).forEach(print);
		marcasCarros.stream().map(primeiraLetra).forEach(print);
		marcasCarros.stream().map(grito).forEach(print);
		
		
		//usando os metodos ou funções existentes em UtilCompose
		marcasCarros.stream()
			.map(UtilCompose.maiuscula)
			.map(UtilCompose.primeiraLetra)
			.map(UtilCompose::grito)
			.forEach(print);
		

	}

}
