/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.RiesgoCargoEvaluarDaoInterface;
import co.analicom.ws.hc.modelo.RiesgoCargoEvaluar;

/**
 * @author Cristian Cruz
 */
public class RiesgoCargoEvaluarDao implements RiesgoCargoEvaluarDaoInterface{
	
	Conexion conexion;
	
	public RiesgoCargoEvaluarDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertRiesgoCargoEvaluar(RiesgoCargoEvaluar riesgoCargoEvaluar) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO RIESGOCARGOEVALUAR (fk_IDT_DocumentoID, trauma, EXPOSICIONMATERIALPARTICULADO, "
						+ "EXPOSICIONMATERIALENPROYECCION, ILUMINACION, EXPOSICIONAVIDEOTERMINALES, EXPOSICIONQUIMICOSYOSOLVENTES, "
						+ "EXPOSICIONAGASESVAPORES, RADIACIONESIONIZANTES, RADIACIONESNOIONIZANTES, OTROS) "
						+ "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setInt(1, riesgoCargoEvaluar.getFk_IDT_DocumentoID());
				statement.setString(2, riesgoCargoEvaluar.getTrauma());
				statement.setString(3, riesgoCargoEvaluar.getEXPOSICIONMATERIALPARTICULADO());
				statement.setString(4, riesgoCargoEvaluar.getEXPOSICIONMATERIALENPROYECCION());
				statement.setString(5, riesgoCargoEvaluar.getILUMINACION());
				statement.setString(6, riesgoCargoEvaluar.getEXPOSICIONAVIDEOTERMINALES());
				statement.setString(7, riesgoCargoEvaluar.getEXPOSICIONQUIMICOSYOSOLVENTES());
				statement.setString(8, riesgoCargoEvaluar.getEXPOSICIONAGASESVAPORES());
				statement.setString(9, riesgoCargoEvaluar.getRADIACIONESIONIZANTES());
				statement.setString(10, riesgoCargoEvaluar.getRADIACIONESNOIONIZANTES());
				statement.setString(11, riesgoCargoEvaluar.getOTROS());
				
				if(!statement.execute()) {
					System.out.println("Insertado!!");
				}
			}
		} catch (Exception e) {
			System.err.println("Error en la inserción " + e.getLocalizedMessage());
			e.printStackTrace();
		}
		
	}
}
