/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.OtoscopiaDaoInterface;
import co.analicom.ws.hc.modelo.Otoscopia;

/**
 * @author Cristian Cruz
 */
public class OtoscopiaDao implements OtoscopiaDaoInterface{
	
	Conexion conexion;
	
	public OtoscopiaDao() {
		conexion = new Conexion();
	}
	
	@Override
	public boolean insertOtoscopia(Otoscopia otoscopia) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				
				String consulta = "INSERT INTO Otoscopia (CAE_Normal, CAE_Otros, CAE_TaponParcial, CAE_TaponTotal, MT_Abultada, MT_Hiperemica, "
						+ "MT_Normal, MT_NoVisualiza, MT_Opaca, MT_Otros, MT_Perforada, MT_PlacaCalcarea, PA_Agenesia, PA_Atresia, "
						+ "PA_Cicatriz, PA_Normal, PA_Otros) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, otoscopia.getCAE_Normal());
				statement.setString(2, otoscopia.getCAE_Otros());
				statement.setString(3, otoscopia.getCAE_TaponParcial());
				statement.setString(4, otoscopia.getCAE_TaponTotal());
				statement.setString(5, otoscopia.getMT_Abultada());
				statement.setString(6, otoscopia.getMT_Hiperemica());
				statement.setString(7, otoscopia.getMT_Normal());
				statement.setString(8, otoscopia.getMT_NoVisualiza());
				statement.setString(9, otoscopia.getMT_Opaca());
				statement.setString(10, otoscopia.getMT_Otros());
				statement.setString(11, otoscopia.getMT_Perforada());
				statement.setString(12, otoscopia.getMT_PlacaCalcarea());
				statement.setString(13, otoscopia.getPA_Agenesia());
				statement.setString(14, otoscopia.getPA_Atresia());
				statement.setString(15, otoscopia.getPA_Cicatriz());
				statement.setString(16, otoscopia.getPA_Normal());
				statement.setString(17, otoscopia.getPA_Otros());
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
	
	@Override
	public int obtenerID() {
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "SELECT _fk_IDT_DocumentoID FROM Otoscopia ORDER BY fechaDeCreacion DESC";
				PreparedStatement statement = connection.prepareStatement(consulta);
				ResultSet result = statement.executeQuery();
				while (result.next()) {
					return result.getInt(1);
				}
			}
			
		} catch (Exception e) {
			return -1;
		}
		return -1;
	}
}
