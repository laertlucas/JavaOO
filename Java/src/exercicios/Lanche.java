package exercicios;

public class Lanche extends Prato{

	String pao;
	String recheio;
	String molho;
		
	public Lanche() {
		
	}
	
	public Lanche(String pao, String recheio, String molho) {
		this.pao = pao;
		this.recheio = recheio;
		this.molho = molho;
	}
	
	public Lanche(String pao, String recheio, String molho, String nome, double preco, String dataDeValidade, double pesoDoAlimento) {
		super(nome, preco, dataDeValidade, pesoDoAlimento);
		this.pao = pao;
		this.recheio = recheio;
		this.molho = molho;
	}
	
	public String getPao(String pao) {
		return pao;
	}
	
	public void setPao(String pao) {
		this.pao = pao;
	}
	
	public String getRecheio(String recheio) {
		return pao;
	}
	
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	public String getMolho(String molho) {
		return molho;
	}
	
	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	@Override
	public String toString() {
		return "Lanche {" + "pao=" + pao + "recheio=" + recheio + "molho=" + molho + '}';
	}
}


//A lanchonete possui 3 principais itens de venda: pizzas, lanches e salgadinhos. 
//Inicialmente, o sistema será testado para controlar as vendas desses 3 itens apenas. 
//Todos os itens vendidos devem conter: preço de venda, data de validade e peso. 
//O sistema da nossa lanchonete deverá criar um pedido, esse pedido será composto pelo nome do cliente, 
//itens que foram consumidos e taxa de serviço. 
//O sistema deve permitir gerar a nota fiscal para entregar ao cliente. 
//O vendedor poderá inserir o valor recebido em dinheiro e o sistema calcula e mostra o troco do cliente na tela. 