/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.HistoriaClinicaInterfaceDao;
import co.analicom.ws.hc.modelo.HistoriaClinica;

/**
 * @author Cristian Cruz
 */
public class HistoriaClinicaDao implements HistoriaClinicaInterfaceDao{
	
	Conexion conexion;
	
	public HistoriaClinicaDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertHistoriaClinica(HistoriaClinica clinica) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO HistoriaClinica (AccidenteTrabajo, anular, EnfermedadProfesional,"
						+ "Estado, firmaMedico, firmaPaciente, fk_DocumentoMD, fk_IDT_DocumentoID, Impreso," 
						+ "Lugar, medico_cierre, QuienModifico, revisionPorSistema, TipoDeExamen, TipoDeExamenExtra, userCierre, "
						+ "UserModifico, CantImpresiones, id_empresa, pk_DocumentoHC, FechaDeDiligenciamiento, FechaCDeDiligenciamiento, "
						+ "FechaDeModificacion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, clinica.getAccidenteTrabajo());
				statement.setString(2, clinica.getAnular());
				statement.setString(3, clinica.getEnfermedadProfesional());
				statement.setString(4, clinica.getEstado());
				statement.setString(5, clinica.getFirmaMedico());
				statement.setString(6, clinica.getFirmaPaciente());
				statement.setString(7, clinica.getFk_DocumentoMD());
				statement.setString(8, clinica.getFk_IDT_DocumentoID());
				statement.setString(9, clinica.getImpreso());
				statement.setString(10, clinica.getLugar());
				statement.setString(11, clinica.getMedico_cierre());
				statement.setString(12, clinica.getQuienModifico());
				statement.setString(13, clinica.getRevisionPorSistema());
				statement.setString(14, clinica.getTipoDeExamen());
				statement.setString(15, clinica.getTipoDeExamenExtra());
				statement.setString(16, clinica.getUserCierre());
				statement.setString(17, clinica.getUserModifico());
				statement.setInt(18, clinica.getCantImpresiones());
				statement.setInt(19, clinica.getId_empresa());
				statement.setInt(20, clinica.getPk_DocumentoHC());
				statement.setTimestamp(21, new Timestamp(clinica.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(22, new Timestamp(clinica.getFechaCDeDiligenciamiento().getTime()));
				statement.setTimestamp(23, new Timestamp(clinica.getFechaDeModificacion().getTime()));
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
