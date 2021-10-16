package br.com.serratec.git;

import java.util.ArrayList;

public abstract class Conta {

	ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();

	protected String cpfTitular;
	protected double saldo;
	protected String idAgencia;

	public ArrayList<Cliente> getCliente() {
		return cliente;
	}

	public ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getIdAgencia() {
		return idAgencia;
	}

	public void setCliente(ArrayList<Cliente> cliente) {
		this.cliente = cliente;
	}

	public void setFuncionario(ArrayList<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setIdAgencia(String idAgencia) {
		this.idAgencia = idAgencia;
	}

}
