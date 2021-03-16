package br.com.xti.poo;

public class MatematicaTest {

	public static void main(String[] args) {

		Matematica m = new Matematica();
		//		int ma = m.maior(15, 7);
		//		System.out.println(ma);
		//		
		//		Matematica s = new Matematica();
		//		double so = s.soma(35, 16);
		//		System.out.println(so);
		
		double so = m.soma(m.maior(2, 4), m.maior(3, 5));
		System.out.println(so);
	}

}
