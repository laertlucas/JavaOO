package exercicios;

public class Salgadinho extends Prato {

	String recheio;
	String massa;
		
	public Salgadinho() {
		
	}
	
	public Salgadinho(String recheio, String massa) {
		this.recheio = recheio;
		this.massa = massa;
	}
	
	public Salgadinho(String recheio, String massa, String nome, double preco, String dataDeValidade, double pesoDoAlimento) {
		super(nome, preco, dataDeValidade, pesoDoAlimento);
		this.recheio = recheio;
		this.massa = massa;
	}
	
	public String getRecheio(String recheio) {
		return recheio;
	}
	
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	public String getMassa(String massa) {
		return massa;
	}
	
	public void setMassa(String massa) {
		this.massa = massa;
	}
	
	@Override
	public String toString() {
		return "Salgadinho{" + "recheio=" + recheio + "massa=" + massa + '}';
	}
}


//A lanchonete possui 3 principais itens de venda: pizzas, lanches e salgadinhos. 
//Inicialmente, o sistema ser� testado para controlar as vendas desses 3 itens apenas. 
//Todos os itens vendidos devem conter: pre�o de venda, data de validade e peso. 
//O sistema da nossa lanchonete dever� criar um pedido, esse pedido ser� composto pelo nome do cliente, 
//itens que foram consumidos e taxa de servi�o. 
//O sistema deve permitir gerar a nota fiscal para entregar ao cliente. 
//O vendedor poder� inserir o valor recebido em dinheiro e o sistema calcula e mostra o troco do cliente na tela. 