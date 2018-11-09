/**
 * 
 */
package co.analicom.ws.hc.modelo;

import java.util.Date;

/**
 * @author Cristian Daniel Cruz
 *
 */
public class HistoriaVisiometria {

	private int fk_IDT_Documento;
	private int fk_empresa;
	private int fk_medico;
	private int fk_paciente;
	private String tipoExamen;
	private String tipoExamenOtro;
	private Date fechaDiligenciamiento;
	private Date fechaModificacion;
	private String impresionDiagnostica;
	private String impresionDiagnosticaObservacion;
	private String userModifica;
	private String impreso;
	private int cantImpresiones;
	private String estado;
	private String PacienteCompatibleLabor;
	private String PacienteCompatibleLabor_Observacion;
	private String RequiereNuevaValoracion;
	private String RequiereNuevaValoracion_Observacion;
	private String RequiereRemisionEspecialista;
	private String RequiereRemisionEspecialista_Observacion;
	private String firmaPaciente;
	private String firmaMedico;

	/**
	 * Super constructor
	 */
	public HistoriaVisiometria() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fk_IDT_Documento
	 * @param fk_empresa
	 * @param fk_medico
	 * @param fk_paciente
	 * @param tipoExamen
	 * @param tipoExamenOtro
	 * @param fechaDiligenciamiento
	 * @param fechaModificacion
	 * @param impresionDiagnostica
	 * @param impresionDiagnosticaObservacion
	 * @param userModifica
	 * @param impreso
	 * @param cantImpresiones
	 * @param estado
	 * @param pacienteCompatibleLabor
	 * @param pacienteCompatibleLabor_Observacion
	 * @param requiereNuevaValoracion
	 * @param requiereNuevaValoracion_Observacion
	 * @param requiereRemisionEspecialista
	 * @param requiereRemisionEspecialista_Observacion
	 * @param firmaPaciente
	 * @param firmaMedico
	 */

	public HistoriaVisiometria(int fk_IDT_Documento, int fk_empresa, int fk_medico, int fk_paciente, String tipoExamen,
			String tipoExamenOtro, Date fechaDiligenciamiento, Date fechaModificacion, String impresionDiagnostica,
			String impresionDiagnosticaObservacion, String userModifica, String impreso, int cantImpresiones,
			String estado, String pacienteCompatibleLabor, String pacienteCompatibleLabor_Observacion,
			String requiereNuevaValoracion, String requiereNuevaValoracion_Observacion,
			String requiereRemisionEspecialista, String requiereRemisionEspecialista_Observacion, String firmaPaciente,
			String firmaMedico) {
		super();
		this.fk_IDT_Documento = fk_IDT_Documento;
		this.fk_empresa = fk_empresa;
		this.fk_medico = fk_medico;
		this.fk_paciente = fk_paciente;
		this.tipoExamen = tipoExamen;
		this.tipoExamenOtro = tipoExamenOtro;
		this.fechaDiligenciamiento = fechaDiligenciamiento;
		this.fechaModificacion = fechaModificacion;
		this.impresionDiagnostica = impresionDiagnostica;
		this.impresionDiagnosticaObservacion = impresionDiagnosticaObservacion;
		this.userModifica = userModifica;
		this.impreso = impreso;
		this.cantImpresiones = cantImpresiones;
		this.estado = estado;
		PacienteCompatibleLabor = pacienteCompatibleLabor;
		PacienteCompatibleLabor_Observacion = pacienteCompatibleLabor_Observacion;
		RequiereNuevaValoracion = requiereNuevaValoracion;
		RequiereNuevaValoracion_Observacion = requiereNuevaValoracion_Observacion;
		RequiereRemisionEspecialista = requiereRemisionEspecialista;
		RequiereRemisionEspecialista_Observacion = requiereRemisionEspecialista_Observacion;
		this.firmaPaciente = firmaPaciente;
		this.firmaMedico = firmaMedico;
	}

	/**
	 * @return the fk_IDT_Documento
	 */
	public int getFk_IDT_Documento() {
		return fk_IDT_Documento;
	}

