package br.com.xti.heran�a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

<<<<<<< HEAD
	public static void dividir(Scanner s)
		throws InputMismatchException, InputMismatchException
	{
		//Scanner s = new Scanner(System.in);
		
		System.out.println("Primeiro n�mero: ");
		int a = s.nextInt();
		System.out.println("Pr�ximo n�mero: ");
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
				System.err.println("N�mero invalido");
				e1.getMessage();
				s.nextLine();
			}
			
			finally { //limpar vari�veis e fechar conec��es
				System.out.println("Finally Executado...");
			}	
			
		} while (continua);	
=======
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			try {
				
				System.out.print("Numero:");
				int a = s.nextInt();
				System.out.print("Divisor:");
				int b = s.nextInt();
				//ArithmeticException1
				//InputMismatchException
				System.out.println(a / b);
				continua = false;
			}
			
			catch (InputMismatchException e1) {
				System.err.println("Erro InputMismatchException ");
				s.nextLine();
			}
			
			catch (ArithmeticException e2) {
				System.err.println("Divisor tem de ser diferente de zero ");
			} 
			finally {
				System.out.println("Finally Executado!");
			}
		} while (continua);
		
		
		
>>>>>>> 452b1914486c519ef93942b6dfde4ed2f5d9081b
	}
}
