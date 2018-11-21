/**
 * 
 */
package co.analicom.ws.hc.modelo;

import java.util.Date;

/**
 * @author Christian Bernal
 */
public class Paraclinico {

	private String AlteracionCorregida, Audiometria, Audiometria_Resultado, Audiometria_Resultado_Observaciones,
			Espirometria, Espirometria_Resultado, Espirometria_Resultado_Observaciones, ExamenLaboratorioDX,
			Observaciones, Optometria, Optometria_Visiometria_Diagnostico, Visiometria;
	private int fk_CodigoExamen, fk_IDT_DocumentoID;
	private Date FechaDeDiligenciamiento, FechaDeModificacion;

	/**
	 * 
	 */
	public Paraclinico() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param alteracionCorregida
	 * @param audiometria
	 * @param audiometria_Resultado
	 * @param audiometria_Resultado_Observaciones
	 * @param espirometria
	 * @param espirometria_Resultado
	 * @param espirometria_Resultado_Observaciones
	 * @param examenLaboratorioDX
	 * @param observaciones
	 * @param optometria
	 * @param optometria_Visiometria_Diagnostico
	 * @param visiometria
	 * @param fk_CodigoExamen
	 * @param fk_IDT_DocumentoID
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public Paraclinico(String alteracionCorregida, String audiometria, String audiometria_Resultado,
			String audiometria_Resultado_Observaciones, String espirometria, String espirometria_Resultado,
			String espirometria_Resultado_Observaciones, String examenLaboratorioDX, String observaciones,
			String optometria, String optometria_Visiometria_Diagnostico, String visiometria, int fk_CodigoExamen,
			int fk_IDT_DocumentoID, Date fechaDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		AlteracionCorregida = alteracionCorregida;
		Audiometria = audiometria;
		Audiometria_Resultado = audiometria_Resultado;
		Audiometria_Resultado_Observaciones = audiometria_Resultado_Observaciones;
		Espirometria = espirometria;
		Espirometria_Resultado = espirometria_Resultado;
		Espirometria_Resultado_Observaciones = espirometria_Resultado_Observaciones;
		ExamenLaboratorioDX = examenLaboratorioDX;
		Observaciones = observaciones;
		Optometria = optometria;
		Optometria_Visiometria_Diagnostico = optometria_Visiometria_Diagnostico;
		Visiometria = visiometria;
		this.fk_CodigoExamen = fk_CodigoExamen;
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
	}

	/**
	 * @return the alteracionCorregida
	 */
	public String getAlteracionCorregida() {
		return AlteracionCorregida;
	}

	/**
	 * @param alteracionCorregida
	 *            the alteracionCorregida to set
	 */
	public void setAlteracionCorregida(String alteracionCorregida) {
		AlteracionCorregida = alteracionCorregida;
	}

	/**
	 * @return the audiometria
	 */
	public String getAudiometria() {
		return Audiometria;
	}

	/**
	 * @param audiometria
	 *            the audiometria to set
	 */
	public void setAudiometria(String audiometria) {
		Audiometria = audiometria;
	}

	/**
	 * @return the audiometria_Resultado
	 */
	public String getAudiometria_Resultado() {
		return Audiometria_Resultado;
	}

	/**
	 * @param audiometria_Resultado
	 *            the audiometria_Resultado to set
	 */
	public void setAudiometria_Resultado(String audiometria_Resultado) {
		Audiometria_Resultado = audiometria_Resultado;
	}

	/**
	 * @return the audiometria_Resultado_Observaciones
	 */
	public String getAudiometria_Resultado_Observaciones() {
		return Audiometria_Resultado_Observaciones;
	}

	/**
	 * @param audiometria_Resultado_Observaciones
	 *            the audiometria_Resultado_Observaciones to set
	 */
	public void setAudiometria_Resultado_Observaciones(String audiometria_Resultado_Observaciones) {
		Audiometria_Resultado_Observaciones = audiometria_Resultado_Observaciones;
	}

	/**
	 * @return the espirometria
	 */
	public String getEspirometria() {
		return Espirometria;
	}

	/**
	 * @param espirometria
	 *            the espirometria to set
	 */
	public void setEspirometria(String espirometria) {
		Espirometria = espirometria;
	}

	/**
	 * @return the espirometria_Resultado
	 */
	public String getEspirometria_Resultado() {
		return Espirometria_Resultado;
	}

	/**
	 * @param espirometria_Resultado
	 *            the espirometria_Resultado to set
	 */
	public void setEspirometria_Resultado(String espirometria_Resultado) {
		Espirometria_Resultado = espirometria_Resultado;
	}

	/**
	 * @return the espirometria_Resultado_Observaciones
	 */
	public String getEspirometria_Resultado_Observaciones() {
		return Espirometria_Resultado_Observaciones;
	}

	/**
	 * @param espirometria_Resultado_Observaciones
	 *            the espirometria_Resultado_Observaciones to set
	 */
	public void setEspirometria_Resultado_Observaciones(String espirometria_Resultado_Observaciones) {
		Espirometria_Resultado_Observaciones = espirometria_Resultado_Observaciones;
	}

	/**
	 * @return the examenLaboratorioDX
	 */
	public String getExamenLaboratorioDX() {
		return ExamenLaboratorioDX;
	}

	/**
	 * @param examenLaboratorioDX
	 *            the examenLaboratorioDX to set
	 */
	public void setExamenLaboratorioDX(String examenLaboratorioDX) {
		ExamenLaboratorioDX = examenLaboratorioDX;
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
	 * @return the optometria
	 */
	public String getOptometria() {
		return Optometria;
	}

	/**
	 * @param optometria
	 *            the optometria to set
	 */
	public void setOptometria(String optometria) {
		Optometria = optometria;
	}

	/**
	 * @return the optometria_Visiometria_Diagnostico
	 */
	public String getOptometria_Visiometria_Diagnostico() {
		return Optometria_Visiometria_Diagnostico;
	}

	/**
	 * @param optometria_Visiometria_Diagnostico
	 *            the optometria_Visiometria_Diagnostico to set
	 */
	public void setOptometria_Visiometria_Diagnostico(String optometria_Visiometria_Diagnostico) {
		Optometria_Visiometria_Diagnostico = optometria_Visiometria_Diagnostico;
	}

	/**
	 * @return the visiometria
	 */
	public String getVisiometria() {
		return Visiometria;
	}

	/**
	 * @param visiometria
	 *            the visiometria to set
	 */
	public void setVisiometria(String visiometria) {
		Visiometria = visiometria;
	}

	/**
	 * @return the fk_CodigoExamen
	 */
	public int getfk_CodigoExamen() {
		return fk_CodigoExamen;
	}

	/**
	 * @param fk_CodigoExamen
	 *            the fk_CodigoExamen to set
	 */
	public void setfk_CodigoExamen(int fk_CodigoExamen) {
		this.fk_CodigoExamen = fk_CodigoExamen;
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
