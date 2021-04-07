package ExerciciosOO.Q1;

import java.util.Date;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.setTitular("Lucas Laert"); 
		c1.setNumero(1262145);
		c1.setAgencia("1262-X");
		c1.setDataDeAbertura(new Date()); 
		
		System.out.println("Saldo Inicial:" + c1.getSaldo());
		c1.depositar(2000);
		System.out.println("Saldo depois do deposito:" + c1.getSaldo());
		
		c1.sacar(1000);
		System.out.println("Saldo após o saque:" + c1.getSaldo());
		System.out.println("Rendimento:" + c1.calcularRendimento());
		
		System.out.println("Saldo Total:" + c1.getSaldoTotal());
		
		Conta c2 = new Conta();
		c2.setTitular("Nath Rebouças");
		c2.setNumero(124321);
		c2.setAgencia("1265-Y");
		c2.setDataDeAbertura(new Date());
		
		c2.depositar(100);
		System.out.println("Nath seu saldo é de:" + c2.getSaldo());
		
		System.out.println(c1.transferir(c2, 100));
		System.out.println(c2.getSaldoTotal());
	}
}
