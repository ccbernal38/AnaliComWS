/**
 * 
 */
package co.analicom.ws.hc.modelo;

import java.util.Date;


/**
 * @author Christian Bernal
 */
public class HistoriaOptometria {

	public HistoriaOptometria() {
		// TODO Auto-generated constructor stub
	}

	private String ADDLENSOMETRIA, estado, FO_OI, FO_OI_Escribir, FO_OD, FO_OD_escribir, Impreso, Lugar,
			Motilidad_ocular, Motilidad_ocular_escribir, OD_LENSOMETRIA, OI_LENSOMETRIA, PacienteCompatibleLabor,
			PacienteCompatibleLabor_Observacion, RequiereNuevaValoracion, RequiereNuevaValoracion_Observacion,
			RequiereRemisionEspecialista, RequiereRemisionEspecialista_Observacion, Retino_ADD, Retino_OD, Retino_OI,
			SA_Camara_Anterior, SACamaraAnteriorEscribir, SACejas, SACejasEscribir, SAConjuntiva, SAConjuntivaEscribir,
			SACornea, SACorneaEscribir, SAEsclerotica, SAEscleroticaEscribir, SAIris, SAIrisEscribir, SAParpados,
			SAParpadosEscribir, SAPestañas, SAPestañasEscribir, SAPupilas, SAPupilasEscribir, SAViasLagrimales,
			SAViasLagrimalesEscribir, TipoDeExamen, TipoDeExamenExtra, TipoLente, userModifica, VisionColor,
			VisionColorEscribir, VisionProfundidad;
	private int __pk_DocumentoHO, _fk_DocumentoMD, _fk_Empresa, _fk_IDT_DocumentoID, CantImpresiones;
	private Date FechaDeDiligenciamiento, FechaDeModificacion;
	private byte[] firmaMedico, firmaPaciente;

