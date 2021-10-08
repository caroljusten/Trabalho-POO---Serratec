package br.com.serratec.git;

public class ContaCorrente extends Conta {

	public ContaCorrente(String cpfTtular, double saldo, String idAgencia) {
		super(getCpfTitular(), saldo, idAgencia);
		this.saldo = saldo;
		this.idAgencia = idAgencia;
	}

}
