package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a quantidade de horas que voce vai demorar na viagem: ");
		int horas = sc.nextInt();
		
		System.out.print("Insira a sua velocidade media: ");
		int velocidade = sc.nextInt();
		
		int distancia = horas * velocidade;
		
		System.out.println("voce percorreu " + distancia + "km gastando " + ((double)distancia / 12) + " litros na viagem.");
		
		
		
		sc.close();

	}

}
