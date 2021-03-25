package br.com.xti.poo;

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double deZeroACem;
	Motor motor;
	
	public Carro() {
		
	}
	
	public Carro(String modelo, int velocidadeMaxima, double deZeroACem) {
		this(modelo, velocidadeMaxima, deZeroACem, null);
	}
	
	public Carro(String modelo, int velocidadeMaxima, double deZeroACem, Motor motor) {
		this.modelo = modelo; 
		this.velocidadeMaxima = velocidadeMaxima;
		this.deZeroACem = deZeroACem;
		this.motor = motor;
	}
}
