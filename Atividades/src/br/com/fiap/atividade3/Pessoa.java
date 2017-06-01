package br.com.fiap.atividade3;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private int idade;
	private char sexo;
	private String empresa;

	public Pessoa(String nome, int idade, char sexo, String empresa) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return this.nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.nome.compareTo(o.getNome()) * -1;
	}

}
