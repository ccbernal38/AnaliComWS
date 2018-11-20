/**
 * 
 */
package co.analicom.ws.hc.modelo;

/**
 * @author Christian Bernal
 */
public class AntecedenteOptometria {
	int fk_DocumentoID;
	String O_Quirurgicos, P_Diabetes, O_Quirurgicos_observacion, P_Diabetes_observacion, O_Trauma, P_Alergicos,
			O_Trauma_Observacion, P_Alergicos_observacion, O_Esquirlas, P_Alteraciones_tiroides,
			O_Esquirlas_Observacion, P_Alteraciones_tiroides_observacion, O_Quimicos, P_Problemas_cardiacos,
			O_Quimicos_observacion, P_Problemas_cardiacos_observacion, O_Galucoma, P_Otros, O_Galucoma_observacion,
			P_Otros_observacion, O_Rehabilitacion_visual, P_Hipertensión, O_Rehabilitacion_visual_observacion,
			P_Hipertensión_observacion, O_Catarata, O_Usuarios_RX, O_Catarata_observacion, O_Usuarios_RX_observacion,
			O_Otros, O_Otros_observacion;

	public AntecedenteOptometria(int fk_DocumentoID, String o_Quirurgicos, String p_Diabetes,
			String o_Quirurgicos_observacion, String p_Diabetes_observacion, String o_Trauma, String p_Alergicos,
			String o_Trauma_Observacion, String p_Alergicos_observacion, String o_Esquirlas,
			String p_Alteraciones_tiroides, String o_Esquirlas_Observacion, String p_Alteraciones_tiroides_observacion,
			String o_Quimicos, String p_Problemas_cardiacos, String o_Quimicos_observacion,
			String p_Problemas_cardiacos_observacion, String o_Galucoma, String p_Otros, String o_Galucoma_observacion,
			String p_Otros_observacion, String o_Rehabilitacion_visual, String p_Hipertensión,
			String o_Rehabilitacion_visual_observacion, String p_Hipertensión_observacion, String o_Catarata,
			String o_Usuarios_RX, String o_Catarata_observacion, String o_Usuarios_RX_observacion, String o_Otros,
			String o_Otros_observacion) {
		super();
		this.fk_DocumentoID = fk_DocumentoID;
		O_Quirurgicos = o_Quirurgicos;
		P_Diabetes = p_Diabetes;
		O_Quirurgicos_observacion = o_Quirurgicos_observacion;
		P_Diabetes_observacion = p_Diabetes_observacion;
		O_Trauma = o_Trauma;
		P_Alergicos = p_Alergicos;
		O_Trauma_Observacion = o_Trauma_Observacion;
		P_Alergicos_observacion = p_Alergicos_observacion;
		O_Esquirlas = o_Esquirlas;
		P_Alteraciones_tiroides = p_Alteraciones_tiroides;
		O_Esquirlas_Observacion = o_Esquirlas_Observacion;
		P_Alteraciones_tiroides_observacion = p_Alteraciones_tiroides_observacion;
		O_Quimicos = o_Quimicos;
		P_Problemas_cardiacos = p_Problemas_cardiacos;
		O_Quimicos_observacion = o_Quimicos_observacion;
		P_Problemas_cardiacos_observacion = p_Problemas_cardiacos_observacion;
		O_Galucoma = o_Galucoma;
		P_Otros = p_Otros;
		O_Galucoma_observacion = o_Galucoma_observacion;
		P_Otros_observacion = p_Otros_observacion;
		O_Rehabilitacion_visual = o_Rehabilitacion_visual;
		P_Hipertensión = p_Hipertensión;
		O_Rehabilitacion_visual_observacion = o_Rehabilitacion_visual_observacion;
		P_Hipertensión_observacion = p_Hipertensión_observacion;
		O_Catarata = o_Catarata;
		O_Usuarios_RX = o_Usuarios_RX;
		O_Catarata_observacion = o_Catarata_observacion;
		O_Usuarios_RX_observacion = o_Usuarios_RX_observacion;
		O_Otros = o_Otros;
		O_Otros_observacion = o_Otros_observacion;
	}

	public int getFk_DocumentoID() {
		return fk_DocumentoID;
	}

	public void setFk_DocumentoID(int fk_DocumentoID) {
		this.fk_DocumentoID = fk_DocumentoID;
	}

	public String getO_Quirurgicos() {
		return O_Quirurgicos;
	}

	public void setO_Quirurgicos(String o_Quirurgicos) {
		O_Quirurgicos = o_Quirurgicos;
	}

	public String getP_Diabetes() {
		return P_Diabetes;
	}

	public void setP_Diabetes(String p_Diabetes) {
		P_Diabetes = p_Diabetes;
	}

	public String getO_Quirurgicos_observacion() {
		return O_Quirurgicos_observacion;
	}

	public void setO_Quirurgicos_observacion(String o_Quirurgicos_observacion) {
		O_Quirurgicos_observacion = o_Quirurgicos_observacion;
	}

	public String getP_Diabetes_observacion() {
		return P_Diabetes_observacion;
	}

	public void setP_Diabetes_observacion(String p_Diabetes_observacion) {
		P_Diabetes_observacion = p_Diabetes_observacion;
	}

	public String getO_Trauma() {
		return O_Trauma;
	}

	public void setO_Trauma(String o_Trauma) {
		O_Trauma = o_Trauma;
	}

	public String getP_Alergicos() {
		return P_Alergicos;
	}

	public void setP_Alergicos(String p_Alergicos) {
		P_Alergicos = p_Alergicos;
	}

	public String getO_Trauma_Observacion() {
		return O_Trauma_Observacion;
	}

