package co.analicom.ws.hc.modelo;

import java.util.Date;


public class HistoriaClinica {

	public HistoriaClinica() {
	}

	public HistoriaClinica(String accidenteTrabajo, String anular, String enfermedadProfesional, String estado,
			String fk_DocumentoMD, String fk_IDT_DocumentoID, String impreso, String lugar, String medico_cierre,
			String quienModifico, String revisionPorSistema, String tipoDeExamen, String tipoDeExamenExtra,
			String userCierre, String userModifico, String firmaMedico, String firmaPaciente, int cantImpresiones, 
			int id_empresa, int pk_DocumentoHC, Date fechaDeDiligenciamiento, Date fechaCDeDiligenciamiento, Date fechaDeModificacion) {
		super();
		AccidenteTrabajo = accidenteTrabajo;
		this.anular = anular;
		EnfermedadProfesional = enfermedadProfesional;
		Estado = estado;
		this.fk_DocumentoMD = fk_DocumentoMD;
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
		Impreso = impreso;
		Lugar = lugar;
		this.medico_cierre = medico_cierre;
		QuienModifico = quienModifico;
		this.revisionPorSistema = revisionPorSistema;
		TipoDeExamen = tipoDeExamen;
		TipoDeExamenExtra = tipoDeExamenExtra;
		this.userCierre = userCierre;
		UserModifico = userModifico;
		CantImpresiones = cantImpresiones;
		this.id_empresa = id_empresa;
		this.pk_DocumentoHC = pk_DocumentoHC;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaCDeDiligenciamiento = fechaCDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
		this.firmaMedico = firmaMedico;
		this.firmaPaciente = firmaPaciente;
	}

	private String AccidenteTrabajo, anular, EnfermedadProfesional, Estado, fk_DocumentoMD, fk_IDT_DocumentoID, Impreso,
			Lugar, medico_cierre, QuienModifico, revisionPorSistema, TipoDeExamen, TipoDeExamenExtra, userCierre,
			UserModifico, firmaMedico, firmaPaciente;

	private int CantImpresiones, id_empresa, pk_DocumentoHC;

	private Date FechaDeDiligenciamiento, FechaCDeDiligenciamiento, FechaDeModificacion;

	public String getAccidenteTrabajo() {
		return AccidenteTrabajo;
	}

	public void setAccidenteTrabajo(String accidenteTrabajo) {
		AccidenteTrabajo = accidenteTrabajo;
	}

	public String getAnular() {
		return anular;
	}

	public void setAnular(String anular) {
		this.anular = anular;
	}

	public String getEnfermedadProfesional() {
		return EnfermedadProfesional;
	}

	public void setEnfermedadProfesional(String enfermedadProfesional) {
		EnfermedadProfesional = enfermedadProfesional;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getFk_DocumentoMD() {
		return fk_DocumentoMD;
	}

	public void setFk_DocumentoMD(String fk_DocumentoMD) {
		this.fk_DocumentoMD = fk_DocumentoMD;
	}

	public String getFk_IDT_DocumentoID() {
		return fk_IDT_DocumentoID;
	}

	public void setFk_IDT_DocumentoID(String fk_IDT_DocumentoID) {
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
	}

	public String getImpreso() {
		return Impreso;
	}

	public void setImpreso(String impreso) {
		Impreso = impreso;
	}

	public String getLugar() {
		return Lugar;
	}

	public void setLugar(String lugar) {
		Lugar = lugar;
	}

	public String getMedico_cierre() {
		return medico_cierre;
	}

	public void setMedico_cierre(String medico_cierre) {
		this.medico_cierre = medico_cierre;
	}

	public String getQuienModifico() {
		return QuienModifico;
	}

	public void setQuienModifico(String quienModifico) {
		QuienModifico = quienModifico;
	}

	public String getRevisionPorSistema() {
		return revisionPorSistema;
	}

	public void setRevisionPorSistema(String revisionPorSistema) {
		this.revisionPorSistema = revisionPorSistema;
	}

	public String getTipoDeExamen() {
		return TipoDeExamen;
	}

	public void setTipoDeExamen(String tipoDeExamen) {
		TipoDeExamen = tipoDeExamen;
	}

	public String getTipoDeExamenExtra() {
		return TipoDeExamenExtra;
	}

	public void setTipoDeExamenExtra(String tipoDeExamenExtra) {
		TipoDeExamenExtra = tipoDeExamenExtra;
	}

	public String getUserCierre() {
		return userCierre;
	}

	public void setUserCierre(String userCierre) {
		this.userCierre = userCierre;
	}

	public String getUserModifico() {
		return UserModifico;
	}

	public void setUserModifico(String userModifico) {
		UserModifico = userModifico;
	}

	public int getCantImpresiones() {
		return CantImpresiones;
	}

	public void setCantImpresiones(int cantImpresiones) {
		CantImpresiones = cantImpresiones;
	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}

	public int getPk_DocumentoHC() {
		return pk_DocumentoHC;
	}

	public void setPk_DocumentoHC(int pk_DocumentoHC) {
		this.pk_DocumentoHC = pk_DocumentoHC;
	}

	public Date getFechaDeDiligenciamiento() {
		return FechaDeDiligenciamiento;
	}

	public void setFechaDeDiligenciamiento(Date fechaDeDiligenciamiento) {
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
	}

	public Date getFechaCDeDiligenciamiento() {
		return FechaCDeDiligenciamiento;
	}

	public void setFechaCDeDiligenciamiento(Date fechaCDeDiligenciamiento) {
		FechaCDeDiligenciamiento = fechaCDeDiligenciamiento;
	}

	public Date getFechaDeModificacion() {
		return FechaDeModificacion;
	}

	public void setFechaDeModificacion(Date fechaDeModificacion) {
		FechaDeModificacion = fechaDeModificacion;
	}

	public String getFirmaMedico() {
		return firmaMedico;
	}

	public void setFirmaMedico(String firmaMedico) {
		this.firmaMedico = firmaMedico;
	}

	public String getFirmaPaciente() {
		return firmaPaciente;
	}

	public void setFirmaPaciente(String firmaPaciente) {
		this.firmaPaciente = firmaPaciente;
	}

}
