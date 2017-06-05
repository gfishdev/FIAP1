package br.com.fiap.fundamentosJavaUml.aula5;

import java.util.concurrent.Callable;

public class Cavalo2 implements Callable<String> {
	private String nomeCavalo;

	public Cavalo2(String nomeCavalo) {
		this.nomeCavalo = nomeCavalo;
	}

	public void setNomeCavalo(String nomeCavalo) {
		this.nomeCavalo = nomeCavalo;
	}

	public String getNomeCavalo() {
		return nomeCavalo;
	}

	@Override
	public String call() throws Exception {
		for (int i = 1; i < 11; i++) {
			Thread.sleep((int) (Math.random() * 100));
			// System.out.println(nomeCavalo + " " + i * 100 / 10 + "%
			// percorridos...");
		}
		return nomeCavalo + " venceu!";
	}

}
