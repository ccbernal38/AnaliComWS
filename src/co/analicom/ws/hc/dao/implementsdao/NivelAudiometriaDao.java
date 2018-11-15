/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.NivelAudiometriaDaoInterface;
import co.analicom.ws.hc.modelo.NivelAudiometria;

/**
 * @author Cristian Cruz
 */
public class NivelAudiometriaDao implements NivelAudiometriaDaoInterface{
	
	Conexion conexion;
	
	public NivelAudiometriaDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertNivelAudiometria(NivelAudiometria nivelAudiometria) {
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				
				String consulta = "INSERT INTO Nivel_Audiometria (frecuencia) VALUES (?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setInt(1, nivelAudiometria.getFrecuencia());
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
