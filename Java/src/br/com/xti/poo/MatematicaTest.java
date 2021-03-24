package br.com.xti.poo;

public class MatematicaTest {

	public static void main(String[] args) {

		//Matematica m = new Matematica();
		//		int ma = m.maior(15, 7);
		//		System.out.println(ma);
		//		
		//		Matematica s = new Matematica();
		//		double so = s.soma(35, 16);
		//		System.out.println(so);
		
		//double[] numeros = {5, 9, 15, 25, 37};
		//double total = m.soma(numeros);
		//double so = m.soma(5, 9, 15, 25, 37);
		//System.out.println(total);
		
		Matematica m = new Matematica();
		System.out.println(m.media(5, 7));
		System.out.println(m.media("35", "15"));
		System.out.println(m.media(35, 53, 39, 42));
	}

}
