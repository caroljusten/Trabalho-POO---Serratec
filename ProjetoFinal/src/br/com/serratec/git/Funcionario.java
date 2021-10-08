package br.com.serratec.git;

public abstract class Funcionario {

	private int senha;
	private String cpf;
	private String cargo;

	public Funcionario(int senha, String cpf, String cargo) {
		super();
		this.senha = senha;
		this.cpf = cpf;
		this.cargo = cargo;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
