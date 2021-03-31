package exercicios;

public class Fatorial {

	public static void main(String[] args) {
		
		int fatorial = 1;
		
		for(int n = 1; n <= 10; n++) {
			fatorial = fatorial * n;
			System.out.println(fatorial);
		}
		
//		long fatorial = 1;
//		for(int n = 1; n <= 40; n++) {
//			fatorial = fatorial *n;
//			System.out.println(fatorial);
//		}
	}

}
