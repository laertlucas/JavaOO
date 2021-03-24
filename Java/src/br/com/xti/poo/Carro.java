package br.com.xti.poo;

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double deZeroACem;
	
	public Carro() {
		
	}
	
	public Carro(String modelo, int velocidadeMaxima, double deZeroACem) {
		this.modelo = modelo; 
		this.velocidadeMaxima = velocidadeMaxima;
		this.deZeroACem = deZeroACem;
	}
}
