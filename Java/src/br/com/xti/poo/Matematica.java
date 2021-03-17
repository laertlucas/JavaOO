package br.com.xti.poo;

public class Matematica {
	int maior;

	int maior (int um, int dois){
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}

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
}
