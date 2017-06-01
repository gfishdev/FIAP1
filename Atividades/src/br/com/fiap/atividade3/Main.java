package br.com.fiap.atividade3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		try {
			String toCript = JOptionPane.showInputDialog("Digite o texto a ser criptografado.");
			if (toCript != null) {
				StringBuilder str1 = new StringBuilder(toCript);
				for (int i = 0; i < str1.length(); i++) {
					Character toChange = str1.charAt(i);
					str1.setCharAt(i, (char) (toChange + 1));
				}
				
				StringBuilder str2 = new StringBuilder(str1.toString());
				for (int i = 0; i < str2.length(); i++) {
					Character toChange = str2.charAt(i);
					str2.setCharAt(i, (char) (toChange - 1));
				}

				Path path1 = Paths.get("mensagemCodificada.txt");
				Path path2 = Paths.get("mesagemDecodificada.txt");
				Files.write(path1, Arrays.asList(str1), Charset.forName("UTF-8"));
				Files.write(path2, Arrays.asList(str2), Charset.forName("UTF-8"));

			} else {
				JOptionPane.showMessageDialog(null, "Texto inválido.");
			}
		} catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Ocorreu um erro");
		}
	}

}
