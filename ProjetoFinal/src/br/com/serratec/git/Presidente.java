package br.com.serratec.git;

public class Presidente extends Funcionario {

	public Presidente(String nome, String cpf, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.cargo = "Presidente";

	}

	public String getCargo() {
		return cargo;
	}

}
