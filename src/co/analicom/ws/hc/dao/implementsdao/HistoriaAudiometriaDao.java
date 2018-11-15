/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.HistoriaAudiometriaDaoInterface;
import co.analicom.ws.hc.modelo.HistoriaAudiometria;

/**
 * @author Cristian Cruz
 */
public class HistoriaAudiometriaDao implements HistoriaAudiometriaDaoInterface{
	
	Conexion conexion;
	
	public HistoriaAudiometriaDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertHistoriaAudiometria(HistoriaAudiometria historiaAudiometria) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				
				String consulta = "INSERT INTO HistoriaAudiometria (estado, impreso, lugar, pacienteCompatibleLabor, PacienteCompatibleLabor_Observacion, "
						+ "RequiereNuevaValoracion, RequiereNuevaValoracion_Observacion, RequiereRemisionEspecialista, RequiereRemisionEspecialista_Observacion, "
						+ "TipoDeExamen, TipoDeExamenExtra, userModifica, usuarioModifica, CantImpresiones, fk_DocumentoMD, fk_Empresa, fk_IDT_DocumentoID, "
						+ "fk_Otoscopia, pk_DocumentoHA, firmaMedico, firmaPaciente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, historiaAudiometria.getEstado());
				statement.setString(2, historiaAudiometria.getImpreso());
				statement.setString(3, historiaAudiometria.getLugar());
				statement.setString(4, historiaAudiometria.getPacienteCompatibleLabor());
				statement.setString(5, historiaAudiometria.getPacienteCompatibleLabor_Observacion());
				statement.setString(6, historiaAudiometria.getRequiereNuevaValoracion());
				statement.setString(7, historiaAudiometria.getRequiereNuevaValoracion_Observacion());
				statement.setString(8, historiaAudiometria.getRequiereRemisionEspecialista());
				statement.setString(9, historiaAudiometria.getRequiereRemisionEspecialista_Observacion());
				statement.setString(10, historiaAudiometria.getTipoDeExamen());
				statement.setString(11, historiaAudiometria.getTipoDeExamenExtra());
				statement.setInt(14, historiaAudiometria.getCantImpresiones());
				statement.setInt(15, historiaAudiometria.getFk_DocumentoMD());
				statement.setInt(16, historiaAudiometria.getFk_Empresa());
				statement.setInt(17, historiaAudiometria.getFk_IDT_DocumentoID());
				statement.setInt(18, historiaAudiometria.getFk_Otoscopia());
				statement.setInt(19, historiaAudiometria.getPk_DocumentoHA());
				statement.setTimestamp(20, new Timestamp(historiaAudiometria.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(21, new Timestamp(historiaAudiometria.getFechaDeModificacion().getTime()));
				statement.setBytes(22, historiaAudiometria.getFirmaMedico());
				statement.setBytes(22, historiaAudiometria.getFirmaPaciente());				
				if(!statement.execute()) {
					System.out.println("Insertado!!");
				}	
				conexion.cerrarConexion();
			}
		} catch (Exception e) {
			System.err.println("Error en la inserción " + e.getLocalizedMessage());
			e.printStackTrace();
			}
		
	}

}