	/**
	 * @param fk_IDT_Documento
	 *            the fk_IDT_Documento to set
	 */
	public void setFk_IDT_Documento(int fk_IDT_Documento) {
		this.fk_IDT_Documento = fk_IDT_Documento;
	}

	/**
	 * @return the fk_empresa
	 */
	public int getFk_empresa() {
		return fk_empresa;
	}

	/**
	 * @param fk_empresa
	 *            the fk_empresa to set
	 */
	public void setFk_empresa(int fk_empresa) {
		this.fk_empresa = fk_empresa;
	}

	/**
	 * @return the fk_medico
	 */
	public int getFk_medico() {
		return fk_medico;
	}

	/**
	 * @param fk_medico
	 *            the fk_medico to set
	 */
	public void setFk_medico(int fk_medico) {
		this.fk_medico = fk_medico;
	}

	/**
	 * @return the fk_paciente
	 */
	public int getFk_paciente() {
		return fk_paciente;
	}

	/**
	 * @param fk_paciente
	 *            the fk_paciente to set
	 */
	public void setFk_paciente(int fk_paciente) {
		this.fk_paciente = fk_paciente;
	}

	/**
	 * @return the tipoExamen
	 */
	public String getTipoExamen() {
		return tipoExamen;
	}

	/**
	 * @param tipoExamen
	 *            the tipoExamen to set
	 */
	public void setTipoExamen(String tipoExamen) {
		this.tipoExamen = tipoExamen;
	}

	/**
	 * @return the tipoExamenOtro
	 */
	public String getTipoExamenOtro() {
		return tipoExamenOtro;
	}

	/**
	 * @param tipoExamenOtro
	 *            the tipoExamenOtro to set
	 */
	public void setTipoExamenOtro(String tipoExamenOtro) {
		this.tipoExamenOtro = tipoExamenOtro;
	}

	/**
	 * @return the fechaDiligenciamiento
	 */
	public Date getFechaDiligenciamiento() {
		return fechaDiligenciamiento;
	}

	/**
	 * @param fechaDiligenciamiento
	 *            the fechaDiligenciamiento to set
	 */
	public void setFechaDiligenciamiento(Date fechaDiligenciamiento) {
		this.fechaDiligenciamiento = fechaDiligenciamiento;
	}

	/**
	 * @return the fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * @param fechaModificacion
	 *            the fechaModificacion to set
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * @return the impresionDiagnostica
	 */
	public String getImpresionDiagnostica() {
		return impresionDiagnostica;
	}

	/**
	 * @param impresionDiagnostica
	 *            the impresionDiagnostica to set
	 */
	public void setImpresionDiagnostica(String impresionDiagnostica) {
		this.impresionDiagnostica = impresionDiagnostica;
	}

	/**
	 * @return the impresionDiagnosticaObservacion
	 */
	public String getImpresionDiagnosticaObservacion() {
		return impresionDiagnosticaObservacion;
	}

	/**
	 * @param impresionDiagnosticaObservacion
	 *            the impresionDiagnosticaObservacion to set
	 */
	public void setImpresionDiagnosticaObservacion(String impresionDiagnosticaObservacion) {
		this.impresionDiagnosticaObservacion = impresionDiagnosticaObservacion;
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
	 * @return the cantImpresiones
	 */
	public int getCantImpresiones() {
		return cantImpresiones;
	}

	/**
	 * @param cantImpresiones
	 *            the cantImpresiones to set
	 */
	public void setCantImpresiones(int cantImpresiones) {
		this.cantImpresiones = cantImpresiones;
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
	 * @return the firmaPaciente
	 */
	public String getFirmaPaciente() {
		return firmaPaciente;
	}

	/**
	 * @param firmaPaciente
	 *            the firmaPaciente to set
	 */
	public void setFirmaPaciente(String firmaPaciente) {
		this.firmaPaciente = firmaPaciente;
	}

	/**
	 * @return the firmaMedico
	 */
	public String getFirmaMedico() {
		return firmaMedico;
	}

	/**
	 * @param firmaMedico
	 *            the firmaMedico to set
	 */
	public void setFirmaMedico(String firmaMedico) {
		this.firmaMedico = firmaMedico;
	}

}
