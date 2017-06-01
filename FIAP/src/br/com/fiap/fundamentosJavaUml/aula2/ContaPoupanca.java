package br.com.fiap.fundamentosJavaUml.aula2;

public class ContaPoupanca extends ContaBancaria implements Tributacao {
	private int diaAniversario;

	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente) {
		super(nomeCliente, endCliente, cpfCliente);
	}

	@Override
	public void saque(double valor) {
		saldo -= valor - 0.10;
	}

	@Override
	public double calcularTributo() {
		return this.saldo * 0.03;
	}
}