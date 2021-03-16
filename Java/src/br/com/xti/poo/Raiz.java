package br.com.xti.poo;

public class Raiz {
	int raiz;
	/**
	 * 
	 * @param numero
	 * @return retornar a raiz quadrada segundo a equação de PELL
	 */
	int raiz(int numero) {
		int raiz = 0, impar = 1;
		while (numero >= impar) {
			numero = numero - impar;
			impar = impar + 2;
			++raiz;
		}
		return raiz;
	}
}
