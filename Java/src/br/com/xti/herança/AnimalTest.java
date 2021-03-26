package br.com.xti.herança;

public class AnimalTest {

	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}
	
	public static void barulhoSemPolimorfismo(String animal) {
		if(animal.equals("Cachorro")) {
			System.out.println("Au, au");
		} else if (animal.equals("Galinha")) {
			System.out.println("Có, có");
		}
	}
	
	public static void main(String[] args) {
		
		/*Cachorro toto = new Cachorro();
		//toto.fazerBarulho();
		toto.fazerBarulho = "Late";
		toto.comida = "Ração";
		toto.peso = 45;
		//toto.dormir();
		toto.dormir = true;
		
		System.out.println("Toto vive de " + toto.comida + " pesando " + toto.peso + " KG");
		System.out.println("Toto " + toto.fazerBarulho + " pela manhã");
		System.out.println(toto.dormir);
		
		Galinha carijo = new Galinha();
		//carijo.fazerBarulho();
		carijo.fazerBarulho = "Cacareja";
		carijo.comida = "Milho";
		carijo.peso = 5;
		//carijo.dormir();
		carijo.dormir = false;
		
		System.out.println("Carijo vive de " + carijo.comida + " pesando " + carijo.peso + " KG");
		System.out.println("Carijo " + carijo.fazerBarulho + " pela manhã e tarde!");
		System.out.println(carijo.dormir);*/
		
		/*Animal toto = new Cachorro();
		Animal carijo = new Galinha();
		
		System.out.println(toto instanceof Cachorro);
		System.out.println(toto instanceof Animal);
		System.out.println(carijo instanceof Galinha);
		System.out.println(carijo instanceof Cachorro);
		
		toto.equals(carijo);// Compara dois objetos!
		toto.getClass();// Retorna o tipo da classe do objeto(cachorro)
		toto.hashCode();// Gera um número especial
		toto.toString();// Retorna a representação da String em texto do objeto*/
		
		//Animal generico = new Animal(0,null);
		Animal toto = new Cachorro();
		Animal carijo = new Galinha();
		
		//generico.fazerBarulho();
		//toto.fazerBarulho();
		//carijo.fazerBarulho();
		
		barulho(toto);
		barulho(carijo);
		
		barulhoSemPolimorfismo("Cachorro");
		barulhoSemPolimorfismo("Galinha");
	}

}
