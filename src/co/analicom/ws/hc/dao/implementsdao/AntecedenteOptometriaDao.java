/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.AntecedenteOptometriaDaoInterface;
import co.analicom.ws.hc.dao.interfacedao.AntecedenteVisiometriaDaoInterface;
import co.analicom.ws.hc.modelo.AntecedenteOptometria;
import co.analicom.ws.hc.modelo.AntecedenteVisiometria;

/**
 * @author Cristian Cruz
 */
public class AntecedenteOptometriaDao implements AntecedenteOptometriaDaoInterface {

	Conexion conexion;

	public AntecedenteOptometriaDao() {
		conexion = new Conexion();
	}

	@Override
	public boolean insertAntecedenteOptometria(AntecedenteOptometria antecedenteOptometria) {
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO HistoriaOptometria_ANTECEDENTES(O_Quirurgicos, P_Diabetes, O_Quirurgicos_observacion, "
						+ "P_Diabetes_observacion, O_Trauma, P_Alergicos, O_Trauma_Observacion, P_Alergicos_observacion, O_Esquirlas, "
						+ "P_Alteraciones_tiroides, O_Esquirlas_Observacion, P_Alteraciones_tiroides_observacion, O_Quimicos, "
						+ "P_Problemas_cardiacos, O_Quimicos_observacion, P_Problemas_cardiacos_observacion, O_Galucoma, P_Otros, "
						+ "O_Galucoma_observacion, P_Otros_observacion, O_Rehabilitacion_visual, P_Hipertension, "
						+ "O_Rehabilitacion_visual_observacion, P_Hipertension_observacion, O_Catarata, O_Usuarios_RX, "
						+ "O_Catarata_observacion, O_Usuarios_RX_observacion, O_Otros, O_Otros_observacion, fk_DocumentoID) "
						+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, antecedenteOptometria.getO_Quirurgicos());
				statement.setString(2, antecedenteOptometria.getP_Diabetes());
				statement.setString(3, antecedenteOptometria.getO_Quirurgicos_observacion());
				statement.setString(4, antecedenteOptometria.getP_Diabetes_observacion());
				statement.setString(5, antecedenteOptometria.getO_Trauma());
				statement.setString(6, antecedenteOptometria.getP_Alergicos());
				statement.setString(7, antecedenteOptometria.getO_Trauma_Observacion());
				statement.setString(8, antecedenteOptometria.getP_Alergicos_observacion());
				statement.setString(9, antecedenteOptometria.getO_Esquirlas());
				statement.setString(10, antecedenteOptometria.getP_Alteraciones_tiroides());
				statement.setString(11, antecedenteOptometria.getO_Esquirlas_Observacion());
				statement.setString(12, antecedenteOptometria.getP_Alteraciones_tiroides_observacion());
				statement.setString(13, antecedenteOptometria.getO_Quimicos());
				statement.setString(14, antecedenteOptometria.getP_Problemas_cardiacos());
				statement.setString(15, antecedenteOptometria.getO_Quimicos_observacion());
				statement.setString(16, antecedenteOptometria.getP_Problemas_cardiacos_observacion());
				statement.setString(17, antecedenteOptometria.getO_Galucoma());
				statement.setString(18, antecedenteOptometria.getP_Otros());
				statement.setString(19, antecedenteOptometria.getO_Galucoma_observacion());
				statement.setString(20, antecedenteOptometria.getP_Otros_observacion());
				statement.setString(21, antecedenteOptometria.getO_Rehabilitacion_visual());
				statement.setString(22, antecedenteOptometria.getP_Hipertension());
				statement.setString(23, antecedenteOptometria.getO_Rehabilitacion_visual_observacion());
				statement.setString(24, antecedenteOptometria.getP_Hipertension_observacion());
				statement.setString(25, antecedenteOptometria.getO_Catarata());
				statement.setString(26, antecedenteOptometria.getO_Usuarios_RX());
				statement.setString(27, antecedenteOptometria.getO_Catarata_observacion());
				statement.setString(28, antecedenteOptometria.getO_Usuarios_RX_observacion());
				statement.setString(29, antecedenteOptometria.getO_Otros());
				statement.setString(30, antecedenteOptometria.getO_Otros_observacion());
				statement.setInt(31, antecedenteOptometria.getFk_DocumentoID());

				if (!statement.execute()) {
					System.out.println("Insertado!!");
				}
				conexion.cerrarConexion();
				return true;
			}
		} catch (Exception e) {
			System.err.println("Error en la insercion Antecedentes optometria" + e.getLocalizedMessage());
			e.printStackTrace();
			return false;
		}
		return false;
	}

}
