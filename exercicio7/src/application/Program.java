package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try
		{
			boolean valor1 = sc.nextBoolean();
			boolean valor2 = sc.nextBoolean();
			
			if (valor1 && valor2)
			{
				System.out.println("Ambos sao VERDADEIROS");
			}
			else if (!valor1 && !valor2)
			{
				System.out.println("Ambos sao FALSOS");
			}
			else
			{
				System.out.println("Ambos sao DIFERENTES");
			}
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Valor inserido nao eh true nem false");
		}
		
		
		sc.close();

	}

}
