package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a temperatura em Fahrenheit: ");
		double fah = sc.nextDouble();
		
		double cel = 5 * (fah - 32) / 9;
		
		System.out.println("Temperatura em Fahrenheit: " + String.format("%.1f", fah) + "ºF");
		System.out.println("Temperatura em Celsius: " + String.format("%.1f", cel) + "ºC");
		
		sc.close();
	}

}
