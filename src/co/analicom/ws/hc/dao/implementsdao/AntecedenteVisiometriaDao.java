/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.AntecedenteVisiometriaDaoInterface;
import co.analicom.ws.hc.modelo.AntecedenteVisiometria;

/**
 * @author Cristian Cruz
 */
public class AntecedenteVisiometriaDao implements AntecedenteVisiometriaDaoInterface {

	Conexion conexion;

	public AntecedenteVisiometriaDao() {
		conexion = new Conexion();
	}

	@Override
	public boolean insertAntecedenteVisiometria(AntecedenteVisiometria antecedenteVisiometria) {

		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO Antecedentes_Visiometria (fk_DocumentoID_P, O_Catarata, O_Catarata_OBSERVACION, O_Esquirlas, "
						+ "O_Esquirlas_OBSERVACION, O_Galucoma, O_Galucoma_OBSERVACION, O_Otros, O_Otros_OBSERVACION, O_Qirurgicos, "
						+ "O_Qirurgicos_OBSERVACION, O_Quimicos, O_Quimicos_OBSERVACION, O_Rehabilitacion_visual, "
						+ "O_Rehabilitacion_visual_OBSERVACION, O_Trauma, O_Trauma_OBSERVACION, O_Usuarios_RX_OBSERVACION, "
						+ "O_Usuarios_RX, P_Alergicos, P_Alergicos_OBSERVACION, P_Alteraciones_tiroides, P_Alteraciones_tiroides_OBSERVACION, "
						+ "P_Diabetes, P_Diabetes_OBSERVACION, P_Hipertension, P_Hipertension_OBSERVACION, P_Otros, P_Otros_OBSERVACION, "
						+ "P_Prbolemas_cardiacos, P_Prbolemas_cardiacos_OBSERVACION) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?\n"
						+ ")";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setInt(1, antecedenteVisiometria.getFk_DocumentoID_P());
				statement.setString(2, antecedenteVisiometria.getO_Catarata());
				statement.setString(3, antecedenteVisiometria.getO_Catarata_OBSERVACION());
				statement.setString(4, antecedenteVisiometria.getO_Esquirlas());
				statement.setString(5, antecedenteVisiometria.getO_Esquirlas_OBSERVACION());
				statement.setString(6, antecedenteVisiometria.getO_Galucoma());
				statement.setString(7, antecedenteVisiometria.getO_Galucoma_OBSERVACION());
				statement.setString(8, antecedenteVisiometria.getO_Otros());
				statement.setString(9, antecedenteVisiometria.getO_Otros_OBSERVACION());
				statement.setString(10, antecedenteVisiometria.getO_Qirurgicos());
				statement.setString(11, antecedenteVisiometria.getO_Qirurgicos_OBSERVACION());
				statement.setString(12, antecedenteVisiometria.getO_Quimicos());
				statement.setString(13, antecedenteVisiometria.getO_Quimicos_OBSERVACION());
				statement.setString(14, antecedenteVisiometria.getO_Rehabilitacion_visual());
				statement.setString(15, antecedenteVisiometria.getO_Rehabilitacion_visual_OBSERVACION());
				statement.setString(16, antecedenteVisiometria.getO_Trauma());
				statement.setString(17, antecedenteVisiometria.getO_Trauma_OBSERVACION());
				statement.setString(18, antecedenteVisiometria.getO_Usuarios_RX_OBSERVACION());
				statement.setString(19, antecedenteVisiometria.getO_Usuarios_RX());
				statement.setString(20, antecedenteVisiometria.getP_Alergicos());
				statement.setString(21, antecedenteVisiometria.getP_Alergicos_OBSERVACION());
				statement.setString(22, antecedenteVisiometria.getP_Alteraciones_tiroides());
				statement.setString(23, antecedenteVisiometria.getP_Alteraciones_tiroides_OBSERVACION());
				statement.setString(24, antecedenteVisiometria.getP_Diabetes());
				statement.setString(25, antecedenteVisiometria.getP_Diabetes_OBSERVACION());
				statement.setString(26, antecedenteVisiometria.getP_Hipertension());
				statement.setString(27, antecedenteVisiometria.getP_Hipertension_OBSERVACION());
				statement.setString(28, antecedenteVisiometria.getP_Otros());
				statement.setString(29, antecedenteVisiometria.getP_Otros_OBSERVACION());
				statement.setString(30, antecedenteVisiometria.getP_Prbolemas_cardiacos());
				statement.setString(31, antecedenteVisiometria.getP_Prbolemas_cardiacos_OBSERVACION());

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

}
