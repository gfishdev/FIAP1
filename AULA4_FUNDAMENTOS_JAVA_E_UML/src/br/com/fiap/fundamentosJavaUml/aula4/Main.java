package br.com.fiap.fundamentosJavaUml.aula4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// Grupo<String> grupo = new Grupo<>();
		// Grupo<Integer> grupo2 = new Grupo<>();
		//
		// grupo.add("");
		// grupo2.add(2);
		//
		// Set<String> nomes = new HashSet<String>();
		//
		// nomes.add("Maria");
		// nomes.add("José");
		// nomes.add("Henrique");
		// nomes.add("Matias");
		// nomes.add("Nascimento");
		// nomes.add("Maria");
		//
		// System.out.println(nomes);
		// System.out.println(nomes.contains("José"));
		//
		// Map<Integer, String> nomes2 = new HashMap<>();
		//
		// nomes2.put(1, "Maria");
		// nomes2.put(2, "José");
		// nomes2.put(3, "Henrique");
		// nomes2.put(4, "Matias");
		// nomes2.put(5, "Nascimento");
		// nomes2.put(6, "Maria");
		//
		// System.out.println(nomes2);
		// System.out.println(nomes2.get(2));
		//
		// try {
		// Properties prop = new Properties(System.getProperties());
		// System.out.println("Propriedade testando " +
		// prop.getProperty("testando"));
		//
		// FileInputStream arquivoPropr;
		// arquivoPropr = new FileInputStream("propriedades.properties");
		// prop = new Properties(System.getProperties());
		// prop.setProperty("testando", "1");
		//
		// prop.load(arquivoPropr);
		// System.setProperties(prop);
		//
		// System.out.println(prop);
		// } catch (IOException e) {
		//
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
		// Cliente cliente3 = new Cliente(774, "Matias");
		// Cliente cliente1 = new Cliente(4, "João");
		// Cliente cliente2 = new Cliente(3, "Maria");
		// Cliente cliente4 = new Cliente(28, "Marcelo");
		// listaCliente.add(cliente1);
		// listaCliente.add(cliente2);
		// listaCliente.add(cliente3);
		// listaCliente.add(cliente4);
		// System.out.println(listaCliente);
		// Collections.sort(listaCliente);
		// System.out.println(listaCliente);

		// ArrayList<String> lista1 = new ArrayList<>();
		// LinkedList<String> lista2 = new LinkedList<>();
		//
		// Collections.sort(lista1, (o1, o2) -> o1.compareTo(o2));

		ArrayList<Cliente> clientes = new ArrayList<>();
		clientes.add(new Cliente("João"));
		clientes.add(new Cliente("Maria"));
		clientes.forEach(u -> System.out.println(u.getNome()));

		clientes.forEach(u -> u.ativar());

		clientes.forEach(Cliente::ativar);

		clientes.sort(Comparator.comparing(Cliente::getNome));
		
		
	}
}