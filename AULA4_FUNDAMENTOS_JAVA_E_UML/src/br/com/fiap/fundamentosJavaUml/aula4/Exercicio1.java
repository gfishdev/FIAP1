package br.com.fiap.fundamentosJavaUml.aula4;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Exercicio1 {
	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<>();
		LinkedList<String> lista2 = new LinkedList<>();

		LocalDateTime inicioLista1 = LocalDateTime.now();
		for (Integer i = 0; i < 10_000_000; i++) {
			lista1.add(i.toString());
		}

		System.out.println("Tempo total de insercao ArrayList é "
				+ ChronoUnit.MILLIS.between(inicioLista1, LocalDateTime.now()) + "ms");

		inicioLista1 = LocalDateTime.now();
		lista1.get(50_000);

		System.out.println("Tempo total de consulta ArrayList é "
				+ ChronoUnit.MILLIS.between(inicioLista1, LocalDateTime.now()) + "ms");

		LocalDateTime inicioLista2 = LocalDateTime.now();
		for (Integer i = 0; i < 10_000_000; i++) {
			lista2.add(i.toString());
		}
		System.out.println(
				"Tempo total de insercao é " + ChronoUnit.MILLIS.between(inicioLista2, LocalDateTime.now()) + "ms");

		inicioLista2 = LocalDateTime.now();
		lista2.get(50_000);

		System.out.println("Tempo total de consulta LinkedList é "
				+ ChronoUnit.MILLIS.between(inicioLista2, LocalDateTime.now()) + "ms");

	}
}
