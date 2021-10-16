package br.com.serratec.git;

public abstract class Funcionario {

	protected String nome;
	protected String cpf;
	protected String senha;
	protected int tipo = 2;
	protected String cargo;

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTipo() {
		return tipo;
	}

	public String getCargo() {
		return cargo;
	}

}
