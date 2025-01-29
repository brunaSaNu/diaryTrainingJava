package application;

import java.util.Scanner;

import entities.ProductStock;

public class ProgramStock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ProductStock productStock = new ProductStock();
		
		System.out.println("Enter product data: ");
		
		System.out.println("Name: ");
		productStock.name = sc.nextLine();
		
		System.out.println("Price: ");
		productStock.price = sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		productStock.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + productStock);
		
		System.out.println();
		System.out.println("Enter the number of products to be add in stock: ");
		int quantity = sc.nextInt();
		productStock.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + productStock);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		productStock.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + productStock);
		
		sc.close();

	}

}
