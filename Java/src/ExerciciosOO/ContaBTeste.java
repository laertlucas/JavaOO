package ExerciciosOO;

import ExerciciosOO.ContaB.Data;

public class ContaBTeste {

	public static void main(String[] args) {
		ContaB c1 = new ContaB();
		c1.nome = "Lucas Laert";
		c1.numero = 991159621;
		c1.agencia = "NuConta";
		c1.saldo = 15_000;
		//c1.dataDeAbertura = "02/04/2021";
				
		c1.deposita(2_000);
		System.out.println(c1.saldo);
		System.out.println(c1.calculaRend());
		
		c1.saca(1_000);
		System.out.println(c1.saldo);
		System.out.println(c1.calculaRend());
		
		ContaB c2 = new ContaB();
		c2.nome = "Rebeca";
		c2.numero = 85817598;
		c2.agencia = "Caixa";
		c2.saldo = 25_000;

		c1.dataDeAbertura = new Data();
		c1.dataDeAbertura.preencheData(2, 4, 2021);;
		
		c2.saca(2_500);
		System.out.println(c2.saldo);
		
		c1 = c2; 
		if (c1 == c2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}

}
