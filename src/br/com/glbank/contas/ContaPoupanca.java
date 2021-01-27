package br.com.glbank.contas;

public class ContaPoupanca extends Conta {
	
	private String cpf;

	public ContaPoupanca(int id, int agencia, int numeroConta, double saldo, String titular) {
		super(id, agencia, numeroConta, saldo, titular);
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	

}