	/**
	 * @param aDDLENSOMETRIA
	 * @param estado
	 * @param fO_OI
	 * @param fO_OI_Escribir
	 * @param fO_OD
	 * @param fO_OD_escribir
	 * @param impreso
	 * @param lugar
	 * @param motilidad_ocular
	 * @param motilidad_ocular_escribir
	 * @param oD_LENSOMETRIA
	 * @param oI_LENSOMETRIA
	 * @param pacienteCompatibleLabor
	 * @param pacienteCompatibleLabor_Observacion
	 * @param requiereNuevaValoracion
	 * @param requiereNuevaValoracion_Observacion
	 * @param requiereRemisionEspecialista
	 * @param requiereRemisionEspecialista_Observacion
	 * @param retino_ADD
	 * @param retino_OD
	 * @param retino_OI
	 * @param sA_Camara_Anterior
	 * @param sACamaraAnteriorEscribir
	 * @param sACejas
	 * @param sACejasEscribir
	 * @param sAConjuntiva
	 * @param sAConjuntivaEscribir
	 * @param sACornea
	 * @param sACorneaEscribir
	 * @param sAEsclerotica
	 * @param sAEscleroticaEscribir
	 * @param sAIris
	 * @param sAIrisEscribir
	 * @param sAParpados
	 * @param sAParpadosEscribir
	 * @param sAPestañas
	 * @param sAPestañasEscribir
	 * @param sAPupilas
	 * @param sAPupilasEscribir
	 * @param sAViasLagrimales
	 * @param sAViasLagrimalesEscribir
	 * @param tipoDeExamen
	 * @param tipoDeExamenExtra
	 * @param tipoLente
	 * @param userModifica
	 * @param visionColor
	 * @param visionColorEscribir
	 * @param visionProfundidad
	 * @param __pk_DocumentoHO
	 * @param _fk_DocumentoMD
	 * @param _fk_Empresa
	 * @param _fk_IDT_DocumentoID
	 * @param cantImpresiones
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 * @param firmaMedico
	 * @param firmaPaciente
	 */
	public HistoriaOptometria(String aDDLENSOMETRIA, String estado, String fO_OI, String fO_OI_Escribir, String fO_OD,
			String fO_OD_escribir, String impreso, String lugar, String motilidad_ocular,
			String motilidad_ocular_escribir, String oD_LENSOMETRIA, String oI_LENSOMETRIA,
			String pacienteCompatibleLabor, String pacienteCompatibleLabor_Observacion, String requiereNuevaValoracion,
			String requiereNuevaValoracion_Observacion, String requiereRemisionEspecialista,
			String requiereRemisionEspecialista_Observacion, String retino_ADD, String retino_OD, String retino_OI,
			String sA_Camara_Anterior, String sACamaraAnteriorEscribir, String sACejas, String sACejasEscribir,
			String sAConjuntiva, String sAConjuntivaEscribir, String sACornea, String sACorneaEscribir,
			String sAEsclerotica, String sAEscleroticaEscribir, String sAIris, String sAIrisEscribir, String sAParpados,
			String sAParpadosEscribir, String sAPestañas, String sAPestañasEscribir, String sAPupilas,
			String sAPupilasEscribir, String sAViasLagrimales, String sAViasLagrimalesEscribir, String tipoDeExamen,
			String tipoDeExamenExtra, String tipoLente, String userModifica, String visionColor,
			String visionColorEscribir, String visionProfundidad, int __pk_DocumentoHO, int _fk_DocumentoMD,
			int _fk_Empresa, int _fk_IDT_DocumentoID, int cantImpresiones, Date fechaDeDiligenciamiento,
			Date fechaDeModificacion, byte[] firmaMedico, byte[] firmaPaciente) {
		super();
		ADDLENSOMETRIA = aDDLENSOMETRIA;
		this.estado = estado;
		FO_OI = fO_OI;
		FO_OI_Escribir = fO_OI_Escribir;
		FO_OD = fO_OD;
		FO_OD_escribir = fO_OD_escribir;
		Impreso = impreso;
		Lugar = lugar;
		Motilidad_ocular = motilidad_ocular;
		Motilidad_ocular_escribir = motilidad_ocular_escribir;
		OD_LENSOMETRIA = oD_LENSOMETRIA;
		OI_LENSOMETRIA = oI_LENSOMETRIA;
		PacienteCompatibleLabor = pacienteCompatibleLabor;
		PacienteCompatibleLabor_Observacion = pacienteCompatibleLabor_Observacion;
		RequiereNuevaValoracion = requiereNuevaValoracion;
		RequiereNuevaValoracion_Observacion = requiereNuevaValoracion_Observacion;
		RequiereRemisionEspecialista = requiereRemisionEspecialista;
		RequiereRemisionEspecialista_Observacion = requiereRemisionEspecialista_Observacion;
		Retino_ADD = retino_ADD;
		Retino_OD = retino_OD;
		Retino_OI = retino_OI;
		SA_Camara_Anterior = sA_Camara_Anterior;
		SACamaraAnteriorEscribir = sACamaraAnteriorEscribir;
		SACejas = sACejas;
		SACejasEscribir = sACejasEscribir;
		SAConjuntiva = sAConjuntiva;
		SAConjuntivaEscribir = sAConjuntivaEscribir;
		SACornea = sACornea;
		SACorneaEscribir = sACorneaEscribir;
		SAEsclerotica = sAEsclerotica;
		SAEscleroticaEscribir = sAEscleroticaEscribir;
		SAIris = sAIris;
		SAIrisEscribir = sAIrisEscribir;
		SAParpados = sAParpados;
		SAParpadosEscribir = sAParpadosEscribir;
		SAPestañas = sAPestañas;
		SAPestañasEscribir = sAPestañasEscribir;
		SAPupilas = sAPupilas;
		SAPupilasEscribir = sAPupilasEscribir;
		SAViasLagrimales = sAViasLagrimales;
		SAViasLagrimalesEscribir = sAViasLagrimalesEscribir;
		TipoDeExamen = tipoDeExamen;
		TipoDeExamenExtra = tipoDeExamenExtra;
		TipoLente = tipoLente;
		this.userModifica = userModifica;
		VisionColor = visionColor;
		VisionColorEscribir = visionColorEscribir;
		VisionProfundidad = visionProfundidad;
		this.__pk_DocumentoHO = __pk_DocumentoHO;
		this._fk_DocumentoMD = _fk_DocumentoMD;
		this._fk_Empresa = _fk_Empresa;
		this._fk_IDT_DocumentoID = _fk_IDT_DocumentoID;
		CantImpresiones = cantImpresiones;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
		this.firmaMedico = firmaMedico;
		this.firmaPaciente = firmaPaciente;
	}

