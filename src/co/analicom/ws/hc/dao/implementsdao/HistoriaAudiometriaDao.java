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
import co.analicom.ws.hc.dao.interfacedao.HistoriaAudiometriaDaoInterface;
import co.analicom.ws.hc.modelo.HistoriaAudiometria;
import co.analicom.ws.util.Util;

/**
 * @author Cristian Cruz
 */
public class HistoriaAudiometriaDao implements HistoriaAudiometriaDaoInterface {

	Conexion conexion;

	public HistoriaAudiometriaDao() {
		conexion = new Conexion();
	}

	@Override
	public boolean insertHistoriaAudiometria(HistoriaAudiometria historiaAudiometria) {

		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String firmaPaciente = historiaAudiometria.getFirmaPaciente();
				String firmaMedico = historiaAudiometria.getFirmaMedico();

				String consulta = "";
				if (!historiaAudiometria.getFirmaMedico().equals("")
						&& !historiaAudiometria.getFirmaPaciente().equals("")) {
					consulta = "INSERT INTO HistoriaAudiometria (estado, impreso, lugar, pacienteCompatibleLabor, PacienteCompatibleLabor_Observacion, "
							+ "RequiereNuevaValoracion, RequiereNuevaValoracion_Observacion, RequiereRemisionEspecialista, RequiereRemisionEspecialista_Observacion, "
							+ "TipoDeExamen, TipoDeExamenExtra, CantImpresiones, fk_DocumentoMD, fk_Empresa, fk_IDT_DocumentoID, "
							+ "fk_Otoscopia,FechaDeDiligenciamiento, firmaMedico, firmaPaciente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,PutAs(?, 'JPEG'),PutAs(?, 'JPEG'))";

				} else if (!firmaPaciente.equals("") && firmaMedico.equals("")) {
					consulta = "INSERT INTO HistoriaAudiometria (estado, impreso, lugar, pacienteCompatibleLabor, PacienteCompatibleLabor_Observacion, "
							+ "RequiereNuevaValoracion, RequiereNuevaValoracion_Observacion, RequiereRemisionEspecialista, RequiereRemisionEspecialista_Observacion, "
							+ "TipoDeExamen, TipoDeExamenExtra, CantImpresiones, fk_DocumentoMD, fk_Empresa, fk_IDT_DocumentoID, "
							+ "fk_Otoscopia,FechaDeDiligenciamiento, firmaPaciente) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,PutAs(?, 'JPEG'))";
				} else if (firmaPaciente.equals("") && !firmaMedico.equals("")) {
					consulta = "INSERT INTO HistoriaAudiometria (estado, impreso, lugar, pacienteCompatibleLabor, PacienteCompatibleLabor_Observacion, "
							+ "RequiereNuevaValoracion, RequiereNuevaValoracion_Observacion, RequiereRemisionEspecialista, RequiereRemisionEspecialista_Observacion, "
							+ "TipoDeExamen, TipoDeExamenExtra, CantImpresiones, fk_DocumentoMD, fk_Empresa, fk_IDT_DocumentoID, "
							+ "fk_Otoscopia,FechaDeDiligenciamiento, firmaMedico) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,PutAs(?, 'JPEG'))";
				} else if (firmaPaciente.equals("") && firmaMedico.equals("")) {
					consulta = "INSERT INTO HistoriaAudiometria (estado, impreso, lugar, pacienteCompatibleLabor, PacienteCompatibleLabor_Observacion, "
							+ "RequiereNuevaValoracion, RequiereNuevaValoracion_Observacion, RequiereRemisionEspecialista, RequiereRemisionEspecialista_Observacion, "
							+ "TipoDeExamen, TipoDeExamenExtra, CantImpresiones, fk_DocumentoMD, fk_Empresa, fk_IDT_DocumentoID, "
							+ "fk_Otoscopia,FechaDeDiligenciamiento) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				}

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
				statement.setInt(12, historiaAudiometria.getCantImpresiones());
				statement.setInt(13, historiaAudiometria.getFk_DocumentoMD());
				statement.setInt(14, historiaAudiometria.getFk_Empresa());
				statement.setInt(15, historiaAudiometria.getFk_IDT_DocumentoID());
				statement.setInt(16, historiaAudiometria.getFk_Otoscopia());
				statement.setInt(16, historiaAudiometria.getFk_Otoscopia());
				statement.setTimestamp(17, new Timestamp(historiaAudiometria.getFechaDeDiligenciamiento().getTime()));

				if (!firmaMedico.equals("") && !firmaPaciente.equals("")) {
					byte[] firmaPacienteByte = Util.convertirABytes(firmaPaciente);
					statement.setBytes(19, firmaPacienteByte);
					byte[] firmaMedicoByte = Util.convertirABytes(firmaMedico);
					statement.setBytes(18, firmaMedicoByte);
				} else if (!firmaPaciente.equals("") && firmaMedico.equals("")) {
					byte[] firmaPacienteByte = Util.convertirABytes(firmaPaciente);
					statement.setBytes(18, firmaPacienteByte);
				} else if (firmaPaciente.equals("") && !firmaMedico.equals("")) {
					byte[] firmaMedicoByte = Util.convertirABytes(firmaMedico);
					statement.setBytes(18, firmaMedicoByte);
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
				String consulta = "SELECT pk_DocumentoHA FROM HistoriaAudiometria";
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
