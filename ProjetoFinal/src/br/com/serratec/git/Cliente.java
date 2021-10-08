package br.com.serratec.git;

import java.util.Scanner;

public class Cliente {

	protected String titular;
	protected int senha;
	protected long cpf;

	public Cliente(String titular, int senha, long cpf) {
		this.setTitular(titular);
		this.setSenha(senha);
		this.setCpf(cpf);
	}
	
	public void logarSistema() {
		System.out.println("Informe seu CPF: ");
		Scanner sc = new Scanner(System.in);
		long confereCPF = sc.nextLong();
		
		System.out.println("Senha: ");
		int confereSenha = sc.nextInt();
		
		if (confereCPF == cpf && confereSenha == senha) {
			System.out.println("Bem vindo(a), " + getTitular());
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

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

}
