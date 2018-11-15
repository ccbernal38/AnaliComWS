/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	public void insertEmpresa(Empresa empresa) {
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
