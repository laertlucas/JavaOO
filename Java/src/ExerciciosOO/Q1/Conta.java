package ExerciciosOO.Q1;

import java.util.Date;

public class Conta {
	
	private String titular;
	private int numero;
	private String agencia;
	private double saldo = 0;
	private Date dataDeAbertura;
	private double saldoTotal;
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public double calcularRendimento() {
		return this.saldo * 0.1;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Date getDataDeAbertura() {
		return dataDeAbertura;
	}
	
	public void setDataDeAbertura(Date dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	
	public double getSaldoTotal() {
		saldoTotal = saldo + calcularRendimento();
		return saldoTotal;
	}
		
	public String transferir(Conta c2, double valorTransferencia) {
		if (saldoTotal >= valorTransferencia) {
			saldoTotal -= valorTransferencia;
			c2.depositar(valorTransferencia);
			return "Transferência realizada com sucesso!";
		} else {
			return "Saldo insuficiente!";
		}
	}
}
