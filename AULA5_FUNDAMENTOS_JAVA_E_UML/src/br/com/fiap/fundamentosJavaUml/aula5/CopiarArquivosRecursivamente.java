package br.com.fiap.fundamentosJavaUml.aula5;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.FileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class CopiarArquivosRecursivamente implements FileVisitor<Path> {
	private Path destino;

	private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.txt");

	public CopiarArquivosRecursivamente(Path destino) {
		super();
		this.destino = destino;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println("Analisando " + file.getFileName() + "...");
		if (matcher.matches(file.getFileName())) {
			System.out.println("Copiando " + file.getFileName() + "...");
			Files.copy(file, destino.resolve(file.getFileName()), StandardCopyOption.REPLACE_EXISTING);
		}
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("Analisando diretório " + dir.getFileName() + "...");
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		return FileVisitResult.CONTINUE;
	}
}
