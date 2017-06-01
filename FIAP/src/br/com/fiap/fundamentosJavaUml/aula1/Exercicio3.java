package br.com.fiap.fundamentosJavaUml.aula1;

public class Exercicio3 {

	public static void main(String[] args) {
		int[] array = { 3, 5, 89, 546, 1, 7, 9, 30, 54, 30, 80 };
		Exercicio3.getResult(array);
	}

	public static void getResult(int[] array) {
		Integer min = null;
		Integer max = null;
		Double med = 0d;
		Double som = 0d;

		for (Integer i : array) {
			min = min == null || i < min ? i : min;
			max = max == null || i > max ? i : max;
			som += i;
		}

		med = som / array.length;

		System.out.println("O valor mínimo é: " + min);
		System.out.println("O valor máximo é: " + max);
		System.out.println("O valor médio é: " + med);
		System.out.println("O valor total somado é: " + som);
		System.out.println("--");

	}

}
