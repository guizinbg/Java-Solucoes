package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate agora = LocalDate.now();
		System.out.print("Insira a data do seu nascimento no formato (dd/MM/yyyy): ");
		String data = sc.next();
		
		LocalDate data1 = LocalDate.parse(data, formatoBR);
		int ano = 0, mes = 0;
		
		long dias = ChronoUnit.DAYS.between(data1, agora);
		
		while (dias >= 30)
		{
			if (dias >= 365)
			{
				ano++;
				dias -= 365;
			}
			else if (dias > 30)
			{
				mes++;
				dias -= 30;
			}
		}
		
		System.out.println("" + ano + " anos, " + mes + " meses e " + dias + " dias de vida");
		
		
		sc.close();

	}

}
