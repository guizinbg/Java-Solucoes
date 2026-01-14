package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor do A: ");
		int A = sc.nextInt();
		
		System.out.print("Insira o valor do B: ");
		int B = sc.nextInt();
		
		System.out.println("O valor do quociente deles eh: " + (A / B));
		System.out.println("O valor do resto deles eh: " + (A % B));

		
		sc.close();
	}

}
