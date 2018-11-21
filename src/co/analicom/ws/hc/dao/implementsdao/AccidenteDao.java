package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.AccidenteDaoInterface;
import co.analicom.ws.hc.modelo.Accidente;

public class AccidenteDao implements AccidenteDaoInterface {

	Conexion conexion;

	public AccidenteDao() {
		// TODO Auto-generated constructor stub
		conexion = new Conexion();
	}

	@Override
	public boolean insertAccidente(Accidente accidente) {
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "insert into paciente(AccidentesDeTrabajo, ARL, Descripcion, Diagnostico, Empresa, EnfermedadProfesional, Lesion,"
						+ "Reubicacion, Secuelas, DiasIncapacidad, fk_IDT_DocumentoID, FechaDeDiligenciamiento, FechaDeModificacion) "
						+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

				PreparedStatement preparedStatement = connection.prepareStatement(consulta);
				preparedStatement.setString(1, accidente.getAccidentesDeTrabajo());
				preparedStatement.setString(2, accidente.getARL());
				preparedStatement.setString(3, accidente.getDescripcion());
				preparedStatement.setString(4, accidente.getDiagnostico());
				preparedStatement.setString(5, accidente.getEmpresa());
				preparedStatement.setString(6, accidente.getEnfermedadProfesional());
				preparedStatement.setString(7, accidente.getLesion());
				preparedStatement.setString(8, accidente.getReubicacion());
				preparedStatement.setString(9, accidente.getSecuelas());
				preparedStatement.setInt(10, accidente.getDiasIncapacidad());
				preparedStatement.setInt(11, accidente.getfk_IDT_DocumentoID());                                                                                                                  

				preparedStatement.setTimestamp(12, new Timestamp(accidente.getFechaDeDiligenciamiento().getTime()));
				preparedStatement.setTimestamp(13, new Timestamp(accidente.getFechaDeModificacion().getTime()));
				preparedStatement.execute();
				
				conexion.cerrarConexion();
				return true;
			}
		} catch (Exception e) {
			System.out.println("Error en orden: " + e.getLocalizedMessage());
			return false;
		}
		return false;
	}

}
