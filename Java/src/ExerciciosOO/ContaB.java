package ExerciciosOO;

public class ContaB {
	String nome;
	int numero;
	double saldo;
	String agencia;
	Data dataDeAbertura;
	private int dia;
	private int mes;
	private int ano;
	
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
		public String dia;
		public String mes;
		public String ano;
		public void preencheData(int i, int j, int k) {
			// TODO Auto-generated method stub
			
		}
	}
	
	void preencheData (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
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
