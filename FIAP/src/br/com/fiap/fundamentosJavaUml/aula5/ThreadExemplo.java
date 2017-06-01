package br.com.fiap.fundamentosJavaUml.aula5;

public class ThreadExemplo extends Thread {
	public void run() {
		try {
			while (true) {
				System.out.println("Executando...");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread Interrompida");
		}
	}
}