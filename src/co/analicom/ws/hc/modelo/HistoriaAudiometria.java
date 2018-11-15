package co.analicom.ws.hc.modelo;

import java.util.Date;


public class HistoriaAudiometria {

	private String estado, impreso, lugar, pacienteCompatibleLabor, PacienteCompatibleLabor_Observacion,
			RequiereNuevaValoracion, RequiereNuevaValoracion_Observacion, RequiereRemisionEspecialista,
			RequiereRemisionEspecialista_Observacion, TipoDeExamen, TipoDeExamenExtra, userModifica, usuarioModifica;
	private int CantImpresiones, fk_DocumentoMD, fk_Empresa, fk_IDT_DocumentoID, fk_Otoscopia, pk_DocumentoHA;
	private Date FechaDeDiligenciamiento, FechaDeModificacion;
	private byte[] firmaMedico, firmaPaciente;

	public HistoriaAudiometria() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param estado
	 * @param impreso
	 * @param lugar
	 * @param pacienteCompatibleLabor
	 * @param pacienteCompatibleLabor_Observacion
	 * @param requiereNuevaValoracion
	 * @param requiereNuevaValoracion_Observacion
	 * @param requiereRemisionEspecialista
	 * @param requiereRemisionEspecialista_Observacion
	 * @param tipoDeExamen
	 * @param tipoDeExamenExtra
	 * @param userModifica
	 * @param usuarioModifica
	 * @param cantImpresiones
	 * @param fk_DocumentoMD
	 * @param fk_Empresa
	 * @param fk_IDT_DocumentoID
	 * @param fk_Otoscopia
	 * @param pk_DocumentoHA
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 * @param firmaMedico
	 * @param firmaPaciente
	 */
	public HistoriaAudiometria(String estado, String impreso, String lugar, String pacienteCompatibleLabor,
			String pacienteCompatibleLabor_Observacion, String requiereNuevaValoracion,
			String requiereNuevaValoracion_Observacion, String requiereRemisionEspecialista,
			String requiereRemisionEspecialista_Observacion, String tipoDeExamen, String tipoDeExamenExtra,
			String userModifica, String usuarioModifica, int cantImpresiones, int fk_DocumentoMD, int fk_Empresa,
			int fk_IDT_DocumentoID, int fk_Otoscopia, int pk_DocumentoHA, Date fechaDeDiligenciamiento,
			Date fechaDeModificacion, byte[] firmaMedico, byte[] firmaPaciente) {
		super();
		this.estado = estado;
		this.impreso = impreso;
		this.lugar = lugar;
		this.pacienteCompatibleLabor = pacienteCompatibleLabor;
		PacienteCompatibleLabor_Observacion = pacienteCompatibleLabor_Observacion;
		RequiereNuevaValoracion = requiereNuevaValoracion;
		RequiereNuevaValoracion_Observacion = requiereNuevaValoracion_Observacion;
		RequiereRemisionEspecialista = requiereRemisionEspecialista;
		RequiereRemisionEspecialista_Observacion = requiereRemisionEspecialista_Observacion;
		TipoDeExamen = tipoDeExamen;
		TipoDeExamenExtra = tipoDeExamenExtra;
		this.userModifica = userModifica;
		this.usuarioModifica = usuarioModifica;
		CantImpresiones = cantImpresiones;
		this.fk_DocumentoMD = fk_DocumentoMD;
		this.fk_Empresa = fk_Empresa;
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
		this.fk_Otoscopia = fk_Otoscopia;
		this.pk_DocumentoHA = pk_DocumentoHA;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
		this.firmaMedico = firmaMedico;
		this.firmaPaciente = firmaPaciente;
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
	 * @return the impreso
	 */
	public String getImpreso() {
		return impreso;
	}

	/**
	 * @param impreso
	 *            the impreso to set
	 */
	public void setImpreso(String impreso) {
		this.impreso = impreso;
	}

	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar
	 *            the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the pacienteCompatibleLabor
	 */
	public String getPacienteCompatibleLabor() {
		return pacienteCompatibleLabor;
	}

	/**
	 * @param pacienteCompatibleLabor
	 *            the pacienteCompatibleLabor to set
	 */
	public void setPacienteCompatibleLabor(String pacienteCompatibleLabor) {
		this.pacienteCompatibleLabor = pacienteCompatibleLabor;
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
	 * @return the usuarioModifica
	 */
	public String getUsuarioModifica() {
		return usuarioModifica;
	}

	/**
	 * @param usuarioModifica
	 *            the usuarioModifica to set
	 */
	public void setUsuarioModifica(String usuarioModifica) {
		this.usuarioModifica = usuarioModifica;
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
	 * @return the fk_DocumentoMD
	 */
	public int getFk_DocumentoMD() {
		return fk_DocumentoMD;
	}

	/**
	 * @param fk_DocumentoMD
	 *            the fk_DocumentoMD to set
	 */
	public void setFk_DocumentoMD(int fk_DocumentoMD) {
		this.fk_DocumentoMD = fk_DocumentoMD;
	}

	/**
	 * @return the fk_Empresa
	 */
	public int getFk_Empresa() {
		return fk_Empresa;
	}

	/**
	 * @param fk_Empresa
	 *            the fk_Empresa to set
	 */
	public void setFk_Empresa(int fk_Empresa) {
		this.fk_Empresa = fk_Empresa;
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
	 * @return the fk_Otoscopia
	 */
	public int getFk_Otoscopia() {
		return fk_Otoscopia;
	}

	/**
	 * @param fk_Otoscopia
	 *            the fk_Otoscopia to set
	 */
	public void setFk_Otoscopia(int fk_Otoscopia) {
		this.fk_Otoscopia = fk_Otoscopia;
	}

	/**
	 * @return the pk_DocumentoHA
	 */
	public int getPk_DocumentoHA() {
		return pk_DocumentoHA;
	}

	/**
	 * @param pk_DocumentoHA
	 *            the pk_DocumentoHA to set
	 */
	public void setPk_DocumentoHA(int pk_DocumentoHA) {
		this.pk_DocumentoHA = pk_DocumentoHA;
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
