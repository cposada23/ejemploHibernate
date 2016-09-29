package com.edu.udea.iw.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.edu.udea.iw.exeption.MyDaoExeption;

/**
 * Para entregar sessines activas a la base de datos
 * @author cposa
 *
 */
public class DataSource {
	
	private static DataSource instancia;
	private SessionFactory sessionFactory;
	private DataSource(){
		
	}
	
	/**
	 * Entrega una inancia del datasouce siguiendo el patron singleton
	 * @return
	 */
	public static DataSource getInstance(){
		if(instancia == null){
			instancia = new DataSource();
		}
		return instancia;
	}

	public Session getSession() throws MyDaoExeption{
		
		try {
			if(sessionFactory == null){
				Configuration configuration = new Configuration();
				configuration.configure("hibernate.cfg.xml"); //Aqui va el archivo de configuracion de hibernate 
				sessionFactory = configuration.buildSessionFactory();
				
			}
			
			return sessionFactory.openSession(); //
		} catch (HibernateException e) {
			throw new MyDaoExeption(e);
		}
		
	}
}

