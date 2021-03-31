package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
	String nomeCliente;
	double taxaDeServico;
	ArrayList<Prato> itensConsumidos; 
	
	public Pedido () {
		itensConsumidos = new ArrayList<>();
	}
	
	public Pedido(String nomeCliente, double taxaDeServico, ArrayList<Prato> itensConsumidos) {
		this.nomeCliente = nomeCliente;
		this.taxaDeServico = taxaDeServico;
		this.itensConsumidos = itensConsumidos;
	}
	
	public String getNomeCliente(String nomeCliente) {
		return nomeCliente;
	}
	
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public double getTaxaDeServico() {
		return taxaDeServico;
	}
	
	public void setTaxaDeServico(double taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}
	
	public ArrayList<Prato> getItensConsumidos() {
		return itensConsumidos;
	}
	
	public void setItensConsumidos(ArrayList<Prato> itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}
	
	@Override
	public String toString() {
		return "Pedido {" + "Nome do Cliente = " + nomeCliente + "Taxa de Serviço -" + taxaDeServico + "Itens Consumidos -" + itensConsumidos + '}';
	}
	
	public double calcularTaxaDeServico() {
		double somaItens = 0.0;
		for (Prato p : itensConsumidos) {
			somaItens += p.getPreco();
		}
		double taxa = somaItens * 0.1;
		return taxa;
	}
	
	public double calcularTroco() {
		double valorRecebido;
		Scanner sc = new Scanner(System.in);
		valorRecebido = sc.nextDouble();
		double somaItens = 0.0;
		for (Prato p : itensConsumidos) {
			somaItens += p.getPreco();
		}
		double troco = (valorRecebido - somaItens);
		return troco;
	}
		public void imprimirNotaFiscal() {
			System.out.println("---Nota---");
			System.out.println("Itens Cosumidos:");
			double valorFinal = 0.0;
			for (Prato p : itensConsumidos) {
				System.out.println(p);
				valorFinal += p.getPreco();
			}
			System.out.println("Valor final a pagar:" + valorFinal);
			System.out.println("A taxa de serviço é: " + calcularTaxaDeServico());
			System.out.println("O troco: " + calcularTroco());
			
			System.out.println("----------------------------------------------------");
		
	}
}

//	A lanchonete possui 3 principais itens de venda: pizzas, lanches e salgadinhos. 
//	Inicialmente, o sistema será testado para controlar as vendas desses 3 itens apenas. 
//	Todos os itens vendidos devem conter: preço de venda, data de validade e peso. 
//	O sistema da nossa lanchonete deverá criar um pedido, esse pedido será composto pelo nome do cliente, 
//	itens que foram consumidos e taxa de serviço. 
//	O sistema deve permitir gerar a nota fiscal para entregar ao cliente. 
//	O vendedor poderá inserir o valor recebido em dinheiro e o sistema calcula e mostra o troco do cliente na tela. 