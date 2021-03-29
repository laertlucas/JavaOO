package br.com.xti.herança;

<<<<<<< HEAD
public class Cubo implements AreaCalculavel, VolumeCalculavel {
=======
public class Cubo implements VolumeCalculavel, AreaCalculavel{
>>>>>>> 452b1914486c519ef93942b6dfde4ed2f5d9081b

	double lado;
	public Cubo(double lado) {
		this.lado = lado;
	}
	
	@Override
<<<<<<< HEAD
	public double calculaVolume() {
		return 6 * lado * lado;
	}

	@Override
	public double calculaArea() {
		return lado * lado * lado;
	}
=======
	public double calculaArea() {
			return lado * lado;
	}

	@Override
	public double calculaVolume() {
			return 6 * lado * lado;
	}

>>>>>>> 452b1914486c519ef93942b6dfde4ed2f5d9081b
}
