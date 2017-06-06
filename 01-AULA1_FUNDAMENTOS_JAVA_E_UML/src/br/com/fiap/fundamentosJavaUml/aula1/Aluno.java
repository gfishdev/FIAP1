package br.com.fiap.fundamentosJavaUml.aula1;

public class Aluno {
	private int codigoAluno;
	private String nomeAluno;
	
	public Aluno() {
		
	}
	
	public Aluno(int codigoAluno, String nomeAluno) {
		this.codigoAluno = codigoAluno;
		this.nomeAluno = nomeAluno;
	}
	
	public int getCodigoAluno() {
		return codigoAluno;
	}
	
	public void setCodigoAluno(int codigoAluno) {
		this.codigoAluno = codigoAluno;
	}
	
	public String nomeAluno() {
		return nomeAluno;
	}
	
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	@Override
	public String toString() {
		return "[Nome do Aluno = '" + this.nomeAluno + "', Codigo do Aluno = " + this.codigoAluno + "]";
	}

}
