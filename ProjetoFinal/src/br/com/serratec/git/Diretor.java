package br.com.serratec.git;

public class Diretor extends Funcionario {

	public Diretor(String nome, String cpf, String senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.cargo = "Diretor";

	}

	public String getCargo() {
		return cargo;
	}

}
