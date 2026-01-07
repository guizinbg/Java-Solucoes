package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a nota 1: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Insira a nota 2: ");
		double nota2 = sc.nextDouble();
		
		System.out.print("Insira a nota 3: ");
		double nota3 = sc.nextDouble();
		
		Aluno al = new Aluno(nota1, nota2, nota3);
		
		System.out.printf("A media do aluno eh %.2f%n", al.calculoNota());
		
		sc.close();

	}

}
