package br.com.fiap.fundamentosJavaUml.aula5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) {
		// ExemploThread t1 = new ExemploThread();
		// ExemploThread t2 = new ExemploThread();
		// ExemploThread t3 = new ExemploThread();
		// ExemploThread t4 = new ExemploThread();
		// ExemploThread t5 = new ExemploThread();
		//
		// t1.setName("T1");
		// t1.start();
		//
		// t2.setName("T2");
		// t2.start();
		//
		// t3.setName("T3");
		// t3.start();
		//
		// t4.setName("T4");
		// t4.start();
		//
		// t5.setName("T5");
		// t5.start();

		// try {
		// ThreadExemplo t = new ThreadExemplo();
		// t.start();
		// Thread.sleep(3000);
		// t.interrupt();
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		// try {
		// Escritor escritor1 = new Escritor("1", 1);
		// Escritor escritor2 = new Escritor("2", 2);
		// Escritor escritor3 = new Escritor("3", 3);
		// Escritor escritor4 = new Escritor("4", 4);
		//
		// escritor1.start();
		// escritor2.start();
		// escritor3.start();
		// escritor4.start();
		// } catch (Exception e) {
		// e.getStackTrace();
		// }

		// Cavalo cavalo1 = new Cavalo("Cavalo 1");
		// Cavalo cavalo2 = new Cavalo("Cavalo 2");
		// Cavalo cavalo3 = new Cavalo("Cavalo 3");
		// Cavalo cavalo4 = new Cavalo("Cavalo 4");
		// Cavalo cavalo5 = new Cavalo("Cavalo 5");
		//
		// Thread t1 = new Thread(cavalo1);
		// Thread t2 = new Thread(cavalo2);
		// Thread t3 = new Thread(cavalo3);
		// Thread t4 = new Thread(cavalo4);
		// Thread t5 = new Thread(cavalo5);
		//
		// t1.start();
		// t2.start();
		// t3.start();
		// t1.start();
		// t1.start();

		// try {
		// ExecutorService executor4 = Executors.newWorkStealingPool();
		// ExecutorService executor5 = Executors.newWorkStealingPool();
		//
		// Cavalo2 cavalo1 = new Cavalo2("Trovão");
		// Cavalo2 cavalo2 = new Cavalo2("Malhado");
		// Cavalo2 cavalo3 = new Cavalo2("Papai-Noel");
		// Cavalo2 cavalo4 = new Cavalo2("Campeão");
		// Cavalo2 cavalo5 = new Cavalo2("Bola");
		// Cavalo2 cavalo6 = new Cavalo2("Preto");
		//
		// List<Callable<String>> callables = Arrays.asList(cavalo1, cavalo2,
		// cavalo3, cavalo4, cavalo5, cavalo6);
		//
		// System.out.println("Aguarando somente o vencedor...");
		// String resultado = executor5.invokeAny(callables);
		// System.out.println("Vencedor: " + resultado);
		//
		// System.out.println("Aguarando a execução de todos...");
		// executor4.invokeAll(callables).stream().map(future -> {
		// try {
		// return future.get();
		// } catch (Exception e) {
		// throw new IllegalStateException(e);
		// }
		// }).forEach(System.out::println);
		//
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// } catch (ExecutionException e) {
		// e.printStackTrace();
		// }

		try {

			// Path origem = Paths.get("FilesToCopy");
			// Path destino = Paths.get("CopiedFiles");
			// Files.walkFileTree(origem, new
			// CopiarArquivosRecursivamente(destino));
			Files.list(Paths.get("c:\\windows")).filter(p -> p.toString().endsWith(".exe"))
					.forEach(System.out::println);

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
