package br.com.serratec.git;

public class Gerente extends Funcionario {

	private String agenciaResponsavel;

	public Gerente(String nome, String cpf, String senha, String agenciaResponsavel) {
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.agenciaResponsavel = agenciaResponsavel;
		this.cargo = "Gerente";
	}

	public String getAgenciaResponsavel() {
		return agenciaResponsavel;
	}

	public void setAgenciaResponsavel(String agenciaResponsavel) {
		this.agenciaResponsavel = agenciaResponsavel;
	}

	public String getCargo() {
		return cargo;
	}

}
