package br.com.fiap.atividade3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;

public class Oto {

	public static void main(String[] args) {
		LocalDateTime inicio = LocalDateTime.now();
		HashSet<Integer> teste = new HashSet<>();
		for(int i = 0; i < 1_000_000;i++) {
			teste.add(i);
		}
		teste.stream().filter(c -> c.equals(5000));
		System.out.println(ChronoUnit.MILLIS.between(inicio, LocalDateTime.now()));

	}

}
