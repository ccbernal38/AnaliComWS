/**
 * 
 */
package co.analicom.ws.modelo.hc;

import java.util.Date;

/**
 * @author Christian Bernal
 */
public class Resultado {

	private String Aplazado, Aplazado_Motivo, AptoConRestriccion, AptoConRestriccion_Motivo, AptoParaElCargo,
			ConPatologiaQueNoLimitaLabor, NoApto, NoApto_Motivo, Otros_escribir, PuedoContinuarConSuLabor,
			SeSugiereReubicacionLaboral, SinPatologiaAparente;
	private int _fk_IDT_DocumentoID, _fk_IDT_DocumentoMD;
	private Date FechaDeDiligenciamiento, FechaDeModificacion;

	/**
	 * 
	 */
	public Resultado() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param aplazado
	 * @param aplazado_Motivo
	 * @param aptoConRestriccion
	 * @param aptoConRestriccion_Motivo
	 * @param aptoParaElCargo
	 * @param conPatologiaQueNoLimitaLabor
	 * @param noApto
	 * @param noApto_Motivo
	 * @param otros_escribir
	 * @param puedoContinuarConSuLabor
	 * @param seSugiereReubicacionLaboral
	 * @param sinPatologiaAparente
	 * @param _fk_IDT_DocumentoID
	 * @param _fk_IDT_DocumentoMD
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public Resultado(String aplazado, String aplazado_Motivo, String aptoConRestriccion,
			String aptoConRestriccion_Motivo, String aptoParaElCargo, String conPatologiaQueNoLimitaLabor,
			String noApto, String noApto_Motivo, String otros_escribir, String puedoContinuarConSuLabor,
			String seSugiereReubicacionLaboral, String sinPatologiaAparente, int _fk_IDT_DocumentoID,
			int _fk_IDT_DocumentoMD, Date fechaDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		Aplazado = aplazado;
		Aplazado_Motivo = aplazado_Motivo;
		AptoConRestriccion = aptoConRestriccion;
		AptoConRestriccion_Motivo = aptoConRestriccion_Motivo;
		AptoParaElCargo = aptoParaElCargo;
		ConPatologiaQueNoLimitaLabor = conPatologiaQueNoLimitaLabor;
		NoApto = noApto;
		NoApto_Motivo = noApto_Motivo;
		Otros_escribir = otros_escribir;
		PuedoContinuarConSuLabor = puedoContinuarConSuLabor;
		SeSugiereReubicacionLaboral = seSugiereReubicacionLaboral;
		SinPatologiaAparente = sinPatologiaAparente;
		this._fk_IDT_DocumentoID = _fk_IDT_DocumentoID;
		this._fk_IDT_DocumentoMD = _fk_IDT_DocumentoMD;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
	}

	/**
	 * @return the aplazado
	 */
	public String getAplazado() {
		return Aplazado;
	}

	/**
	 * @param aplazado
	 *            the aplazado to set
	 */
	public void setAplazado(String aplazado) {
		Aplazado = aplazado;
	}

	/**
	 * @return the aplazado_Motivo
	 */
	public String getAplazado_Motivo() {
		return Aplazado_Motivo;
	}

	/**
	 * @param aplazado_Motivo
	 *            the aplazado_Motivo to set
	 */
	public void setAplazado_Motivo(String aplazado_Motivo) {
		Aplazado_Motivo = aplazado_Motivo;
	}

	/**
	 * @return the aptoConRestriccion
	 */
	public String getAptoConRestriccion() {
		return AptoConRestriccion;
	}

	/**
	 * @param aptoConRestriccion
	 *            the aptoConRestriccion to set
	 */
	public void setAptoConRestriccion(String aptoConRestriccion) {
		AptoConRestriccion = aptoConRestriccion;
	}

	/**
	 * @return the aptoConRestriccion_Motivo
	 */
	public String getAptoConRestriccion_Motivo() {
		return AptoConRestriccion_Motivo;
	}

