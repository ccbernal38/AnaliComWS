package co.analicom.ws.hc.modelo;

import java.util.Date;

/**
 * 
 * @author Christian Bernal
 */
public class ImpresionDiagnostica {

	private String Diagnostico, SospechaDeOrigen, TipoDeDiagnostico;
	private int fk_CIE10, fk_IDT_DocumentoID;
	private Date FechaDeDiligenciamiento, FechaDeModificacion;

	public ImpresionDiagnostica() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param diagnostico
	 * @param sospechaDeOrigen
	 * @param tipoDeDiagnostico
	 * @param fk_CIE10
	 * @param fk_IDT_DocumentoID
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public ImpresionDiagnostica(String diagnostico, String sospechaDeOrigen, String tipoDeDiagnostico, int fk_CIE10,
			int fk_IDT_DocumentoID, Date fechaDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		Diagnostico = diagnostico;
		SospechaDeOrigen = sospechaDeOrigen;
		TipoDeDiagnostico = tipoDeDiagnostico;
		this.fk_CIE10 = fk_CIE10;
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
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
	 * @return the fk_CIE10
	 */
	public int getfk_CIE10() {
		return fk_CIE10;
	}

	/**
	 * @param fk_CIE10 the fk_CIE10 to set
	 */
	public void setfk_CIE10(int fk_CIE10) {
		this.fk_CIE10 = fk_CIE10;
	}

	/**
	 * @return the fk_IDT_DocumentoID
	 */
	public int getfk_IDT_DocumentoID() {
		return fk_IDT_DocumentoID;
	}

	/**
	 * @param fk_IDT_DocumentoID the fk_IDT_DocumentoID to set
	 */
	public void setfk_IDT_DocumentoID(int fk_IDT_DocumentoID) {
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
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
