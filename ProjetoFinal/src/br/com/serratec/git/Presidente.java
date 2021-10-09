package br.com.serratec.git;

import java.util.Scanner;

public class Presidente extends Funcionario {
	
	public void cadastraFuncionario(String cpf, int senha, String cargo) {
		this.cpf = cpf;
		this.senha = senha;
		this.cargo = cargo;
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

}
