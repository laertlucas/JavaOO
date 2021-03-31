package ExerciciosOO;

import java.util.Scanner;

public class ContaTest {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		c.nomeDoTitular(null);
		c.numeroDaConta(0);
		c.agencia(null);
		c.saldo(0);
		c.abertura(null);
		
		System.out.println("Informe um valor a ser depositado: ");
		
		Scanner s = new Scanner(System.in);
		double deposita = s.nextDouble();
		c.saldo = deposita;
		System.out.println("Seu deposito será de: " + deposita + "R$");
		System.out.println("Seu novo saldo é de " + c.saldo);
		
		System.out.println("---------------------------------");
		System.out.println("Informe um valor a ser sacado: ");
		
		double saca = s.nextDouble();
		c.saldo = c.saldo - saca;
		System.out.println("Seu novo saldo é de: " + c.saldo + "R$");
		
		double rendimento = 0.1;
		rendimento = c.saldo * rendimento;
		c.saldo = rendimento + c.saldo;
		System.out.println("Seu dinheiro rendeu: " + rendimento + "R$");
		System.out.println("Seu novo saldo é de: " + c.saldo + "R$");
		
	}

}
