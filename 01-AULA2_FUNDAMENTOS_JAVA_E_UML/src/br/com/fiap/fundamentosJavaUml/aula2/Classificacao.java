package br.com.fiap.fundamentosJavaUml.aula2;

public enum Classificacao {
	POTENCIAL(400_000.00, 500_000.00), MEDIO(200_000.00, 400_000.00), BAIXO(1.0, 200_000.00);

	private double min;
	private double max;

	Classificacao(double min, double max) {
		this.min = min;
		this.max = max;
	}

	public double getMin() {
		return min;
	}

	public double getMax() {
		return max;
	}

	public boolean isCompatible(ContaBancaria conta) {
		if (conta.getSaldo() >= this.getMin() && conta.getSaldo() <= this.getMax()) {
			return true;
		}
		return false;

	}

}
