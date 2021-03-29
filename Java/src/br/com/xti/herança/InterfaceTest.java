package br.com.xti.herança;

public class InterfaceTest {
<<<<<<< HEAD

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

=======
	
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
>>>>>>> 452b1914486c519ef93942b6dfde4ed2f5d9081b
}