	public void setO_Trauma_Observacion(String o_Trauma_Observacion) {
		O_Trauma_Observacion = o_Trauma_Observacion;
	}

	public String getP_Alergicos_observacion() {
		return P_Alergicos_observacion;
	}

	public void setP_Alergicos_observacion(String p_Alergicos_observacion) {
		P_Alergicos_observacion = p_Alergicos_observacion;
	}

	public String getO_Esquirlas() {
		return O_Esquirlas;
	}

	public void setO_Esquirlas(String o_Esquirlas) {
		O_Esquirlas = o_Esquirlas;
	}

	public String getP_Alteraciones_tiroides() {
		return P_Alteraciones_tiroides;
	}

	public void setP_Alteraciones_tiroides(String p_Alteraciones_tiroides) {
		P_Alteraciones_tiroides = p_Alteraciones_tiroides;
	}

	public String getO_Esquirlas_Observacion() {
		return O_Esquirlas_Observacion;
	}

	public void setO_Esquirlas_Observacion(String o_Esquirlas_Observacion) {
		O_Esquirlas_Observacion = o_Esquirlas_Observacion;
	}

	public String getP_Alteraciones_tiroides_observacion() {
		return P_Alteraciones_tiroides_observacion;
	}

	public void setP_Alteraciones_tiroides_observacion(String p_Alteraciones_tiroides_observacion) {
		P_Alteraciones_tiroides_observacion = p_Alteraciones_tiroides_observacion;
	}

	public String getO_Quimicos() {
		return O_Quimicos;
	}

	public void setO_Quimicos(String o_Quimicos) {
		O_Quimicos = o_Quimicos;
	}

	public String getP_Problemas_cardiacos() {
		return P_Problemas_cardiacos;
	}

	public void setP_Problemas_cardiacos(String p_Problemas_cardiacos) {
		P_Problemas_cardiacos = p_Problemas_cardiacos;
	}

	public String getO_Quimicos_observacion() {
		return O_Quimicos_observacion;
	}

	public void setO_Quimicos_observacion(String o_Quimicos_observacion) {
		O_Quimicos_observacion = o_Quimicos_observacion;
	}

	public String getP_Problemas_cardiacos_observacion() {
		return P_Problemas_cardiacos_observacion;
	}

	public void setP_Problemas_cardiacos_observacion(String p_Problemas_cardiacos_observacion) {
		P_Problemas_cardiacos_observacion = p_Problemas_cardiacos_observacion;
	}

	public String getO_Galucoma() {
		return O_Galucoma;
	}

	public void setO_Galucoma(String o_Galucoma) {
		O_Galucoma = o_Galucoma;
	}

	public String getP_Otros() {
		return P_Otros;
	}

	public void setP_Otros(String p_Otros) {
		P_Otros = p_Otros;
	}

	public String getO_Galucoma_observacion() {
		return O_Galucoma_observacion;
	}

	public void setO_Galucoma_observacion(String o_Galucoma_observacion) {
		O_Galucoma_observacion = o_Galucoma_observacion;
	}

	public String getP_Otros_observacion() {
		return P_Otros_observacion;
	}

	public void setP_Otros_observacion(String p_Otros_observacion) {
		P_Otros_observacion = p_Otros_observacion;
	}

	public String getO_Rehabilitacion_visual() {
		return O_Rehabilitacion_visual;
	}

	public void setO_Rehabilitacion_visual(String o_Rehabilitacion_visual) {
		O_Rehabilitacion_visual = o_Rehabilitacion_visual;
	}

	public String getP_Hipertensión() {
		return P_Hipertensión;
	}

	public void setP_Hipertensión(String p_Hipertensión) {
		P_Hipertensión = p_Hipertensión;
	}

	public String getO_Rehabilitacion_visual_observacion() {
		return O_Rehabilitacion_visual_observacion;
	}

	public void setO_Rehabilitacion_visual_observacion(String o_Rehabilitacion_visual_observacion) {
		O_Rehabilitacion_visual_observacion = o_Rehabilitacion_visual_observacion;
	}

	public String getP_Hipertensión_observacion() {
		return P_Hipertensión_observacion;
	}

	public void setP_Hipertensión_observacion(String p_Hipertensión_observacion) {
		P_Hipertensión_observacion = p_Hipertensión_observacion;
	}

	public String getO_Catarata() {
		return O_Catarata;
	}

	public void setO_Catarata(String o_Catarata) {
		O_Catarata = o_Catarata;
	}

	public String getO_Usuarios_RX() {
		return O_Usuarios_RX;
	}

	public void setO_Usuarios_RX(String o_Usuarios_RX) {
		O_Usuarios_RX = o_Usuarios_RX;
	}

	public String getO_Catarata_observacion() {
		return O_Catarata_observacion;
	}

	public void setO_Catarata_observacion(String o_Catarata_observacion) {
		O_Catarata_observacion = o_Catarata_observacion;
	}

	public String getO_Usuarios_RX_observacion() {
		return O_Usuarios_RX_observacion;
	}

	public void setO_Usuarios_RX_observacion(String o_Usuarios_RX_observacion) {
		O_Usuarios_RX_observacion = o_Usuarios_RX_observacion;
	}

	public String getO_Otros() {
		return O_Otros;
	}

	public void setO_Otros(String o_Otros) {
		O_Otros = o_Otros;
	}

	public String getO_Otros_observacion() {
		return O_Otros_observacion;
	}

	public void setO_Otros_observacion(String o_Otros_observacion) {
		O_Otros_observacion = o_Otros_observacion;
	}

	/**
	 * 
	 */
	public AntecedenteOptometria() {
		// TODO Auto-generated constructor stub
	}

}
