package exercicios;

//import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
//import Classes.Prato;

public class Pizzaria {

	static ArrayList<Pedido> pedidos = new ArrayList<>();
	static ArrayList<Prato> pratosDisponiveis = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		carregarDados();
		
		int op = 0;
		
		while (true) {
			System.out.println("Bem vindos ao Quase Três Lanches");
			System.out.println("1) Fazer pedido) sair");
			op = sc.nextInt();
			switch (op) {
				case 1:
					fazerPedido();
					break;
				case 2: 
					return;
			}
		}
	}
	
	public static void carregarDados() {
		Pizza p1 = new Pizza("Mista", "Calabresa", "Portuguesa", "Mussarela", 20.0, "20/11/2021", 20 );
		Pizza p2 = new Pizza("Carne de Sol", "Bacon", "Frango", "3 Queijos", 25.0, "20/11/2021", 25 );
		Pizza p3 = new Pizza("Chocolate", "Sonho de Valsa", "Rapadura", "Doce de Leite", 50.0, "10/11/2021", 50 );
		
		Lanche l1 = new Lanche("Xburg", "Pão com Ovo", "Bauru","Pão com Mortadela", 10.0, "15/11/2021", 10);
		Lanche l2 = new Lanche("Xtudo", "Pão com Ovo e queijo", "Pão com carne de sol","Pão com presunto e queijo", 15.0, "15/11/2021", 15);
		Lanche l3 = new Lanche("Quarteirao", "Pão com Ovo, queijo e mortadela", "Mistão","Pão com Mortadela, ovo e carne do sol", 20.0, "15/11/2021", 20);
		
		Salgadinho s1 = new Salgadinho("Bolinha de Queijo", "Frango", "Pastel de Vento", 5.0, "10/11/2021", 5);
		Salgadinho s2 = new Salgadinho("Salsicha", "Mista", "Carne de sol", 7.5, "15/11/2021", 7.5);
		Salgadinho s3 = new Salgadinho("Bacon", "Carne com Queijo", "Enrolado", 10.0, "15/11/2021", 10);
		
		pratosDisponiveis.add(p1);
		pratosDisponiveis.add(p2);
		pratosDisponiveis.add(p3);
		
		pratosDisponiveis.add(l1);
		pratosDisponiveis.add(l2);
		pratosDisponiveis.add(l3);
		
		pratosDisponiveis.add(s1);
		pratosDisponiveis.add(s2);
		pratosDisponiveis.add(s3);
		
	}
	
	public static void fazerPedido() {
		Pedido p = new Pedido();
		p.setNomeCliente(sc.nextLine());
		System.out.println("Nome do Cliente:");
		int op = -1;
		while (true) {
			for (int i = 1; i < pratosDisponiveis.size(); i++) {
				System.out.println(i + ")" + pratosDisponiveis.get(i).getNome());
			}
			System.out.println("Digite 0 para encerrar o pedido");
			op = sc.nextInt();
			if(op != 0) {
				ArrayList<Prato> temp = new ArrayList<>();
				
				temp = p.getItensConsumidos();
				System.out.println(temp);
				temp.add(pratosDisponiveis.get(op));
				p.setItensConsumidos(temp);
			} else {
				break;
			}
		}
		p.imprimirNotaFiscal();
	}
}


//A lanchonete possui 3 principais itens de venda: pizzas, lanches e salgadinhos. 
//Inicialmente, o sistema será testado para controlar as vendas desses 3 itens apenas. 
//Todos os itens vendidos devem conter: preço de venda, data de validade e peso. 
//O sistema da nossa lanchonete deverá criar um pedido, esse pedido será composto pelo nome do cliente, 
//itens que foram consumidos e taxa de serviço. 
//O sistema deve permitir gerar a nota fiscal para entregar ao cliente. 
//O vendedor poderá inserir o valor recebido em dinheiro e o sistema calcula e mostra o troco do cliente na tela. 