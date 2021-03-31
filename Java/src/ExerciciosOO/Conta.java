package ExerciciosOO;

import java.text.SimpleDateFormat;

public class Conta {

	String titular;
	int numeroDaConta;
	String agencia;
	double saldo;
	String abertura;
//	double deposita;
//	double saca;
//	double rendimento;
	
	public Conta() {
		
	}
	
	public Conta(String titular, int numeroDaConta, String agencia, double saldo, String abertura) {
		this.titular = titular;
		this.numeroDaConta = numeroDaConta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.abertura = abertura;
	}
	
	void nomeDoTitular(String nomeDoTitular) {
		System.out.println("lucas");
	}
	
	void numeroDaConta(int numeroDaConta){
		System.out.println("12654-5");
	}
	
	void agencia(String agencia) {
		System.out.println("Caixa");
	}
	
	void saldo(double saldo) {
		double saldoAtual = 0;
		System.out.println("Seu saldo inicial é de: " + saldoAtual);
	}
	
	void abertura(String abertura) { 
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		String data = formato.format(10/02/2021);
		System.out.println(data);
	}

}
