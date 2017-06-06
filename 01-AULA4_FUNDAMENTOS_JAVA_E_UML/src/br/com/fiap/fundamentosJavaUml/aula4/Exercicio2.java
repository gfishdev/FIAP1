package br.com.fiap.fundamentosJavaUml.aula4;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Exercicio2 {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("Ze", 20, true, LocalDateTime.now().minusMonths(20)));
		clientes.add(new Cliente("Jao", 49, true, LocalDateTime.now().minusMonths(5)));
		clientes.add(new Cliente("Marcio", 31, true, LocalDateTime.now().minusMonths(1)));
		clientes.add(new Cliente("Tio", 11, true, LocalDateTime.now().minusMonths(90)));
		clientes.add(new Cliente("Fio", 60, true, LocalDateTime.now()));
		System.out.println(clientes);
		clientes.stream().filter(c -> ChronoUnit.YEARS.between(c.getPrimeiraCompra(), LocalDateTime.now()) > 4)
				.forEach(Cliente::inativar);

		int max = clientes.stream().mapToInt(Cliente::getIdade).max().orElse(0);
		int min = clientes.stream().mapToInt(Cliente::getIdade).min().orElse(0);
		double media = clientes.stream().mapToInt(Cliente::getIdade).average().orElse(0);
		
		System.out.println(clientes);
		
		System.out.println("idade maxima: " + max);
		System.out.println("idade minima: " + min);
		System.out.println("idade media: " + media);
	}

}
