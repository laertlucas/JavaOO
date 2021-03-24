package br.com.xti.poo;

public class FuncionarioTest {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.setNome("Lucas");
		
		Funcionario g = new Funcionario();
		g.setSalario(9000);
		
		Funcionario h = new Funcionario();
		h.setAtivo(true);
		
		Funcionario j = new Funcionario();
		j.setSenha("Lucas");
		
		System.out.println(f.getNome());
		System.out.println(g.getSalario());
		System.out.println(h.isAtivo());
		System.out.println(j.setSenha(null));
	}

}
