package br.com.glbank.contas;

public class ContaCorrente extends Conta {

	private String cpf;
	
	
	public ContaCorrente(int id, int agencia, int numeroConta, double saldo, String titular) {
		super(id, agencia, numeroConta, saldo, titular);
		
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	

}
