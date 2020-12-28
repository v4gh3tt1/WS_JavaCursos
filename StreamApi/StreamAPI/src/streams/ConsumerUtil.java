package streams;

import java.util.function.Consumer;

public class ConsumerUtil implements Consumer<Product>{

	@Override
	public void accept(Product t) {
		t.setPrice(t.getPrice() * 1.1);		// aumenta o preco em 10%
	}

}
