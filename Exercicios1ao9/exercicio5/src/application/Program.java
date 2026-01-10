package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Insira o valor do salario minimo: ");
		double salarioMinimo = sc.nextDouble();
		
		System.out.print("Insira o valor do salario: ");
		double salario = sc.nextDouble();
		
		
		
		double resultado = salario / salarioMinimo;
		
		System.out.printf("O Usuario ganha %.2f salarios minimos!", resultado);
		
		
		sc.close();

	}

}
