package co.analicom.ws.hc.modelo;

/**
 * 
 * @author Christian Bernal
 */
public class Otoscopia {

	private String CAE_Normal, CAE_Otros, CAE_TaponParcial, CAE_TaponTotal, MT_Abultada, MT_Hiperemica, MT_Normal,
			MT_NoVisualiza, MT_Opaca, MT_Otros, MT_Perforada, MT_PlacaCalcarea, PA_Agenesia, PA_Atresia, PA_Cicatriz,
			PA_Normal, PA_Otros;
	private int _fk_IDT_DocumentoID;

	/**
	 * 
	 */
	public Otoscopia() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cAE_Normal
	 * @param cAE_Otros
	 * @param cAE_TaponParcial
	 * @param cAE_TaponTotal
	 * @param mT_Abultada
	 * @param mT_Hiperemica
	 * @param mT_Normal
	 * @param mT_NoVisualiza
	 * @param mT_Opaca
	 * @param mT_Otros
	 * @param mT_Perforada
	 * @param mT_PlacaCalcarea
	 * @param pA_Agenesia
	 * @param pA_Atresia
	 * @param pA_Cicatriz
	 * @param pA_Normal
	 * @param pA_Otros
	 * @param _fk_IDT_DocumentoID
	 */
	public Otoscopia(String cAE_Normal, String cAE_Otros, String cAE_TaponParcial, String cAE_TaponTotal,
			String mT_Abultada, String mT_Hiperemica, String mT_Normal, String mT_NoVisualiza, String mT_Opaca,
			String mT_Otros, String mT_Perforada, String mT_PlacaCalcarea, String pA_Agenesia, String pA_Atresia,
			String pA_Cicatriz, String pA_Normal, String pA_Otros, int _fk_IDT_DocumentoID) {
		super();
		CAE_Normal = cAE_Normal;
		CAE_Otros = cAE_Otros;
		CAE_TaponParcial = cAE_TaponParcial;
		CAE_TaponTotal = cAE_TaponTotal;
		MT_Abultada = mT_Abultada;
		MT_Hiperemica = mT_Hiperemica;
		MT_Normal = mT_Normal;
		MT_NoVisualiza = mT_NoVisualiza;
		MT_Opaca = mT_Opaca;
		MT_Otros = mT_Otros;
		MT_Perforada = mT_Perforada;
		MT_PlacaCalcarea = mT_PlacaCalcarea;
		PA_Agenesia = pA_Agenesia;
		PA_Atresia = pA_Atresia;
		PA_Cicatriz = pA_Cicatriz;
		PA_Normal = pA_Normal;
		PA_Otros = pA_Otros;
		this._fk_IDT_DocumentoID = _fk_IDT_DocumentoID;
	}

	/**
	 * @return the cAE_Normal
	 */
	public String getCAE_Normal() {
		return CAE_Normal;
	}

	/**
	 * @param cAE_Normal
	 *            the cAE_Normal to set
	 */
	public void setCAE_Normal(String cAE_Normal) {
		CAE_Normal = cAE_Normal;
	}

	/**
	 * @return the cAE_Otros
	 */
	public String getCAE_Otros() {
		return CAE_Otros;
	}

	/**
	 * @param cAE_Otros
	 *            the cAE_Otros to set
	 */
	public void setCAE_Otros(String cAE_Otros) {
		CAE_Otros = cAE_Otros;
	}

	/**
	 * @return the cAE_TaponParcial
	 */
	public String getCAE_TaponParcial() {
		return CAE_TaponParcial;
	}

	/**
	 * @param cAE_TaponParcial
	 *            the cAE_TaponParcial to set
	 */
	public void setCAE_TaponParcial(String cAE_TaponParcial) {
		CAE_TaponParcial = cAE_TaponParcial;
	}

	/**
	 * @return the cAE_TaponTotal
	 */
	public String getCAE_TaponTotal() {
		return CAE_TaponTotal;
	}

	/**
	 * @param cAE_TaponTotal
	 *            the cAE_TaponTotal to set
	 */
	public void setCAE_TaponTotal(String cAE_TaponTotal) {
		CAE_TaponTotal = cAE_TaponTotal;
	}

	/**
	 * @return the mT_Abultada
	 */
	public String getMT_Abultada() {
		return MT_Abultada;
	}

