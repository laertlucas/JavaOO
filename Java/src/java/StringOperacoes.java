package java;

public class StringOperacoes {

	public static void main(String[] args) {
		String s1 = "Write Once";
		String s2 = s1 + "Run Anywhere";
		String s3 = new String("Java Virtual Machine");
		char[] array = {'j','a','v','a'};
		String s4 = new String(array);

		//Operações 
		int tamanho = s1.length();
		char letra = s1.charAt(0);
		String texto = s1.toString();
		
		//Localização - Caracteres e strings no texto
		int posicao = s3.indexOf("Virtual");
		int ultima = s3.lastIndexOf('j');
		boolean vazia = s3.isEmpty();
		//System.out.println(posicao);
		
		//Comparação 
		String xti = "xti";
		//boolean x = xti.equals("xti");
		//boolean x = xti.equalsIgnoreCase("xti");
		//boolean x = xti.startsWith("xI");
		boolean x = xti.endsWith("i");
		System.out.println(x);
		
		int c = "amor".compareTo("bola");
		System.out.println(c);
		
		String so = "Ole, ole!";
		boolean o = so.regionMatches(true, 3, "Ole", 0, 2);
		System.out.println(o);
		
		String l = "O Brasil é Lindo";
		String s1 = l.substring(11);
		
		s1 = l.concat(" que Maravilha");
		s1 = l.replace('s', 'z');
		//s1 = l.replaceFirst("", "x");
		//s1 = l.replaceAll("","X");
		s1 = l.toUpperCase();
		s1 = l.toLowerCase();

		System.out.println("    espaços".trim());
		
		System.out.println(s1);
				
	}

}
