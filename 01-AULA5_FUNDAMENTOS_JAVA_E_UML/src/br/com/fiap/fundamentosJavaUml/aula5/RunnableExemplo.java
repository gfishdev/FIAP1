package br.com.fiap.fundamentosJavaUml.aula5;

public class RunnableExemplo implements Runnable {
	public void run() {
		int i = 0;
		while (i < 80) {
			i++;
			System.out.println("Contando " + i + "...");
		}
	}
}
