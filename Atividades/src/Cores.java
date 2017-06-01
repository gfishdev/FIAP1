
public enum Cores {
	BRANCO("Branco", 21), PRETO("Preto", 22), VERMELHO("Vermelho", 23), AMARELO("Amarelo", 24), AZUL("Azul", 25);
	
	private String nomeCor;
	private int codigoCor;
	
	private Cores(String nomeCor, int codigoCor) {
		this.nomeCor = nomeCor;
		this.codigoCor = codigoCor;
	}
	
	public String getNomeCor() {
		return this.nomeCor;
	}
	
	public int getCodigoCor() {
		return this.codigoCor;
	}
	
	
}
