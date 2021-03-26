package br.com.xti.heran�a;

public class Opera��oTest {

	public static void calcule(Opera��oMatematica o, double x, double y) {
		System.out.println(o.calcular(x, y));
	}
	
	public static void semPolimorfismo(String o, double x, double y) {
		if(o.equals("Soma")) {
			System.out.println(x + y);
		} else if(o.equals("Multiplica��o")) {
			System.out.println(x * y);
		}
	}
	
	public static void main(String[] args) {
		calcule(new Soma(), 5, 7);
		calcule(new Multiplica��o(), 50, 5);
	}
}
