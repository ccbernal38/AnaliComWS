/**
 * 
 */
package co.analicom.ws.hc.modelo;

import java.sql.Blob;
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
	private Blob firmaPaciente;
	private Blob firmaMedico;
	
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
			String requiereRemisionEspecialista, String requiereRemisionEspecialista_Observacion, Blob firmaPaciente,
			Blob firmaMedico) {
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
	
	

}
