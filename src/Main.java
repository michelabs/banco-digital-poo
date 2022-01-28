import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Cliente cliente1 = new Cliente();
		System.out.println("Digite as informações do cliente!");
		System.out.print("Nome do Cliente: ");
		cliente1.setNomeCompleto(sc.nextLine());
		System.out.print("CEP: ");
		cliente1.setEnderecoCEP(sc.nextInt());
		System.out.print("Numero: ");
		cliente1.setEnderecoNumero(sc.nextInt());
		System.out.print("Ponto de referência: ");
		cliente1.setEnderecoReferencia(sc.next());		
		Conta cc1 = new ContaCorrente(cliente1);			
		System.out.println(cc1);
		
		cc1.depositar(1000.00);
		cc1.imprimirExtrato();
		System.out.println();
		cc1.sacar(500.00);	
		cc1.imprimirExtrato();
		System.out.println();
		cc1.depositar(120.00);
		cc1.imprimirExtrato();
		System.out.println();

		System.out.println("************************");
		System.out.println();
		
		Cliente cliente2 = new Cliente();
		System.out.println("Digite as informações do cliente!");
		System.out.print("Nome do Cliente: ");
		sc.nextLine();
		cliente2.setNomeCompleto(sc.nextLine());
		System.out.print("CEP: ");		
		cliente2.setEnderecoCEP(sc.nextInt());
		System.out.print("Numero: ");
		cliente2.setEnderecoNumero(sc.nextInt());
		System.out.print("Ponto de referência: ");
		cliente2.setEnderecoReferencia(sc.next());		
		Conta cc2 = new ContaPoupanca(cliente2);			
		System.out.println(cc2);
		System.out.println();
		
		cc2.depositar(2000.00);
		cc2.imprimirExtrato();
		System.out.println();
		cc2.sacar(600.00);	
		cc2.imprimirExtrato();
		System.out.println();
		cc2.depositar(155.00);
		cc2.imprimirExtrato();
		System.out.println();			
		cc1.transferir(500, cc2);
		cc2.imprimirExtrato();
	}
}