package streams;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product t) {
		
		return t.getPrice() <=199;
	}
	
	

}
