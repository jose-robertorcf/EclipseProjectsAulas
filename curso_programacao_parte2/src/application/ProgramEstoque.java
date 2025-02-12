package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramEstoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		/*
		Toda classe é uma subclasse da classe Object (ou seja, Product, Triangle também são da classe Object)
		Métodos da classe Object:
		getClass - retorna o tipo de objeto
		equals - compara se o objeto é igual a outro
		hashCode - retorna um código hash do objeto
		toString - converte o objeto para string	
		*/
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
