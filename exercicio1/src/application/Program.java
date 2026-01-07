package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		int B = sc.nextInt();
		
		int C = sc.nextInt();
	
		int soma = A + B;
		
		System.out.println("A soma entre A e B eh: " + soma);
		
		if (soma < C)
		{
			System.out.println("A Soma eh menor que C");
		}
		else
		{
			System.out.println("A soma nao eh menor que C");
		}
		
	
		
		sc.close();
	}

}
