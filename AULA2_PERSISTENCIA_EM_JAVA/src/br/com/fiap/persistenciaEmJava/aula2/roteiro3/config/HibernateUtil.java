package br.com.fiap.persistenciaEmJava.aula2.roteiro3.config;

import javax.security.auth.login.Configuration;

import org.hibernate.SessionFactory;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}