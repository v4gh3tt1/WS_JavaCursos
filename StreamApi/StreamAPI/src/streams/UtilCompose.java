package streams;

import java.util.function.UnaryOperator;


public class UtilCompose {
	
	public final static UnaryOperator< String > minuscula = 
			n -> n.toLowerCase() + "\n";
			
	public final static UnaryOperator< String > maiuscula = 
			n -> n.toUpperCase() + "\n";
	
	public final static UnaryOperator< String > primeiraLetra = 
			n -> n.charAt(0) + "\n";
	
	public final static String grito (String n) { 
			return n + "!!!\n";
	}
}
