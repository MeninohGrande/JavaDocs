package poo.atividade.javadocs;

import java.io.IOException;

/**
 * A classe conta em banco é uma abstração simples de criação e movimentação
 * de uma conta bancária genérica
 * 
 * 	@author Pedro A S Chaves (MeninohGrande)
 *	@since 0.1
 */
public class ContaBanco {

	/**
	 * O atributo {@link ContaBanco#numConta} é usado para armazenar um numero de conta da instância;
	 * O atributo {@link ContaBanco#nomeConta} é usado para armazenar o nome do titular da conta da instância
	 * O atributo {@link ContaBanco#saldo} é usado para armazenar o saldo da conta da instância
	 */
	
	private int numConta;
	private String nomeConta;
	private double saldo;


	/**
	 * O metodo {@code ContaBanco} é o construtor personalizado da classe
	 * 
	 * @param numConta Recebe o numero da conta para a construção da classe
	 * @param nomeConta Recebe o nome do titular da conta para a construção da classe
	 */
	
	public ContaBanco (int numConta, String nomeConta) {
		
		this.numConta = numConta;
	
		this.nomeConta = nomeConta;
	}
	
	/**
	 *  O método {@code getSaldo} retorna o saldo atual da conta.
	 *  
	 * 	@return saldo atual da conta
	 */	
	public double getSaldo () {
		return this.saldo;
	}
	
	/**
	 * O método {@code getNumConta} Retorna o numero da conta da atual instância
	 * 
	 * @return Retorna o numero da conta da atual instância
	 */
	public int getNumConta() {
		return numConta;
	}
	
	/**
	 * O método {@code getNomeConta} Retorna o nome do titular da conta
	 * 
	 * @return Retorna o nome do titular da conta
	 */
	public String getNomeConta() {
		return nomeConta;
	}
	
	/**
	 * O método {@code} é responsavel por adicionar um valor ao saldo da conta
	 * 
	 * @param valor é o paramentro que armazena o valor a ser depositado
	 * @throws IOException é lançando quando o valor digitado é menor ou igual a zero.
	 */
	public void deposito (double valor) throws IOException {
		if (valor > 0)
			this.saldo += valor;
		else
			throw new IOException("Valor inserido incorreto");
	}
	
	/**
	 * O metodo {@code saque} faz um debito da conta com um acrescimo de uma taxa de $5
	 * 
	 * @param valor armazena o valor a ser debitado da conta
	 * @throws IOException é lançado quando o valor inserido é menor ou igual a zero
	 */
	public void saque (double valor) throws IOException {
		if (valor > 0)
			this.saldo -= valor+5;
		else
			throw new IOException("Valor inserido incorreto");
	}
	
	/**
	 * O método {@code imprimir} é responsavel por imprimir no console todas as informações a cerca da conta
	 */
	public void imprimir() {
		System.out.println("Conta: "
				+ getNumConta() 
				+ ", Propietario: " 
				+ getNomeConta()
				+ ", Saldo: $" + getSaldo()
				);
		
	}
	
}
