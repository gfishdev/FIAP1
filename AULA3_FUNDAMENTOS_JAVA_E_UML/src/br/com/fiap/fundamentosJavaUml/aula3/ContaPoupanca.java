package br.com.fiap.fundamentosJavaUml.aula3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContaPoupanca extends ContaBancaria implements Tributacao {
	private int diaAniversario;

	public ContaPoupanca(String nomeCliente, String endCliente, String cpfCliente, LocalDate dataNascimento,
			LocalDate dataCriacao) {
		super(nomeCliente, endCliente, cpfCliente, dataNascimento, dataCriacao);
	}

	@Override
	public void saque(double valor) throws SaldoInsuficienteException {
		if (ChronoUnit.YEARS.between(getDataCriacao(), LocalDate.now()) < 0) {
			valor += 0.10 + (valor * 0.01);
			System.out.println("valor menos de um ano: " + valor);
		} else {
			valor += 0.10;
			System.out.println("valor mais de um ano: " + valor);
		}
		if (saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente");
		} else {
			saldo -= valor;
		}
	}

	@Override
	public double calcularTributo() {
		return this.saldo * 0.03;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ContaBancaria) {
			ContaBancaria contaToCompare = (ContaBancaria) obj;
			return this.getCpfCliente().equals(contaToCompare.getCpfCliente());
		} else {
			return false;
		}
	}
}