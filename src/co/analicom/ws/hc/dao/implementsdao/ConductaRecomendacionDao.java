/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.ConductaRecomendacionDaoInterface;
import co.analicom.ws.hc.modelo.ConductaRecomendacion;

/**
 * @author Cristian Cruz
 */
public class ConductaRecomendacionDao implements ConductaRecomendacionDaoInterface{
	
	Conexion conexion;
	
	public ConductaRecomendacionDao() {
		conexion = new Conexion();
	}
	@Override
	public boolean insertConductaRecomendacion(ConductaRecomendacion conductaRecomendaciones) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO CONDUCTARECOMENDACIONES (fk_IDT_DocumentoID, PausasActivas, ErgonomiaVisual, PautasHigieneVisual, proteccionPersonal, " + 
						"proteccionPersonalCorreccionOptica, gafasUV, HigieneVisual, ControlOptometria, ControlOftalmologia, " + 
						"OtrasConductas, PausasActivasObservacion, ErgonomiaVisualObservacion, higieneVisualObservacion, " + 
						"proteccionPersonalObservacion, proteccionCorreccionOpticaObservacion, gafasUVObservacion, " + 
						"HigieneVisualObservacionn, ControlOptometriaObservacion, ControlOftalmologiaObservacion, " + 
						"otrasConductasObservacion, correccionOpticaPermanente, correccionOpticaObservacion, correccionOpticaProlongadaObs, " + 
						"correccionOpticaVisionProlongada, contCorreccionOpticaActual, contCorreccionOpticaActualobs, " + 
						"correccionOpticaVisualCercanaObs, correccionOpticaVisualCercana, correccionOpticaActual, " + 
						"correccionOpticaActualObs, elementosProteccionVisual, elementosProteccionVisualObs, " + 
						"proteccionVisualCorreccionOptObservacion, proteccionVisualCorreccionOpt, controlAnual, " + 
						"controlAnualObservacion, NoUsoCorreccionOptica, NoUsoCorreccionOpticaObs, correcionOptica, " + 
						"correcionOpticaObse, RecomendacionesAdicionales) " +
						"VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setInt(1, conductaRecomendaciones.getFk_IDT_DocumentoID());
				statement.setString(2, conductaRecomendaciones.getPausasActivas());
				statement.setString(3, conductaRecomendaciones.getErgonomiaVisual());
				statement.setString(4, conductaRecomendaciones.getPautasHigieneVisual());
				statement.setString(5, conductaRecomendaciones.getProteccionPersonal());
				statement.setString(6, conductaRecomendaciones.getProteccionPersonalCorreccionOptica());
				statement.setString(7, conductaRecomendaciones.getGafasUV());
				statement.setString(8, conductaRecomendaciones.getHigieneVisual());
				statement.setString(9, conductaRecomendaciones.getControlOptometria());
				statement.setString(10, conductaRecomendaciones.getControlOftalmologia());
				statement.setString(11, conductaRecomendaciones.getOtrasConductas());
				statement.setString(12, conductaRecomendaciones.getPausasActivasObservacion());
				statement.setString(13, conductaRecomendaciones.getErgonomiaVisualObservacion());
				statement.setString(14, conductaRecomendaciones.getHigieneVisualObservacion());
				statement.setString(15, conductaRecomendaciones.getProteccionPersonalObservacion());
				statement.setString(16, conductaRecomendaciones.getProteccionCorreccionOpticaObservacion());
				statement.setString(17, conductaRecomendaciones.getGafasUVObservacion());
				statement.setString(18, conductaRecomendaciones.getHigieneVisualObservacionn());
				statement.setString(19, conductaRecomendaciones.getControlOptometriaObservacion());
				statement.setString(20, conductaRecomendaciones.getControlOftalmologiaObservacion());
				statement.setString(21, conductaRecomendaciones.getOtrasConductasObservacion());
				statement.setString(22, conductaRecomendaciones.getCorreccionOpticaPermanente());
				statement.setString(23, conductaRecomendaciones.getCorreccionOpticaObservacion());
				statement.setString(24, conductaRecomendaciones.getCorreccionOpticaProlongadaObs());
				statement.setString(25, conductaRecomendaciones.getCorreccionOpticaVisionProlongada());
				statement.setString(26, conductaRecomendaciones.getContCorreccionOpticaActual());
				statement.setString(27, conductaRecomendaciones.getContCorreccionOpticaActualobs());
				statement.setString(28, conductaRecomendaciones.getCorreccionOpticaVisualCercanaObs());
				statement.setString(29, conductaRecomendaciones.getCorreccionOpticaVisualCercana());
				statement.setString(30, conductaRecomendaciones.getCorreccionOpticaActual());
				statement.setString(31, conductaRecomendaciones.getCorreccionOpticaActualObs());
				statement.setString(32, conductaRecomendaciones.getElementosProteccionVisual());
				statement.setString(33, conductaRecomendaciones.getElementosProteccionVisualObs());
				statement.setString(34, conductaRecomendaciones.getProteccionVisualCorreccionOptObservacion());
				statement.setString(35, conductaRecomendaciones.getProteccionVisualCorreccionOpt());
				statement.setString(36, conductaRecomendaciones.getControlAnual());
				statement.setString(37, conductaRecomendaciones.getControlAnualObservacion());
				statement.setString(38, conductaRecomendaciones.getNoUsoCorreccionOptica());
				statement.setString(39, conductaRecomendaciones.getNoUsoCorreccionOpticaObs());
				statement.setString(40, conductaRecomendaciones.getCorrecionOptica());
				statement.setString(41, conductaRecomendaciones.getCorrecionOpticaObse());
				statement.setString(42, conductaRecomendaciones.getRecomendacionesAdicionales());

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
