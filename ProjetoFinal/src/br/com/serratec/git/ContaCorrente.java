package br.com.serratec.git;

import java.util.Scanner;

public class ContaCorrente extends Conta {

	private String tipo;

	public ContaCorrente(Cliente cliente, String idAgencia) {
		cpfTitular = cliente.getCpf();
		this.idAgencia = idAgencia;
		this.setSaldo(0);
		tipo = "Conta Corrente";
	}

	public ContaCorrente(Funcionario funcionario, String idAgencia) {
		cpfTitular = funcionario.getCpf();
		this.idAgencia = idAgencia;
		this.setSaldo(0);
		tipo = "Conta Corrente";
	}

	public void saqueConta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor a ser sacado: ");
		double valorSaque = sc.nextLong();

		if (valorSaque <= saldo) {
			saldo -= valorSaque;
			System.out.println("Saque de R$" + valorSaque + " concluído, seu saldo atual é de R$" + saldo);
		} else {
			System.out.println("Saldo insuficiente");
		}
	}

	public void depositoConta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor a ser depositado: ");
		double valorDeposito = sc.nextLong();

		saldo += valorDeposito;
		System.out.println("Depósito realizado com sucesso!");
	}

	/*public void transfereConta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor da transferência: ");
		double valorTransf = sc.nextLong();

		System.out.println("Informe o CPF do destinatário: ");
		String cpfDest = sc.nextLine();
		
		if (cpfDest == getCpfTitular()) {
			this.saldo -= valorTransf;
			
		}

		

		System.out.println("Transferência concluída!\nValor: R$" + valorTransf + "\nEnviado de: " + getCpfTitular()
				+ "\nPara: " + cpfDest);
	}*/



}
