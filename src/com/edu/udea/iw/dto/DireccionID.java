package com.edu.udea.iw.dto;

import java.io.Serializable;

/**
 * clase para mapear claves primarias porque es compuesta
 * @author cposa
 *
 */
public class DireccionID implements Serializable { // LOs que son para claves primarias compuestas tienen que implementar serializables
	
	private Cliente cliente;
	private Integer codigo;
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
