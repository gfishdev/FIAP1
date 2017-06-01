package br.com.fiap.fundamentosJavaUml.aula2;

public class Main {

	public static void main(String[] args) {

		Funcionario guilherme = new Funcionario();
		guilherme.setNome("Guilherme");
		guilherme.setSalario(1000000);

		System.out.println(guilherme.getNome() + ", Salário = " + guilherme.getSalario());

		ContaEspecial conta = new ContaEspecial("Guilherme", "Rua X, 0", "123.456.789-10");
		conta.deposita(500000);
		System.out.println(conta);
		conta.saque(20);
		System.out.println(conta);
		System.out.println("BAIXO: " + Classificacao.BAIXO.isCompatible(conta));
		System.out.println("MEDIO: " + Classificacao.MEDIO.isCompatible(conta));
		System.out.println("POTENCIAL: " + Classificacao.POTENCIAL.isCompatible(conta));

		ContaPoupanca poupanca = new ContaPoupanca("Guilherme", "Rua X, 0", "123.456.789-10");
		poupanca.deposita(300000);
		System.out.println(poupanca);
		System.out.println("BAIXO: " + Classificacao.BAIXO.isCompatible(poupanca));
		System.out.println("MEDIO: " + Classificacao.MEDIO.isCompatible(poupanca));
		System.out.println("POTENCIAL: " + Classificacao.POTENCIAL.isCompatible(poupanca));

	}

}
