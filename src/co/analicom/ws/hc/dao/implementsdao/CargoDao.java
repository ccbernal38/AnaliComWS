/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.CargoDaoInterface;
import co.analicom.ws.hc.modelo.Cargo;

/**
 * @author Cristian Cruz
 */
public class CargoDao implements CargoDaoInterface{
	
	Conexion connexion;
	
	public CargoDao() {
		connexion = new Conexion();
	}	
	@Override
	public void insertCargo(Cargo cargo) {
		
		try {
			Connection connection = connexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO Cargo (Antiguedad, CargoTiempo, fk_IDT_DocumentoID, fk_NIT, HorasTrabajadas"
						+ "Area, Cargo, CargoEvaluar,  ElementosDeProteccion, Empresa, JornadaDeTrabajo, unidad"
						+ "FechaIngreso, FechaRetiro, FechaDeDiligenciamiento, FechaDeModificacion) VALUES (?,?,?,?,"
						+ "?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setInt(1, cargo.getAntiguedad());
				statement.setInt(2, cargo.getCargoTiempo());
				statement.setInt(3, cargo.getFk_IDT_DocumentoID());
				statement.setInt(4, cargo.getFk_NIT());
				statement.setInt(5, cargo.getHorasTrabajadas());
				statement.setString(6, cargo.getArea());
				statement.setString(7, cargo.getCargo());
				statement.setString(8, cargo.getCargoEvaluar());
				statement.setString(9, cargo.getElementosDeProteccion());
				statement.setString(10, cargo.getEmpresa());
				statement.setString(11, cargo.getJornadaDeTrabajo());
				statement.setString(12, cargo.getUnidad());
				statement.setTimestamp(13, new Timestamp(cargo.getFechaIngreso().getTime()));
				statement.setTimestamp(14, new Timestamp(cargo.getFechaRetiro().getTime()));
				statement.setTimestamp(15, new Timestamp(cargo.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(16, new Timestamp(cargo.getFechaDeModificacion().getTime()));
				
				if (!statement.execute()) {
					System.out.println("Insertado!");
				}
				connexion.cerrarConexion();
			}
		} catch (Exception e) {
			System.out.println("Error en orden: " + e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

}
