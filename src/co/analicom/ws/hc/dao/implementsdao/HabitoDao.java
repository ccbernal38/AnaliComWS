/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.HabitoDaoInterface;
import co.analicom.ws.hc.modelo.Habito;

/**
 * @author Cristian Cruz
 */
public class HabitoDao implements HabitoDaoInterface{
	
	Conexion conexion;
	
	public HabitoDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertHabito(Habito habito) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO Habito (Alcohol, AlcoholCantidad, AlcoholFrecuencia, Deporte, DeporteCual, DeporteFrecuencia, "
						+ "DeporteLesiones, DeporteLesionesCual, ExFumador, Fumador, Sedentarismo, SedentarismoFrecuencia, SustanciasPsicoactivas, "
						+ "SustanciasPsicoactivasCual, SustanciasPsicoactivasFrecuencia, CantidadCigarrillosDia, fk_IDT_DocumentoID, TiempoFumador,"
						+ "FechaDeDiligenciamiento, FechaDeModificacion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, habito.getAlcohol());
				statement.setString(2, habito.getAlcoholCantidad());
				statement.setString(3, habito.getAlcoholFrecuencia());
				statement.setString(4, habito.getDeporte());
				statement.setString(5, habito.getDeporteCual());
				statement.setString(6, habito.getDeporteFrecuencia());
				statement.setString(7, habito.getDeporteLesiones());
				statement.setString(8, habito.getDeporteLesionesCual());
				statement.setString(9, habito.getExFumador());
				statement.setString(10, habito.getFumador());
				statement.setString(11, habito.getSedentarismo());
				statement.setString(12, habito.getSedentarismoFrecuencia());
				statement.setString(13, habito.getSustanciasPsicoactivas());
				statement.setString(14, habito.getSustanciasPsicoactivasCual());
				statement.setString(15, habito.getSustanciasPsicoactivasFrecuencia());
				statement.setInt(16, habito.getCantidadCigarrillosDia());
				statement.setInt(17, habito.getFk_IDT_DocumentoID());
				statement.setInt(18, habito.getTiempoFumador());
				statement.setTimestamp(19, new Timestamp(habito.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(20, new Timestamp(habito.getFechaDeModificacion().getTime()));
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
