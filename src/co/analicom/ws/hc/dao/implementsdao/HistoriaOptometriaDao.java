/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.HistoriaOptometriaDaoInterface;
import co.analicom.ws.hc.modelo.HistoriaOptometria;
import co.analicom.ws.util.Util;

/**
 * @author Cristian Cruz
 */
public class HistoriaOptometriaDao implements HistoriaOptometriaDaoInterface {

	Conexion conexion;

	public HistoriaOptometriaDao() {
		conexion = new Conexion();
	}

	@Override
	public boolean insertHistoriaOptometria(HistoriaOptometria historiaOptometria) {

		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {

				String firmaPaciente = historiaOptometria.getFirmaPaciente();
				String firmaMedico = historiaOptometria.getFirmaMedico();

				String consulta = "";
				if (!historiaOptometria.getFirmaMedico().equals("")
						&& !historiaOptometria.getFirmaPaciente().equals("")) {
					consulta = "INSERT INTO HistoriaOptometria (ADDLENSOMETRIA, estado, FO_OI, FO_OI_Escribir, FO_OD, FO_OD_escribir, "
							+ "Impreso, Lugar, Motilidad_ocular, Motilidad_ocular_escribir, OD_LENSOMETRIA, OI_LENSOMETRIA, PacienteCompatibleLabor, "
							+ "PacienteCompatibleLabor_Observacion, RequiereNuevaValoracion, RequiereNuevaValoracion_Observacion, RequiereRemisionEspecialista, "
							+ "RequiereRemisionEspecialista_Observacion, Retino_ADD, Retino_OD, Retino_OI, SA_Camara_Anterior, SACamaraAnteriorEscribir, "
							+ "SACejas, SACejasEscribir, SAConjuntiva, SAConjuntivaEscribir, SACornea, SACorneaEscribir, SAEsclerotica, SAEscleroticaEscribir, "
							+ "SAIris, SAIrisEscribir, SAParpados, SAParpadosEscribir, SAPestanas, SAPestanasEscribir, SAPupilas, SAPupilasEscribir, "
							+ "SAViasLagrimales, SAViasLagrimalesEscribir, TipoDeExamen, TipoDeExamenExtra, TipoLente, userModifica, VisionColor, "
							+ "VisionColorEscribir, VisionProfundidad, fk_DocumentoMD, fk_Empresa, fk_IDT_DocumentoID, "
							+ "CantImpresiones, FechaDeDiligenciamiento, FechaDeModificacion, firmaMedico, firmaPaciente) VALUES "
							+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,PutAs(?, 'JPEG'),PutAs(?, 'JPEG'))";

				} else if (!firmaPaciente.equals("") && firmaMedico.equals("")) {
					consulta = "INSERT INTO HistoriaOptometria (ADDLENSOMETRIA, estado, FO_OI, FO_OI_Escribir, FO_OD, FO_OD_escribir, "
							+ "Impreso, Lugar, Motilidad_ocular, Motilidad_ocular_escribir, OD_LENSOMETRIA, OI_LENSOMETRIA, PacienteCompatibleLabor, "
							+ "PacienteCompatibleLabor_Observacion, RequiereNuevaValoracion, RequiereNuevaValoracion_Observacion, RequiereRemisionEspecialista, "
							+ "RequiereRemisionEspecialista_Observacion, Retino_ADD, Retino_OD, Retino_OI, SA_Camara_Anterior, SACamaraAnteriorEscribir, "
							+ "SACejas, SACejasEscribir, SAConjuntiva, SAConjuntivaEscribir, SACornea, SACorneaEscribir, SAEsclerotica, SAEscleroticaEscribir, "
							+ "SAIris, SAIrisEscribir, SAParpados, SAParpadosEscribir, SAPestanas, SAPestanasEscribir, SAPupilas, SAPupilasEscribir, "
							+ "SAViasLagrimales, SAViasLagrimalesEscribir, TipoDeExamen, TipoDeExamenExtra, TipoLente, userModifica, VisionColor, "
							+ "VisionColorEscribir, VisionProfundidad, fk_DocumentoMD, fk_Empresa, fk_IDT_DocumentoID, "
							+ "CantImpresiones, FechaDeDiligenciamiento, FechaDeModificacion, firmaPaciente) VALUES "
							+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,PutAs(?, 'JPEG'))";
				} else if (firmaPaciente.equals("") && !firmaMedico.equals("")) {
					consulta = "INSERT INTO HistoriaOptometria (ADDLENSOMETRIA, estado, FO_OI, FO_OI_Escribir, FO_OD, FO_OD_escribir, "
							+ "Impreso, Lugar, Motilidad_ocular, Motilidad_ocular_escribir, OD_LENSOMETRIA, OI_LENSOMETRIA, PacienteCompatibleLabor, "
							+ "PacienteCompatibleLabor_Observacion, RequiereNuevaValoracion, RequiereNuevaValoracion_Observacion, RequiereRemisionEspecialista, "
							+ "RequiereRemisionEspecialista_Observacion, Retino_ADD, Retino_OD, Retino_OI, SA_Camara_Anterior, SACamaraAnteriorEscribir, "
							+ "SACejas, SACejasEscribir, SAConjuntiva, SAConjuntivaEscribir, SACornea, SACorneaEscribir, SAEsclerotica, SAEscleroticaEscribir, "
							+ "SAIris, SAIrisEscribir, SAParpados, SAParpadosEscribir, SAPestanas, SAPestanasEscribir, SAPupilas, SAPupilasEscribir, "
							+ "SAViasLagrimales, SAViasLagrimalesEscribir, TipoDeExamen, TipoDeExamenExtra, TipoLente, userModifica, VisionColor, "
							+ "VisionColorEscribir, VisionProfundidad, fk_DocumentoMD, fk_Empresa, fk_IDT_DocumentoID, "
							+ "CantImpresiones, FechaDeDiligenciamiento, FechaDeModificacion, firmaMedico) VALUES "
							+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,PutAs(?, 'JPEG'))";
				} else if (firmaPaciente.equals("") && firmaMedico.equals("")) {
					consulta = "INSERT INTO HistoriaOptometria (ADDLENSOMETRIA, estado, FO_OI, FO_OI_Escribir, FO_OD, FO_OD_escribir, "
							+ "Impreso, Lugar, Motilidad_ocular, Motilidad_ocular_escribir, OD_LENSOMETRIA, OI_LENSOMETRIA, PacienteCompatibleLabor, "
							+ "PacienteCompatibleLabor_Observacion, RequiereNuevaValoracion, RequiereNuevaValoracion_Observacion, RequiereRemisionEspecialista, "
							+ "RequiereRemisionEspecialista_Observacion, Retino_ADD, Retino_OD, Retino_OI, SA_Camara_Anterior, SACamaraAnteriorEscribir, "
							+ "SACejas, SACejasEscribir, SAConjuntiva, SAConjuntivaEscribir, SACornea, SACorneaEscribir, SAEsclerotica, SAEscleroticaEscribir, "
							+ "SAIris, SAIrisEscribir, SAParpados, SAParpadosEscribir, SAPestanas, SAPestanasEscribir, SAPupilas, SAPupilasEscribir, "
							+ "SAViasLagrimales, SAViasLagrimalesEscribir, TipoDeExamen, TipoDeExamenExtra, TipoLente, userModifica, VisionColor, "
							+ "VisionColorEscribir, VisionProfundidad, fk_DocumentoMD, fk_Empresa, fk_IDT_DocumentoID, "
							+ "CantImpresiones, FechaDeDiligenciamiento, FechaDeModificacion) VALUES "
							+ "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				}

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
				statement.setString(36, historiaOptometria.getSAPestanas());
				statement.setString(37, historiaOptometria.getSAPestanasEscribir());
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
				statement.setInt(49, historiaOptometria.getfk_DocumentoMD());
				statement.setInt(50, historiaOptometria.getfk_Empresa());
				statement.setInt(51, historiaOptometria.getfk_IDT_DocumentoID());
				statement.setInt(52, historiaOptometria.getCantImpresiones());
				statement.setTimestamp(53, new Timestamp(historiaOptometria.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(54, new Timestamp(historiaOptometria.getFechaDeModificacion().getTime()));

				if (!firmaMedico.equals("") && !firmaPaciente.equals("")) {
					byte[] firmaPacienteByte = Util.convertirABytes(firmaPaciente);
					statement.setBytes(56, firmaPacienteByte);
					byte[] firmaMedicoByte = Util.convertirABytes(firmaMedico);
					statement.setBytes(55, firmaMedicoByte);
				} else if (!firmaPaciente.equals("") && firmaMedico.equals("")) {
					byte[] firmaPacienteByte = Util.convertirABytes(firmaPaciente);
					statement.setBytes(55, firmaPacienteByte);
				} else if (firmaPaciente.equals("") && !firmaMedico.equals("")) {
					byte[] firmaMedicoByte = Util.convertirABytes(firmaMedico);
					statement.setBytes(55, firmaMedicoByte);
				}

				if (!statement.execute()) {
					System.out.println("Insertado!!");
				}
				conexion.cerrarConexion();
				return true;
			}
		} catch (Exception e) {
			System.err.println("Error en la inserción " + e.getLocalizedMessage());
			e.printStackTrace();
			return false;
		}
		return false;

	}

	@Override
	public int obtenerID() {
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				List<Integer> list = new ArrayList<>();
				String consulta = "SELECT pk_DocumentoHO FROM HistoriaOptometria";
				PreparedStatement statement = connection.prepareStatement(consulta);
				ResultSet result = statement.executeQuery();
				while (result.next()) {
					list.add(result.getInt(1));
				}
				return list.get(list.size() - 1);
			}

		} catch (Exception e) {
			return -1;
		}
		return -1;
	}
}
