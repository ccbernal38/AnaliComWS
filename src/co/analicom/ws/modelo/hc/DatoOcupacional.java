package co.analicom.ws.modelo.hc;

import java.util.Date;

public class DatoOcupacional {

	private String Biologicos, Ergonomicos, Fisicos, Otros, Psicosociales, Quimicos, Seguridad;

	private int fk_IDT_DocumentoID, fk_NIT, TiempoExposicion;
	
	private Date FechaDeDiligenciamiento,  FechaDeModificacion;
	
	public DatoOcupacional() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param biologicos
	 * @param ergonomicos
	 * @param fisicos
	 * @param otros
	 * @param psicosociales
	 * @param quimicos
	 * @param seguridad
	 * @param fk_IDT_DocumentoID
	 * @param fk_NIT
	 * @param tiempoExposicion
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public DatoOcupacional(String biologicos, String ergonomicos, String fisicos, String otros, String psicosociales,
			String quimicos, String seguridad, int fk_IDT_DocumentoID, int fk_NIT, int tiempoExposicion,
			Date fechaDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		Biologicos = biologicos;
		Ergonomicos = ergonomicos;
		Fisicos = fisicos;
		Otros = otros;
		Psicosociales = psicosociales;
		Quimicos = quimicos;
		Seguridad = seguridad;
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
		this.fk_NIT = fk_NIT;
		TiempoExposicion = tiempoExposicion;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
	}

	/**
	 * @return the biologicos
	 */
	public String getBiologicos() {
		return Biologicos;
	}

	/**
	 * @param biologicos the biologicos to set
	 */
	public void setBiologicos(String biologicos) {
		Biologicos = biologicos;
	}

	/**
	 * @return the ergonomicos
	 */
	public String getErgonomicos() {
		return Ergonomicos;
	}

	/**
	 * @param ergonomicos the ergonomicos to set
	 */
	public void setErgonomicos(String ergonomicos) {
		Ergonomicos = ergonomicos;
	}

	/**
	 * @return the fisicos
	 */
	public String getFisicos() {
		return Fisicos;
	}

	/**
	 * @param fisicos the fisicos to set
	 */
	public void setFisicos(String fisicos) {
		Fisicos = fisicos;
	}

	/**
	 * @return the otros
	 */
	public String getOtros() {
		return Otros;
	}

	/**
	 * @param otros the otros to set
	 */
	public void setOtros(String otros) {
		Otros = otros;
	}

	/**
	 * @return the psicosociales
	 */
	public String getPsicosociales() {
		return Psicosociales;
	}

	/**
	 * @param psicosociales the psicosociales to set
	 */
	public void setPsicosociales(String psicosociales) {
		Psicosociales = psicosociales;
	}

	/**
	 * @return the quimicos
	 */
	public String getQuimicos() {
		return Quimicos;
	}

	/**
	 * @param quimicos the quimicos to set
	 */
	public void setQuimicos(String quimicos) {
		Quimicos = quimicos;
	}

	/**
	 * @return the seguridad
	 */
	public String getSeguridad() {
		return Seguridad;
	}

	/**
	 * @param seguridad the seguridad to set
	 */
	public void setSeguridad(String seguridad) {
		Seguridad = seguridad;
	}

	/**
	 * @return the fk_IDT_DocumentoID
	 */
	public int getFk_IDT_DocumentoID() {
		return fk_IDT_DocumentoID;
	}

	/**
	 * @param fk_IDT_DocumentoID the fk_IDT_DocumentoID to set
	 */
	public void setFk_IDT_DocumentoID(int fk_IDT_DocumentoID) {
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
	}

	/**
	 * @return the fk_NIT
	 */
	public int getFk_NIT() {
		return fk_NIT;
	}

	/**
	 * @param fk_NIT the fk_NIT to set
	 */
	public void setFk_NIT(int fk_NIT) {
		this.fk_NIT = fk_NIT;
	}

	/**
	 * @return the tiempoExposicion
	 */
	public int getTiempoExposicion() {
		return TiempoExposicion;
	}

	/**
	 * @param tiempoExposicion the tiempoExposicion to set
	 */
	public void setTiempoExposicion(int tiempoExposicion) {
		TiempoExposicion = tiempoExposicion;
	}

	/**
	 * @return the fechaDeDiligenciamiento
	 */
	public Date getFechaDeDiligenciamiento() {
		return FechaDeDiligenciamiento;
	}

	/**
	 * @param fechaDeDiligenciamiento the fechaDeDiligenciamiento to set
	 */
	public void setFechaDeDiligenciamiento(Date fechaDeDiligenciamiento) {
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
	}

	/**
	 * @return the fechaDeModificacion
	 */
	public Date getFechaDeModificacion() {
		return FechaDeModificacion;
	}

	/**
	 * @param fechaDeModificacion the fechaDeModificacion to set
	 */
	public void setFechaDeModificacion(Date fechaDeModificacion) {
		FechaDeModificacion = fechaDeModificacion;
	}
	
	

}
