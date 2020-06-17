package poo.atividade.javadocs;

import java.io.IOException;

/**
 * A classe conta em banco � uma abstra��o simples de cria��o e movimenta��o
 * de uma conta banc�ria gen�rica
 * 
 * 	@author Pedro A S Chaves (MeninohGrande)
 *	@since 0.1
 */
public class ContaBanco {

	/**
	 * O atributo {@link ContaBanco#numConta} � usado para armazenar um numero de conta da inst�ncia;
	 * O atributo {@link ContaBanco#nomeConta} � usado para armazenar o nome do titular da conta da inst�ncia
	 * O atributo {@link ContaBanco#saldo} � usado para armazenar o saldo da conta da inst�ncia
	 */
	
	private int numConta;
	private String nomeConta;
	private double saldo;


	/**
	 * O metodo {@code ContaBanco} � o construtor personalizado da classe
	 * 
	 * @param numConta Recebe o numero da conta para a constru��o da classe
	 * @param nomeConta Recebe o nome do titular da conta para a constru��o da classe
	 */
	
	public ContaBanco (int numConta, String nomeConta) {
		
		this.numConta = numConta;
	
		this.nomeConta = nomeConta;
	}
	
	/**
	 *  O m�todo {@code getSaldo} retorna o saldo atual da conta.
	 *  
	 * 	@return saldo atual da conta
	 */	
	public double getSaldo () {
		return this.saldo;
	}
	
	/**
	 * O m�todo {@code getNumConta} Retorna o numero da conta da atual inst�ncia
	 * 
	 * @return Retorna o numero da conta da atual inst�ncia
	 */
	public int getNumConta() {
		return numConta;
	}
	
	/**
	 * O m�todo {@code getNomeConta} Retorna o nome do titular da conta
	 * 
	 * @return Retorna o nome do titular da conta
	 */
	public String getNomeConta() {
		return nomeConta;
	}
	
	/**
	 * O m�todo {@code} � responsavel por adicionar um valor ao saldo da conta
	 * 
	 * @param valor � o paramentro que armazena o valor a ser depositado
	 * @throws IOException � lan�ando quando o valor digitado � menor ou igual a zero.
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
	 * @throws IOException � lan�ado quando o valor inserido � menor ou igual a zero
	 */
	public void saque (double valor) throws IOException {
		if (valor > 0)
			this.saldo -= valor+5;
		else
			throw new IOException("Valor inserido incorreto");
	}
	
	/**
	 * O m�todo {@code imprimir} � responsavel por imprimir no console todas as informa��es a cerca da conta
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
