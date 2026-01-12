package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o tamanho do lado A: ");
		int A = sc.nextInt();
		
		System.out.print("Insira o tamanho do lado B: ");
		int B = sc.nextInt();
		
		System.out.print("Insira o tamanho do lado C: ");
		int C = sc.nextInt();
		
		if (A < (B + C) && B < (A + C) && C < (A + B))	
		{
			if (A == B && B == C)
			{
				System.out.println("O Triangulo eh equilatero.");
			}
			else if (A == B || A == C || B == C)
			{
				System.out.println("O Triangulo eh isoceles.");
			}
			else
			{
				System.out.println("O Triangulo eh escaleno.");
			}
		}
		else
		{
			System.out.println("O Triangulo nao eh valido.");
		}
		
		sc.close();

	}

}
