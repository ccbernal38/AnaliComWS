/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.EmpresaDaoInterface;
import co.analicom.ws.hc.modelo.Empresa;

/**
 * @author Cristian Cruz
 */
public class EmpresaDao implements EmpresaDaoInterface{
	
	Conexion conexion;
	
	public EmpresaDao() {
		conexion = new Conexion();
	}
	
	@Override
	public boolean insertEmpresa(Empresa empresa) {

		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {

				String consulta = "INSERT INTO Empresa (ActividadEconomica, direccion, Nombre, telefono, fk_IDT_DocumentoID,"
						+ "nit, pk_nit, FechaDeDiligenciamiento, FechaDeModificacion) VALUES (?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, empresa.getActividadEconomica());
				statement.setString(2, empresa.getDireccion());
				statement.setString(3, empresa.getNombre());
				statement.setString(4, empresa.getTelefono());
				statement.setInt(5, empresa.getFk_IDT_DocumentoID());
				statement.setInt(6, empresa.getNit());
				statement.setInt(7, empresa.getPk_nit());
				statement.setTimestamp(8, new Timestamp(empresa.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(9, new Timestamp(empresa.getFechaDeModificacion().getTime()));
				if (!statement.execute()) {
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
				String consulta = "SELECT pk_NIT FROM Empresa ORDER BY fechaDeDiligenciamiento DESC";
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
