/**
 * 
 */
package co.analicom.ws.modelo.hc;

import java.util.Date;

/**
 * @author Christian Bernal
 */
public class Accidente {

	private String AccidentesDeTrabajo, ARL, Descripcion, Diagnostico, Empresa, EnfermedadProfesional, Lesion,
			Reubicacion, Secuelas;
	private int DiasIncapacidad, _fk_IDT_DocumentoID;
	private Date FechaDeDiligenciamiento, FechaDeModificacion;

	/**
	 * 
	 */
	public Accidente() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param accidentesDeTrabajo
	 * @param aRL
	 * @param descripcion
	 * @param diagnostico
	 * @param empresa
	 * @param enfermedadProfesional
	 * @param lesion
	 * @param reubicacion
	 * @param secuelas
	 * @param diasIncapacidad
	 * @param _fk_IDT_DocumentoID
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public Accidente(String accidentesDeTrabajo, String aRL, String descripcion, String diagnostico, String empresa,
			String enfermedadProfesional, String lesion, String reubicacion, String secuelas, int diasIncapacidad,
			int _fk_IDT_DocumentoID, Date fechaDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		AccidentesDeTrabajo = accidentesDeTrabajo;
		ARL = aRL;
		Descripcion = descripcion;
		Diagnostico = diagnostico;
		Empresa = empresa;
		EnfermedadProfesional = enfermedadProfesional;
		Lesion = lesion;
		Reubicacion = reubicacion;
		Secuelas = secuelas;
		DiasIncapacidad = diasIncapacidad;
		this._fk_IDT_DocumentoID = _fk_IDT_DocumentoID;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
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
		return Empresa;
	}

	/**
	 * @param empresa
	 *            the empresa to set
	 */
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}

	/**
	 * @return the enfermedadProfesional
	 */
	public String getEnfermedadProfesional() {
		return EnfermedadProfesional;
	}

	/**
	 * @param enfermedadProfesional
	 *            the enfermedadProfesional to set
	 */
	public void setEnfermedadProfesional(String enfermedadProfesional) {
		EnfermedadProfesional = enfermedadProfesional;
	}

	/**
	 * @return the lesion
	 */
	public String getLesion() {
		return Lesion;
	}

	/**
	 * @param lesion
	 *            the lesion to set
	 */
	public void setLesion(String lesion) {
		Lesion = lesion;
	}

	/**
	 * @return the reubicacion
	 */
	public String getReubicacion() {
		return Reubicacion;
	}

	/**
	 * @param reubicacion
	 *            the reubicacion to set
	 */
	public void setReubicacion(String reubicacion) {
		Reubicacion = reubicacion;
	}

	/**
	 * @return the secuelas
	 */
	public String getSecuelas() {
		return Secuelas;
	}

	/**
	 * @param secuelas
	 *            the secuelas to set
	 */
	public void setSecuelas(String secuelas) {
		Secuelas = secuelas;
	}

	/**
	 * @return the diasIncapacidad
	 */
	public int getDiasIncapacidad() {
		return DiasIncapacidad;
	}

	/**
	 * @param diasIncapacidad
	 *            the diasIncapacidad to set
	 */
	public void setDiasIncapacidad(int diasIncapacidad) {
		DiasIncapacidad = diasIncapacidad;
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
		return FechaDeDiligenciamiento;
	}

	/**
	 * @param fechaDeDiligenciamiento
	 *            the fechaDeDiligenciamiento to set
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
	 * @param fechaDeModificacion
	 *            the fechaDeModificacion to set
	 */
	public void setFechaDeModificacion(Date fechaDeModificacion) {
		FechaDeModificacion = fechaDeModificacion;
	}

}
