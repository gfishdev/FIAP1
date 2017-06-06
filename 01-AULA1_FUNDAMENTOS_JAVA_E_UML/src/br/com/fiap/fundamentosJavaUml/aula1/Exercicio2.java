package br.com.fiap.fundamentosJavaUml.aula1;

public class Exercicio2 {
	public static String getBinario(int numero) {
		if (numero == 0) {
			return "0";
		}
		String retorno = "";
		while (numero > 0) {
			retorno = (numero % 2) + retorno;
			numero = numero / 2;
		}
		return retorno;
	}

}
