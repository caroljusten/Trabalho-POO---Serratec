package br.com.serratec.git;

import java.util.Scanner;

public class Cliente {

	protected String titular;
	protected String cpf;
	protected int senha;

	public Cliente(String titular, String cpf, int senha) {
		this.titular = titular;
		this.cpf = cpf;
		this.senha = senha;
	}

	public void logarSistema() {
		System.out.println("Informe seu CPF: ");
		Scanner sc = new Scanner(System.in);
		String confereCPF = sc.nextLine();

		System.out.println("Senha: ");
		int confereSenha = sc.nextInt();

		if (confereCPF == getCpf() && confereSenha == senha) {
			System.out.println("Bem vindo(a), ");
		} else {
			System.out.println("CPF ou Senha inválidos! Verifique seus dados e tente novamente");
			System.exit(0);
		}
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
