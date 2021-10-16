package br.com.serratec.git;

public class Cliente {

	protected String nome;
	protected String cpf;
	protected String senha;
	protected int tipo = 1;

	public Cliente(String nome, String cpf, String senha) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	public String getTitular() {
		return nome;
	}

	public void setTitular(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
