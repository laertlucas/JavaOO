package br.com.xti.herança;

public class SenhaTest {

	static void autenticar(String senha) 
		throws SenhaInvalidaException
	{
		if ("123".equals(senha)) {
			System.out.println("Autenticado");
		} else {
			throw new SenhaInvalidaException("Senha Incorreta");
		}
	}
	
	public static void main(String[] args) {
		try {
			autenticar("132");
		} catch(SenhaInvalidaException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
