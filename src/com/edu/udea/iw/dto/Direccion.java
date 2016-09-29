package com.edu.udea.iw.dto;

public class Direccion {

	//La clave primaria es compuesta 
	//Creo un dto que contanga los campos de la clace primaria 
	private DireccionID id;
	private String direccion;
	private Ciudad ciudad;
	private String telefono;
	private boolean preferida;
	public DireccionID getId() {
		return id;
	}
	public void setId(DireccionID id) {
		this.id = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public boolean isPreferida() {
		return preferida;
	}
	public void setPreferida(boolean preferida) {
		this.preferida = preferida;
	}
	
	
	
}
