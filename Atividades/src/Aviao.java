public class Aviao extends Thread {

	private String nomeVoo;
	private Aeroporto airport;

	public Aviao(String nomeVoo, Aeroporto airport) {
		super();
		this.nomeVoo = nomeVoo;
		this.airport = airport;
	}

	synchronized void voar() {
		try {
			Thread.sleep(2000);
			System.out.println(this.nomeVoo + " voando...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void decolar() throws InterruptedException {
		airport.pistaDisponivel(this, "decolar");
		System.out.println(this.nomeVoo + " Decolando...");
	}

	synchronized void aterrissar() throws InterruptedException {
		airport.pistaDisponivel(this, "aterrisar");
		System.out.println(this.nomeVoo + " Aterrisando...!");
	}
	
	public String getNomeVoo() {
		return this.nomeVoo;
	}

	@Override
	public void run() {
		try {
			decolar();
			voar();
			aterrissar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}