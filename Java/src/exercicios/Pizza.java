package exercicios;

public class Pizza extends Prato{
	
	String molho;
	String recheio;
	String borda;
		
	public Pizza() {
		
	}
	
	public Pizza(String molho, String recheio, String borda) {
		this.molho = molho;
		this.recheio = recheio;
		this.borda = borda;
	}
	
	public Pizza(String molho, String recheio, String borda, String nome, double preco, String dataDeValidade, double pesoDoAlimento) {
		super(nome, preco, dataDeValidade, pesoDoAlimento);
		this.molho = molho;
		this.recheio = recheio;
		this.borda = borda;
	}
	
	public String getMolho(String molho) {
		return molho;
	}
	
	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	public String getRecheio(String recheio) {
		return recheio;
	}
	
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	public String getBorda(String borda) {
		return borda;
	}
	
	public void setBorda(String borda) {
		this.borda = borda;
	}
	
	@Override
	public String toString() {
		return "Pizza {" + "molho=" + molho + "rechio=" + recheio + "borda=" + borda + '}';
	}
	
}

//A lanchonete possui 3 principais itens de venda: pizzas, lanches e salgadinhos. 
//Inicialmente, o sistema será testado para controlar as vendas desses 3 itens apenas. 
//Todos os itens vendidos devem conter: preço de venda, data de validade e peso. 
//O sistema da nossa lanchonete deverá criar um pedido, esse pedido será composto pelo nome do cliente, 
//itens que foram consumidos e taxa de serviço. 
//O sistema deve permitir gerar a nota fiscal para entregar ao cliente. 
//O vendedor poderá inserir o valor recebido em dinheiro e o sistema calcula e mostra o troco do cliente na tela. 