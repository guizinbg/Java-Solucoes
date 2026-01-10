package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o nome da Pessoa: ");
		String nome = sc.nextLine();
		
		System.out.print("Insira a idade da Pessoa: ");
		int idade = sc.nextInt();
		
		Pessoa pr = new Pessoa(nome, idade);
		
		System.out.println(pr);
		
		sc.close();

	}

}
