package br.com.serratec.git;

public class ContaPoupanca extends Conta {
	
	private String tipo;

	public ContaPoupanca(Long cpfTitular, String idAgencia) {

		this.idAgencia = idAgencia;
		saldo = 0;
		tipo = "Conta Poupança";
	}
}
