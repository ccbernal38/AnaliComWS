/**
 * 
 */
package co.analicom.ws.modelo.hc;

import java.util.Date;

/**
 * @author Christian Bernal
 */
public class Habito {

	private String Alcohol, AlcoholCantidad, AlcoholFrecuencia, Deporte, DeporteCual, DeporteFrecuencia,
			DeporteLesiones, DeporteLesionesCual, ExFumador, Fumador, Sedentarismo, SedentarismoFrecuencia,
			SustanciasPsicoactivas, SustanciasPsicoactivasCual, SustanciasPsicoactivasFrecuencia;

	private int CantidadCigarrillosDia, fk_IDT_DocumentoID, TiempoFumador;
	private Date FechaDeDiligenciamiento, FechaDeModificacion;

	/**
	 * 
	 */
	public Habito() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param alcohol
	 * @param alcoholCantidad
	 * @param alcoholFrecuencia
	 * @param deporte
	 * @param deporteCual
	 * @param deporteFrecuencia
	 * @param deporteLesiones
	 * @param deporteLesionesCual
	 * @param exFumador
	 * @param fumador
	 * @param sedentarismo
	 * @param sedentarismoFrecuencia
	 * @param sustanciasPsicoactivas
	 * @param sustanciasPsicoactivasCual
	 * @param sustanciasPsicoactivasFrecuencia
	 * @param cantidadCigarrillosDia
	 * @param fk_IDT_DocumentoID
	 * @param tiempoFumador
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public Habito(String alcohol, String alcoholCantidad, String alcoholFrecuencia, String deporte, String deporteCual,
			String deporteFrecuencia, String deporteLesiones, String deporteLesionesCual, String exFumador,
			String fumador, String sedentarismo, String sedentarismoFrecuencia, String sustanciasPsicoactivas,
			String sustanciasPsicoactivasCual, String sustanciasPsicoactivasFrecuencia, int cantidadCigarrillosDia,
			int fk_IDT_DocumentoID, int tiempoFumador, Date fechaDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		Alcohol = alcohol;
		AlcoholCantidad = alcoholCantidad;
		AlcoholFrecuencia = alcoholFrecuencia;
		Deporte = deporte;
		DeporteCual = deporteCual;
		DeporteFrecuencia = deporteFrecuencia;
		DeporteLesiones = deporteLesiones;
		DeporteLesionesCual = deporteLesionesCual;
		ExFumador = exFumador;
		Fumador = fumador;
		Sedentarismo = sedentarismo;
		SedentarismoFrecuencia = sedentarismoFrecuencia;
		SustanciasPsicoactivas = sustanciasPsicoactivas;
		SustanciasPsicoactivasCual = sustanciasPsicoactivasCual;
		SustanciasPsicoactivasFrecuencia = sustanciasPsicoactivasFrecuencia;
		CantidadCigarrillosDia = cantidadCigarrillosDia;
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
		TiempoFumador = tiempoFumador;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
	}

	/**
	 * @return the alcohol
	 */
	public String getAlcohol() {
		return Alcohol;
	}

	/**
	 * @param alcohol
	 *            the alcohol to set
	 */
	public void setAlcohol(String alcohol) {
		Alcohol = alcohol;
	}

	/**
	 * @return the alcoholCantidad
	 */
	public String getAlcoholCantidad() {
		return AlcoholCantidad;
	}

	/**
	 * @param alcoholCantidad
	 *            the alcoholCantidad to set
	 */
	public void setAlcoholCantidad(String alcoholCantidad) {
		AlcoholCantidad = alcoholCantidad;
	}

	/**
	 * @return the alcoholFrecuencia
	 */
	public String getAlcoholFrecuencia() {
		return AlcoholFrecuencia;
	}

	/**
	 * @param alcoholFrecuencia
	 *            the alcoholFrecuencia to set
	 */
	public void setAlcoholFrecuencia(String alcoholFrecuencia) {
		AlcoholFrecuencia = alcoholFrecuencia;
	}

	/**
	 * @return the deporte
	 */
	public String getDeporte() {
		return Deporte;
	}

	/**
	 * @param deporte
	 *            the deporte to set
	 */
	public void setDeporte(String deporte) {
		Deporte = deporte;
	}

	/**
	 * @return the deporteCual
	 */
	public String getDeporteCual() {
		return DeporteCual;
	}

	/**
	 * @param deporteCual
	 *            the deporteCual to set
	 */
	public void setDeporteCual(String deporteCual) {
		DeporteCual = deporteCual;
	}

	/**
	 * @return the deporteFrecuencia
	 */
	public String getDeporteFrecuencia() {
		return DeporteFrecuencia;
	}

