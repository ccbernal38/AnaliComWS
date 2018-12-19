/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.HistoriaClinicaInterfaceDao;
import co.analicom.ws.hc.modelo.HistoriaClinica;

/**
 * @author Cristian Cruz
 */
public class HistoriaClinicaDao implements HistoriaClinicaInterfaceDao {

	Conexion conexion;

	public HistoriaClinicaDao() {
		conexion = new Conexion();
	}

	@Override
	public boolean insertHistoriaClinica(HistoriaClinica clinica) {

		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO HistoriaClinica (AccidenteTrabajo, anular, EnfermedadProfesional,"
						+ "Estado, firmaMedico_base64, firmaPaciente_base64, fk_DocumentoMD, fk_IDT_DocumentoID, "
						+ "medico_cierre, revisionPorSistema, TipoDeExamen, TipoDeExamenExtra, userCierre, "
						+ "FechaCDeDiligenciamiento, FechaDeModificacion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, clinica.getAccidenteTrabajo());
				statement.setString(2, clinica.getAnular());
				statement.setString(3, clinica.getEnfermedadProfesional());
				statement.setString(4, clinica.getEstado());
				statement.setString(5, clinica.getFirmaMedico());
				statement.setString(6, clinica.getFirmaPaciente());
				statement.setString(7, clinica.getFk_DocumentoMD());
				statement.setString(8, clinica.getFk_IDT_DocumentoID());
				statement.setString(9, clinica.getMedico_cierre());
				statement.setString(10, clinica.getRevisionPorSistema());
				statement.setString(11, clinica.getTipoDeExamen());
				statement.setString(12, clinica.getTipoDeExamenExtra());
				statement.setString(13, clinica.getUserCierre());
				statement.setTimestamp(14, new Timestamp(clinica.getFechaCDeDiligenciamiento().getTime()));
				statement.setTimestamp(15, new Timestamp(clinica.getFechaDeModificacion().getTime()));
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
			java.util.List<Integer> integers = new ArrayList<>();
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "SELECT pk_DocumentoHC FROM HistoriaClinica ORDER BY pk_DocumentoHC DESC";
				PreparedStatement statement = connection.prepareStatement(consulta);
				ResultSet result = statement.executeQuery();

				while (result.next()) {
					integers.add(result.getInt(1));
				}
				return integers.get(0);
			}

		} catch (Exception e) {
			return -1;
		}
		return -1;
	}

}
