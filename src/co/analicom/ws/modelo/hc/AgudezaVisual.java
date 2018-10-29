package co.analicom.ws.modelo.hc;

/**
 * @author Cristian Cruz
 */
public class AgudezaVisual {
	
	private int fk_IDT_DocumentoID;
	private String VisionProfundidadEscribir;
	private String VisionProfundidad;
	private String VisionColorEscribir;
	private String visionColor;
	private String SegmentoAnteriorEscribir;
	private String SegmentoAnterior;
	private String MotilidadOcularEscribir;
	private String MotilidadOcular;
	private String LS_OIObservacion;
	private String LS_OI20;
	private String LS_ODObservacion;
	private String LS_OD20;
	private String LS_BObservacion;
	private String LS_Binocular20;
	private String LC_OIObservacion;
	private String LC_OI20;
	private String LC_ODObservacion;
	private String LC_OD20;
	private String LC_BObservacion;
	private String LC_Binocular20;
	private String CS_OIObservacion;
	private String CS_OI20;
	private String CS_ODObservacion;
	private String CS_OD20;
	private String CS_BObservacion;
	private String CS_Binocular20;
	private String CC_OIObservacion;
	private String CC_OI20;
	private String CC_ODObservacion;
	private String CC_OD20;
	private String CC_BObservacion;
	private String CC_Binocular20;
	private String CampoVisualEscribir;
	private String CampoVisual;
	
	/**
	 * @param fk_IDT_DocumentoID
	 * @param visionProfundidadEscribir
	 * @param visionProfundidad
	 * @param visionColorEscribir
	 * @param visionColor
	 * @param segmentoAnteriorEscribir
	 * @param segmentoAnterior
	 * @param motilidadOcularEscribir
	 * @param motilidadOcular
	 * @param lS_OIObservacion
	 * @param lS_OI20
	 * @param lS_ODObservacion
	 * @param lS_OD20
	 * @param lS_BObservacion
	 * @param lS_Binocular20
	 * @param lC_OIObservacion
	 * @param lC_OI20
	 * @param lC_ODObservacion
	 * @param lC_OD20
	 * @param lC_BObservacion
	 * @param lC_Binocular20
	 * @param cS_OIObservacion
	 * @param cS_OI20
	 * @param cS_ODObservacion
	 * @param cS_OD20
	 * @param cS_BObservacion
	 * @param cS_Binocular20
	 * @param cC_OIObservacion
	 * @param cC_OI20
	 * @param cC_ODObservacion
	 * @param cC_OD20
	 * @param cC_BObservacion
	 * @param cC_Binocular20
	 * @param campoVisualEscribir
	 * @param campoVisual
	 */
	public AgudezaVisual(int fk_IDT_DocumentoID, String visionProfundidadEscribir, String visionProfundidad,
			String visionColorEscribir, String visionColor, String segmentoAnteriorEscribir, String segmentoAnterior,
			String motilidadOcularEscribir, String motilidadOcular, String lS_OIObservacion, String lS_OI20,
			String lS_ODObservacion, String lS_OD20, String lS_BObservacion, String lS_Binocular20,
			String lC_OIObservacion, String lC_OI20, String lC_ODObservacion, String lC_OD20, String lC_BObservacion,
			String lC_Binocular20, String cS_OIObservacion, String cS_OI20, String cS_ODObservacion, String cS_OD20,
			String cS_BObservacion, String cS_Binocular20, String cC_OIObservacion, String cC_OI20,
			String cC_ODObservacion, String cC_OD20, String cC_BObservacion, String cC_Binocular20,
			String campoVisualEscribir, String campoVisual) {
		super();
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
		VisionProfundidadEscribir = visionProfundidadEscribir;
		VisionProfundidad = visionProfundidad;
		VisionColorEscribir = visionColorEscribir;
		this.visionColor = visionColor;
		SegmentoAnteriorEscribir = segmentoAnteriorEscribir;
		SegmentoAnterior = segmentoAnterior;
		MotilidadOcularEscribir = motilidadOcularEscribir;
		MotilidadOcular = motilidadOcular;
		LS_OIObservacion = lS_OIObservacion;
		LS_OI20 = lS_OI20;
		LS_ODObservacion = lS_ODObservacion;
		LS_OD20 = lS_OD20;
		LS_BObservacion = lS_BObservacion;
		LS_Binocular20 = lS_Binocular20;
		LC_OIObservacion = lC_OIObservacion;
		LC_OI20 = lC_OI20;
		LC_ODObservacion = lC_ODObservacion;
		LC_OD20 = lC_OD20;
		LC_BObservacion = lC_BObservacion;
		LC_Binocular20 = lC_Binocular20;
		CS_OIObservacion = cS_OIObservacion;
		CS_OI20 = cS_OI20;
		CS_ODObservacion = cS_ODObservacion;
		CS_OD20 = cS_OD20;
		CS_BObservacion = cS_BObservacion;
		CS_Binocular20 = cS_Binocular20;
		CC_OIObservacion = cC_OIObservacion;
		CC_OI20 = cC_OI20;
		CC_ODObservacion = cC_ODObservacion;
		CC_OD20 = cC_OD20;
		CC_BObservacion = cC_BObservacion;
		CC_Binocular20 = cC_Binocular20;
		CampoVisualEscribir = campoVisualEscribir;
		CampoVisual = campoVisual;
	}

