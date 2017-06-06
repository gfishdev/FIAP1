package br.com.fiap.fundamentosJavaUml.aula3;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		ContaPoupanca conta1 = new ContaPoupanca("A", "Rua A", "1234567895", LocalDate.of(1994, 2, 8), LocalDate.now());
		ContaPoupanca conta2 = new ContaPoupanca("A", "Rua A", "1234567895", LocalDate.of(1994, 2, 8),
				LocalDate.of(2000, 2, 8));

		System.out.println(conta1.equals(conta2));
		conta2.setCpfCliente("1234567890");
		System.out.println(conta1.equals(conta2));
		try {

			conta1.deposita(30);
			conta1.saque(60);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		try {
			conta2.deposita(30);
			conta2.saque(60);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
		
	}

}
