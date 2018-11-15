/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.AudiogramaDaoInterface;
import co.analicom.ws.hc.modelo.Audiograma;

/**
 * @author Cristian Cruz
 */
public class AudiogramaDao implements AudiogramaDaoInterface{
	Conexion conexion;
	
	public AudiogramaDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertAudiograma(Audiograma audiograma) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				
				String consulta = "INSERT INTO Audiograma (_fk_DocumentoFrecuencia, _fk_DocumentosHA, oidoDerecho, oidoIzquierdo) VALUES (?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setInt(1, audiograma.get_fk_DocumentoFrecuencia());
				statement.setInt(2, audiograma.get_fk_DocumentosHA());
				statement.setInt(3, audiograma.getOidoDerecho());
				statement.setInt(4, audiograma.getOidoIzquierdo());
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