	/**
	 * @return the aDDLENSOMETRIA
	 */
	public String getADDLENSOMETRIA() {
		return ADDLENSOMETRIA;
	}

	/**
	 * @param aDDLENSOMETRIA
	 *            the aDDLENSOMETRIA to set
	 */
	public void setADDLENSOMETRIA(String aDDLENSOMETRIA) {
		ADDLENSOMETRIA = aDDLENSOMETRIA;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the fO_OI
	 */
	public String getFO_OI() {
		return FO_OI;
	}

	/**
	 * @param fO_OI
	 *            the fO_OI to set
	 */
	public void setFO_OI(String fO_OI) {
		FO_OI = fO_OI;
	}

	/**
	 * @return the fO_OI_Escribir
	 */
	public String getFO_OI_Escribir() {
		return FO_OI_Escribir;
	}

	/**
	 * @param fO_OI_Escribir
	 *            the fO_OI_Escribir to set
	 */
	public void setFO_OI_Escribir(String fO_OI_Escribir) {
		FO_OI_Escribir = fO_OI_Escribir;
	}

	/**
	 * @return the fO_OD
	 */
	public String getFO_OD() {
		return FO_OD;
	}

	/**
	 * @param fO_OD
	 *            the fO_OD to set
	 */
	public void setFO_OD(String fO_OD) {
		FO_OD = fO_OD;
	}

	/**
	 * @return the fO_OD_escribir
	 */
	public String getFO_OD_escribir() {
		return FO_OD_escribir;
	}

	/**
	 * @param fO_OD_escribir
	 *            the fO_OD_escribir to set
	 */
	public void setFO_OD_escribir(String fO_OD_escribir) {
		FO_OD_escribir = fO_OD_escribir;
	}

	/**
	 * @return the impreso
	 */
	public String getImpreso() {
		return Impreso;
	}

	/**
	 * @param impreso
	 *            the impreso to set
	 */
	public void setImpreso(String impreso) {
		Impreso = impreso;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return Lugar;
	}

	/**
	 * @param lugar
	 *            the lugar to set
	 */
	public void setLugar(String lugar) {
		Lugar = lugar;
	}

	/**
	 * @return the motilidad_ocular
	 */
	public String getMotilidad_ocular() {
		return Motilidad_ocular;
	}

	/**
	 * @param motilidad_ocular
	 *            the motilidad_ocular to set
	 */
	public void setMotilidad_ocular(String motilidad_ocular) {
		Motilidad_ocular = motilidad_ocular;
	}

	/**
	 * @return the motilidad_ocular_escribir
	 */
	public String getMotilidad_ocular_escribir() {
		return Motilidad_ocular_escribir;
	}

	/**
	 * @param motilidad_ocular_escribir
	 *            the motilidad_ocular_escribir to set
	 */
	public void setMotilidad_ocular_escribir(String motilidad_ocular_escribir) {
		Motilidad_ocular_escribir = motilidad_ocular_escribir;
	}

	/**
	 * @return the oD_LENSOMETRIA
	 */
	public String getOD_LENSOMETRIA() {
		return OD_LENSOMETRIA;
	}

	/**
	 * @param oD_LENSOMETRIA
	 *            the oD_LENSOMETRIA to set
	 */
	public void setOD_LENSOMETRIA(String oD_LENSOMETRIA) {
		OD_LENSOMETRIA = oD_LENSOMETRIA;
	}

	/**
	 * @return the oI_LENSOMETRIA
	 */
	public String getOI_LENSOMETRIA() {
		return OI_LENSOMETRIA;
	}

	/**
	 * @param oI_LENSOMETRIA
	 *            the oI_LENSOMETRIA to set
	 */
	public void setOI_LENSOMETRIA(String oI_LENSOMETRIA) {
		OI_LENSOMETRIA = oI_LENSOMETRIA;
	}

	/**
	 * @return the pacienteCompatibleLabor
	 */
	public String getPacienteCompatibleLabor() {
		return PacienteCompatibleLabor;
	}

	/**
	 * @param pacienteCompatibleLabor
	 *            the pacienteCompatibleLabor to set
	 */
	public void setPacienteCompatibleLabor(String pacienteCompatibleLabor) {
		PacienteCompatibleLabor = pacienteCompatibleLabor;
	}

	/**
	 * @return the pacienteCompatibleLabor_Observacion
	 */
	public String getPacienteCompatibleLabor_Observacion() {
		return PacienteCompatibleLabor_Observacion;
	}

	/**
	 * @param pacienteCompatibleLabor_Observacion
	 *            the pacienteCompatibleLabor_Observacion to set
	 */
	public void setPacienteCompatibleLabor_Observacion(String pacienteCompatibleLabor_Observacion) {
		PacienteCompatibleLabor_Observacion = pacienteCompatibleLabor_Observacion;
	}

	/**
	 * @return the requiereNuevaValoracion
	 */
	public String getRequiereNuevaValoracion() {
		return RequiereNuevaValoracion;
	}

	/**
	 * @param requiereNuevaValoracion
	 *            the requiereNuevaValoracion to set
	 */
	public void setRequiereNuevaValoracion(String requiereNuevaValoracion) {
		RequiereNuevaValoracion = requiereNuevaValoracion;
	}

	/**
	 * @return the requiereNuevaValoracion_Observacion
	 */
	public String getRequiereNuevaValoracion_Observacion() {
		return RequiereNuevaValoracion_Observacion;
	}

	/**
	 * @param requiereNuevaValoracion_Observacion
	 *            the requiereNuevaValoracion_Observacion to set
	 */
	public void setRequiereNuevaValoracion_Observacion(String requiereNuevaValoracion_Observacion) {
		RequiereNuevaValoracion_Observacion = requiereNuevaValoracion_Observacion;
	}

	/**
	 * @return the requiereRemisionEspecialista
	 */
	public String getRequiereRemisionEspecialista() {
		return RequiereRemisionEspecialista;
	}

	/**
	 * @param requiereRemisionEspecialista
	 *            the requiereRemisionEspecialista to set
	 */
	public void setRequiereRemisionEspecialista(String requiereRemisionEspecialista) {
		RequiereRemisionEspecialista = requiereRemisionEspecialista;
	}

	/**
	 * @return the requiereRemisionEspecialista_Observacion
	 */
	public String getRequiereRemisionEspecialista_Observacion() {
		return RequiereRemisionEspecialista_Observacion;
	}

	/**
	 * @param requiereRemisionEspecialista_Observacion
	 *            the requiereRemisionEspecialista_Observacion to set
	 */
	public void setRequiereRemisionEspecialista_Observacion(String requiereRemisionEspecialista_Observacion) {
		RequiereRemisionEspecialista_Observacion = requiereRemisionEspecialista_Observacion;
	}

	/**
	 * @return the retino_ADD
	 */
	public String getRetino_ADD() {
		return Retino_ADD;
	}

	/**
	 * @param retino_ADD
	 *            the retino_ADD to set
	 */
	public void setRetino_ADD(String retino_ADD) {
		Retino_ADD = retino_ADD;
	}

	/**
	 * @return the retino_OD
	 */
	public String getRetino_OD() {
		return Retino_OD;
	}

	/**
	 * @param retino_OD
	 *            the retino_OD to set
	 */
	public void setRetino_OD(String retino_OD) {
		Retino_OD = retino_OD;
	}

	/**
	 * @return the retino_OI
	 */
	public String getRetino_OI() {
		return Retino_OI;
	}

	/**
	 * @param retino_OI
	 *            the retino_OI to set
	 */
	public void setRetino_OI(String retino_OI) {
		Retino_OI = retino_OI;
	}

	/**
	 * @return the sA_Camara_Anterior
	 */
	public String getSA_Camara_Anterior() {
		return SA_Camara_Anterior;
	}

	/**
	 * @param sA_Camara_Anterior
	 *            the sA_Camara_Anterior to set
	 */
	public void setSA_Camara_Anterior(String sA_Camara_Anterior) {
		SA_Camara_Anterior = sA_Camara_Anterior;
	}

	/**
	 * @return the sACamaraAnteriorEscribir
	 */
	public String getSACamaraAnteriorEscribir() {
		return SACamaraAnteriorEscribir;
	}

	/**
	 * @param sACamaraAnteriorEscribir
	 *            the sACamaraAnteriorEscribir to set
	 */
	public void setSACamaraAnteriorEscribir(String sACamaraAnteriorEscribir) {
		SACamaraAnteriorEscribir = sACamaraAnteriorEscribir;
	}

	/**
	 * @return the sACejas
	 */
	public String getSACejas() {
		return SACejas;
	}

	/**
	 * @param sACejas
	 *            the sACejas to set
	 */
	public void setSACejas(String sACejas) {
		SACejas = sACejas;
	}

	/**
	 * @return the sACejasEscribir
	 */
	public String getSACejasEscribir() {
		return SACejasEscribir;
	}

	/**
	 * @param sACejasEscribir
	 *            the sACejasEscribir to set
	 */
	public void setSACejasEscribir(String sACejasEscribir) {
		SACejasEscribir = sACejasEscribir;
	}

	/**
	 * @return the sAConjuntiva
	 */
	public String getSAConjuntiva() {
		return SAConjuntiva;
	}

	/**
	 * @param sAConjuntiva
	 *            the sAConjuntiva to set
	 */
	public void setSAConjuntiva(String sAConjuntiva) {
		SAConjuntiva = sAConjuntiva;
	}

	/**
	 * @return the sAConjuntivaEscribir
	 */
	public String getSAConjuntivaEscribir() {
		return SAConjuntivaEscribir;
	}

	/**
	 * @param sAConjuntivaEscribir
	 *            the sAConjuntivaEscribir to set
	 */
	public void setSAConjuntivaEscribir(String sAConjuntivaEscribir) {
		SAConjuntivaEscribir = sAConjuntivaEscribir;
	}

	/**
	 * @return the sACornea
	 */
	public String getSACornea() {
		return SACornea;
	}

	/**
	 * @param sACornea
	 *            the sACornea to set
	 */
	public void setSACornea(String sACornea) {
		SACornea = sACornea;
	}

	/**
	 * @return the sACorneaEscribir
	 */
	public String getSACorneaEscribir() {
		return SACorneaEscribir;
	}

	/**
	 * @param sACorneaEscribir
	 *            the sACorneaEscribir to set
	 */
	public void setSACorneaEscribir(String sACorneaEscribir) {
		SACorneaEscribir = sACorneaEscribir;
	}

	/**
	 * @return the sAEsclerotica
	 */
	public String getSAEsclerotica() {
		return SAEsclerotica;
	}

	/**
	 * @param sAEsclerotica
	 *            the sAEsclerotica to set
	 */
	public void setSAEsclerotica(String sAEsclerotica) {
		SAEsclerotica = sAEsclerotica;
	}

	/**
	 * @return the sAEscleroticaEscribir
	 */
	public String getSAEscleroticaEscribir() {
		return SAEscleroticaEscribir;
	}

	/**
	 * @param sAEscleroticaEscribir
	 *            the sAEscleroticaEscribir to set
	 */
	public void setSAEscleroticaEscribir(String sAEscleroticaEscribir) {
		SAEscleroticaEscribir = sAEscleroticaEscribir;
	}

	/**
	 * @return the sAIris
	 */
	public String getSAIris() {
		return SAIris;
	}

	/**
	 * @param sAIris
	 *            the sAIris to set
	 */
	public void setSAIris(String sAIris) {
		SAIris = sAIris;
	}

	/**
	 * @return the sAIrisEscribir
	 */
	public String getSAIrisEscribir() {
		return SAIrisEscribir;
	}

	/**
	 * @param sAIrisEscribir
	 *            the sAIrisEscribir to set
	 */
	public void setSAIrisEscribir(String sAIrisEscribir) {
		SAIrisEscribir = sAIrisEscribir;
	}

	/**
	 * @return the sAParpados
	 */
	public String getSAParpados() {
		return SAParpados;
	}

	/**
	 * @param sAParpados
	 *            the sAParpados to set
	 */
	public void setSAParpados(String sAParpados) {
		SAParpados = sAParpados;
	}

	/**
	 * @return the sAParpadosEscribir
	 */
	public String getSAParpadosEscribir() {
		return SAParpadosEscribir;
	}

	/**
	 * @param sAParpadosEscribir
	 *            the sAParpadosEscribir to set
	 */
	public void setSAParpadosEscribir(String sAParpadosEscribir) {
		SAParpadosEscribir = sAParpadosEscribir;
	}

	/**
	 * @return the sAPestañas
	 */
	public String getSAPestañas() {
		return SAPestañas;
	}

	/**
	 * @param sAPestañas
	 *            the sAPestañas to set
	 */
	public void setSAPestañas(String sAPestañas) {
		SAPestañas = sAPestañas;
	}

	/**
	 * @return the sAPestañasEscribir
	 */
	public String getSAPestañasEscribir() {
		return SAPestañasEscribir;
	}

	/**
	 * @param sAPestañasEscribir
	 *            the sAPestañasEscribir to set
	 */
	public void setSAPestañasEscribir(String sAPestañasEscribir) {
		SAPestañasEscribir = sAPestañasEscribir;
	}

	/**
	 * @return the sAPupilas
	 */
	public String getSAPupilas() {
		return SAPupilas;
	}

	/**
	 * @param sAPupilas
	 *            the sAPupilas to set
	 */
	public void setSAPupilas(String sAPupilas) {
		SAPupilas = sAPupilas;
	}

	/**
	 * @return the sAPupilasEscribir
	 */
	public String getSAPupilasEscribir() {
		return SAPupilasEscribir;
	}

	/**
	 * @param sAPupilasEscribir
	 *            the sAPupilasEscribir to set
	 */
	public void setSAPupilasEscribir(String sAPupilasEscribir) {
		SAPupilasEscribir = sAPupilasEscribir;
	}

	/**
	 * @return the sAViasLagrimales
	 */
	public String getSAViasLagrimales() {
		return SAViasLagrimales;
	}

	/**
	 * @param sAViasLagrimales
	 *            the sAViasLagrimales to set
	 */
	public void setSAViasLagrimales(String sAViasLagrimales) {
		SAViasLagrimales = sAViasLagrimales;
	}

	/**
	 * @return the sAViasLagrimalesEscribir
	 */
	public String getSAViasLagrimalesEscribir() {
		return SAViasLagrimalesEscribir;
	}

	/**
	 * @param sAViasLagrimalesEscribir
	 *            the sAViasLagrimalesEscribir to set
	 */
	public void setSAViasLagrimalesEscribir(String sAViasLagrimalesEscribir) {
		SAViasLagrimalesEscribir = sAViasLagrimalesEscribir;
	}

	/**
	 * @return the tipoDeExamen
	 */
	public String getTipoDeExamen() {
		return TipoDeExamen;
	}

	/**
	 * @param tipoDeExamen
	 *            the tipoDeExamen to set
	 */
	public void setTipoDeExamen(String tipoDeExamen) {
		TipoDeExamen = tipoDeExamen;
	}

	/**
	 * @return the tipoDeExamenExtra
	 */
	public String getTipoDeExamenExtra() {
		return TipoDeExamenExtra;
	}

	/**
	 * @param tipoDeExamenExtra
	 *            the tipoDeExamenExtra to set
	 */
	public void setTipoDeExamenExtra(String tipoDeExamenExtra) {
		TipoDeExamenExtra = tipoDeExamenExtra;
	}

	/**
	 * @return the tipoLente
	 */
	public String getTipoLente() {
		return TipoLente;
	}

	/**
	 * @param tipoLente
	 *            the tipoLente to set
	 */
	public void setTipoLente(String tipoLente) {
		TipoLente = tipoLente;
	}

	/**
	 * @return the userModifica
	 */
	public String getUserModifica() {
		return userModifica;
	}

	/**
	 * @param userModifica
	 *            the userModifica to set
	 */
	public void setUserModifica(String userModifica) {
		this.userModifica = userModifica;
	}

	/**
	 * @return the visionColor
	 */
	public String getVisionColor() {
		return VisionColor;
	}

	/**
	 * @param visionColor
	 *            the visionColor to set
	 */
	public void setVisionColor(String visionColor) {
		VisionColor = visionColor;
	}

	/**
	 * @return the visionColorEscribir
	 */
	public String getVisionColorEscribir() {
		return VisionColorEscribir;
	}

	/**
	 * @param visionColorEscribir
	 *            the visionColorEscribir to set
	 */
	public void setVisionColorEscribir(String visionColorEscribir) {
		VisionColorEscribir = visionColorEscribir;
	}

	/**
	 * @return the visionProfundidad
	 */
	public String getVisionProfundidad() {
		return VisionProfundidad;
	}

	/**
	 * @param visionProfundidad
	 *            the visionProfundidad to set
	 */
	public void setVisionProfundidad(String visionProfundidad) {
		VisionProfundidad = visionProfundidad;
	}

	/**
	 * @return the __pk_DocumentoHO
	 */
	public int get__pk_DocumentoHO() {
		return __pk_DocumentoHO;
	}

	/**
	 * @param __pk_DocumentoHO
	 *            the __pk_DocumentoHO to set
	 */
	public void set__pk_DocumentoHO(int __pk_DocumentoHO) {
		this.__pk_DocumentoHO = __pk_DocumentoHO;
	}

	/**
	 * @return the _fk_DocumentoMD
	 */
	public int get_fk_DocumentoMD() {
		return _fk_DocumentoMD;
	}

	/**
	 * @param _fk_DocumentoMD
	 *            the _fk_DocumentoMD to set
	 */
	public void set_fk_DocumentoMD(int _fk_DocumentoMD) {
		this._fk_DocumentoMD = _fk_DocumentoMD;
	}

	/**
	 * @return the _fk_Empresa
	 */
	public int get_fk_Empresa() {
		return _fk_Empresa;
	}

	/**
	 * @param _fk_Empresa
	 *            the _fk_Empresa to set
	 */
	public void set_fk_Empresa(int _fk_Empresa) {
		this._fk_Empresa = _fk_Empresa;
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

	/**
	 * @return the cantImpresiones
	 */
	public int getCantImpresiones() {
		return CantImpresiones;
	}

	/**
	 * @param cantImpresiones
	 *            the cantImpresiones to set
	 */
	public void setCantImpresiones(int cantImpresiones) {
		CantImpresiones = cantImpresiones;
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

	/**
	 * @return the firmaMedico
	 */
	public byte[] getFirmaMedico() {
		return firmaMedico;
	}

	/**
	 * @param firmaMedico
	 *            the firmaMedico to set
	 */
	public void setFirmaMedico(byte[] firmaMedico) {
		this.firmaMedico = firmaMedico;
	}

	/**
	 * @return the firmaPaciente
	 */
	public byte[] getFirmaPaciente() {
		return firmaPaciente;
	}

	/**
	 * @param firmaPaciente
	 *            the firmaPaciente to set
	 */
	public void setFirmaPaciente(byte[] firmaPaciente) {
		this.firmaPaciente = firmaPaciente;
	}

}
