/**
 * Classe abstrata que se referencia a uma conta
 * 
 * @Author Gustavo Ribeiro
 * 
 */

package br.com.glbank.contas;

public abstract class Conta {
	private int id;
	private int agencia;
	private int numeroConta;
	private double saldo;
	private String titular;
	public static int total;

	
	public Conta(int id, int agencia, int numeroConta, double saldo, String titular) {
		super();
		this.id = id;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.titular = titular;
		total++;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			System.out.println("Valor transferido para " + destino.getTitular());
			return true;
		}
		return false;
	}
	
	public boolean sacar(double valor) {		
		if(this.saldo > valor) {
			this.saldo += valor;			
			System.out.println("Saque realizado!");
			return true;
		} else {
			System.out.println("Não foi possível realizar o saque");
			return false;			
		}
		
	}
	
}
		
	
	
	


