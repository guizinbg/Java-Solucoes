package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] numeros = new int[3];
		
		for (int i = 0; i < 3; i++)
		{
			System.out.printf("Insira o %d numero: ", i + 1);
			numeros[i] = sc.nextInt();
		}
		
		for (int i = 2; i > 0; i--)
		{
			if (numeros[i] > numeros[i - 1])
			{
				int temp = numeros[i];
				numeros[i] = numeros[i - 1];
				numeros[i - 1] = temp;
			}
		}
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println(numeros[i]);
		}

		sc.close();
	}

}
