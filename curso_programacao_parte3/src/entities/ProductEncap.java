package entities;

public class ProductEncap {

	private String name;
	private double price;
	private int quantity;
	
	
	//É possível inserir construtores automaticamente, clicando com o botão direito do mouse e clicar em source e generate (o que eu quiser de opção)
	
	public ProductEncap(String name, double price/*,int quantity*/) {
		super();
		this.name = name;
		this.price = price;
		//this.quantity = quantity;
	}

	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public int getQuantity() {
		return quantity;
	}


	
	
	/*public ProductEncap() { 
		
	}
	
	public ProductEncap(String name, double price, int quantity) {  
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public ProductEncap(String name, double price) {  
		this.name = name;
		this.price = price;
		//quantity = 0;
	}
	
	
	// Por convenção, setters e getters são colocados após os construtores
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	*/
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price) 
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
	
}