	/**
	 * @param aptoConRestriccion_Motivo
	 *            the aptoConRestriccion_Motivo to set
	 */
	public void setAptoConRestriccion_Motivo(String aptoConRestriccion_Motivo) {
		AptoConRestriccion_Motivo = aptoConRestriccion_Motivo;
	}

	/**
	 * @return the aptoParaElCargo
	 */
	public String getAptoParaElCargo() {
		return AptoParaElCargo;
	}

	/**
	 * @param aptoParaElCargo
	 *            the aptoParaElCargo to set
	 */
	public void setAptoParaElCargo(String aptoParaElCargo) {
		AptoParaElCargo = aptoParaElCargo;
	}

	/**
	 * @return the conPatologiaQueNoLimitaLabor
	 */
	public String getConPatologiaQueNoLimitaLabor() {
		return ConPatologiaQueNoLimitaLabor;
	}

	/**
	 * @param conPatologiaQueNoLimitaLabor
	 *            the conPatologiaQueNoLimitaLabor to set
	 */
	public void setConPatologiaQueNoLimitaLabor(String conPatologiaQueNoLimitaLabor) {
		ConPatologiaQueNoLimitaLabor = conPatologiaQueNoLimitaLabor;
	}

	/**
	 * @return the noApto
	 */
	public String getNoApto() {
		return NoApto;
	}

	/**
	 * @param noApto
	 *            the noApto to set
	 */
	public void setNoApto(String noApto) {
		NoApto = noApto;
	}

	/**
	 * @return the noApto_Motivo
	 */
	public String getNoApto_Motivo() {
		return NoApto_Motivo;
	}

	/**
	 * @param noApto_Motivo
	 *            the noApto_Motivo to set
	 */
	public void setNoApto_Motivo(String noApto_Motivo) {
		NoApto_Motivo = noApto_Motivo;
	}

	/**
	 * @return the otros_escribir
	 */
	public String getOtros_escribir() {
		return Otros_escribir;
	}

	/**
	 * @param otros_escribir
	 *            the otros_escribir to set
	 */
	public void setOtros_escribir(String otros_escribir) {
		Otros_escribir = otros_escribir;
	}

	/**
	 * @return the puedoContinuarConSuLabor
	 */
	public String getPuedoContinuarConSuLabor() {
		return PuedoContinuarConSuLabor;
	}

	/**
	 * @param puedoContinuarConSuLabor
	 *            the puedoContinuarConSuLabor to set
	 */
	public void setPuedoContinuarConSuLabor(String puedoContinuarConSuLabor) {
		PuedoContinuarConSuLabor = puedoContinuarConSuLabor;
	}

	/**
	 * @return the seSugiereReubicacionLaboral
	 */
	public String getSeSugiereReubicacionLaboral() {
		return SeSugiereReubicacionLaboral;
	}

	/**
	 * @param seSugiereReubicacionLaboral
	 *            the seSugiereReubicacionLaboral to set
	 */
	public void setSeSugiereReubicacionLaboral(String seSugiereReubicacionLaboral) {
		SeSugiereReubicacionLaboral = seSugiereReubicacionLaboral;
	}

	/**
	 * @return the sinPatologiaAparente
	 */
	public String getSinPatologiaAparente() {
		return SinPatologiaAparente;
	}

	/**
	 * @param sinPatologiaAparente
	 *            the sinPatologiaAparente to set
	 */
	public void setSinPatologiaAparente(String sinPatologiaAparente) {
		SinPatologiaAparente = sinPatologiaAparente;
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
	 * @return the _fk_IDT_DocumentoMD
	 */
	public int get_fk_IDT_DocumentoMD() {
		return _fk_IDT_DocumentoMD;
	}

	/**
	 * @param _fk_IDT_DocumentoMD
	 *            the _fk_IDT_DocumentoMD to set
	 */
	public void set_fk_IDT_DocumentoMD(int _fk_IDT_DocumentoMD) {
		this._fk_IDT_DocumentoMD = _fk_IDT_DocumentoMD;
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
