package com.edu.udea.iw.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import com.edu.udea.iw.dao.CiudadDao;
import com.edu.udea.iw.dao.DataSource;
import com.edu.udea.iw.dto.Ciudad;
import com.edu.udea.iw.exeption.MyDaoExeption;

public class CiudadDadoImpHibernate implements CiudadDao {

	@Override
	public List<Ciudad> obtener() throws MyDaoExeption {
		
		Session session = null;
		List<Ciudad> resultado = null;
		
		try {
			session = DataSource.getInstance().getSession();
			Criteria criteria =  session.createCriteria(Ciudad.class);
			resultado = criteria.list();
		} catch (HibernateException	 e) {
			throw new MyDaoExeption(e);
		}
		
		return resultado;
		
	}

	@Override
	public Ciudad obtener(long codigo) throws MyDaoExeption {
		Session session = null;
		Ciudad ciudad = null;
		
		try {
			session = DataSource.getInstance().getSession();
			Criteria criteria =  session.createCriteria(Ciudad.class).add(Restrictions.eq("Codigo", codigo));
			ciudad = (Ciudad)criteria.uniqueResult();
			// Hay otras dos formas de hacerla Consultarlo!
		} catch (HibernateException	 e) {
			throw new MyDaoExeption(e);
		}
		
		return ciudad;
	}

	@Override
	public void guardar(Ciudad ciudad) throws MyDaoExeption {
		Session session = null;
		
		
		try {
			
			session = DataSource.getInstance().getSession();
			session.save(ciudad); 
			
		} catch (HibernateException	 e) {
			throw new MyDaoExeption(e);
		}
		
	
		
	}

	@Override
	public void modificar(Ciudad ciudad) throws MyDaoExeption {
		Session session = null;
		
		
		try {
			
			session = DataSource.getInstance().getSession();
			session.update(ciudad); 
			
		} catch (HibernateException	 e) {
			throw new MyDaoExeption(e);
		}
		
		
	}

	@Override
	public void eliminar(long codigo) throws MyDaoExeption {
		Session session = null;
		Ciudad ciudad = new Ciudad();
		ciudad.setCodigo(codigo);
		
		try {
			
			session = DataSource.getInstance().getSession();
			session.delete(ciudad); 
			
		} catch (HibernateException	 e) {
			throw new MyDaoExeption(e);
		}
		
	}
	
	

	

}
