/**
 * 
 */
package co.analicom.ws.hc.modelo;

import java.util.Date;

/**
 * @author Christian Bernal
 */
public class RevisionPorSistemas {

	private String Cardiovascular, Dermatologico, Diagnostico, Digestivo, Genitourinario, Hematologico, Neurologico,Observaciones, Osteomuscular, Osteomuscular_Otras, Psiquiatrico, Respiratorio;
	private int fk_DocumentoMD, fk_IDT_DocumentoID;
	private Date FechaDeDiligenciamiento, FechaDeModificacion;

	/**
	 * 
	 */
	public RevisionPorSistemas() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cardiovascular
	 * @param desmatologico
	 * @param diagnostico
	 * @param digestivo
	 * @param genitourinario
	 * @param hematologico
	 * @param neurologico
	 * @param observaciones
	 * @param osteomuscular
	 * @param osteomuscular_Otras
	 * @param psiquiatrico
	 * @param respiratorio
	 * @param fk_DocumentoMD
	 * @param fk_IDT_DocumentoID
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public RevisionPorSistemas(String cardiovascular, String desmatologico, String diagnostico, String digestivo,
			String genitourinario, String hematologico, String neurologico, String observaciones, String osteomuscular,
			String osteomuscular_Otras, String psiquiatrico, String respiratorio, int fk_DocumentoMD,
			int fk_IDT_DocumentoID, Date fechaDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		Cardiovascular = cardiovascular;
		Dermatologico = desmatologico;
		Diagnostico = diagnostico;
		Digestivo = digestivo;
		Genitourinario = genitourinario;
		Hematologico = hematologico;
		Neurologico = neurologico;
		Observaciones = observaciones;
		Osteomuscular = osteomuscular;
		Osteomuscular_Otras = osteomuscular_Otras;
		Psiquiatrico = psiquiatrico;
		Respiratorio = respiratorio;
		this.fk_DocumentoMD = fk_DocumentoMD;
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
	}

	/**
	 * @return the cardiovascular
	 */
	public String getCardiovascular() {
		return Cardiovascular;
	}

	/**
	 * @param cardiovascular
	 *            the cardiovascular to set
	 */
	public void setCardiovascular(String cardiovascular) {
		Cardiovascular = cardiovascular;
	}

	/**
	 * @return the desmatologico
	 */
	public String getDesmatologico() {
		return Dermatologico;
	}

	/**
	 * @param desmatologico
	 *            the desmatologico to set
	 */
	public void setDesmatologico(String desmatologico) {
		Dermatologico = desmatologico;
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
	 * @return the digestivo
	 */
	public String getDigestivo() {
		return Digestivo;
	}

	/**
	 * @param digestivo
	 *            the digestivo to set
	 */
	public void setDigestivo(String digestivo) {
		Digestivo = digestivo;
	}

	/**
	 * @return the genitourinario
	 */
	public String getGenitourinario() {
		return Genitourinario;
	}

	/**
	 * @param genitourinario
	 *            the genitourinario to set
	 */
	public void setGenitourinario(String genitourinario) {
		Genitourinario = genitourinario;
	}

	/**
	 * @return the hematologico
	 */
	public String getHematologico() {
		return Hematologico;
	}

	/**
	 * @param hematologico
	 *            the hematologico to set
	 */
	public void setHematologico(String hematologico) {
		Hematologico = hematologico;
	}

	/**
	 * @return the neurologico
	 */
	public String getNeurologico() {
		return Neurologico;
	}

	/**
	 * @param neurologico
	 *            the neurologico to set
	 */
	public void setNeurologico(String neurologico) {
		Neurologico = neurologico;
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
	 * @return the osteomuscular
	 */
	public String getOsteomuscular() {
		return Osteomuscular;
	}

	/**
	 * @param osteomuscular
	 *            the osteomuscular to set
	 */
	public void setOsteomuscular(String osteomuscular) {
		Osteomuscular = osteomuscular;
	}

	/**
	 * @return the osteomuscular_Otras
	 */
	public String getOsteomuscular_Otras() {
		return Osteomuscular_Otras;
	}

	/**
	 * @param osteomuscular_Otras
	 *            the osteomuscular_Otras to set
	 */
	public void setOsteomuscular_Otras(String osteomuscular_Otras) {
		Osteomuscular_Otras = osteomuscular_Otras;
	}

	/**
	 * @return the psiquiatrico
	 */
	public String getPsiquiatrico() {
		return Psiquiatrico;
	}

	/**
	 * @param psiquiatrico
	 *            the psiquiatrico to set
	 */
	public void setPsiquiatrico(String psiquiatrico) {
		Psiquiatrico = psiquiatrico;
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
	 * @return the fk_DocumentoMD
	 */
	public int getfk_DocumentoMD() {
		return fk_DocumentoMD;
	}

	/**
	 * @param fk_DocumentoMD
	 *            the fk_DocumentoMD to set
	 */
	public void setfk_DocumentoMD(int fk_DocumentoMD) {
		this.fk_DocumentoMD = fk_DocumentoMD;
	}

	/**
	 * @return the fk_IDT_DocumentoID
	 */
	public int getfk_IDT_DocumentoID() {
		return fk_IDT_DocumentoID;
	}

	/**
	 * @param fk_IDT_DocumentoID
	 *            the fk_IDT_DocumentoID to set
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
