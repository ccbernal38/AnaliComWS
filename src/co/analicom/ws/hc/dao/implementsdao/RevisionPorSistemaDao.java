/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.RevisionPorSistemaDaoInterface;
import co.analicom.ws.hc.modelo.RevisionPorSistemas;

/**
 * @author Cristian Cruz
 */
public class RevisionPorSistemaDao implements RevisionPorSistemaDaoInterface{
	
	Conexion conexion;
	
	public RevisionPorSistemaDao() {
		conexion = new Conexion();
	}
	
	@Override
	public boolean insertRevisionSistema(RevisionPorSistemas revisionPorSistemas) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO Revision_por_Sistemas (Cardiovascular, Desmatologico, Diagnostico, Digestivo, Genitourinario, "
						+ "Hematologico, Neurologico,Observaciones, Osteomuscular, Osteomuscular_Otras, Psiquiatrico, Respiratorio, "
						+ "_fk_DocumentoMD, _fk_IDT_DocumentoID, FechaDeDiligenciamiento, FechaDeModificacion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, revisionPorSistemas.getCardiovascular());
				statement.setString(2, revisionPorSistemas.getDesmatologico());
				statement.setString(3, revisionPorSistemas.getDiagnostico());
				statement.setString(4, revisionPorSistemas.getDigestivo());
				statement.setString(5, revisionPorSistemas.getGenitourinario());
				statement.setString(6, revisionPorSistemas.getHematologico());
				statement.setString(7, revisionPorSistemas.getNeurologico());
				statement.setString(8, revisionPorSistemas.getObservaciones());
				statement.setString(9, revisionPorSistemas.getOsteomuscular());
				statement.setString(10, revisionPorSistemas.getOsteomuscular_Otras());
				statement.setString(11, revisionPorSistemas.getPsiquiatrico());
				statement.setString(12, revisionPorSistemas.getRespiratorio());
				statement.setInt(13, revisionPorSistemas.get_fk_DocumentoMD());
				statement.setInt(14, revisionPorSistemas.get_fk_IDT_DocumentoID());
				statement.setTimestamp(15, new Timestamp(revisionPorSistemas.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(16, new Timestamp(revisionPorSistemas.getFechaDeModificacion().getTime()));
				if(!statement.execute()) {
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
	
	
}
