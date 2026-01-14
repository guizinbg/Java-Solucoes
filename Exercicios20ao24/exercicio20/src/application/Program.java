package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor que você quer descobrir a taboada: ");
		int n = sc.nextInt();
		
		System.out.println("Taboada do " + n + ":");
		for (int i = 0; i <= 10; i++)
		{
			System.out.println("" + n + " x " + i + " = " + (n * i));
			
		}
		sc.close();

	}

}
