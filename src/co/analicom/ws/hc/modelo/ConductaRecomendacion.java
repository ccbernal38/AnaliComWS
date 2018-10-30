package co.analicom.ws.hc.modelo;

public class ConductaRecomendacion {
	
	private int fk_IDT_DocumentoID;
	private String PausasActivas;
	private String ErgonomiaVisual;
	private String PautasHigieneVisual;
	private String proteccionPersonal;
	private String proteccionPersonalCorreccionOptica;
	private String gafasUV;
	private String HigieneVisual;
	private String ControlOptometria;
	private String ControlOftalmologia;
	private String OtrasConductas;
	private String PausasActivasObservacion;
	private String ErgonomiaVisualObservacion;
	private String higieneVisualObservacion;
	private String proteccionPersonalObservacion;
	private String proteccionCorreccionOpticaObservacion;
	private String gafasUVObservacion;
	private String HigieneVisualObservacionn;
	private String ControlOptometriaObservacion;
	private String ControlOftalmologiaObservacion;
	private String otrasConductasObservacion;
	private String correccionOpticaPermanente;
	private String correccionOpticaObservacion;
	private String correccionOpticaVisionProlongada;
	private String contCorreccionOpticaActual;
	private String contCorreccionOpticaActualobs;
	private String correccionOpticaVisualCercanaObs;
	private String correccionOpticaVisualCercana;
	private String correccionOpticaActual;
	private String correccionOpticaActualObs;
	private String elementosProteccionVisual;
	private String elementosProteccionVisualObs;
	private String proteccionVisualCorreccionOptObservacion;
	private String proteccionVisualCorreccionOpt;
	private String controlAnual;
	private String controlAnualObservacion;
	private String NoUsoCorreccionOptica;
	private String NoUsoCorreccionOpticaObs;
	private String correcionOptica;
	private String correcionOpticaObse;
	private String RecomendacionesAdicionales;
	
