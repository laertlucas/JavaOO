package br.com.xti.poo;

public class Funcionario {
	private String nome;
	private boolean ativo;
	private double salario;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String setSenha(String senha) {
		return senha;
	}

	public void isSenhaCorreta(boolean s) {
		this.senha = senha;
	}
}
