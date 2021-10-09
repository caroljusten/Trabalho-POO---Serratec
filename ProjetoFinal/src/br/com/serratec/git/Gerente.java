package br.com.serratec.git;

import java.util.Scanner;

public class Gerente extends Funcionario {

	private String agenciaResponsavel;

	public  Gerente(String cpf, int senha, String agenciaResponsavel) {
		this.cpf = cpf;
		this.senha = senha;
		this.cargo = "Gerente";
		this.agenciaResponsavel = agenciaResponsavel;
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

	public String getAgenciaResponsavel() {
		return agenciaResponsavel;
	}

	public void setAgenciaResponsavel(String agenciaResponsavel) {
		this.agenciaResponsavel = agenciaResponsavel;
	}

}
