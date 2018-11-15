/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.ImpresionDiagnosticaDaoInterface;
import co.analicom.ws.hc.modelo.ImpresionDiagnostica;

/**
 * @author Cristian Cruz
 */
public class ImpresionDiagnosticaDao implements ImpresionDiagnosticaDaoInterface{
	
	Conexion conexion;
	
	public ImpresionDiagnosticaDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertImpresionDiagnostica(ImpresionDiagnostica impresionDiagnostica) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				
				String consulta = "INSERT INTO ImpresionDiagnostica (Diagnostico, SospechaDeOrigen, TipoDeDiagnostico, _fk_CIE10, "
						+ "_fk_IDT_DocumentoID, FechaDeDiligenciamiento, FechaDeModificacion) VALUES (?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, impresionDiagnostica.getDiagnostico());
				statement.setString(2, impresionDiagnostica.getSospechaDeOrigen());
				statement.setString(3, impresionDiagnostica.getTipoDeDiagnostico());
				statement.setInt(4, impresionDiagnostica.get_fk_CIE10());
				statement.setInt(5, impresionDiagnostica.get_fk_IDT_DocumentoID());
				statement.setTimestamp(6, new Timestamp(impresionDiagnostica.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(7, new Timestamp(impresionDiagnostica.getFechaDeModificacion().getTime()));
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
