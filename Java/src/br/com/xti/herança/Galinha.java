package br.com.xti.herança;

public class Galinha extends Animal {

	public Galinha() {
		super("milho", "Cacarejo", false, 5);
		
		super.comida = comida;
		super.fazerBarulho = fazerBarulho;
		super.dormir = dormir;
		super.peso = peso;
	}
	
	void fazerBarulho() {
		System.out.println("Có Có");
	}
	
}
