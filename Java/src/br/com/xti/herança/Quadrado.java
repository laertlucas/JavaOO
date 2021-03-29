package br.com.xti.herança;

public class Quadrado implements AreaCalculavel {

	double lado;
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
<<<<<<< HEAD
		return lado * lado;
	}
	
}	
=======
		return lado*lado;
	}
}
>>>>>>> 452b1914486c519ef93942b6dfde4ed2f5d9081b
