/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.SintomasDaoInterface;
import co.analicom.ws.hc.modelo.Sintoma;

/**
 * @author Cristian Cruz
 */
public class SintomaDao implements SintomasDaoInterface {
	
	Conexion conexion;
	
	public SintomaDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertSintomas(Sintoma sintoma) {
		
		try {
			Connection connection = (Connection) conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO SINTOMAS (fk_IDT_DocumentoID, visionBorrosaLejana, visionBorrosaCercana, Fotofobia, "
						+ "DolorOcular, VisionDoble, Cefalea, SaltoRenglon, Epifora, Enrojecimiento, SuenioAlLeer, "
						+ "Ardor, NoRefiere) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setInt(1, sintoma.getFk_IDT_DocumentoID());
				statement.setString(2, sintoma.getVisionBorrosaLejana());
				statement.setString(3, sintoma.getVisionBorrosaCercana());
				statement.setString(4, sintoma.getFotofobia());
				statement.setString(5, sintoma.getDolorOcular());
				statement.setString(6, sintoma.getVisionDoble());
				statement.setString(7, sintoma.getCefalea());
				statement.setString(8, sintoma.getSaltoRenglon());
				statement.setString(9, sintoma.getEpifora());
				statement.setString(10, sintoma.getEnrojecimiento());
				statement.setString(11, sintoma.getSuenioAlLeer());
				statement.setString(12, sintoma.getArdor());
				statement.setString(13, sintoma.getNoRefiere());
				
				if(!statement.execute()) {
					System.out.println("Insertado!!");
				}				
			}
		} catch (Exception e) {
			System.err.println("Error en la inserción " + e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

}
