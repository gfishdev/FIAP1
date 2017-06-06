package br.com.fiap.fundamentosJavaUml.aula4;

import java.time.LocalDateTime;

public class Cliente implements Comparable<Cliente> {
	private int identificacao;
	private String nome;
	private int idade;
	private LocalDateTime primeiraCompra;

	public LocalDateTime getPrimeiraCompra() {
		return primeiraCompra;
	}

	public void setPrimeiraCompra(LocalDateTime primeiraCompra) {
		this.primeiraCompra = primeiraCompra;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	private boolean ativo;

	public Cliente(int identificacao, String nome) {
		super();
		this.identificacao = identificacao;
		this.nome = nome;
	}

	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public Cliente(String nome, int idade, boolean ativo, LocalDateTime primeiraCompra) {
		this(nome);
		this.idade = idade;
		this.ativo = ativo;
		this.primeiraCompra = primeiraCompra;
	}

	public void ativar() {
		ativo = !ativo ? !ativo : ativo;
	}

	public void inativar() {
		ativo = ativo ? !ativo : ativo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdentificacao() {
		return identificacao;
	}

	@Override
	public String toString() {
		return "Cliente [identificacao=" + identificacao + ", nome=" + nome + ", idade=" + idade + ", primeiraCompra="
				+ primeiraCompra + ", ativo=" + ativo + "]";
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

	public int compareTo(Cliente outroCliente) {
		if (this.identificacao < outroCliente.identificacao) {
			return -1;
		}
		if (this.identificacao > outroCliente.identificacao) {
			return 1;
		}
		return 0;
	}
}