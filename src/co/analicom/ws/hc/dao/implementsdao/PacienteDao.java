package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.modelo.Paciente;

public class PacienteDao implements co.analicom.ws.hc.dao.interfacedao.PacienteDao {

	Conexion conexion;

	public PacienteDao() {
		conexion = new Conexion();
	}

	@Override
	public void insertPaciente(Paciente paciente) {
		
	}

	@Override
	public boolean verificarPacienteExiste(String documento) {

		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "Select count(*) from paciente where documento = '?'";

				PreparedStatement preparedStatement = connection.prepareStatement(consulta);
				preparedStatement.setString(1, documento);
				ResultSet resultSet = preparedStatement.executeQuery();

				if (resultSet.next()) {
					conexion.cerrarConexion();
					return true;
				}
			}
		} catch (Exception e) {
			System.out.println("Error en orden: " + e.getLocalizedMessage());

		}
		return false;
	}

}
