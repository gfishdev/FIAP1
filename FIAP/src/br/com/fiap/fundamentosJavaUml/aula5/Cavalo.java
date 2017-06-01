package br.com.fiap.fundamentosJavaUml.aula5;

public class Cavalo implements Runnable {
	private String name;

	public Cavalo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep((int) (Math.random() * 5000));
				System.out.println(getName() + " " + i*100/10+"%...");
			}
			System.out.println(getName() + " ganhou!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return this.name;
	}

}
