package com.edu.udea.iw.dao;

import java.util.List;

import com.edu.udea.iw.dto.Ciudad;
import com.edu.udea.iw.exeption.MyDaoExeption;

/**
 * Define los metodos para acceder a las ciudades
 * @author cposa
 *
 */
public interface CiudadDao {
	/**
	 * Entrega la lista de ciudades disponibles en la base de datos
	 * @return Lista de ciudades
	 * @throws MyDaoExeption Cuando hay algun problema de conexión
	 */
	public List<Ciudad> obtener() throws MyDaoExeption;
	
	/**
	 * Entrega los datos de una ciudad dado su codigo
	 * @param codigo
	 * @return
	 * @throws MyDaoExeption
	 */
	public Ciudad obtener(long codigo) throws MyDaoExeption;

	/** 
	 * Permite crear una nueva ciudad en la base de datos
	 * @param ciudad
	 * @throws MyDaoExeption
	 */
	public void guardar(Ciudad ciudad) throws MyDaoExeption;
	
	/**
	 * Permite modificar una cidudad de la base de datos
	 * @param ciudad
	 * @throws MyDaoExeption
	 */
	public void modificar(Ciudad ciudad) throws MyDaoExeption;
	
	/**
	 * Elimina una ciudad dado su codigo de la base de datos
	 * @param codigo
	 * @throws MyDaoExeption
	 */
	public void eliminar(long codigo) throws MyDaoExeption;
	
	
	
}
