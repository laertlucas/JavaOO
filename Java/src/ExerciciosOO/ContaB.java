package ExerciciosOO;

import java.util.Date;

public class ContaB {
	String nome;
	int numero;
	double saldo;
	String agencia;
	Date dataDeAbertura;
	
	void saca(double valor) {
		this.saldo -= valor;
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	double calculaRend() {
		return this.saldo * 0.1;
	}
	
	class Data {
		Data dataDeAbertura;
		public int dia;
		public int mes;
		public int ano;
		public void preencheData(int dia, int mes, int ano) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
			
		}
	}
	
	void preencheData (int dia, int mes, int ano) {
	}
	
	String recuperaDadosDeImpressao() {
		String dados = "Nome: " + this.nome;
		 dados = "Numero: " + this.numero;
		 dados = "Saldo: " + this.saldo;
		 dados = "Agencia: " + this.agencia;
		 dados = "Data de Abertura: " + this.dataDeAbertura;
		 dados = "Dia" + this.dataDeAbertura.dia;
		 dados = "mes" + this.dataDeAbertura.mes;
		 dados = "Ano" + this.dataDeAbertura.ano;
		return dados;
	}
	
	
}
