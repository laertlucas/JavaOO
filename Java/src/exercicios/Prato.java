package exercicios;

public class Prato {
	String nome;
	double preco;
	String dataDeValidade;
	double pesoDoAlimento;
	
	public Prato() {
		
	}
	
	public Prato(String nome, double preco, String dataDeValidade, double pesoDoAlimento) {
		this.nome = nome;
		this.preco = preco;
		this.dataDeValidade = dataDeValidade;
		this.pesoDoAlimento = pesoDoAlimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getDataDeValidade() {
		return dataDeValidade;
	}
	
	public void setDataDeValidade(String dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}
	
	public double getPesoDoAlimento() {
		return pesoDoAlimento;
	}
	
	public void setPeso(double pesoDoAlimento) {
		this.pesoDoAlimento = pesoDoAlimento;
	}
	
	@Override
	public String toString() {
		return "Prato{" + "nome=" + nome + ", preco=" + preco + ", dataDeValidade=" + dataDeValidade + ", peso=" + pesoDoAlimento + '}';
	}
}
