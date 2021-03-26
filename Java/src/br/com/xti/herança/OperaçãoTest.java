package br.com.xti.herança;

public class OperaçãoTest {

	public static void calcule(OperaçãoMatematica o, double x, double y) {
		System.out.println(o.calcular(x, y));
	}
	
	public static void semPolimorfismo(String o, double x, double y) {
		if(o.equals("Soma")) {
			System.out.println(x + y);
		} else if(o.equals("Multiplicação")) {
			System.out.println(x * y);
		}
	}
	
	public static void main(String[] args) {
		calcule(new Soma(), 5, 7);
		calcule(new Multiplicação(), 50, 5);
	}
}
