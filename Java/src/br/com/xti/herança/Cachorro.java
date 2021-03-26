package br.com.xti.herança;

public class Cachorro extends Animal {

	public Cachorro() {
		super("carne", "Auau", true , 40);
		
		super.comida = comida;
		super.fazerBarulho = fazerBarulho;
		super.dormir = dormir;
		super.peso = peso;
		
	}
	
	void fazerBarulho() {
		System.out.println("Au au");
	}
	
}
