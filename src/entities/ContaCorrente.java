package entities;
import java.util.Scanner;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);		
	}
	
	public void imprimirExtrato() {
        System.out.println("\t=== Extrato Conta Corrente \t===");
        System.out.printf("Ag�ncia: %d%n", super.agencia);
        System.out.printf("N�mero: %d%n", super.numeroConta);
        System.out.printf("Saldo: %.2f%n", super.saldo);
        	}

	@Override
	public String toString() {
		return 	" === Bem vindo ao Banco 034! A sua conta foi criada com sucesso! === \n" + 
		" Titular: " +  cliente.getNomeCompleto() + "\n" +  
		" Endereco do Titular: " +  cliente.getEnderecoCEP() + ", N�mero: " +  cliente.getEnderecoNumero() + " Refer�ncia: " +  cliente.getEnderecoReferencia() + "\n" + 
		" Ag�ncia: " + AGENCIA_PADRAO + "\n"  + 		
		" Conta: " + numeroConta;
	}
}	
	
