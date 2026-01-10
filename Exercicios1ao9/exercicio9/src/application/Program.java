package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.print("Insira a sua altura: ");
		double altura = sc.nextDouble();
		
		Pessoa ps = new Pessoa(peso, altura);
		
		double imc = ps.imc();
		
		if (imc < 18.5)
		{
			System.out.println("Voce esta na medida: Abaixo do peso!");
		}
		else if (imc < 24.9)
		{
			System.out.println("Voce esta na medida: Peso ideal (parabéns)!");
		}
		else if (imc < 29.9)
		{
			System.out.println("Voce esta na medida: Levemente acima do peso!");
		}
		else if (imc < 34.9)
		{
			System.out.println("Voce esta na medida: Obesidade grau I!");
			
		}
		else if (imc < 39.9)
		{
			System.out.println("Voce esta na medida: Obesidade grau II (severa)!");
			
		}
		else
		{
			System.out.println("Voce esta na medida: Obesidade grau III (mórbida)!");
		}
		
		
		
		
		
		sc.close();
	}

}
