package br.com.xti.herança;

public class InterfaceTest {

//	public static void area(AreaCalculavel o) {
//		System.out.println(o.calculaArea());
//	}
//	
//	public static void volume(VolumeCalculavel p) {
//		System.out.println(p.calculaVolume());
//	}
	
	public static void main(String[] args) {
//		area(new Quadrado(6));
//		volume(new Cubo(6));
		
		Quadrado q = new Quadrado(6);
		Cubo c = new Cubo(6);
		
		System.out.println(q.calculaArea());
		System.out.println(c.calculaArea());
	}

}
