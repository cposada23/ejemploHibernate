package com.edu.udea.iw.dao;

import java.util.List;

import com.edu.udea.iw.dto.Cliente;
import com.edu.udea.iw.exeption.MyDaoExeption;

public interface ClienteDao {

	/**
	 * Permite crear un cliente nuevo en la base de datos
	 * @param cliente
	 * @throws MyDaoExeption
	 */
	public void crear(Cliente cliente) throws MyDaoExeption;
	
	/**
	 * Obtiene todos los clientes de la base de datos
	 * @throws MyDaoExeption
	 */
	public List<Cliente> obtener() throws MyDaoExeption;
	
	/**
	 * Elimina un cliente de la base de datos
	 * @throws MyDaoExeption
	 */
	public void eliminar(String cedula) throws MyDaoExeption;
	
	/**
	 * Se obtiene un cliente dada su cedula
	 * @param cedula
	 * @throws MyDaoExeption
	 */
	public Cliente obtenerPorCedula(String cedula) throws MyDaoExeption;
}
