package br.com.xti.herança;

public class InterfaceTest {
	
	public static void area(AreaCalculavel o){
		System.out.println(o.calculaArea());
	}
	
	public static void volume(VolumeCalculavel i) {
		System.out.println(i.calculaVolume());
	}
	
	public static void main(String[] args) {
//		Quadrado q = new Quadrado(4);
//		Cubo c = new Cubo(6);
//		
//		System.out.println(q.calculaArea());
//		System.out.println(c.calculaVolume());
		
		area(new Quadrado(4));
		volume(new Cubo(4));
	}
}
