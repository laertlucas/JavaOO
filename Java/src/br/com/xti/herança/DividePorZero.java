package br.com.xti.herança;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void dividir(Scanner s)
		throws InputMismatchException, InputMismatchException
	{
		//Scanner s = new Scanner(System.in);
		
		System.out.println("Primeiro número: ");
		int a = s.nextInt();
		System.out.println("Próximo número: ");
		int b = s.nextInt();
		
		System.out.println(a / b);
	}
	
	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		boolean continua = true;
		do {
			
			try {
				dividir(s);
				continua = false;
				//ArithmeticException
				//InputMismatchException
			}
		
			catch(InputMismatchException | ArithmeticException e1) {
				System.err.println("Número invalido");
				e1.getMessage();
				s.nextLine();
			}
			
			finally { //limpar variáveis e fechar conecções
				System.out.println("Finally Executado...");
			}	
			
		} while (continua);	
	}
}