	/**
	 * Super constructor
	 */
	public AgudezaVisual() {
		// TODO Auto-generated constructor stub
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
	 * @return the visionProfundidadEscribir
	 */
	public String getVisionProfundidadEscribir() {
		return VisionProfundidadEscribir;
	}

	/**
	 * @param visionProfundidadEscribir the visionProfundidadEscribir to set
	 */
	public void setVisionProfundidadEscribir(String visionProfundidadEscribir) {
		VisionProfundidadEscribir = visionProfundidadEscribir;
	}

	/**
	 * @return the visionProfundidad
	 */
	public String getVisionProfundidad() {
		return VisionProfundidad;
	}

	/**
	 * @param visionProfundidad the visionProfundidad to set
	 */
	public void setVisionProfundidad(String visionProfundidad) {
		VisionProfundidad = visionProfundidad;
	}

	/**
	 * @return the visionColorEscribir
	 */
	public String getVisionColorEscribir() {
		return VisionColorEscribir;
	}

	/**
	 * @param visionColorEscribir the visionColorEscribir to set
	 */
	public void setVisionColorEscribir(String visionColorEscribir) {
		VisionColorEscribir = visionColorEscribir;
	}

	/**
	 * @return the visionColor
	 */
	public String getVisionColor() {
		return visionColor;
	}

	/**
	 * @param visionColor the visionColor to set
	 */
	public void setVisionColor(String visionColor) {
		this.visionColor = visionColor;
	}

	/**
	 * @return the segmentoAnteriorEscribir
	 */
	public String getSegmentoAnteriorEscribir() {
		return SegmentoAnteriorEscribir;
	}

	/**
	 * @param segmentoAnteriorEscribir the segmentoAnteriorEscribir to set
	 */
	public void setSegmentoAnteriorEscribir(String segmentoAnteriorEscribir) {
		SegmentoAnteriorEscribir = segmentoAnteriorEscribir;
	}

	/**
	 * @return the segmentoAnterior
	 */
	public String getSegmentoAnterior() {
		return SegmentoAnterior;
	}

	/**
	 * @param segmentoAnterior the segmentoAnterior to set
	 */
	public void setSegmentoAnterior(String segmentoAnterior) {
		SegmentoAnterior = segmentoAnterior;
	}

	/**
	 * @return the motilidadOcularEscribir
	 */
	public String getMotilidadOcularEscribir() {
		return MotilidadOcularEscribir;
	}

	/**
	 * @param motilidadOcularEscribir the motilidadOcularEscribir to set
	 */
	public void setMotilidadOcularEscribir(String motilidadOcularEscribir) {
		MotilidadOcularEscribir = motilidadOcularEscribir;
	}

	/**
	 * @return the motilidadOcular
	 */
	public String getMotilidadOcular() {
		return MotilidadOcular;
	}

	/**
	 * @param motilidadOcular the motilidadOcular to set
	 */
	public void setMotilidadOcular(String motilidadOcular) {
		MotilidadOcular = motilidadOcular;
	}

	/**
	 * @return the lS_OIObservacion
	 */
	public String getLS_OIObservacion() {
		return LS_OIObservacion;
	}

	/**
	 * @param lS_OIObservacion the lS_OIObservacion to set
	 */
	public void setLS_OIObservacion(String lS_OIObservacion) {
		LS_OIObservacion = lS_OIObservacion;
	}

	/**
	 * @return the lS_OI20
	 */
	public String getLS_OI20() {
		return LS_OI20;
	}

	/**
	 * @param lS_OI20 the lS_OI20 to set
	 */
	public void setLS_OI20(String lS_OI20) {
		LS_OI20 = lS_OI20;
	}

	/**
	 * @return the lS_ODObservacion
	 */
	public String getLS_ODObservacion() {
		return LS_ODObservacion;
	}

	/**
	 * @param lS_ODObservacion the lS_ODObservacion to set
	 */
	public void setLS_ODObservacion(String lS_ODObservacion) {
		LS_ODObservacion = lS_ODObservacion;
	}

	/**
	 * @return the lS_OD20
	 */
	public String getLS_OD20() {
		return LS_OD20;
	}

	/**
	 * @param lS_OD20 the lS_OD20 to set
	 */
	public void setLS_OD20(String lS_OD20) {
		LS_OD20 = lS_OD20;
	}

	/**
	 * @return the lS_BObservacion
	 */
	public String getLS_BObservacion() {
		return LS_BObservacion;
	}

	/**
	 * @param lS_BObservacion the lS_BObservacion to set
	 */
	public void setLS_BObservacion(String lS_BObservacion) {
		LS_BObservacion = lS_BObservacion;
	}

	/**
	 * @return the lS_Binocular20
	 */
	public String getLS_Binocular20() {
		return LS_Binocular20;
	}

	/**
	 * @param lS_Binocular20 the lS_Binocular20 to set
	 */
	public void setLS_Binocular20(String lS_Binocular20) {
		LS_Binocular20 = lS_Binocular20;
	}

	/**
	 * @return the lC_OIObservacion
	 */
	public String getLC_OIObservacion() {
		return LC_OIObservacion;
	}

	/**
	 * @param lC_OIObservacion the lC_OIObservacion to set
	 */
	public void setLC_OIObservacion(String lC_OIObservacion) {
		LC_OIObservacion = lC_OIObservacion;
	}

	/**
	 * @return the lC_OI20
	 */
	public String getLC_OI20() {
		return LC_OI20;
	}

	/**
	 * @param lC_OI20 the lC_OI20 to set
	 */
	public void setLC_OI20(String lC_OI20) {
		LC_OI20 = lC_OI20;
	}

	/**
	 * @return the lC_ODObservacion
	 */
	public String getLC_ODObservacion() {
		return LC_ODObservacion;
	}

	/**
	 * @param lC_ODObservacion the lC_ODObservacion to set
	 */
	public void setLC_ODObservacion(String lC_ODObservacion) {
		LC_ODObservacion = lC_ODObservacion;
	}

	/**
	 * @return the lC_OD20
	 */
	public String getLC_OD20() {
		return LC_OD20;
	}

	/**
	 * @param lC_OD20 the lC_OD20 to set
	 */
	public void setLC_OD20(String lC_OD20) {
		LC_OD20 = lC_OD20;
	}

	/**
	 * @return the lC_BObservacion
	 */
	public String getLC_BObservacion() {
		return LC_BObservacion;
	}

	/**
	 * @param lC_BObservacion the lC_BObservacion to set
	 */
	public void setLC_BObservacion(String lC_BObservacion) {
		LC_BObservacion = lC_BObservacion;
	}

	/**
	 * @return the lC_Binocular20
	 */
	public String getLC_Binocular20() {
		return LC_Binocular20;
	}

	/**
	 * @param lC_Binocular20 the lC_Binocular20 to set
	 */
	public void setLC_Binocular20(String lC_Binocular20) {
		LC_Binocular20 = lC_Binocular20;
	}

	/**
	 * @return the cS_OIObservacion
	 */
	public String getCS_OIObservacion() {
		return CS_OIObservacion;
	}

	/**
	 * @param cS_OIObservacion the cS_OIObservacion to set
	 */
	public void setCS_OIObservacion(String cS_OIObservacion) {
		CS_OIObservacion = cS_OIObservacion;
	}

	/**
	 * @return the cS_OI20
	 */
	public String getCS_OI20() {
		return CS_OI20;
	}

	/**
	 * @param cS_OI20 the cS_OI20 to set
	 */
	public void setCS_OI20(String cS_OI20) {
		CS_OI20 = cS_OI20;
	}

	/**
	 * @return the cS_ODObservacion
	 */
	public String getCS_ODObservacion() {
		return CS_ODObservacion;
	}

	/**
	 * @param cS_ODObservacion the cS_ODObservacion to set
	 */
	public void setCS_ODObservacion(String cS_ODObservacion) {
		CS_ODObservacion = cS_ODObservacion;
	}

	/**
	 * @return the cS_OD20
	 */
	public String getCS_OD20() {
		return CS_OD20;
	}

	/**
	 * @param cS_OD20 the cS_OD20 to set
	 */
	public void setCS_OD20(String cS_OD20) {
		CS_OD20 = cS_OD20;
	}

	/**
	 * @return the cS_BObservacion
	 */
	public String getCS_BObservacion() {
		return CS_BObservacion;
	}

	/**
	 * @param cS_BObservacion the cS_BObservacion to set
	 */
	public void setCS_BObservacion(String cS_BObservacion) {
		CS_BObservacion = cS_BObservacion;
	}

	/**
	 * @return the cS_Binocular20
	 */
	public String getCS_Binocular20() {
		return CS_Binocular20;
	}

	/**
	 * @param cS_Binocular20 the cS_Binocular20 to set
	 */
	public void setCS_Binocular20(String cS_Binocular20) {
		CS_Binocular20 = cS_Binocular20;
	}

	/**
	 * @return the cC_OIObservacion
	 */
	public String getCC_OIObservacion() {
		return CC_OIObservacion;
	}

	/**
	 * @param cC_OIObservacion the cC_OIObservacion to set
	 */
	public void setCC_OIObservacion(String cC_OIObservacion) {
		CC_OIObservacion = cC_OIObservacion;
	}

	/**
	 * @return the cC_OI20
	 */
	public String getCC_OI20() {
		return CC_OI20;
	}

	/**
	 * @param cC_OI20 the cC_OI20 to set
	 */
	public void setCC_OI20(String cC_OI20) {
		CC_OI20 = cC_OI20;
	}

	/**
	 * @return the cC_ODObservacion
	 */
	public String getCC_ODObservacion() {
		return CC_ODObservacion;
	}

	/**
	 * @param cC_ODObservacion the cC_ODObservacion to set
	 */
	public void setCC_ODObservacion(String cC_ODObservacion) {
		CC_ODObservacion = cC_ODObservacion;
	}

	/**
	 * @return the cC_OD20
	 */
	public String getCC_OD20() {
		return CC_OD20;
	}

	/**
	 * @param cC_OD20 the cC_OD20 to set
	 */
	public void setCC_OD20(String cC_OD20) {
		CC_OD20 = cC_OD20;
	}

	/**
	 * @return the cC_BObservacion
	 */
	public String getCC_BObservacion() {
		return CC_BObservacion;
	}

	/**
	 * @param cC_BObservacion the cC_BObservacion to set
	 */
	public void setCC_BObservacion(String cC_BObservacion) {
		CC_BObservacion = cC_BObservacion;
	}

	/**
	 * @return the cC_Binocular20
	 */
	public String getCC_Binocular20() {
		return CC_Binocular20;
	}

	/**
	 * @param cC_Binocular20 the cC_Binocular20 to set
	 */
	public void setCC_Binocular20(String cC_Binocular20) {
		CC_Binocular20 = cC_Binocular20;
	}

	/**
	 * @return the campoVisualEscribir
	 */
	public String getCampoVisualEscribir() {
		return CampoVisualEscribir;
	}

	/**
	 * @param campoVisualEscribir the campoVisualEscribir to set
	 */
	public void setCampoVisualEscribir(String campoVisualEscribir) {
		CampoVisualEscribir = campoVisualEscribir;
	}

	/**
	 * @return the campoVisual
	 */
	public String getCampoVisual() {
		return CampoVisual;
	}

	/**
	 * @param campoVisual the campoVisual to set
	 */
	public void setCampoVisual(String campoVisual) {
		CampoVisual = campoVisual;
	}
	
	
}
