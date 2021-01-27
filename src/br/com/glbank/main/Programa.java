/**
 * Programa Principal de execução 
 * 
 * @author Gustavo Ribeiro
 */

package br.com.glbank.main;

import java.util.ArrayList;

import br.com.glbank.contas.Conta;
import br.com.glbank.contas.ContaCorrente;

public class Programa extends Conta{

	public Programa(int id, int agencia, int numeroConta, double saldo, String titular) {
		super(id, agencia, numeroConta, saldo, titular);
	}

	public static void main(String[] args) {
		
		
		ArrayList<Conta> listaContas = new ArrayList<Conta>();
		
		
		Conta cc1 = new ContaCorrente(01, 4167, 5462187, 100.0, "Gustavo"); // id, agencia, numero da conta, saldo, titular
		Conta cc2 = new ContaCorrente(02, 7451, 9871654, 233.0, "Ana"); // id, agencia, numero da conta, saldo, titular
		Conta cc3 = new ContaCorrente(03, 2605, 7915321, 80.0, "Leonardo"); // id, agencia, numero da conta, saldo, titular
		Conta cc4 = new ContaCorrente(04, 8914, 1054879, 25.6, "Luis"); // id, agencia, numero da conta, saldo, titular
		
		cc1.depositar(11.0);
		cc2.transfere(78.5, cc4);
		cc3.sacar(100.0);
		
		listaContas.add(cc1);
		listaContas.add(cc2);
		listaContas.add(cc3);
		listaContas.add(cc4);
		
		System.out.println("Quantidade de contas criadas: " + listaContas.size()); // pelo tamanho do arraylist - mesmo resultado
		
		System.out.println("Contas atualizadas: ");

		for(int i=0; i<listaContas.size(); i++) {
			Object ref = listaContas.get(i);
			System.out.println(ref);
		}
			
		
		

	}

}