	public ConductaRecomendacion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fk_IDT_DocumentoID
	 * @param pausasActivas
	 * @param ergonomiaVisual
	 * @param pautasHigieneVisual
	 * @param proteccionPersonal
	 * @param proteccionPersonalCorreccionOptica
	 * @param gafasUV
	 * @param higieneVisual
	 * @param controlOptometria
	 * @param controlOftalmologia
	 * @param otrasConductas
	 * @param pausasActivasObservacion
	 * @param ergonomiaVisualObservacion
	 * @param higieneVisualObservacion
	 * @param proteccionPersonalObservacion
	 * @param proteccionCorreccionOpticaObservacion
	 * @param gafasUVObservacion
	 * @param higieneVisualObservacionn
	 * @param controlOptometriaObservacion
	 * @param controlOftalmologiaObservacion
	 * @param otrasConductasObservacion
	 * @param correccionOpticaPermanente
	 * @param correccionOpticaObservacion
	 * @param correccionOpticaVisionProlongada
	 * @param contCorreccionOpticaActual
	 * @param contCorreccionOpticaActualobs
	 * @param correccionOpticaVisualCercanaObs
	 * @param correccionOpticaVisualCercana
	 * @param correccionOpticaActual
	 * @param correccionOpticaActualObs
	 * @param elementosProteccionVisual
	 * @param elementosProteccionVisualObs
	 * @param proteccionVisualCorreccionOptObservacion
	 * @param proteccionVisualCorreccionOpt
	 * @param controlAnual
	 * @param controlAnualObservacion
	 * @param noUsoCorreccionOptica
	 * @param noUsoCorreccionOpticaObs
	 * @param correcionOptica
	 * @param correcionOpticaObse
	 * @param recomendacionesAdicionales
	 */
	public ConductaRecomendacion(int fk_IDT_DocumentoID, String pausasActivas, String ergonomiaVisual,
			String pautasHigieneVisual, String proteccionPersonal, String proteccionPersonalCorreccionOptica,
			String gafasUV, String higieneVisual, String controlOptometria, String controlOftalmologia,
			String otrasConductas, String pausasActivasObservacion, String ergonomiaVisualObservacion,
			String higieneVisualObservacion, String proteccionPersonalObservacion,
			String proteccionCorreccionOpticaObservacion, String gafasUVObservacion, String higieneVisualObservacionn,
			String controlOptometriaObservacion, String controlOftalmologiaObservacion,
			String otrasConductasObservacion, String correccionOpticaPermanente, String correccionOpticaObservacion,
			String correccionOpticaVisionProlongada, String contCorreccionOpticaActual,
			String contCorreccionOpticaActualobs, String correccionOpticaVisualCercanaObs,
			String correccionOpticaVisualCercana, String correccionOpticaActual, String correccionOpticaActualObs,
			String elementosProteccionVisual, String elementosProteccionVisualObs,
			String proteccionVisualCorreccionOptObservacion, String proteccionVisualCorreccionOpt, String controlAnual,
			String controlAnualObservacion, String noUsoCorreccionOptica, String noUsoCorreccionOpticaObs,
			String correcionOptica, String correcionOpticaObse, String recomendacionesAdicionales) {
		super();
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
		PausasActivas = pausasActivas;
		ErgonomiaVisual = ergonomiaVisual;
		PautasHigieneVisual = pautasHigieneVisual;
		this.proteccionPersonal = proteccionPersonal;
		this.proteccionPersonalCorreccionOptica = proteccionPersonalCorreccionOptica;
		this.gafasUV = gafasUV;
		HigieneVisual = higieneVisual;
		ControlOptometria = controlOptometria;
		ControlOftalmologia = controlOftalmologia;
		OtrasConductas = otrasConductas;
		PausasActivasObservacion = pausasActivasObservacion;
		ErgonomiaVisualObservacion = ergonomiaVisualObservacion;
		this.higieneVisualObservacion = higieneVisualObservacion;
		this.proteccionPersonalObservacion = proteccionPersonalObservacion;
		this.proteccionCorreccionOpticaObservacion = proteccionCorreccionOpticaObservacion;
		this.gafasUVObservacion = gafasUVObservacion;
		HigieneVisualObservacionn = higieneVisualObservacionn;
		ControlOptometriaObservacion = controlOptometriaObservacion;
		ControlOftalmologiaObservacion = controlOftalmologiaObservacion;
		this.otrasConductasObservacion = otrasConductasObservacion;
		this.correccionOpticaPermanente = correccionOpticaPermanente;
		this.correccionOpticaObservacion = correccionOpticaObservacion;
		this.correccionOpticaVisionProlongada = correccionOpticaVisionProlongada;
		this.contCorreccionOpticaActual = contCorreccionOpticaActual;
		this.contCorreccionOpticaActualobs = contCorreccionOpticaActualobs;
		this.correccionOpticaVisualCercanaObs = correccionOpticaVisualCercanaObs;
		this.correccionOpticaVisualCercana = correccionOpticaVisualCercana;
		this.correccionOpticaActual = correccionOpticaActual;
		this.correccionOpticaActualObs = correccionOpticaActualObs;
		this.elementosProteccionVisual = elementosProteccionVisual;
		this.elementosProteccionVisualObs = elementosProteccionVisualObs;
		this.proteccionVisualCorreccionOptObservacion = proteccionVisualCorreccionOptObservacion;
		this.proteccionVisualCorreccionOpt = proteccionVisualCorreccionOpt;
		this.controlAnual = controlAnual;
		this.controlAnualObservacion = controlAnualObservacion;
		NoUsoCorreccionOptica = noUsoCorreccionOptica;
		NoUsoCorreccionOpticaObs = noUsoCorreccionOpticaObs;
		this.correcionOptica = correcionOptica;
		this.correcionOpticaObse = correcionOpticaObse;
		RecomendacionesAdicionales = recomendacionesAdicionales;
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
	 * @return the pausasActivas
	 */
	public String getPausasActivas() {
		return PausasActivas;
	}

	/**
	 * @param pausasActivas the pausasActivas to set
	 */
	public void setPausasActivas(String pausasActivas) {
		PausasActivas = pausasActivas;
	}

	/**
	 * @return the ergonomiaVisual
	 */
	public String getErgonomiaVisual() {
		return ErgonomiaVisual;
	}

	/**
	 * @param ergonomiaVisual the ergonomiaVisual to set
	 */
	public void setErgonomiaVisual(String ergonomiaVisual) {
		ErgonomiaVisual = ergonomiaVisual;
	}

	/**
	 * @return the pautasHigieneVisual
	 */
	public String getPautasHigieneVisual() {
		return PautasHigieneVisual;
	}

	/**
	 * @param pautasHigieneVisual the pautasHigieneVisual to set
	 */
	public void setPautasHigieneVisual(String pautasHigieneVisual) {
		PautasHigieneVisual = pautasHigieneVisual;
	}

	/**
	 * @return the proteccionPersonal
	 */
	public String getProteccionPersonal() {
		return proteccionPersonal;
	}

	/**
	 * @param proteccionPersonal the proteccionPersonal to set
	 */
	public void setProteccionPersonal(String proteccionPersonal) {
		this.proteccionPersonal = proteccionPersonal;
	}

	/**
	 * @return the proteccionPersonalCorreccionOptica
	 */
	public String getProteccionPersonalCorreccionOptica() {
		return proteccionPersonalCorreccionOptica;
	}

	/**
	 * @param proteccionPersonalCorreccionOptica the proteccionPersonalCorreccionOptica to set
	 */
	public void setProteccionPersonalCorreccionOptica(String proteccionPersonalCorreccionOptica) {
		this.proteccionPersonalCorreccionOptica = proteccionPersonalCorreccionOptica;
	}

	/**
	 * @return the gafasUV
	 */
	public String getGafasUV() {
		return gafasUV;
	}

	/**
	 * @param gafasUV the gafasUV to set
	 */
	public void setGafasUV(String gafasUV) {
		this.gafasUV = gafasUV;
	}

	/**
	 * @return the higieneVisual
	 */
	public String getHigieneVisual() {
		return HigieneVisual;
	}

	/**
	 * @param higieneVisual the higieneVisual to set
	 */
	public void setHigieneVisual(String higieneVisual) {
		HigieneVisual = higieneVisual;
	}

	/**
	 * @return the controlOptometria
	 */
	public String getControlOptometria() {
		return ControlOptometria;
	}

	/**
	 * @param controlOptometria the controlOptometria to set
	 */
	public void setControlOptometria(String controlOptometria) {
		ControlOptometria = controlOptometria;
	}

	/**
	 * @return the controlOftalmologia
	 */
	public String getControlOftalmologia() {
		return ControlOftalmologia;
	}

	/**
	 * @param controlOftalmologia the controlOftalmologia to set
	 */
	public void setControlOftalmologia(String controlOftalmologia) {
		ControlOftalmologia = controlOftalmologia;
	}

	/**
	 * @return the otrasConductas
	 */
	public String getOtrasConductas() {
		return OtrasConductas;
	}

	/**
	 * @param otrasConductas the otrasConductas to set
	 */
	public void setOtrasConductas(String otrasConductas) {
		OtrasConductas = otrasConductas;
	}

	/**
	 * @return the pausasActivasObservacion
	 */
	public String getPausasActivasObservacion() {
		return PausasActivasObservacion;
	}

	/**
	 * @param pausasActivasObservacion the pausasActivasObservacion to set
	 */
	public void setPausasActivasObservacion(String pausasActivasObservacion) {
		PausasActivasObservacion = pausasActivasObservacion;
	}

	/**
	 * @return the ergonomiaVisualObservacion
	 */
	public String getErgonomiaVisualObservacion() {
		return ErgonomiaVisualObservacion;
	}

	/**
	 * @param ergonomiaVisualObservacion the ergonomiaVisualObservacion to set
	 */
	public void setErgonomiaVisualObservacion(String ergonomiaVisualObservacion) {
		ErgonomiaVisualObservacion = ergonomiaVisualObservacion;
	}

	/**
	 * @return the higieneVisualObservacion
	 */
	public String getHigieneVisualObservacion() {
		return higieneVisualObservacion;
	}

	/**
	 * @param higieneVisualObservacion the higieneVisualObservacion to set
	 */
	public void setHigieneVisualObservacion(String higieneVisualObservacion) {
		this.higieneVisualObservacion = higieneVisualObservacion;
	}

	/**
	 * @return the proteccionPersonalObservacion
	 */
	public String getProteccionPersonalObservacion() {
		return proteccionPersonalObservacion;
	}

	/**
	 * @param proteccionPersonalObservacion the proteccionPersonalObservacion to set
	 */
	public void setProteccionPersonalObservacion(String proteccionPersonalObservacion) {
		this.proteccionPersonalObservacion = proteccionPersonalObservacion;
	}

	/**
	 * @return the proteccionCorreccionOpticaObservacion
	 */
	public String getProteccionCorreccionOpticaObservacion() {
		return proteccionCorreccionOpticaObservacion;
	}

	/**
	 * @param proteccionCorreccionOpticaObservacion the proteccionCorreccionOpticaObservacion to set
	 */
	public void setProteccionCorreccionOpticaObservacion(String proteccionCorreccionOpticaObservacion) {
		this.proteccionCorreccionOpticaObservacion = proteccionCorreccionOpticaObservacion;
	}

	/**
	 * @return the gafasUVObservacion
	 */
	public String getGafasUVObservacion() {
		return gafasUVObservacion;
	}

	/**
	 * @param gafasUVObservacion the gafasUVObservacion to set
	 */
	public void setGafasUVObservacion(String gafasUVObservacion) {
		this.gafasUVObservacion = gafasUVObservacion;
	}

	/**
	 * @return the higieneVisualObservacionn
	 */
	public String getHigieneVisualObservacionn() {
		return HigieneVisualObservacionn;
	}

	/**
	 * @param higieneVisualObservacionn the higieneVisualObservacionn to set
	 */
	public void setHigieneVisualObservacionn(String higieneVisualObservacionn) {
		HigieneVisualObservacionn = higieneVisualObservacionn;
	}

	/**
	 * @return the controlOptometriaObservacion
	 */
	public String getControlOptometriaObservacion() {
		return ControlOptometriaObservacion;
	}

	/**
	 * @param controlOptometriaObservacion the controlOptometriaObservacion to set
	 */
	public void setControlOptometriaObservacion(String controlOptometriaObservacion) {
		ControlOptometriaObservacion = controlOptometriaObservacion;
	}

	/**
	 * @return the controlOftalmologiaObservacion
	 */
	public String getControlOftalmologiaObservacion() {
		return ControlOftalmologiaObservacion;
	}

	/**
	 * @param controlOftalmologiaObservacion the controlOftalmologiaObservacion to set
	 */
	public void setControlOftalmologiaObservacion(String controlOftalmologiaObservacion) {
		ControlOftalmologiaObservacion = controlOftalmologiaObservacion;
	}

	/**
	 * @return the otrasConductasObservacion
	 */
	public String getOtrasConductasObservacion() {
		return otrasConductasObservacion;
	}

	/**
	 * @param otrasConductasObservacion the otrasConductasObservacion to set
	 */
	public void setOtrasConductasObservacion(String otrasConductasObservacion) {
		this.otrasConductasObservacion = otrasConductasObservacion;
	}

	/**
	 * @return the correccionOpticaPermanente
	 */
	public String getCorreccionOpticaPermanente() {
		return correccionOpticaPermanente;
	}

	/**
	 * @param correccionOpticaPermanente the correccionOpticaPermanente to set
	 */
	public void setCorreccionOpticaPermanente(String correccionOpticaPermanente) {
		this.correccionOpticaPermanente = correccionOpticaPermanente;
	}

	/**
	 * @return the correccionOpticaObservacion
	 */
	public String getCorreccionOpticaObservacion() {
		return correccionOpticaObservacion;
	}

	/**
	 * @param correccionOpticaObservacion the correccionOpticaObservacion to set
	 */
	public void setCorreccionOpticaObservacion(String correccionOpticaObservacion) {
		this.correccionOpticaObservacion = correccionOpticaObservacion;
	}

	/**
	 * @return the correccionOpticaVisionProlongada
	 */
	public String getCorreccionOpticaVisionProlongada() {
		return correccionOpticaVisionProlongada;
	}

	/**
	 * @param correccionOpticaVisionProlongada the correccionOpticaVisionProlongada to set
	 */
	public void setCorreccionOpticaVisionProlongada(String correccionOpticaVisionProlongada) {
		this.correccionOpticaVisionProlongada = correccionOpticaVisionProlongada;
	}

	/**
	 * @return the contCorreccionOpticaActual
	 */
	public String getContCorreccionOpticaActual() {
		return contCorreccionOpticaActual;
	}

	/**
	 * @param contCorreccionOpticaActual the contCorreccionOpticaActual to set
	 */
	public void setContCorreccionOpticaActual(String contCorreccionOpticaActual) {
		this.contCorreccionOpticaActual = contCorreccionOpticaActual;
	}

	/**
	 * @return the contCorreccionOpticaActualobs
	 */
	public String getContCorreccionOpticaActualobs() {
		return contCorreccionOpticaActualobs;
	}

	/**
	 * @param contCorreccionOpticaActualobs the contCorreccionOpticaActualobs to set
	 */
	public void setContCorreccionOpticaActualobs(String contCorreccionOpticaActualobs) {
		this.contCorreccionOpticaActualobs = contCorreccionOpticaActualobs;
	}

	/**
	 * @return the correccionOpticaVisualCercanaObs
	 */
	public String getCorreccionOpticaVisualCercanaObs() {
		return correccionOpticaVisualCercanaObs;
	}

	/**
	 * @param correccionOpticaVisualCercanaObs the correccionOpticaVisualCercanaObs to set
	 */
	public void setCorreccionOpticaVisualCercanaObs(String correccionOpticaVisualCercanaObs) {
		this.correccionOpticaVisualCercanaObs = correccionOpticaVisualCercanaObs;
	}

	/**
	 * @return the correccionOpticaVisualCercana
	 */
	public String getCorreccionOpticaVisualCercana() {
		return correccionOpticaVisualCercana;
	}

	/**
	 * @param correccionOpticaVisualCercana the correccionOpticaVisualCercana to set
	 */
	public void setCorreccionOpticaVisualCercana(String correccionOpticaVisualCercana) {
		this.correccionOpticaVisualCercana = correccionOpticaVisualCercana;
	}

	/**
	 * @return the correccionOpticaActual
	 */
	public String getCorreccionOpticaActual() {
		return correccionOpticaActual;
	}

	/**
	 * @param correccionOpticaActual the correccionOpticaActual to set
	 */
	public void setCorreccionOpticaActual(String correccionOpticaActual) {
		this.correccionOpticaActual = correccionOpticaActual;
	}

	/**
	 * @return the correccionOpticaActualObs
	 */
	public String getCorreccionOpticaActualObs() {
		return correccionOpticaActualObs;
	}

	/**
	 * @param correccionOpticaActualObs the correccionOpticaActualObs to set
	 */
	public void setCorreccionOpticaActualObs(String correccionOpticaActualObs) {
		this.correccionOpticaActualObs = correccionOpticaActualObs;
	}

	/**
	 * @return the elementosProteccionVisual
	 */
	public String getElementosProteccionVisual() {
		return elementosProteccionVisual;
	}

	/**
	 * @param elementosProteccionVisual the elementosProteccionVisual to set
	 */
	public void setElementosProteccionVisual(String elementosProteccionVisual) {
		this.elementosProteccionVisual = elementosProteccionVisual;
	}

	/**
	 * @return the elementosProteccionVisualObs
	 */
	public String getElementosProteccionVisualObs() {
		return elementosProteccionVisualObs;
	}

	/**
	 * @param elementosProteccionVisualObs the elementosProteccionVisualObs to set
	 */
	public void setElementosProteccionVisualObs(String elementosProteccionVisualObs) {
		this.elementosProteccionVisualObs = elementosProteccionVisualObs;
	}

	/**
	 * @return the proteccionVisualCorreccionOptObservacion
	 */
	public String getProteccionVisualCorreccionOptObservacion() {
		return proteccionVisualCorreccionOptObservacion;
	}

	/**
	 * @param proteccionVisualCorreccionOptObservacion the proteccionVisualCorreccionOptObservacion to set
	 */
	public void setProteccionVisualCorreccionOptObservacion(String proteccionVisualCorreccionOptObservacion) {
		this.proteccionVisualCorreccionOptObservacion = proteccionVisualCorreccionOptObservacion;
	}

	/**
	 * @return the proteccionVisualCorreccionOpt
	 */
	public String getProteccionVisualCorreccionOpt() {
		return proteccionVisualCorreccionOpt;
	}

	/**
	 * @param proteccionVisualCorreccionOpt the proteccionVisualCorreccionOpt to set
	 */
	public void setProteccionVisualCorreccionOpt(String proteccionVisualCorreccionOpt) {
		this.proteccionVisualCorreccionOpt = proteccionVisualCorreccionOpt;
	}

	/**
	 * @return the controlAnual
	 */
	public String getControlAnual() {
		return controlAnual;
	}

	/**
	 * @param controlAnual the controlAnual to set
	 */
	public void setControlAnual(String controlAnual) {
		this.controlAnual = controlAnual;
	}

	/**
	 * @return the controlAnualObservacion
	 */
	public String getControlAnualObservacion() {
		return controlAnualObservacion;
	}

	/**
	 * @param controlAnualObservacion the controlAnualObservacion to set
	 */
	public void setControlAnualObservacion(String controlAnualObservacion) {
		this.controlAnualObservacion = controlAnualObservacion;
	}

	/**
	 * @return the noUsoCorreccionOptica
	 */
	public String getNoUsoCorreccionOptica() {
		return NoUsoCorreccionOptica;
	}

	/**
	 * @param noUsoCorreccionOptica the noUsoCorreccionOptica to set
	 */
	public void setNoUsoCorreccionOptica(String noUsoCorreccionOptica) {
		NoUsoCorreccionOptica = noUsoCorreccionOptica;
	}

	/**
	 * @return the noUsoCorreccionOpticaObs
	 */
	public String getNoUsoCorreccionOpticaObs() {
		return NoUsoCorreccionOpticaObs;
	}

	/**
	 * @param noUsoCorreccionOpticaObs the noUsoCorreccionOpticaObs to set
	 */
	public void setNoUsoCorreccionOpticaObs(String noUsoCorreccionOpticaObs) {
		NoUsoCorreccionOpticaObs = noUsoCorreccionOpticaObs;
	}

	/**
	 * @return the correcionOptica
	 */
	public String getCorrecionOptica() {
		return correcionOptica;
	}

	/**
	 * @param correcionOptica the correcionOptica to set
	 */
	public void setCorrecionOptica(String correcionOptica) {
		this.correcionOptica = correcionOptica;
	}

	/**
	 * @return the correcionOpticaObse
	 */
	public String getCorrecionOpticaObse() {
		return correcionOpticaObse;
	}

	/**
	 * @param correcionOpticaObse the correcionOpticaObse to set
	 */
	public void setCorrecionOpticaObse(String correcionOpticaObse) {
		this.correcionOpticaObse = correcionOpticaObse;
	}

	/**
	 * @return the recomendacionesAdicionales
	 */
	public String getRecomendacionesAdicionales() {
		return RecomendacionesAdicionales;
	}

	/**
	 * @param recomendacionesAdicionales the recomendacionesAdicionales to set
	 */
	public void setRecomendacionesAdicionales(String recomendacionesAdicionales) {
		RecomendacionesAdicionales = recomendacionesAdicionales;
	}
	
	

}
