/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;
import java.sql.Connection;

import java.sql.PreparedStatement;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.AgudezaVisualDaoInterface;
import co.analicom.ws.hc.modelo.AgudezaVisual;

/**
 * @author Cristian Cruz
 */
public class AgudezaVisualDao implements AgudezaVisualDaoInterface {
	
	Conexion conexion;
	
	public AgudezaVisualDao() {
		conexion = new Conexion();
	}
	
	@Override
	public boolean insertarAgudezaVisual(AgudezaVisual agudezaVisual) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO AgudezaVisual ( fk_IDT_DocumentoID, VisionProfundidadEscribir, VisionProfundidad, "
						+ "VisionColorEscribir, visionColor, SegmentoAnteriorEscribir, SegmentoAnterior, MotilidadOcularEscribir, "
						+ "MotilidadOcular, LS_OIObservacion, LS_OI20, LS_ODObservacion, LS_OD20, LS_BObservacion, "
						+ "LS_Binocular20, LC_OIObservacion, LC_OI20, LC_ODObservacion, LC_OD20, LC_BObservacion, LC_Binocular20, "
						+ "CS_OIObservacion, CS_OI20, CS_ODObservacion, CS_OD20, CS_BObservacion, CS_Binocular20, CC_OIObservacion, "
						+ "CC_OI20, CC_ODObservacion, CC_OD20, CC_BObservacion, CC_Binocular20, CampoVisualEscribir, CampoVisual) "
						+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setInt(1, agudezaVisual.getFk_IDT_DocumentoID());
				statement.setString(2, agudezaVisual.getVisionProfundidadEscribir());
				statement.setString(3, agudezaVisual.getVisionProfundidad());
				statement.setString(4, agudezaVisual.getVisionColorEscribir());
				statement.setString(5, agudezaVisual.getVisionColor());
				statement.setString(6, agudezaVisual.getSegmentoAnteriorEscribir());
				statement.setString(7, agudezaVisual.getSegmentoAnterior());
				statement.setString(8, agudezaVisual.getMotilidadOcularEscribir());
				statement.setString(9, agudezaVisual.getMotilidadOcular());
				statement.setString(10, agudezaVisual.getLS_OIObservacion());
				statement.setString(11, agudezaVisual.getLS_OI20());
				statement.setString(12, agudezaVisual.getLS_ODObservacion());
				statement.setString(13, agudezaVisual.getLS_OD20());
				statement.setString(14, agudezaVisual.getLS_BObservacion());
				statement.setString(15, agudezaVisual.getLS_Binocular20());
				statement.setString(16, agudezaVisual.getLC_OIObservacion());
				statement.setString(17, agudezaVisual.getLC_OI20());
				statement.setString(18, agudezaVisual.getLC_ODObservacion());
				statement.setString(19, agudezaVisual.getLC_OD20());
				statement.setString(20, agudezaVisual.getLC_BObservacion());
				statement.setString(21, agudezaVisual.getLC_Binocular20());
				statement.setString(22, agudezaVisual.getCS_OIObservacion());
				statement.setString(23, agudezaVisual.getCS_OI20());
				statement.setString(24, agudezaVisual.getCS_ODObservacion());
				statement.setString(25, agudezaVisual.getCS_OD20());
				statement.setString(26, agudezaVisual.getCS_BObservacion());
				statement.setString(27, agudezaVisual.getCS_Binocular20());
				statement.setString(28, agudezaVisual.getCC_OIObservacion());
				statement.setString(29, agudezaVisual.getCC_OI20());
				statement.setString(30, agudezaVisual.getCC_ODObservacion());
				statement.setString(31, agudezaVisual.getCC_OD20());
				statement.setString(32, agudezaVisual.getCC_BObservacion());
				statement.setString(33, agudezaVisual.getCC_Binocular20());
				statement.setString(34, agudezaVisual.getCampoVisualEscribir());
				statement.setString(35, agudezaVisual.getCampoVisual());
				
				if(!statement.execute()) {
					System.out.println("Insertado!!");
				}
				conexion.cerrarConexion();
				return true;
			}
		} catch(Exception e) {
			System.err.println("Error en la inserción " + e.getLocalizedMessage());
			e.printStackTrace();
			return false;
		}
		return false;
	}

}
