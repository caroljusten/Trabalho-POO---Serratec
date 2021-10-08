package br.com.serratec.git;

public class Cliente {

	protected String titular;
	protected int senha;
	protected String cpf;

	public Cliente(String titular, int senha, String cpf) {
		this.setTitular(titular);
		this.setSenha(senha);
		this.setCpf(cpf);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
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

}
