package br.com.serratec.git;

public abstract class Conta {

	protected static String cpfTitular;
	protected double saldo;
	protected String idAgencia;

	protected static String getCpfTitular() {
		return cpfTitular;

	}

	public Conta(String cpfTitular, double saldo, String idAgencia) {
		super();
		Conta.cpfTitular = cpfTitular;
		this.saldo = saldo;
		this.idAgencia = idAgencia;
	}

	public void setCpfTitular(String cpfTitular) {
		Conta.cpfTitular = cpfTitular;
	}

	public String getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(String idAgencia) {
		this.idAgencia = idAgencia;
	}

}
