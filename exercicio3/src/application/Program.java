package application;

import java.util.Scanner;

public class Program {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor A: ");
		int A = sc.nextInt();
		
		System.out.print("Insira o valor B: ");
		int B = sc.nextInt();
		
		int C;
		
		if (A == B)
		{
			C = A + B;
		}
		else
		{
			C = A * B;
		}
		
		System.out.println("O resultado eh " + C);
		
		sc.close();
	}
}
