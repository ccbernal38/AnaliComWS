/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.EnfermedadProfesionalDaoInterface;
import co.analicom.ws.hc.modelo.EnfermedadProfesional;

/**
 * @author Cristian Cruz
 */
public class EnfermedadProfesionalDao implements EnfermedadProfesionalDaoInterface{
	
	Conexion conexion;
	
	public EnfermedadProfesionalDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertEnfermedadProfesional(EnfermedadProfesional enfermedadProfesional) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO ENFERMEDADPROFESIONAL (_fk_IDT_DocumentoID, AccidentesDeTrabajo, ARL, Descripcion, "
						+ "Diagnostico, empresa, enfermedadProfesional, reubicacion, fechaDeDiligenciamiento, FechaDeModificacion) "
						+ "VALUES (?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setInt(1, enfermedadProfesional.get_fk_IDT_DocumentoID());
				statement.setString(2, enfermedadProfesional.getAccidentesDeTrabajo());
				statement.setString(3, enfermedadProfesional.getARL());
				statement.setString(4, enfermedadProfesional.getDescripcion());
				statement.setString(5, enfermedadProfesional.getDiagnostico());
				statement.setString(6, enfermedadProfesional.getEmpresa());
				statement.setString(7, enfermedadProfesional.getEnfermedadProfesional());
				statement.setString(8, enfermedadProfesional.getReubicacion());
				statement.setTimestamp(9, new Timestamp(enfermedadProfesional.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(10, new Timestamp(enfermedadProfesional.getFechaDeModificacion().getTime()));
				
				if (!statement.execute()) {
					System.out.println("Insertado");
				}
				conexion.cerrarConexion();
			}
		} catch (Exception e) {
			System.out.println("Error en orden: " + e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

}
