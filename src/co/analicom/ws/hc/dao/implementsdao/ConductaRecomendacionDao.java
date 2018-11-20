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
	public boolean insertConductaRecomendacion(ConductaRecomendacion conductaRecomendacion) {
		
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
