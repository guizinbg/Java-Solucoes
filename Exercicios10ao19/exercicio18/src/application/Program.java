package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int francisco = 150;
		int sara = 110;
		int anos = 0;
		while (sara <= francisco)
		{
			sara += 3;
			francisco += 2;
			anos++;
		}
		
		System.out.println("Demorou " + anos + " anos para sara ficar maior que o francisco.");
		System.out.println("A sara tem " + sara + "cm e o francisco " + francisco + "cm");
		sc.close();

	}

}
