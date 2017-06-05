package br.com.fiap.fundamentosJavaUml.aula1;

public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(10, "Guilherme Rodrigues");

		System.out.println(aluno);

		int numero = 23;
		System.out.println("getBinario(" + numero + "): " + Exercicio2.getBinario(numero));

	}

}
