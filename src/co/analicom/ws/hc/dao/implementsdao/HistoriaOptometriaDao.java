/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.HistoriaOptometriaDaoInterface;
import co.analicom.ws.hc.modelo.HistoriaOptometria;

/**
 * @author Cristian Cruz
 */
public class HistoriaOptometriaDao implements HistoriaOptometriaDaoInterface{
	
	Conexion conexion;
	
	public HistoriaOptometriaDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertHistoriaOptometria(HistoriaOptometria historiaOptometria) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				
				String consulta = "INSERT INTO HistoriaOptometria (ADDLENSOMETRIA, estado, FO_OI, FO_OI_Escribir, FO_OD, FO_OD_escribir, "
						+ "Impreso, Lugar, Motilidad_ocular, Motilidad_ocular_escribir, OD_LENSOMETRIA, OI_LENSOMETRIA, PacienteCompatibleLabor, "
						+ "PacienteCompatibleLabor_Observacion, RequiereNuevaValoracion, RequiereNuevaValoracion_Observacion, RequiereRemisionEspecialista, "
						+ "RequiereRemisionEspecialista_Observacion, Retino_ADD, Retino_OD, Retino_OI, SA_Camara_Anterior, SACamaraAnteriorEscribir, "
						+ "SACejas, SACejasEscribir, SAConjuntiva, SAConjuntivaEscribir, SACornea, SACorneaEscribir, SAEsclerotica, SAEscleroticaEscribir, "
						+ "SAIris, SAIrisEscribir, SAParpados, SAParpadosEscribir, SAPestañas, SAPestañasEscribir, SAPupilas, SAPupilasEscribir, "
						+ "SAViasLagrimales, SAViasLagrimalesEscribir, TipoDeExamen, TipoDeExamenExtra, TipoLente, userModifica, VisionColor, "
						+ "VisionColorEscribir, VisionProfundidad, __pk_DocumentoHO, _fk_DocumentoMD, _fk_Empresa, _fk_IDT_DocumentoID, "
						+ "CantImpresiones, FechaDeDiligenciamiento, FechaDeModificacion, firmaMedico, firmaPaciente) VALUES "
						+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, historiaOptometria.getADDLENSOMETRIA());
				statement.setString(2, historiaOptometria.getEstado());
				statement.setString(3, historiaOptometria.getFO_OI());
				statement.setString(4, historiaOptometria.getFO_OI_Escribir());
				statement.setString(5, historiaOptometria.getFO_OD());
				statement.setString(6, historiaOptometria.getFO_OD_escribir());
				statement.setString(7, historiaOptometria.getImpreso());
				statement.setString(8, historiaOptometria.getLugar());
				statement.setString(9, historiaOptometria.getMotilidad_ocular());
				statement.setString(10, historiaOptometria.getMotilidad_ocular_escribir());
				statement.setString(11, historiaOptometria.getOD_LENSOMETRIA());
				statement.setString(12, historiaOptometria.getOI_LENSOMETRIA());
				statement.setString(13, historiaOptometria.getPacienteCompatibleLabor());
				statement.setString(14, historiaOptometria.getPacienteCompatibleLabor_Observacion());
				statement.setString(15, historiaOptometria.getRequiereNuevaValoracion());
				statement.setString(16, historiaOptometria.getRequiereNuevaValoracion_Observacion());
				statement.setString(17, historiaOptometria.getRequiereRemisionEspecialista());
				statement.setString(18, historiaOptometria.getRequiereRemisionEspecialista_Observacion());
				statement.setString(19, historiaOptometria.getRetino_ADD());
				statement.setString(20, historiaOptometria.getRetino_OD());
				statement.setString(21, historiaOptometria.getRetino_OI());
				statement.setString(22, historiaOptometria.getSA_Camara_Anterior());
				statement.setString(23, historiaOptometria.getSACamaraAnteriorEscribir());
				statement.setString(24, historiaOptometria.getSACejas());
				statement.setString(25, historiaOptometria.getSACejasEscribir());
				statement.setString(26, historiaOptometria.getSAConjuntiva());
				statement.setString(27, historiaOptometria.getSAConjuntivaEscribir());
				statement.setString(28, historiaOptometria.getSACornea());
				statement.setString(29, historiaOptometria.getSACorneaEscribir());
				statement.setString(30, historiaOptometria.getSAEsclerotica());
				statement.setString(31, historiaOptometria.getSAEscleroticaEscribir());
				statement.setString(32, historiaOptometria.getSAIris());
				statement.setString(33, historiaOptometria.getSAIrisEscribir());
				statement.setString(34, historiaOptometria.getSAParpados());
				statement.setString(35, historiaOptometria.getSAParpadosEscribir());
				statement.setString(36, historiaOptometria.getSAPestañas());
				statement.setString(37, historiaOptometria.getSAPestañasEscribir());
				statement.setString(38, historiaOptometria.getSAPupilas());
				statement.setString(39, historiaOptometria.getSAPupilasEscribir());
				statement.setString(40, historiaOptometria.getSAViasLagrimales());
				statement.setString(41, historiaOptometria.getSAViasLagrimalesEscribir());
				statement.setString(42, historiaOptometria.getTipoDeExamen());
				statement.setString(43, historiaOptometria.getTipoDeExamenExtra());
				statement.setString(44, historiaOptometria.getTipoLente());
				statement.setString(45, historiaOptometria.getUserModifica());
				statement.setString(46, historiaOptometria.getVisionColor());
				statement.setString(47, historiaOptometria.getVisionColorEscribir());
				statement.setString(48, historiaOptometria.getVisionProfundidad());
				statement.setInt(49, historiaOptometria.get__pk_DocumentoHO());
				statement.setInt(50, historiaOptometria.get_fk_DocumentoMD());
				statement.setInt(51, historiaOptometria.get_fk_Empresa());
				statement.setInt(52, historiaOptometria.get_fk_IDT_DocumentoID());
				statement.setInt(53, historiaOptometria.getCantImpresiones());
				statement.setTimestamp(54, new Timestamp(historiaOptometria.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(55, new Timestamp(historiaOptometria.getFechaDeModificacion().getTime()));
				statement.setBytes(56, historiaOptometria.getFirmaMedico());
				statement.setBytes(57, historiaOptometria.getFirmaPaciente());
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
