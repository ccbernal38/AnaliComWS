/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.ManipulacionAlimentoDaoInterface;
import co.analicom.ws.hc.modelo.ManipulacionAlimentos;

/**
 * @author Cristian Cruz
 */
public class ManipulacionAlimentoDao implements ManipulacionAlimentoDaoInterface {

	Conexion conexion;

	public ManipulacionAlimentoDao() {
		conexion = new Conexion();
	}

	@Override
	public boolean insertManipulacionAlimento(ManipulacionAlimentos manipulacionAlimentos) {

		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO ManipulacionAlimentos (DermatologicoA, DermatologicoB, DermatologicoBCual, Lesiones, "
						+ "Observaciones, Respiratorio, Respiratorio_Ascultacion, Respiratorio_Inspeccion, Solicitado, _fk_IDT_DocumentoID, "
						+ "FechaDeDiligenciamiento, FechaDeModificacion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, manipulacionAlimentos.getDermatologicoA());
				statement.setString(2, manipulacionAlimentos.getDermatologicoB());
				statement.setString(3, manipulacionAlimentos.getDermatologicoBCual());
				statement.setString(4, manipulacionAlimentos.getLesiones());
				statement.setString(5, manipulacionAlimentos.getObservaciones());
				statement.setString(6, manipulacionAlimentos.getRespiratorio());
				statement.setString(7, manipulacionAlimentos.getRespiratorio_Ascultacion());
				statement.setString(8, manipulacionAlimentos.getRespiratorio_Inspeccion());
				statement.setString(9, manipulacionAlimentos.getSolicitado());
				statement.setInt(10, manipulacionAlimentos.get_fk_IDT_DocumentoID());
				statement.setTimestamp(11, new Timestamp(manipulacionAlimentos.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(12, new Timestamp(manipulacionAlimentos.getFechaDeModificacion().getTime()));

				if(!statement.execute()) {
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

}
