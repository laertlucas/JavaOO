package br.com.xti.poo;

public class Matematica {

	/*
	 * int maior;
	 * 
	 * int maior (int um, int dois){ if (um > dois) { return um; } else { return
	 * dois; } }
	 */

	double soma;

	double soma(double [] numeros) {
		//return um + dois;
		//double s = um + dois;
		//return s;
		double total = 0;
		for(double n : numeros) {
			total += n;
		}
		return total;
	}
	
	double media;
	
	double media(int x, int y) {
		System.out.println("media(int x, int y)");
		return (x + y)/2;
	}
	
	double media(String x, String y) {
		System.out.println("media(String x, String y)");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy)/2;
	}
	
	double media(double ... numeros) {
		System.out.println("media(double ... numeros)");
		return this.soma(numeros) / numeros.length;
	}
}
