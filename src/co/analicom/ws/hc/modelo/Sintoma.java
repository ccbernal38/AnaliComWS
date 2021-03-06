/**
 * 
 */
package co.analicom.ws.hc.modelo;

/**
 * @author Cristian Cruz
 */
public class Sintoma {

	/**
	 * Super constructor
	 */
	public Sintoma() {
		// TODO Auto-generated constructor stub
	}
	
	private int fk_IDT_DocumentoID;
	private String visionBorrosaLejana;
	private String visionBorrosaCercana;
	private String Fotofobia;
	private String DolorOcular;
	private String VisionDoble;
	private String Cefalea;
	private String SaltoRenglon;
	private String Epifora;
	private String Enrojecimiento;
	private String SuenioAlLeer;
	private String Ardor;
	private String NoRefiere;

	
	/**
	 * @param fk_IDT_DocumentoID
	 * @param visionBorrosaLejana
	 * @param visionBorrosaCercana
	 * @param fotofobia
	 * @param dolorOcular
	 * @param VisionDoble
	 * @param cefalea
	 * @param saltoRenglon
	 * @param epifora
	 * @param enrojecimiento
	 * @param suenioAlLeer
	 * @param ardor
	 * @param noRefiere
	 */
	public Sintoma(int fk_IDT_DocumentoID, String visionBorrosaLejana, String visionBorrosaCercana, String fotofobia,
			String dolorOcular, String VisionDoble, String cefalea, String saltoRenglon, String epifora,
			String enrojecimiento, String suenioAlLeer, String ardor, String noRefiere) {
		super();
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
		this.visionBorrosaLejana = visionBorrosaLejana;
		this.visionBorrosaCercana = visionBorrosaCercana;
		this.Fotofobia = fotofobia;
		this.DolorOcular = dolorOcular;
		this.VisionDoble = VisionDoble;
		this.Cefalea = cefalea;
		this.SaltoRenglon = saltoRenglon;
		this.Epifora = epifora;
		this.Enrojecimiento = enrojecimiento;
		this.SuenioAlLeer = suenioAlLeer;
		this.Ardor = ardor;
		this.NoRefiere = noRefiere;
	}


	public int getFk_IDT_DocumentoID() {
		return fk_IDT_DocumentoID;
	}


	public void setFk_IDT_DocumentoID(int fk_IDT_DocumentoID) {
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
	}


	public String getVisionBorrosaLejana() {
		return visionBorrosaLejana;
	}


	public void setVisionBorrosaLejana(String visionBorrosaLejana) {
		this.visionBorrosaLejana = visionBorrosaLejana;
	}


	public String getVisionBorrosaCercana() {
		return visionBorrosaCercana;
	}


	public void setVisionBorrosaCercana(String visionBorrosaCercana) {
		this.visionBorrosaCercana = visionBorrosaCercana;
	}


	public String getFotofobia() {
		return Fotofobia;
	}


	public void setFotofobia(String fotofobia) {
		Fotofobia = fotofobia;
	}


	public String getDolorOcular() {
		return DolorOcular;
	}


	public void setDolorOcular(String dolorOcular) {
		DolorOcular = dolorOcular;
	}


	public String getVisionDoble() {
		return VisionDoble;
	}


	public void setVisionDoble(String stringVisionDoble) {
		VisionDoble = stringVisionDoble;
	}


	public String getCefalea() {
		return Cefalea;
	}


	public void setCefalea(String cefalea) {
		Cefalea = cefalea;
	}


	public String getSaltoRenglon() {
		return SaltoRenglon;
	}


	public void setSaltoRenglon(String saltoRenglon) {
		SaltoRenglon = saltoRenglon;
	}


	public String getEpifora() {
		return Epifora;
	}


	public void setEpifora(String epifora) {
		Epifora = epifora;
	}


	public String getEnrojecimiento() {
		return Enrojecimiento;
	}


	public void setEnrojecimiento(String enrojecimiento) {
		Enrojecimiento = enrojecimiento;
	}


	public String getSuenioAlLeer() {
		return SuenioAlLeer;
	}


	public void setSuenioAlLeer(String suenioAlLeer) {
		SuenioAlLeer = suenioAlLeer;
	}


	public String getArdor() {
		return Ardor;
	}


	public void setArdor(String ardor) {
		Ardor = ardor;
	}


	public String getNoRefiere() {
		return NoRefiere;
	}


	public void setNoRefiere(String noRefiere) {
		NoRefiere = noRefiere;
	}
	
	
}
