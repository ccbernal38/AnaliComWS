/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.ResultadoDaoInterface;
import co.analicom.ws.hc.modelo.Resultado;

/**
 * @author Cristian Cruz
 */
public class ResultadoDao implements ResultadoDaoInterface{
	
	Conexion conexion;
	
	public ResultadoDao() {
		conexion = new Conexion();
	}
	
	@Override
	public boolean insertResultado(Resultado resultado) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO Resultado (Aplazado, Aplazado_Motivo, AptoConRestriccion, AptoConRestriccion_Motivo, "
						+ "AptoParaElCargo, ConPatologiaQueNoLimitaLabor, NoApto, NoApto_Motivo, Otros_escribir, PuedoContinuarConSuLabor, "
						+ "SeSugiereReubicacionLaboral, SinPatologiaAparente, _fk_IDT_DocumentoID, _fk_IDT_DocumentoMD,"
						+ "FechaDeDiligenciamiento, FechaDeModificacion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, resultado.getAplazado());
				statement.setString(2, resultado.getAplazado_Motivo());
				statement.setString(3, resultado.getAptoConRestriccion());
				statement.setString(4, resultado.getAptoConRestriccion_Motivo());
				statement.setString(5, resultado.getAptoParaElCargo());
				statement.setString(6, resultado.getConPatologiaQueNoLimitaLabor());
				statement.setString(7, resultado.getNoApto());
				statement.setString(8, resultado.getNoApto_Motivo());
				statement.setString(9, resultado.getOtros_escribir());
				statement.setString(10, resultado.getPuedoContinuarConSuLabor());
				statement.setString(11, resultado.getSeSugiereReubicacionLaboral());
				statement.setString(12, resultado.getSinPatologiaAparente());
				statement.setInt(13, resultado.get_fk_IDT_DocumentoID());
				statement.setInt(14, resultado.get_fk_IDT_DocumentoMD());
				statement.setTimestamp(15, new Timestamp(resultado.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(16, new Timestamp(resultado.getFechaDeModificacion().getTime()));

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
