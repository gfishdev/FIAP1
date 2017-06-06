package br.com.fiap.fundamentosJavaUml.aula2;

public class ContaEspecial extends ContaBancaria {

	public ContaEspecial(String nomeCliente, String endCliente, String cpfCliente) {
		super(nomeCliente, endCliente, cpfCliente);
	}

	@Override
	public void deposita(double valor) {
		super.deposita(valor - (valor * 0.1));
	}

	@Override
	public void saque(double valor) {
		super.saque(valor + (valor * 0.1));
	}
}
