
public class ModificadoresDeAcesso {

	private String name;// Só pode ser usado na mesma classe.
	
	String name;// Pode ser acessado na mesma classe e no mesmo pacote.
	
	public String name;// Pode ser acessado em todas as classes e em classes externas.
	
	public String getNome() {
		return nome;
	}
	
	public static void main(String[] args) {

	}

}
