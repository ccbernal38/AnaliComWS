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
import co.analicom.ws.hc.dao.interfacedao.HistoriaVisiometriaDaoInterface;
import co.analicom.ws.hc.modelo.HistoriaVisiometria;
import co.analicom.ws.util.Util;

/**
 * @author Cristian Cruz
 */
public class HistoriaVisiometriaDao implements HistoriaVisiometriaDaoInterface {

	Conexion conexion;

	public HistoriaVisiometriaDao() {
		conexion = new Conexion();
	}

	@Override
	public boolean insertarHistoriaVisiometria(HistoriaVisiometria historiaVisiometria) {

		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "";
				String firmaPaciente = historiaVisiometria.getFirmaPaciente();
				String firmaMedico = historiaVisiometria.getFirmaMedico();

				if (!historiaVisiometria.getFirmaMedico().equals("")
						&& !historiaVisiometria.getFirmaPaciente().equals("")) {
					consulta = "INSERT INTO HistoriaVisiometria (fk_empresa, fk_medico, fk_paciente, "
							+ "tipoExamen, tipoExamenOtro, fechaDiligenciamiento, fechaModificacion, impresionDiagnostica, "
							+ "impresionDiagnosticaObservacion, userModifica, impreso, cantImpresiones, estado, pacienteCompatibleLabor, "
							+ "pacienteCompatibleLabor_Observacion, requiereNuevaValoracion, requiereNuevaValoracion_Observacion, "
							+ "requiereRemisionEspecialista, requiereRemisionEspecialista_Observacion, firmaPaciente, firmaMedico) "
							+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,PutAs(?, 'JPEG'),PutAs(?, 'JPEG'))";

				} else if (!firmaPaciente.equals("") && firmaMedico.equals("")) {
					consulta = "INSERT INTO HistoriaVisiometria (fk_empresa, fk_medico, fk_paciente, "
							+ "tipoExamen, tipoExamenOtro, fechaDiligenciamiento, fechaModificacion, impresionDiagnostica, "
							+ "impresionDiagnosticaObservacion, userModifica, impreso, cantImpresiones, estado, pacienteCompatibleLabor, "
							+ "pacienteCompatibleLabor_Observacion, requiereNuevaValoracion, requiereNuevaValoracion_Observacion, "
							+ "requiereRemisionEspecialista, requiereRemisionEspecialista_Observacion, firmaPaciente) "
							+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,PutAs(?, 'JPEG'))";
				} else if (firmaPaciente.equals("") && !firmaMedico.equals("")) {
					consulta = "INSERT INTO HistoriaVisiometria (fk_empresa, fk_medico, fk_paciente, "
							+ "tipoExamen, tipoExamenOtro, fechaDiligenciamiento, fechaModificacion, impresionDiagnostica, "
							+ "impresionDiagnosticaObservacion, userModifica, impreso, cantImpresiones, estado, pacienteCompatibleLabor, "
							+ "pacienteCompatibleLabor_Observacion, requiereNuevaValoracion, requiereNuevaValoracion_Observacion, "
							+ "requiereRemisionEspecialista, requiereRemisionEspecialista_Observacion, firmaMedico) "
							+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,PutAs(?, 'JPEG'))";
				} else if (firmaPaciente.equals("") && firmaMedico.equals("")) {
					consulta = "INSERT INTO HistoriaVisiometria (fk_empresa, fk_medico, fk_paciente, "
							+ "tipoExamen, tipoExamenOtro, fechaDiligenciamiento, fechaModificacion, impresionDiagnostica, "
							+ "impresionDiagnosticaObservacion, userModifica, impreso, cantImpresiones, estado, pacienteCompatibleLabor, "
							+ "pacienteCompatibleLabor_Observacion, requiereNuevaValoracion, requiereNuevaValoracion_Observacion, "
							+ "requiereRemisionEspecialista, requiereRemisionEspecialista_Observacion) "
							+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				}

				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setInt(1, historiaVisiometria.getFk_empresa());
				statement.setInt(2, historiaVisiometria.getFk_medico());
				statement.setInt(3, historiaVisiometria.getFk_paciente());
				statement.setString(4, historiaVisiometria.getTipoExamen());
				statement.setString(5, historiaVisiometria.getTipoExamenOtro());
				statement.setTimestamp(6, new Timestamp(historiaVisiometria.getFechaDiligenciamiento().getTime()));
				statement.setTimestamp(7, new Timestamp(historiaVisiometria.getFechaModificacion().getTime()));
				statement.setString(8, historiaVisiometria.getImpresionDiagnostica());
				statement.setString(9, historiaVisiometria.getImpresionDiagnosticaObservacion());
				statement.setString(10, historiaVisiometria.getUserModifica());
				statement.setString(11, historiaVisiometria.getImpreso());
				statement.setInt(12, historiaVisiometria.getCantImpresiones());
				statement.setString(13, historiaVisiometria.getEstado());
				statement.setString(14, historiaVisiometria.getPacienteCompatibleLabor());
				statement.setString(15, historiaVisiometria.getPacienteCompatibleLabor_Observacion());
				statement.setString(16, historiaVisiometria.getRequiereNuevaValoracion());
				statement.setString(17, historiaVisiometria.getRequiereNuevaValoracion_Observacion());
				statement.setString(18, historiaVisiometria.getRequiereRemisionEspecialista());
				statement.setString(19, historiaVisiometria.getRequiereRemisionEspecialista_Observacion());

				if (!firmaMedico.equals("") && !firmaPaciente.equals("")) {
					byte[] firmaPacienteByte = Util.convertirABytes(firmaPaciente);
					statement.setBytes(20, firmaPacienteByte);
					byte[] firmaMedicoByte = Util.convertirABytes(firmaMedico);
					statement.setBytes(21, firmaMedicoByte);
				} else if (!firmaPaciente.equals("") && firmaMedico.equals("")) {
					byte[] firmaPacienteByte = Util.convertirABytes(firmaPaciente);
					statement.setBytes(20, firmaPacienteByte);
				} else if (firmaPaciente.equals("") && !firmaMedico.equals("")) {
					byte[] firmaMedicoByte = Util.convertirABytes(firmaMedico);
					statement.setBytes(20, firmaMedicoByte);
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
	public boolean verificarHistoriaVisioExiste(String fecha, String paciente) {

		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "SELECT COUNT(*) FROM PACIENTE WHERE fechaDiligenciamiento = '?' AND fk_paciente = ''?''";

				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, fecha);
				statement.setString(2, paciente);
				ResultSet resultSet = statement.executeQuery();

				if (resultSet.next()) {
					conexion.cerrarConexion();
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("Error en orden: " + e.getLocalizedMessage());
		}
		return false;
	}

	@Override
	public int obtenerID() {
		try {
			List<Integer> integers = new ArrayList<>();
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "SELECT fk_IDT_DocumentoID FROM HistoriaVisiometria";
				PreparedStatement statement = connection.prepareStatement(consulta);
				ResultSet result = statement.executeQuery();
				while (result.next()) {
					integers.add(result.getInt("fk_IDT_DocumentoID"));
				}
				return integers.get(integers.size()-1);
			}

		} catch (Exception e) {
			return -1;
		}
		return -1;
	}
}
