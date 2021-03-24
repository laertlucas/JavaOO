package br.com.xti.poo;

public class CarroTest {

	public static void main(String[] args) {
		Carro wolksvagen = new Carro();
		wolksvagen.modelo = "Virtus";
		wolksvagen.velocidadeMaxima = 240;
		wolksvagen.deZeroACem = 8.7;
		
		Carro wolks = new Carro("Golf", 260, 8.5);
		
		System.out.println(wolksvagen.modelo);
		System.out.println(wolksvagen.velocidadeMaxima);
		System.out.println(wolksvagen.deZeroACem);
		
		System.out.println(wolks.modelo);
		System.out.println(wolks.velocidadeMaxima);
		System.out.println(wolks.deZeroACem);
	}

}
