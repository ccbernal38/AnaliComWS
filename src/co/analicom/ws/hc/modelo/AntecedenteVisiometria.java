/**
 * 
 */
package co.analicom.ws.hc.modelo;

/**
 * @author Cristian Cruz
 */
public class AntecedenteVisiometria {
	
	private int  fk_DocumentoID_P;
	private String O_Catarata, O_Catarata_OBSERVACION, O_Esquirlas, O_Esquirlas_OBSERVACION, O_Galucoma, O_Galucoma_OBSERVACION, O_Otros, 
	O_Otros_OBSERVACION, O_Qirurgicos, O_Qirurgicos_OBSERVACION, O_Quimicos, O_Quimicos_OBSERVACION, O_Rehabilitacion_visual, 
	O_Rehabilitacion_visual_OBSERVACION, O_Trauma, O_Trauma_OBSERVACION, O_Usuarios_RX_OBSERVACION, O_Usuarios_RX, P_Alergicos, 
	P_Alergicos_OBSERVACION, P_Alteraciones_tiroides, P_Alteraciones_tiroides_OBSERVACION, P_Diabetes, P_Diabetes_OBSERVACION, 
	P_Hipertension, P_Hipertension_OBSERVACION, P_Otros, P_Otros_OBSERVACION, P_Prbolemas_cardiacos, P_Prbolemas_cardiacos_OBSERVACION;
	/**
	 * @param fk_DocumentoID_P
	 * @param o_Catarata
	 * @param o_Catarata_OBSERVACION
	 * @param o_Esquirlas
	 * @param o_Esquirlas_OBSERVACION
	 * @param o_Galucoma
	 * @param o_Galucoma_OBSERVACION
	 * @param o_Otros
	 * @param o_Otros_OBSERVACION
	 * @param o_Qirurgicos
	 * @param o_Qirurgicos_OBSERVACION
	 * @param o_Quimicos
	 * @param o_Quimicos_OBSERVACION
	 * @param o_Rehabilitacion_visual
	 * @param o_Rehabilitacion_visual_OBSERVACION
	 * @param o_Trauma
	 * @param o_Trauma_OBSERVACION
	 * @param o_Usuarios_RX_OBSERVACION
	 * @param o_Usuarios_RX
	 * @param p_Alergicos
	 * @param p_Alergicos_OBSERVACION
	 * @param p_Alteraciones_tiroides
	 * @param p_Alteraciones_tiroides_OBSERVACION
	 * @param p_Diabetes
	 * @param p_Diabetes_OBSERVACION
	 * @param p_Hipertension
	 * @param p_Hipertension_OBSERVACION
	 * @param p_Otros
	 * @param p_Otros_OBSERVACION
	 * @param p_Prbolemas_cardiacos
	 * @param p_Prbolemas_cardiacos_OBSERVACION
	 */
	public AntecedenteVisiometria(int fk_DocumentoID_P, String o_Catarata, String o_Catarata_OBSERVACION,
			String o_Esquirlas, String o_Esquirlas_OBSERVACION, String o_Galucoma, String o_Galucoma_OBSERVACION,
			String o_Otros, String o_Otros_OBSERVACION, String o_Qirurgicos, String o_Qirurgicos_OBSERVACION,
			String o_Quimicos, String o_Quimicos_OBSERVACION, String o_Rehabilitacion_visual,
			String o_Rehabilitacion_visual_OBSERVACION, String o_Trauma, String o_Trauma_OBSERVACION,
			String o_Usuarios_RX_OBSERVACION, String o_Usuarios_RX, String p_Alergicos, String p_Alergicos_OBSERVACION,
			String p_Alteraciones_tiroides, String p_Alteraciones_tiroides_OBSERVACION, String p_Diabetes,
			String p_Diabetes_OBSERVACION, String p_Hipertension, String p_Hipertension_OBSERVACION, String p_Otros,
			String p_Otros_OBSERVACION, String p_Prbolemas_cardiacos, String p_Prbolemas_cardiacos_OBSERVACION) {
		super();
		this.fk_DocumentoID_P = fk_DocumentoID_P;
		O_Catarata = o_Catarata;
		O_Catarata_OBSERVACION = o_Catarata_OBSERVACION;
		O_Esquirlas = o_Esquirlas;
		O_Esquirlas_OBSERVACION = o_Esquirlas_OBSERVACION;
		O_Galucoma = o_Galucoma;
		O_Galucoma_OBSERVACION = o_Galucoma_OBSERVACION;
		O_Otros = o_Otros;
		O_Otros_OBSERVACION = o_Otros_OBSERVACION;
		O_Qirurgicos = o_Qirurgicos;
		O_Qirurgicos_OBSERVACION = o_Qirurgicos_OBSERVACION;
		O_Quimicos = o_Quimicos;
		O_Quimicos_OBSERVACION = o_Quimicos_OBSERVACION;
		O_Rehabilitacion_visual = o_Rehabilitacion_visual;
		O_Rehabilitacion_visual_OBSERVACION = o_Rehabilitacion_visual_OBSERVACION;
		O_Trauma = o_Trauma;
		O_Trauma_OBSERVACION = o_Trauma_OBSERVACION;
		O_Usuarios_RX_OBSERVACION = o_Usuarios_RX_OBSERVACION;
		O_Usuarios_RX = o_Usuarios_RX;
		P_Alergicos = p_Alergicos;
		P_Alergicos_OBSERVACION = p_Alergicos_OBSERVACION;
		P_Alteraciones_tiroides = p_Alteraciones_tiroides;
		P_Alteraciones_tiroides_OBSERVACION = p_Alteraciones_tiroides_OBSERVACION;
		P_Diabetes = p_Diabetes;
		P_Diabetes_OBSERVACION = p_Diabetes_OBSERVACION;
		P_Hipertension = p_Hipertension;
		P_Hipertension_OBSERVACION = p_Hipertension_OBSERVACION;
		P_Otros = p_Otros;
		P_Otros_OBSERVACION = p_Otros_OBSERVACION;
		P_Prbolemas_cardiacos = p_Prbolemas_cardiacos;
		P_Prbolemas_cardiacos_OBSERVACION = p_Prbolemas_cardiacos_OBSERVACION;
	}
	/**
	 * @return the fk_DocumentoID_P
	 */
	public int getFk_DocumentoID_P() {
		return fk_DocumentoID_P;
	}
	/**
	 * @return the o_Catarata
	 */
	public String getO_Catarata() {
		return O_Catarata;
	}
	/**
	 * @return the o_Catarata_OBSERVACION
	 */
	public String getO_Catarata_OBSERVACION() {
		return O_Catarata_OBSERVACION;
	}
	/**
	 * @return the o_Esquirlas
	 */
	public String getO_Esquirlas() {
		return O_Esquirlas;
	}
	/**
	 * @return the o_Esquirlas_OBSERVACION
	 */
	public String getO_Esquirlas_OBSERVACION() {
		return O_Esquirlas_OBSERVACION;
	}
	/**
	 * @return the o_Galucoma
	 */
	public String getO_Galucoma() {
		return O_Galucoma;
	}
	/**
	 * @return the o_Galucoma_OBSERVACION
	 */
	public String getO_Galucoma_OBSERVACION() {
		return O_Galucoma_OBSERVACION;
	}
	/**
	 * @return the o_Otros
	 */
	public String getO_Otros() {
		return O_Otros;
	}
	/**
	 * @return the o_Otros_OBSERVACION
	 */
	public String getO_Otros_OBSERVACION() {
		return O_Otros_OBSERVACION;
	}
	/**
	 * @return the o_Qirurgicos
	 */
	public String getO_Qirurgicos() {
		return O_Qirurgicos;
	}
	/**
	 * @return the o_Qirurgicos_OBSERVACION
	 */
	public String getO_Qirurgicos_OBSERVACION() {
		return O_Qirurgicos_OBSERVACION;
	}
	/**
	 * @return the o_Quimicos
	 */
	public String getO_Quimicos() {
		return O_Quimicos;
	}
	/**
	 * @return the o_Quimicos_OBSERVACION
	 */
	public String getO_Quimicos_OBSERVACION() {
		return O_Quimicos_OBSERVACION;
	}
	/**
	 * @return the o_Rehabilitacion_visual
	 */
	public String getO_Rehabilitacion_visual() {
		return O_Rehabilitacion_visual;
	}
	/**
	 * @return the o_Rehabilitacion_visual_OBSERVACION
	 */
	public String getO_Rehabilitacion_visual_OBSERVACION() {
		return O_Rehabilitacion_visual_OBSERVACION;
	}
	/**
	 * @return the o_Trauma
	 */
	public String getO_Trauma() {
		return O_Trauma;
	}
	/**
	 * @return the o_Trauma_OBSERVACION
	 */
	public String getO_Trauma_OBSERVACION() {
		return O_Trauma_OBSERVACION;
	}
	/**
	 * @return the o_Usuarios_RX_OBSERVACION
	 */
	public String getO_Usuarios_RX_OBSERVACION() {
		return O_Usuarios_RX_OBSERVACION;
	}
	/**
	 * @return the o_Usuarios_RX
	 */
	public String getO_Usuarios_RX() {
		return O_Usuarios_RX;
	}
	/**
	 * @return the p_Alergicos
	 */
	public String getP_Alergicos() {
		return P_Alergicos;
	}
	/**
	 * @return the p_Alergicos_OBSERVACION
	 */
	public String getP_Alergicos_OBSERVACION() {
		return P_Alergicos_OBSERVACION;
	}
	/**
	 * @return the p_Alteraciones_tiroides
	 */
	public String getP_Alteraciones_tiroides() {
		return P_Alteraciones_tiroides;
	}
	/**
	 * @return the p_Alteraciones_tiroides_OBSERVACION
	 */
	public String getP_Alteraciones_tiroides_OBSERVACION() {
		return P_Alteraciones_tiroides_OBSERVACION;
	}
	/**
	 * @return the p_Diabetes
	 */
	public String getP_Diabetes() {
		return P_Diabetes;
	}
	/**
	 * @return the p_Diabetes_OBSERVACION
	 */
	public String getP_Diabetes_OBSERVACION() {
		return P_Diabetes_OBSERVACION;
	}
	/**
	 * @return the p_Hipertension
	 */
	public String getP_Hipertension() {
		return P_Hipertension;
	}
	/**
	 * @return the p_Hipertension_OBSERVACION
	 */
	public String getP_Hipertension_OBSERVACION() {
		return P_Hipertension_OBSERVACION;
	}
	/**
	 * @return the p_Otros
	 */
	public String getP_Otros() {
		return P_Otros;
	}
	/**
	 * @return the p_Otros_OBSERVACION
	 */
	public String getP_Otros_OBSERVACION() {
		return P_Otros_OBSERVACION;
	}
	/**
	 * @return the p_Prbolemas_cardiacos
	 */
	public String getP_Prbolemas_cardiacos() {
		return P_Prbolemas_cardiacos;
	}
	/**
	 * @return the p_Prbolemas_cardiacos_OBSERVACION
	 */
	public String getP_Prbolemas_cardiacos_OBSERVACION() {
		return P_Prbolemas_cardiacos_OBSERVACION;
	}
	
	

}