	/**
	 * @param deporteFrecuencia
	 *            the deporteFrecuencia to set
	 */
	public void setDeporteFrecuencia(String deporteFrecuencia) {
		DeporteFrecuencia = deporteFrecuencia;
	}

	/**
	 * @return the deporteLesiones
	 */
	public String getDeporteLesiones() {
		return DeporteLesiones;
	}

	/**
	 * @param deporteLesiones
	 *            the deporteLesiones to set
	 */
	public void setDeporteLesiones(String deporteLesiones) {
		DeporteLesiones = deporteLesiones;
	}

	/**
	 * @return the deporteLesionesCual
	 */
	public String getDeporteLesionesCual() {
		return DeporteLesionesCual;
	}

	/**
	 * @param deporteLesionesCual
	 *            the deporteLesionesCual to set
	 */
	public void setDeporteLesionesCual(String deporteLesionesCual) {
		DeporteLesionesCual = deporteLesionesCual;
	}

	/**
	 * @return the exFumador
	 */
	public String getExFumador() {
		return ExFumador;
	}

	/**
	 * @param exFumador
	 *            the exFumador to set
	 */
	public void setExFumador(String exFumador) {
		ExFumador = exFumador;
	}

	/**
	 * @return the fumador
	 */
	public String getFumador() {
		return Fumador;
	}

	/**
	 * @param fumador
	 *            the fumador to set
	 */
	public void setFumador(String fumador) {
		Fumador = fumador;
	}

	/**
	 * @return the sedentarismo
	 */
	public String getSedentarismo() {
		return Sedentarismo;
	}

	/**
	 * @param sedentarismo
	 *            the sedentarismo to set
	 */
	public void setSedentarismo(String sedentarismo) {
		Sedentarismo = sedentarismo;
	}

	/**
	 * @return the sedentarismoFrecuencia
	 */
	public String getSedentarismoFrecuencia() {
		return SedentarismoFrecuencia;
	}

	/**
	 * @param sedentarismoFrecuencia
	 *            the sedentarismoFrecuencia to set
	 */
	public void setSedentarismoFrecuencia(String sedentarismoFrecuencia) {
		SedentarismoFrecuencia = sedentarismoFrecuencia;
	}

	/**
	 * @return the sustanciasPsicoactivas
	 */
	public String getSustanciasPsicoactivas() {
		return SustanciasPsicoactivas;
	}

	/**
	 * @param sustanciasPsicoactivas
	 *            the sustanciasPsicoactivas to set
	 */
	public void setSustanciasPsicoactivas(String sustanciasPsicoactivas) {
		SustanciasPsicoactivas = sustanciasPsicoactivas;
	}

	/**
	 * @return the sustanciasPsicoactivasCual
	 */
	public String getSustanciasPsicoactivasCual() {
		return SustanciasPsicoactivasCual;
	}

	/**
	 * @param sustanciasPsicoactivasCual
	 *            the sustanciasPsicoactivasCual to set
	 */
	public void setSustanciasPsicoactivasCual(String sustanciasPsicoactivasCual) {
		SustanciasPsicoactivasCual = sustanciasPsicoactivasCual;
	}

	/**
	 * @return the sustanciasPsicoactivasFrecuencia
	 */
	public String getSustanciasPsicoactivasFrecuencia() {
		return SustanciasPsicoactivasFrecuencia;
	}

	/**
	 * @param sustanciasPsicoactivasFrecuencia
	 *            the sustanciasPsicoactivasFrecuencia to set
	 */
	public void setSustanciasPsicoactivasFrecuencia(String sustanciasPsicoactivasFrecuencia) {
		SustanciasPsicoactivasFrecuencia = sustanciasPsicoactivasFrecuencia;
	}

	/**
	 * @return the cantidadCigarrillosDia
	 */
	public int getCantidadCigarrillosDia() {
		return CantidadCigarrillosDia;
	}

	/**
	 * @param cantidadCigarrillosDia
	 *            the cantidadCigarrillosDia to set
	 */
	public void setCantidadCigarrillosDia(int cantidadCigarrillosDia) {
		CantidadCigarrillosDia = cantidadCigarrillosDia;
	}

	/**
	 * @return the fk_IDT_DocumentoID
	 */
	public int getFk_IDT_DocumentoID() {
		return fk_IDT_DocumentoID;
	}

	/**
	 * @param fk_IDT_DocumentoID
	 *            the fk_IDT_DocumentoID to set
	 */
	public void setFk_IDT_DocumentoID(int fk_IDT_DocumentoID) {
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
	}

	/**
	 * @return the tiempoFumador
	 */
	public int getTiempoFumador() {
		return TiempoFumador;
	}

	/**
	 * @param tiempoFumador
	 *            the tiempoFumador to set
	 */
	public void setTiempoFumador(int tiempoFumador) {
		TiempoFumador = tiempoFumador;
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
