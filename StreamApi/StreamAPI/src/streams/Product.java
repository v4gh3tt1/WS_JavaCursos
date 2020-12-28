package streams;

public class Product {

	
	private String name;
	private Double price;
	
	public Product () {
		
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticProductPredicate(Product p){ // trabalha com o produto passado como argumento
		return p.getName() =="Radio";
	}

	String varName = "Fone"; // pode capturar valores fornecidos pelo usuario
	public boolean nonStaticProductPredicate(){ // trabalha com o proprio objeto
		return name == varName; // valor fornecido e armazenado em variavel
	}
	
	public static void staticPriceUpdate(Product p) { // metodo estático trabalha com o argumento recebido como parametro
		p.setPrice (p.getPrice() * 0.90); //setando novo valor
	}
	
	public void nonStaticPriceUpdate() { // metodo nao estático trabalha com price do proprio objeto
		setPrice (getPrice() * 1.10); //setando novo valor
	}
	
	public static String staticLoweCaseName(Product p) {
		return p.getName().toLowerCase();
	}

	public String nonStaticUpperCaseName() {
		setName ( name.toUpperCase() );
		return getName();
	}

	@Override
	public String toString() {
		return String.format("Product [name=%s, price=%.2f]", name, price);
	}
	
	
	
	
	
}
