package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o nome do aluno: ");
		String nome = sc.nextLine();
		
		System.out.print("Insira a nota 1: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Insira a nota 2: ");
		double nota2 = sc.nextDouble();
		
		System.out.print("Insira a nota 3: ");
		double nota3 = sc.nextDouble();
		
		System.out.print("Insira a nota 4: ");
		double nota4 = sc.nextDouble();
		
		Aluno al = new Aluno(nome, nota1, nota2, nota3, nota4);
		
		System.out.println("Nome do aluno: " + al.getName());
		
		if (al.passaOuNao())
		{
			System.out.println("Ele esta aprovado! a nota final do " + al.getName() + " eh " + String.format("%.2f", al.calculoMedia()));
		}
		else
		{
			System.out.println("Ele esta reprovado! a nota final do " + al.getName() + " eh " + String.format("%.2f", al.calculoMedia()));
		}
		
		sc.close();

	}

}
