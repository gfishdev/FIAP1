package br.com.fiap.fundamentosJavaUml.aula4;

import java.util.ArrayList;

public class Grupo<T> {
	ArrayList elementos;

	public Grupo() {
		elementos = new ArrayList();
	}

	public void add(T obj) {
		elementos.add(obj);
	}

	public void remove(T obj) {
		elementos.remove(obj);
	}
}