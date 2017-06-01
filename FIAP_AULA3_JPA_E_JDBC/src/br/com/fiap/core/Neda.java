package br.com.fiap.core;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Forum;

/**
 * NEDA_SUA_CONTA :D
 * 
 * @author notin
 *
 */
public class Neda {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FIAP_AULA3_JPA_E_JDBC");

		EntityManager em = entityManagerFactory.createEntityManager();

		ForumHelper fHelper = new ForumHelper(em);

		Forum forum = new Forum();
		forum.setAssunto("Java Persistence");
		forum.setDescricao("Discuss�o de JPA.");

		System.out.println(fHelper.salvar(forum));
	}

}
