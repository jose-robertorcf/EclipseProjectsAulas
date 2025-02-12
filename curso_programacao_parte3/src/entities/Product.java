package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public Product() { //é possível também deixar o construtor padrão
		
	}
	
	public Product(String name, double price, int quantity) {  //a criação do construtor determina que os dados sejam determinados já no início da instanciação
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {  //a sobrecarga serve para obrigar que certos dados sejam inseridos na instanciação e outros não. ou seja, disponibilizar mais opções de operação
		this.name = name;
		this.price = price;
		//quantity = 0;
	}
	
	
	
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
