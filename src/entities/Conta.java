package entities;

public class Conta {
	
	protected static final int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected static int numeroConta;
	protected double saldo;	
	protected static Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public void sacar(double valor) {
		saldo -= valor ;		
	}
	
	public void depositar(double valor) {
		saldo += valor ;		
	}
	
	public void transferir(double valor, Conta contaDestino ) {
		sacar(valor);
		contaDestino.depositar(valor);		
	}	
	
	public int getAgencia() {
		return agencia;
	}	

	public static Cliente getCliente() {
		return cliente;
	}

	public static void setCliente(Cliente cliente) {
		Conta.cliente = cliente;
	}

	public static int getNumeroConta() {
		return numeroConta;
	}

	public static void setNumeroConta(int numeroConta) {
		Conta.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
	public void imprimirExtrato() {
		
	}
	
}	

