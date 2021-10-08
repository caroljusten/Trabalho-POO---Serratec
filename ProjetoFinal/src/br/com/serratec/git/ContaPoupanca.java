package br.com.serratec.git;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String cpfTtular, double saldo, String idAgencia) {
		super(getCpfTitular(), saldo, idAgencia);
		this.saldo = saldo;
		this.idAgencia = idAgencia;		
	}
}
