package streams;

import java.util.function.Function;

public class FunctionUtil implements Function<Product, String>{


	@Override
	public String apply(Product t) {
		
		return t.getName().toUpperCase();
	}

}

