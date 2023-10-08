package dio;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor, digite o numero da Agencia:");
		String agencia = scanner.nextLine();

		System.out.println("Por favor, digite o numero da Conta:");
		int numero = scanner.nextInt();

	
		scanner.nextLine();

		System.out.println("Por favor, digite o Nome do Cliente:");
		String nomeCliente = scanner.nextLine();

		System.out.println("Por favor, digite o Saldo:");
		double saldo = scanner.nextDouble();

		System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
		System.out.println("sua agencia e " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque.");

		scanner.close();
	}
}
