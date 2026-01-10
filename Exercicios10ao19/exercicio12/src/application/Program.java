package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o nome do produto: ");
		String nome = sc.nextLine();
		
		System.out.print("Insira o valor do produto: ");
		double valor = sc.nextDouble();
		
		Produto pr = new Produto(nome, valor);
		
		System.out.println();
		System.out.println("Metodos de pagamentos:");
		System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
		System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
		System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
		System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
		System.out.println();
		
		System.out.print("Escolha o metodo de pagamento: ");
		int escolha = sc.nextInt();
		
		pr.condicoes(escolha);
		
		System.out.println(pr);
		
		sc.close();
	}

}
