package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramConverter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bougth? ");
		double amount = sc.nextDouble();
		
		double convertWithIOF = CurrencyConverter.dollarToReal(dollarPrice, amount);
		
		System.out.printf("Amount to be paid in reais: %.2f%n", convertWithIOF);
		
		sc.close();

	}

}
