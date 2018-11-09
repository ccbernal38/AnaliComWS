/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.HistoriaVisiometriaDaoInterface;
import co.analicom.ws.hc.modelo.HistoriaVisiometria;
import co.analicom.ws.util.Util;

/**
 * @author Cristian Cruz
 */
public class HistoriaVisiometriaDao implements HistoriaVisiometriaDaoInterface{
	
	Conexion conexion;
	
	public HistoriaVisiometriaDao() {
		conexion = new Conexion();
	}

	@Override
	public void insertarHistoriaVisiometria(HistoriaVisiometria historiaVisiometria) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO HistoriaVisiometria (fk_IDT_DocumentoID, fk_empresa, fk_medico, fk_paciente, "
						+ "tipoExamen, tipoExamenOtro, fechaDiligenciamiento, fechaModificacion, impresionDiagnostica, "
						+ "impresionDiagnosticaObservacion, userModifica, impreso, cantImpresiones, estado, pacienteCompatibleLabor, "
						+ "pacienteCompatibleLabor_Observacion, requiereNuevaValoracion, requiereNuevaValoracion_Observacion, "
						+ "requiereRemisionEspecialista, requiereRemisionEspecialista_Observacion, firmaPaciente, firmaMedico) "
						+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,PutAs(?, 'JPEG'),PutAs(?, 'JPEG'))";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setInt(1, historiaVisiometria.getFk_IDT_Documento());
				statement.setInt(2, historiaVisiometria.getFk_empresa());
				statement.setInt(3, historiaVisiometria.getFk_medico());
				statement.setInt(4, historiaVisiometria.getFk_paciente());
				statement.setString(5, historiaVisiometria.getTipoExamen());
				statement.setString(6, historiaVisiometria.getTipoExamenOtro());
				statement.setTimestamp(7, new Timestamp(historiaVisiometria.getFechaDiligenciamiento().getTime()));
				statement.setTimestamp(8, new Timestamp(historiaVisiometria.getFechaModificacion().getTime()));
				statement.setString(9, historiaVisiometria.getImpresionDiagnostica());
				statement.setString(10, historiaVisiometria.getImpresionDiagnosticaObservacion());
				statement.setString(11, historiaVisiometria.getUserModifica());
				statement.setString(12, historiaVisiometria.getImpreso());
				statement.setInt(13, historiaVisiometria.getCantImpresiones());
				statement.setString(14, historiaVisiometria.getEstado());
				statement.setString(15, historiaVisiometria.getPacienteCompatibleLabor());
				statement.setString(16, historiaVisiometria.getPacienteCompatibleLabor_Observacion());
				statement.setString(17, historiaVisiometria.getRequiereNuevaValoracion());
				statement.setString(18, historiaVisiometria.getRequiereNuevaValoracion_Observacion());
				statement.setString(19, historiaVisiometria.getRequiereRemisionEspecialista());
				statement.setString(20, historiaVisiometria.getRequiereRemisionEspecialista_Observacion());
				
				String firmaPaciente = historiaVisiometria.getFirmaPaciente();
				String firmaMedico = historiaVisiometria.getFirmaMedico();
				
				if (firmaPaciente != null) {
					byte [] firmaPacienteByte = Util.convertirABytes(firmaPaciente);
					statement.setBytes(21, firmaPacienteByte);					
				}
				if (firmaMedico != null) {
					byte [] firmaMedicoByte  = Util.convertirABytes(firmaMedico);
					statement.setBytes(22, firmaMedicoByte);					
				}
				if(!statement.execute()) {
					System.out.println("Insertado!!");
				}
			}
							
		} catch (Exception e) {
			System.err.println("Error en la inserción " + e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

	@Override
	public boolean verificarHistoriaVisioExiste(String fecha, String paciente) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "SELECT COUNT(*) FROM PACIENTE WHERE fechaDiligenciamiento = '?' AND fk_paciente = ''?''";
				
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, fecha);
				statement.setString(2, paciente);
				ResultSet resultSet = statement.executeQuery();
				
				if(resultSet.next()) {
					conexion.cerrarConexion();
					return true;
				}
			}
		} catch(Exception e) {
			System.out.println("Error en orden: " + e.getLocalizedMessage());
		}
		return false;
	}
	
}
