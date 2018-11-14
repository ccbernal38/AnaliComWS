/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.HistoricoImpresionDaoInterface;
import co.analicom.ws.hc.modelo.HistoricoImpresion;

/**
 * @author Cristian Cruz
 */
public class HistoricoImpresionDao implements HistoricoImpresionDaoInterface{
	
	Conexion conexion;
	
	public HistoricoImpresionDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertHistoricoImpresion(HistoricoImpresion historicoImpresion) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO HistoricoImpresiones (usuario, historia_id, fecha) VALUES (?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, historicoImpresion.getUsuario());
				statement.setInt(2, historicoImpresion.getHistoria_id());
				statement.setTimestamp(3,new Timestamp(historicoImpresion.getFecha().getTime()));
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
