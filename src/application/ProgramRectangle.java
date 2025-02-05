package application;

import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();		
		
		System.out.printf("AREA = %.2f%n" + rectangle.area());
		System.out.printf("PERIMETER = %.2f%n" + rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n" + rectangle.diagonal());
		
		sc.close();

	}

}
