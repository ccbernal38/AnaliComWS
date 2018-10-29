<<<<<<< HEAD
package co.analicom.ws.modelo.hc;

/**
 * @author Cristian Cruz
 */
public class RiesgoCargoEvaluar {
	
	private int fk_IDT_DocumentoID;
	private String trauma;
	
	
	/**
	 * Super constructor
	 */
	public RiesgoCargoEvaluar() {
		// TODO Auto-generated constructor stub
	}

}
=======
package co.analicom.ws.modelo.hc;

/**
 * @author Cristian Cruz
 */
public class RiesgoCargoEvaluar {
	
	private int fk_IDT_DocumentoID;
	private String trauma;
	private String EXPOSICIONMATERIALPARTICULADO;
	private String EXPOSICIONMATERIALENPROYECCION;
	private String ILUMINACION;
	private String EXPOSICIONAVIDEOTERMINALES;
	private String EXPOSICIONQUIMICOSYOSOLVENTES;
	private String EXPOSICIONAGASESVAPORES;
	private String RADIACIONESIONIZANTES;
	private String RADIACIONESNOIONIZANTES;
	private String OTROS;	
	
	/**
	 * Super constructor
	 */
	public RiesgoCargoEvaluar() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fk_IDT_DocumentoID
	 * @param trauma
	 * @param eXPOSICIONMATERIALPARTICULADO
	 * @param eXPOSICIONMATERIALENPROYECCION
	 * @param iLUMINACION
	 * @param eXPOSICIONAVIDEOTERMINALES
	 * @param eXPOSICIONQUIMICOSYOSOLVENTES
	 * @param eXPOSICIONAGASESVAPORES
	 * @param rADIACIONESIONIZANTES
	 * @param rADIACIONESNOIONIZANTES
	 * @param oTROS
	 */
	public RiesgoCargoEvaluar(int fk_IDT_DocumentoID, String trauma, String eXPOSICIONMATERIALPARTICULADO,
			String eXPOSICIONMATERIALENPROYECCION, String iLUMINACION, String eXPOSICIONAVIDEOTERMINALES,
			String eXPOSICIONQUIMICOSYOSOLVENTES, String eXPOSICIONAGASESVAPORES, String rADIACIONESIONIZANTES,
			String rADIACIONESNOIONIZANTES, String oTROS) {
		super();
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
		this.trauma = trauma;
		EXPOSICIONMATERIALPARTICULADO = eXPOSICIONMATERIALPARTICULADO;
		EXPOSICIONMATERIALENPROYECCION = eXPOSICIONMATERIALENPROYECCION;
		ILUMINACION = iLUMINACION;
		EXPOSICIONAVIDEOTERMINALES = eXPOSICIONAVIDEOTERMINALES;
		EXPOSICIONQUIMICOSYOSOLVENTES = eXPOSICIONQUIMICOSYOSOLVENTES;
		EXPOSICIONAGASESVAPORES = eXPOSICIONAGASESVAPORES;
		RADIACIONESIONIZANTES = rADIACIONESIONIZANTES;
		RADIACIONESNOIONIZANTES = rADIACIONESNOIONIZANTES;
		OTROS = oTROS;
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
	 * @return the trauma
	 */
	public String getTrauma() {
		return trauma;
	}

	/**
	 * @param trauma the trauma to set
	 */
	public void setTrauma(String trauma) {
		this.trauma = trauma;
	}

	/**
	 * @return the eXPOSICIONMATERIALPARTICULADO
	 */
	public String getEXPOSICIONMATERIALPARTICULADO() {
		return EXPOSICIONMATERIALPARTICULADO;
	}

	/**
	 * @param eXPOSICIONMATERIALPARTICULADO the eXPOSICIONMATERIALPARTICULADO to set
	 */
	public void setEXPOSICIONMATERIALPARTICULADO(String eXPOSICIONMATERIALPARTICULADO) {
		EXPOSICIONMATERIALPARTICULADO = eXPOSICIONMATERIALPARTICULADO;
	}

	/**
	 * @return the eXPOSICIONMATERIALENPROYECCION
	 */
	public String getEXPOSICIONMATERIALENPROYECCION() {
		return EXPOSICIONMATERIALENPROYECCION;
	}

	/**
	 * @param eXPOSICIONMATERIALENPROYECCION the eXPOSICIONMATERIALENPROYECCION to set
	 */
	public void setEXPOSICIONMATERIALENPROYECCION(String eXPOSICIONMATERIALENPROYECCION) {
		EXPOSICIONMATERIALENPROYECCION = eXPOSICIONMATERIALENPROYECCION;
	}

	/**
	 * @return the iLUMINACION
	 */
	public String getILUMINACION() {
		return ILUMINACION;
	}

	/**
	 * @param iLUMINACION the iLUMINACION to set
	 */
	public void setILUMINACION(String iLUMINACION) {
		ILUMINACION = iLUMINACION;
	}

	/**
	 * @return the eXPOSICIONAVIDEOTERMINALES
	 */
	public String getEXPOSICIONAVIDEOTERMINALES() {
		return EXPOSICIONAVIDEOTERMINALES;
	}

	/**
	 * @param eXPOSICIONAVIDEOTERMINALES the eXPOSICIONAVIDEOTERMINALES to set
	 */
	public void setEXPOSICIONAVIDEOTERMINALES(String eXPOSICIONAVIDEOTERMINALES) {
		EXPOSICIONAVIDEOTERMINALES = eXPOSICIONAVIDEOTERMINALES;
	}

	/**
	 * @return the eXPOSICIONQUIMICOSYOSOLVENTES
	 */
	public String getEXPOSICIONQUIMICOSYOSOLVENTES() {
		return EXPOSICIONQUIMICOSYOSOLVENTES;
	}

	/**
	 * @param eXPOSICIONQUIMICOSYOSOLVENTES the eXPOSICIONQUIMICOSYOSOLVENTES to set
	 */
	public void setEXPOSICIONQUIMICOSYOSOLVENTES(String eXPOSICIONQUIMICOSYOSOLVENTES) {
		EXPOSICIONQUIMICOSYOSOLVENTES = eXPOSICIONQUIMICOSYOSOLVENTES;
	}

	/**
	 * @return the eXPOSICIONAGASESVAPORES
	 */
	public String getEXPOSICIONAGASESVAPORES() {
		return EXPOSICIONAGASESVAPORES;
	}

	/**
	 * @param eXPOSICIONAGASESVAPORES the eXPOSICIONAGASESVAPORES to set
	 */
	public void setEXPOSICIONAGASESVAPORES(String eXPOSICIONAGASESVAPORES) {
		EXPOSICIONAGASESVAPORES = eXPOSICIONAGASESVAPORES;
	}

	/**
	 * @return the rADIACIONESIONIZANTES
	 */
	public String getRADIACIONESIONIZANTES() {
		return RADIACIONESIONIZANTES;
	}

	/**
	 * @param rADIACIONESIONIZANTES the rADIACIONESIONIZANTES to set
	 */
	public void setRADIACIONESIONIZANTES(String rADIACIONESIONIZANTES) {
		RADIACIONESIONIZANTES = rADIACIONESIONIZANTES;
	}

	/**
	 * @return the rADIACIONESNOIONIZANTES
	 */
	public String getRADIACIONESNOIONIZANTES() {
		return RADIACIONESNOIONIZANTES;
	}

	/**
	 * @param rADIACIONESNOIONIZANTES the rADIACIONESNOIONIZANTES to set
	 */
	public void setRADIACIONESNOIONIZANTES(String rADIACIONESNOIONIZANTES) {
		RADIACIONESNOIONIZANTES = rADIACIONESNOIONIZANTES;
	}

	/**
	 * @return the oTROS
	 */
	public String getOTROS() {
		return OTROS;
	}

	/**
	 * @param oTROS the oTROS to set
	 */
	public void setOTROS(String oTROS) {
		OTROS = oTROS;
	}
	
	
}
>>>>>>> refs/remotes/origin/master
