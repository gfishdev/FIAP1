import java.util.Random;

public class Aeroporto extends Thread {

	private String nomeAeroporto;
	private boolean pistaLiberada = false;

	public Aeroporto(String nomeAeroporto) {
		this.nomeAeroporto = nomeAeroporto;
	}

	synchronized void pistaDisponivel(Aviao t, String acao) throws InterruptedException {
		if (!pistaLiberada) {
			System.out.println(t.getNomeVoo() + " Esperando para " + acao + "...");
			this.wait();
		}
	}

	synchronized void alterarEstadoPista() {
		// pistaLiberada = new Random().nextBoolean();
		pistaLiberada = true;
		if (pistaLiberada)
			this.notifyAll();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			alterarEstadoPista();
			run();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}