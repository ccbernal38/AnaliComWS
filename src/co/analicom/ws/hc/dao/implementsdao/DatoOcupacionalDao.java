/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.DatoOcupacionalDaoInterface;
import co.analicom.ws.hc.modelo.DatoOcupacional;

/**
 * @author Cristian Cruz
 */
public class DatoOcupacionalDao implements DatoOcupacionalDaoInterface{
	
	Conexion conexion;
	
	public DatoOcupacionalDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertDatoOcupacional(DatoOcupacional datoOcupacional) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO DatosOcupacionales (Biologicos, Ergonomicos, Fisicos, Otros, "
						+ "Psicosociales, Quimicos, Seguridad, fk_IDT_DocumentoID, fk_NIT, TiempoExposicion, "
						+ "FechaDeDiligenciamiento,  FechaDeModificacion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, datoOcupacional.getBiologicos());
				statement.setString(2, datoOcupacional.getErgonomicos());
				statement.setString(3, datoOcupacional.getFisicos());
				statement.setString(4, datoOcupacional.getOtros());
				statement.setString(5, datoOcupacional.getPsicosociales());
				statement.setString(6, datoOcupacional.getQuimicos());
				statement.setString(7, datoOcupacional.getSeguridad());
				statement.setInt(8, datoOcupacional.getFk_IDT_DocumentoID());
				statement.setInt(9, datoOcupacional.getFk_NIT());
				statement.setInt(10, datoOcupacional.getTiempoExposicion());
				statement.setTimestamp(11, new Timestamp(datoOcupacional.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(12, new Timestamp(datoOcupacional.getFechaDeModificacion().getTime()));
				
				if (!statement.execute()) {
					System.out.println("Insertado!");
				}
				conexion.cerrarConexion();
			}
			
		} catch (Exception e) {
			System.out.println("Error en orden: " + e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

}
