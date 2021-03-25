package br.com.xti.poo;

public class CarroTest {

	public static void main(String[] args) {
		Carro wolksvagen = new Carro();
		wolksvagen.modelo = "Virtus";
		wolksvagen.velocidadeMaxima = 240;
		wolksvagen.deZeroACem = 8.7;
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 690;
		wolksvagen.motor = v12;
		
		Carro wolks = new Carro("Golf", 260, 8.5);
		Motor v8 = new Motor("V8", 1000);
		wolks.motor = v8;
		
		System.out.println(wolks.motor.potencia);
		
		Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("W16", 1200));
		
		System.out.println(bugatti.modelo);
		System.out.println(bugatti.motor.potencia);
		
		System.out.println(wolksvagen.modelo);
		System.out.println(wolksvagen.velocidadeMaxima);
		System.out.println(wolksvagen.deZeroACem);
		
		System.out.println(wolks.modelo);
		System.out.println(wolks.velocidadeMaxima);
		System.out.println(wolks.deZeroACem);
		
	}

}
