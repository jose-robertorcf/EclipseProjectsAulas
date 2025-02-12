package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //"this" referencia o atributo da classe Product, e não o argumento do método addProducts
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price) //String.format para formatar como se fosse o printf
				+ ", "
				+ quantity
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
	
}
