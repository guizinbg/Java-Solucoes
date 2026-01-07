package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n % 2 == 0)
		{
			System.out.println("o numero eh par");
		}
		else
		{
			System.out.println("o numero eh impar");
		}
		
		if (n < 0)
		{
			System.out.println("o numero eh negativo");
		}
		else
		{
			System.out.println("o numero eh positivo");
		}
		
	
		
		sc.close();
	}

}
