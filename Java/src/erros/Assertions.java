package erros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Escreva um numero entre 0 e 10...");
		int numero = s.nextInt();
		
		assert(numero >= 0 && numero <= 10) : "Numero Invalido" + numero;
		System.out.println("Entrou " + numero);
	}

}
