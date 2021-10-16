package br.com.serratec.git;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaInterno {

	public static void main(String[] args) {

		int tipo = 0;
		int numero = 0;
		Scanner sc = new Scanner(System.in);

		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
		ArrayList<Conta> conta = new ArrayList<Conta>();

		//cadastros (teste only, usar arquivo)
		Cliente c1 = new Cliente("Carol", "1234567890", "1234");
		Cliente c2 = new Cliente("Breno", "1987654321", "5678");
		Cliente c3 = new Cliente("Z�zinho", "152369837", "4321");
		cliente.add(c1);
		cliente.add(c2);
		cliente.add(c3);
		
		Gerente g1 = new Gerente("Rog�rio", "1358748252", "1234", "abc123");
		Diretor d1 = new Diretor("Robervaldo", "5624865234", "5555");
		Presidente p1 = new Presidente("Rica�a", "263265652", "7777");
		funcionario.add(g1);
		funcionario.add(d1);
		funcionario.add(p1);

		ContaCorrente cc1 = new ContaCorrente(c1, "abc123");
		conta.add(cc1);
		ContaCorrente cc2 = new ContaCorrente(c2, "abc123");
		conta.add(cc2);
		ContaCorrente cc3 = new ContaCorrente(g1, "abc123");
		conta.add(cc3);

		// login
		System.out.println("Bem Vindo ao Banco Seique Seiquel�");
		System.out.println("Insira seu CPF: ");
		String username = sc.nextLine();

		System.out.println("Insira sua senha: ");
		String password = sc.nextLine();

		// saber se � cliente ou funcionario
		for (Cliente busca : cliente) {
			if (username.equals(busca.getCpf())) {
				tipo = 1;
			}
		}

		for (Funcionario busca : funcionario) {
			if (username.equals(busca.getCpf())) {
				tipo = 2;				
			}
		}
		System.out.println(tipo);

		// se for cliente
		if (tipo == 1) {
			for (Cliente item : cliente) {
				if (username.equals(item.getCpf())) {
					item.getCpf();
					if (password.equals(item.getSenha())) {
						System.out.println("Bem vindo(a), " + item.getNome());
					} else {
						System.out.println("Senha Inv�lida");
						System.exit(0);
					}
				}
			}
		}

		// se for funcion�rio
		else if (tipo == 2) {
			for (Funcionario item : funcionario) {
				if (username.equals(item.getCpf())) {
					item.getCpf();
					if (password.equals(item.getSenha())) {
						System.out.println("Bem vindo(a), " + item.getNome());
					} else {
						System.out.println("Senha Inv�lida");
						System.exit(0);
					}
				}
			}
		} else {
			System.out.println("CPF n�o cadastrado");
			System.exit(0);
		}

		// menu cliente
		if (tipo == 1) {
			System.out.println("1 - Movimenta��es na Conta\n2 - Relat�rios");
			switch (numero) {
				case 1: 
					System.out.println("1 - Saque\n2 - Dep�sito\n3 - Transfer�ncia");
					switch (numero) {
						case 1: //fun��o saque
							break;
							
						case 2: //fun��o dep�sito
							break;
							
						case 3: //fun��o transferencia
					break;						
					}
				break;
				case 2:
					System.out.println("1 - Saldo\n2 - Relat�rio de tributa��o da conta corrente\n3 - Relat�rio de Rendimento da Poupan�a");
					switch (numero) {
					case 1: //getSaldo
						break;
						
					case 2: //fun��o relat�rio conta corrente
						break;
						
					case 3: //fun��o relat�rio rendimento conta poupan�a
						break;						
					}
				break;
				}
		} // fim menu cliente

		//menu gerente
		if (tipo == 2) {
			System.out.println("1 - Movimenta��es na Conta\n2 - Relat�rios");
			switch (numero) {
				case 1: 
					System.out.println("1 - Saque\n2 - Dep�sito\n3 - Transfer�ncia");
					switch (numero) {
						case 1: //fun��o saque
							break;
							
						case 2: //fun��o dep�sito
							break;
							
						case 3: //fun��o transferencia
					break;						
					}
				break;
				case 2:
					System.out.println("1 - Saldo\n2 - Relat�rio de tributa��o da conta corrente\n3 - Relat�rio de Rendimento da Poupan�a");
					switch (numero) {
					case 1: //getSaldo
						break;
						
					case 2: //fun��o relat�rio conta corrente
						break;
						
					case 3: //fun��o relat�rio rendimento conta poupan�a
						break;						
					}
				break;
				}
		}
	}

}
