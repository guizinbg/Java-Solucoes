package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("A = ");
		int A = sc.nextInt();
		
		System.out.print("B = ");
		int B = sc.nextInt();
		
		int temp = A;
		A = B;
		B = temp;
		
		System.out.println("O novo valor de A eh: " + A);
		System.out.println("O novo valor de B eh: " + B);
		
		sc.close();

	}

}
