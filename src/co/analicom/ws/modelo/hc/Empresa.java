package co.analicom.ws.modelo.hc;

import java.util.Date;

public class Empresa {
	
	private String ActividadEconomica, direccion, Nombre, telefono;
	private int fk_IDT_DocumentoID, nit, pk_nit;
	private Date FechaDeDiligenciamiento, FechaDeModificacion;
	
	/**
	 * @param actividadEconomica
	 * @param direccion
	 * @param nombre
	 * @param telefono
	 * @param fk_IDT_DocumentoID
	 * @param nit
	 * @param pk_nit
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public Empresa(String actividadEconomica, String direccion, String nombre, String telefono, int fk_IDT_DocumentoID,
			int nit, int pk_nit, Date fechaDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		ActividadEconomica = actividadEconomica;
		this.direccion = direccion;
		Nombre = nombre;
		this.telefono = telefono;
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
		this.nit = nit;
		this.pk_nit = pk_nit;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
	}
	
	
	public Empresa() {
		// TODO Auto-generated constructor stub
	}
	
	public String getActividadEconomica() {
		return ActividadEconomica;
	}
	public void setActividadEconomica(String actividadEconomica) {
		ActividadEconomica = actividadEconomica;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getFk_IDT_DocumentoID() {
		return fk_IDT_DocumentoID;
	}
	public void setFk_IDT_DocumentoID(int fk_IDT_DocumentoID) {
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
	}
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit = nit;
	}
	public int getPk_nit() {
		return pk_nit;
	}
	public void setPk_nit(int pk_nit) {
		this.pk_nit = pk_nit;
	}
	public Date getFechaDeDiligenciamiento() {
		return FechaDeDiligenciamiento;
	}
	public void setFechaDeDiligenciamiento(Date fechaDeDiligenciamiento) {
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
	}
	public Date getFechaDeModificacion() {
		return FechaDeModificacion;
	}
	public void setFechaDeModificacion(Date fechaDeModificacion) {
		FechaDeModificacion = fechaDeModificacion;
	}
	
	
}
