/**
 * 
 */
package co.analicom.ws.hc.modelo;

import java.util.Date;

/**
 * @author Christian Bernal
 */
public class ManipulacionAlimentos {

	private String DermatologicoA, DermatologicoB, DermatologicoBCual, Lesiones, Observaciones, Respiratorio, Respiratorio_Ascultacion, Respiratorio_Inspeccion, Solicitado;

	private int _fk_IDT_DocumentoID;

	private Date FechaDeDiligenciamiento, FechaDeModificacion;

	/**
	 * 
	 */
	public ManipulacionAlimentos() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param dermatologicoA
	 * @param dermatologicoB
	 * @param dermatologicoBCual
	 * @param lesiones
	 * @param observaciones
	 * @param respiratorio
	 * @param respiratorio_Ascultacion
	 * @param respiratorio_Inspeccion
	 * @param solicitado
	 * @param _fk_IDT_DocumentoID
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public ManipulacionAlimentos(String dermatologicoA, String dermatologicoB, String dermatologicoBCual,
			String lesiones, String observaciones, String respiratorio, String respiratorio_Ascultacion,
			String respiratorio_Inspeccion, String solicitado, int _fk_IDT_DocumentoID, Date fechaDeDiligenciamiento,
			Date fechaDeModificacion) {
		super();
		DermatologicoA = dermatologicoA;
		DermatologicoB = dermatologicoB;
		DermatologicoBCual = dermatologicoBCual;
		Lesiones = lesiones;
		Observaciones = observaciones;
		Respiratorio = respiratorio;
		Respiratorio_Ascultacion = respiratorio_Ascultacion;
		Respiratorio_Inspeccion = respiratorio_Inspeccion;
		Solicitado = solicitado;
		this._fk_IDT_DocumentoID = _fk_IDT_DocumentoID;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
	}

	/**
	 * @return the dermatologicoA
	 */
	public String getDermatologicoA() {
		return DermatologicoA;
	}

	/**
	 * @param dermatologicoA
	 *            the dermatologicoA to set
	 */
	public void setDermatologicoA(String dermatologicoA) {
		DermatologicoA = dermatologicoA;
	}

	/**
	 * @return the dermatologicoB
	 */
	public String getDermatologicoB() {
		return DermatologicoB;
	}

	/**
	 * @param dermatologicoB
	 *            the dermatologicoB to set
	 */
	public void setDermatologicoB(String dermatologicoB) {
		DermatologicoB = dermatologicoB;
	}

	/**
	 * @return the dermatologicoBCual
	 */
	public String getDermatologicoBCual() {
		return DermatologicoBCual;
	}

	/**
	 * @param dermatologicoBCual
	 *            the dermatologicoBCual to set
	 */
	public void setDermatologicoBCual(String dermatologicoBCual) {
		DermatologicoBCual = dermatologicoBCual;
	}

	/**
	 * @return the lesiones
	 */
	public String getLesiones() {
		return Lesiones;
	}

	/**
	 * @param lesiones
	 *            the lesiones to set
	 */
	public void setLesiones(String lesiones) {
		Lesiones = lesiones;
	}

	/**
	 * @return the observaciones
	 */
	public String getObservaciones() {
		return Observaciones;
	}

	/**
	 * @param observaciones
	 *            the observaciones to set
	 */
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	/**
	 * @return the respiratorio
	 */
	public String getRespiratorio() {
		return Respiratorio;
	}

	/**
	 * @param respiratorio
	 *            the respiratorio to set
	 */
	public void setRespiratorio(String respiratorio) {
		Respiratorio = respiratorio;
	}

	/**
	 * @return the respiratorio_Ascultacion
	 */
	public String getRespiratorio_Ascultacion() {
		return Respiratorio_Ascultacion;
	}

	/**
	 * @param respiratorio_Ascultacion
	 *            the respiratorio_Ascultacion to set
	 */
	public void setRespiratorio_Ascultacion(String respiratorio_Ascultacion) {
		Respiratorio_Ascultacion = respiratorio_Ascultacion;
	}

	/**
	 * @return the respiratorio_Inspeccion
	 */
	public String getRespiratorio_Inspeccion() {
		return Respiratorio_Inspeccion;
	}

	/**
	 * @param respiratorio_Inspeccion
	 *            the respiratorio_Inspeccion to set
	 */
	public void setRespiratorio_Inspeccion(String respiratorio_Inspeccion) {
		Respiratorio_Inspeccion = respiratorio_Inspeccion;
	}

	/**
	 * @return the solicitado
	 */
	public String getSolicitado() {
		return Solicitado;
	}

	/**
	 * @param solicitado
	 *            the solicitado to set
	 */
	public void setSolicitado(String solicitado) {
		Solicitado = solicitado;
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
