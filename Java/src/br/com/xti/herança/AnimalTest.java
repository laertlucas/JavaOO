package br.com.xti.heran�a;

public class AnimalTest {

	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro();
		//toto.fazerBarulho();
		toto.fazerBarulho = "Late";
		toto.comida = "Ra��o";
		toto.peso = 45;
		//toto.dormir();
		toto.dormir = true;
		
		System.out.println("Toto vive de " + toto.comida + " pesando " + toto.peso + " KG");
		System.out.println("Toto " + toto.fazerBarulho + " pela manh�");
		System.out.println(toto.dormir);
		
		Galinha carijo = new Galinha();
		//carijo.fazerBarulho();
		carijo.fazerBarulho = "Cacareja";
		carijo.comida = "Milho";
		carijo.peso = 5;
		//carijo.dormir();
		carijo.dormir = false;
		
		System.out.println("Carijo vive de " + carijo.comida + " pesando " + carijo.peso + " KG");
		System.out.println("Carijo " + carijo.fazerBarulho + " pela manh� e tarde!");
		System.out.println(carijo.dormir);
	}

}
