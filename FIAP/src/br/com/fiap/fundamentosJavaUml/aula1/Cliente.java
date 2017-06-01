package br.com.fiap.fundamentosJavaUml.aula1;

public class Cliente {
	private String numeroRG, numeroCPF, endereco, nome;

	public Cliente() {

	}

	public Cliente(String numeroRG) {
		this();
		this.numeroRG = numeroRG;
	}

	public Cliente(String numeroRG, String numeroCPF, String endereco, String nome) {
		this(numeroRG);
		this.numeroCPF = numeroCPF;
		this.endereco = endereco;
		this.nome = nome;
	}

	public String getNumeroRG() {
		return numeroRG;
	}

	public void setNumeroRG(String numeroRG) {
		this.numeroRG = numeroRG;
	}

	public String getNumeroCPF() {
		return numeroCPF;
	}

	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