	/**
	 * @param mT_Abultada
	 *            the mT_Abultada to set
	 */
	public void setMT_Abultada(String mT_Abultada) {
		MT_Abultada = mT_Abultada;
	}

	/**
	 * @return the mT_Hiperemica
	 */
	public String getMT_Hiperemica() {
		return MT_Hiperemica;
	}

	/**
	 * @param mT_Hiperemica
	 *            the mT_Hiperemica to set
	 */
	public void setMT_Hiperemica(String mT_Hiperemica) {
		MT_Hiperemica = mT_Hiperemica;
	}

	/**
	 * @return the mT_Normal
	 */
	public String getMT_Normal() {
		return MT_Normal;
	}

	/**
	 * @param mT_Normal
	 *            the mT_Normal to set
	 */
	public void setMT_Normal(String mT_Normal) {
		MT_Normal = mT_Normal;
	}

	/**
	 * @return the mT_NoVisualiza
	 */
	public String getMT_NoVisualiza() {
		return MT_NoVisualiza;
	}

	/**
	 * @param mT_NoVisualiza
	 *            the mT_NoVisualiza to set
	 */
	public void setMT_NoVisualiza(String mT_NoVisualiza) {
		MT_NoVisualiza = mT_NoVisualiza;
	}

	/**
	 * @return the mT_Opaca
	 */
	public String getMT_Opaca() {
		return MT_Opaca;
	}

	/**
	 * @param mT_Opaca
	 *            the mT_Opaca to set
	 */
	public void setMT_Opaca(String mT_Opaca) {
		MT_Opaca = mT_Opaca;
	}

	/**
	 * @return the mT_Otros
	 */
	public String getMT_Otros() {
		return MT_Otros;
	}

	/**
	 * @param mT_Otros
	 *            the mT_Otros to set
	 */
	public void setMT_Otros(String mT_Otros) {
		MT_Otros = mT_Otros;
	}

	/**
	 * @return the mT_Perforada
	 */
	public String getMT_Perforada() {
		return MT_Perforada;
	}

	/**
	 * @param mT_Perforada
	 *            the mT_Perforada to set
	 */
	public void setMT_Perforada(String mT_Perforada) {
		MT_Perforada = mT_Perforada;
	}

	/**
	 * @return the mT_PlacaCalcarea
	 */
	public String getMT_PlacaCalcarea() {
		return MT_PlacaCalcarea;
	}

	/**
	 * @param mT_PlacaCalcarea
	 *            the mT_PlacaCalcarea to set
	 */
	public void setMT_PlacaCalcarea(String mT_PlacaCalcarea) {
		MT_PlacaCalcarea = mT_PlacaCalcarea;
	}

	/**
	 * @return the pA_Agenesia
	 */
	public String getPA_Agenesia() {
		return PA_Agenesia;
	}

	/**
	 * @param pA_Agenesia
	 *            the pA_Agenesia to set
	 */
	public void setPA_Agenesia(String pA_Agenesia) {
		PA_Agenesia = pA_Agenesia;
	}

	/**
	 * @return the pA_Atresia
	 */
	public String getPA_Atresia() {
		return PA_Atresia;
	}

	/**
	 * @param pA_Atresia
	 *            the pA_Atresia to set
	 */
	public void setPA_Atresia(String pA_Atresia) {
		PA_Atresia = pA_Atresia;
	}

	/**
	 * @return the pA_Cicatriz
	 */
	public String getPA_Cicatriz() {
		return PA_Cicatriz;
	}

	/**
	 * @param pA_Cicatriz
	 *            the pA_Cicatriz to set
	 */
	public void setPA_Cicatriz(String pA_Cicatriz) {
		PA_Cicatriz = pA_Cicatriz;
	}

	/**
	 * @return the pA_Normal
	 */
	public String getPA_Normal() {
		return PA_Normal;
	}

	/**
	 * @param pA_Normal
	 *            the pA_Normal to set
	 */
	public void setPA_Normal(String pA_Normal) {
		PA_Normal = pA_Normal;
	}

	/**
	 * @return the pA_Otros
	 */
	public String getPA_Otros() {
		return PA_Otros;
	}

	/**
	 * @param pA_Otros
	 *            the pA_Otros to set
	 */
	public void setPA_Otros(String pA_Otros) {
		PA_Otros = pA_Otros;
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
	
	
}
