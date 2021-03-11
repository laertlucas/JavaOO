package br.com.xti.poo;

public class ContaTest {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.cliente = "Lucas";
		conta.saldo = 20_000.00;
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Rebeca";
		destino.saldo = 10_000.00;
		destino.exibeSaldo();
		
		conta.transferePara(destino, 5000);
		conta.exibeSaldo();
		destino.exibeSaldo();
		
		
		/*conta.saca(2000);
		conta.exibeSaldo();

		conta.deposita(15000);
		conta.exibeSaldo();*/
		
		
		
	}

}
