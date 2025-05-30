package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProductEncap;

public class ProgramEncapsu {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		/*System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();*/
		
		ProductEncap product = new ProductEncap(name, price/*, quantity*/);
		
		product.setName("Computer");
		System.out.println("Updated name: " + product.getName());
		
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated product data: " + product);
		
		sc.close();

	}

}