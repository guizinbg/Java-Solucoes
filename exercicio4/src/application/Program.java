package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um numero inteiro: ");
		int n = sc.nextInt();
		
		System.out.println("O seu antecessor eh " + (n - 1));
		
		System.out.println("O seu sucessor eh " + (n + 1));
		
		sc.close();

	}

}
