package co.analicom.ws.modelo.hc;

import java.util.Date;

/**
 * 
 * @author Christian Bernal
 */
public class ImpresionDiagnostica {

	private String Diagnostico, SospechaDeOrigen, TipoDeDiagnostico;
	private int _fk_CIE10, _fk_IDT_DocumentoID;
	private Date FechaDeDiligenciamiento, FechaDeModificacion;

	public ImpresionDiagnostica() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param diagnostico
	 * @param sospechaDeOrigen
	 * @param tipoDeDiagnostico
	 * @param _fk_CIE10
	 * @param _fk_IDT_DocumentoID
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public ImpresionDiagnostica(String diagnostico, String sospechaDeOrigen, String tipoDeDiagnostico, int _fk_CIE10,
			int _fk_IDT_DocumentoID, Date fechaDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		Diagnostico = diagnostico;
		SospechaDeOrigen = sospechaDeOrigen;
		TipoDeDiagnostico = tipoDeDiagnostico;
		this._fk_CIE10 = _fk_CIE10;
		this._fk_IDT_DocumentoID = _fk_IDT_DocumentoID;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
	}

	/**
	 * @return the diagnostico
	 */
	public String getDiagnostico() {
		return Diagnostico;
	}

	/**
	 * @param diagnostico the diagnostico to set
	 */
	public void setDiagnostico(String diagnostico) {
		Diagnostico = diagnostico;
	}

	/**
	 * @return the sospechaDeOrigen
	 */
	public String getSospechaDeOrigen() {
		return SospechaDeOrigen;
	}

	/**
	 * @param sospechaDeOrigen the sospechaDeOrigen to set
	 */
	public void setSospechaDeOrigen(String sospechaDeOrigen) {
		SospechaDeOrigen = sospechaDeOrigen;
	}

	/**
	 * @return the tipoDeDiagnostico
	 */
	public String getTipoDeDiagnostico() {
		return TipoDeDiagnostico;
	}

	/**
	 * @param tipoDeDiagnostico the tipoDeDiagnostico to set
	 */
	public void setTipoDeDiagnostico(String tipoDeDiagnostico) {
		TipoDeDiagnostico = tipoDeDiagnostico;
	}

	/**
	 * @return the _fk_CIE10
	 */
	public int get_fk_CIE10() {
		return _fk_CIE10;
	}

	/**
	 * @param _fk_CIE10 the _fk_CIE10 to set
	 */
	public void set_fk_CIE10(int _fk_CIE10) {
		this._fk_CIE10 = _fk_CIE10;
	}

	/**
	 * @return the _fk_IDT_DocumentoID
	 */
	public int get_fk_IDT_DocumentoID() {
		return _fk_IDT_DocumentoID;
	}

	/**
	 * @param _fk_IDT_DocumentoID the _fk_IDT_DocumentoID to set
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
