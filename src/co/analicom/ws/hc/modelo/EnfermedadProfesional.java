/**
 * 
 */
package co.analicom.ws.hc.modelo;

import java.util.Date;

/**
 * @author Christian Bernal
 */
public class EnfermedadProfesional {

	private String AccidentesDeTrabajo, ARL, Descripcion, Diagnostico, empresa, enfermedadProfesional, reubicacion;
	private int _fk_IDT_DocumentoID;
	private Date fechaDeDiligenciamiento, FechaDeModificacion;

	/**
	 * 
	 */
	public EnfermedadProfesional() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accidentesDeTrabajo
	 * @param aRL
	 * @param descripcion
	 * @param diagnostico
	 * @param empresa
	 * @param enfermedadProfesional
	 * @param reubicacion
	 * @param _fk_IDT_DocumentoID
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public EnfermedadProfesional(String accidentesDeTrabajo, String aRL, String descripcion, String diagnostico,
			String empresa, String enfermedadProfesional, String reubicacion, int _fk_IDT_DocumentoID,
			Date fechaDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		AccidentesDeTrabajo = accidentesDeTrabajo;
		ARL = aRL;
		Descripcion = descripcion;
		Diagnostico = diagnostico;
		this.empresa = empresa;
		this.enfermedadProfesional = enfermedadProfesional;
		this.reubicacion = reubicacion;
		this._fk_IDT_DocumentoID = _fk_IDT_DocumentoID;
		this.fechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
	}

	/**
	 * @return the accidentesDeTrabajo
	 */
	public String getAccidentesDeTrabajo() {
		return AccidentesDeTrabajo;
	}

	/**
	 * @param accidentesDeTrabajo
	 *            the accidentesDeTrabajo to set
	 */
	public void setAccidentesDeTrabajo(String accidentesDeTrabajo) {
		AccidentesDeTrabajo = accidentesDeTrabajo;
	}

	/**
	 * @return the aRL
	 */
	public String getARL() {
		return ARL;
	}

	/**
	 * @param aRL
	 *            the aRL to set
	 */
	public void setARL(String aRL) {
		ARL = aRL;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return Descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	/**
	 * @return the diagnostico
	 */
	public String getDiagnostico() {
		return Diagnostico;
	}

	/**
	 * @param diagnostico
	 *            the diagnostico to set
	 */
	public void setDiagnostico(String diagnostico) {
		Diagnostico = diagnostico;
	}

	/**
	 * @return the empresa
	 */
	public String getEmpresa() {
		return empresa;
	}

	/**
	 * @param empresa
	 *            the empresa to set
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	/**
	 * @return the enfermedadProfesional
	 */
	public String getEnfermedadProfesional() {
		return enfermedadProfesional;
	}

	/**
	 * @param enfermedadProfesional
	 *            the enfermedadProfesional to set
	 */
	public void setEnfermedadProfesional(String enfermedadProfesional) {
		this.enfermedadProfesional = enfermedadProfesional;
	}

	/**
	 * @return the reubicacion
	 */
	public String getReubicacion() {
		return reubicacion;
	}

	/**
	 * @param reubicacion
	 *            the reubicacion to set
	 */
	public void setReubicacion(String reubicacion) {
		this.reubicacion = reubicacion;
	}

	/**
	 * @return the _fk_IDT_DocumentoID
	 */
	public int get_fk_IDT_DocumentoID() {
		return _fk_IDT_DocumentoID;
	}

	/**
	 * @param _fk_IDT_DocumentoID
	 *            the _fk_IDT_DocumentoID to set
	 */
	public void set_fk_IDT_DocumentoID(int _fk_IDT_DocumentoID) {
		this._fk_IDT_DocumentoID = _fk_IDT_DocumentoID;
	}

	/**
	 * @return the fechaDeDiligenciamiento
	 */
	public Date getFechaDeDiligenciamiento() {
		return fechaDeDiligenciamiento;
	}

	/**
	 * @param fechaDeDiligenciamiento
	 *            the fechaDeDiligenciamiento to set
	 */
	public void setFechaDeDiligenciamiento(Date fechaDeDiligenciamiento) {
		this.fechaDeDiligenciamiento = fechaDeDiligenciamiento;
	}

	/**
	 * @return the fechaDeModificacion
	 */
	public Date getFechaDeModificacion() {
		return FechaDeModificacion;
	}

	/**
	 * @param fechaDeModificacion
	 *            the fechaDeModificacion to set
	 */
	public void setFechaDeModificacion(Date fechaDeModificacion) {
		FechaDeModificacion = fechaDeModificacion;
	}

}
