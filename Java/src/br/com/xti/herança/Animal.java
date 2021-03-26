package br.com.xti.herança;

public class Animal {

	int serial;
	String comida;
	String fazerBarulho;
	boolean dormir;
	double peso;
	
	public Animal(String comida, String fazerBarulho, boolean dormir, double peso) {
		this.comida = comida;
		this.fazerBarulho = fazerBarulho;
		this.dormir = dormir;
		this.peso = peso;
	}
	
	void dormir() {}//System.out.println("ZZzzzZZzZzzZ");}
	void fazerBarulho() {System.out.println("Zuada");}
	void peso() {}
	void comida() {}
}
