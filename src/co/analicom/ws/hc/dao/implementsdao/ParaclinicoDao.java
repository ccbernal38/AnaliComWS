/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.ParaclinicoDaoInterface;
import co.analicom.ws.hc.modelo.Paraclinico;

/**
 * @author Cristian Cruz
 */
public class ParaclinicoDao implements ParaclinicoDaoInterface{
	
	Conexion conexion;
	
	public ParaclinicoDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertParaclinico(Paraclinico paraclinico) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				
				String consulta = "INSERT INTO Paraclinicos (AlteracionCorregida, Audiometria, Audiometria_Resultado, "
						+ "Audiometria_Resultado_Observaciones, Espirometria, Espirometria_Resultado, Espirometria_Resultado_Observaciones, "
						+ "ExamenLaboratorioDX, Observaciones, Optometria, Optometria_Visiometria_Diagnostico, Visiometria, "
						+ "_fk_CodigoExamen, _fk_IDT_DocumentoID, FechaDeDiligenciamiento, FechaDeModificacion) "
						+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, paraclinico.getAlteracionCorregida());
				statement.setString(2, paraclinico.getAudiometria());
				statement.setString(3, paraclinico.getAudiometria_Resultado());
				statement.setString(4, paraclinico.getAudiometria_Resultado_Observaciones());
				statement.setString(5, paraclinico.getEspirometria());
				statement.setString(6, paraclinico.getEspirometria_Resultado());
				statement.setString(7, paraclinico.getEspirometria_Resultado_Observaciones());
				statement.setString(8, paraclinico.getExamenLaboratorioDX());
				statement.setString(9, paraclinico.getObservaciones());
				statement.setString(10, paraclinico.getOptometria());
				statement.setString(11, paraclinico.getOptometria_Visiometria_Diagnostico());
				statement.setString(12, paraclinico.getVisiometria());
				statement.setInt(13, paraclinico.get_fk_CodigoExamen());
				statement.setInt(14, paraclinico.get_fk_IDT_DocumentoID());
				statement.setTimestamp(15, new Timestamp(paraclinico.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(16, new Timestamp(paraclinico.getFechaDeModificacion().getTime()));
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
