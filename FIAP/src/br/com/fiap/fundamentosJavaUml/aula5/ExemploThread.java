package br.com.fiap.fundamentosJavaUml.aula5;

public class ExemploThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 1_000_000; i++) {
			System.out.println(getName() + ": " + i);
		}
	}
}
