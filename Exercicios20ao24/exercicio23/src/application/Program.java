package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor da hora/aula: ");
		double hora = sc.nextDouble();
		
		System.out.print("Insira a quantidade de aulas lecionadas no mes: ");
		int aulas = sc.nextInt();
		
		System.out.print("Insira o percentual de desconto do INSS: ");
		double inss = sc.nextDouble();
		inss /= 100;
		
		double resultado = (double)aulas * hora;
		resultado -= resultado * inss;
		
		System.out.printf("O salario liquido do professor eh de %.2f", resultado);
		
		
		sc.close();

	}

}
