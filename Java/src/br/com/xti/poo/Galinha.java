package br.com.xti.poo;

public class Galinha {
	public static int ovosDaGalinha;
	
	public int ovos;
	
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGalinha++;
		return this;
	}
	
	public static double mediaDeOvos(int galinhas) {
		return Galinha.ovosDaGalinha / galinhas;
	}
}
