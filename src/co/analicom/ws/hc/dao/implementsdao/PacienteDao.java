package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Calendar;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.PacienteDaoInterface;
import co.analicom.ws.hc.modelo.Paciente;

public class PacienteDao implements PacienteDaoInterface {

	Conexion conexion;

	public PacienteDao() {
		conexion = new Conexion();
	}

	@Override
	public boolean insertPaciente(Paciente paciente) {
		try {
			Connection connection = conexion.getConexionHC();

			if (connection != null) {
				String foto = paciente.getFoto();
				String firma = paciente.getFirma();
				String consulta = "";
				if (!foto.equals("") && !firma.equals("")) {
					consulta = "insert into paciente(documento, tipodocumento, IDT_Nombres, IDT_Apellidos, IDT_Sexo, IDT_fechaNacimiento, "
							+ "IDT_LugarNacimiento, IDT_DireccionDomicilio, IDT_DomicilioCiudad,"
							+ "IDT_CorreoElectronico, IDT_Escolaridad, IDT_EPS, IDT_ARL, IDT_AFP,"
							+ "IDT_AvisoEmergenciaNombres, IDT_AvisoEmergenciaApellidos, IDT_AvisoEmergenciaParentesco, "
							+ "GrupoSanguineo, RH, cargo, antiguedad,IDT_telefonoDomicilio, IDT_TelefonoCelular, IDT_AvisoEmergenciaTelefono, "
							+ "IDT_AvisoEmergenciaTelefonoCelular, fechaDeDiligenciamiento, fechaDeModificacion, foto, firma) "
							+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,PutAs(?, 'JPEG'),PutAs(?, 'JPEG'))";
				} else if (foto.equals("") && !firma.equals("")) {
					consulta = "insert into paciente(documento, tipodocumento, IDT_Nombres, IDT_Apellidos, IDT_Sexo, IDT_fechaNacimiento, "
							+ "IDT_LugarNacimiento, IDT_DireccionDomicilio, IDT_DomicilioCiudad,"
							+ "IDT_CorreoElectronico, IDT_Escolaridad, IDT_EPS, IDT_ARL, IDT_AFP,"
							+ "IDT_AvisoEmergenciaNombres, IDT_AvisoEmergenciaApellidos, IDT_AvisoEmergenciaParentesco, "
							+ "GrupoSanguineo, RH, cargo, antiguedad,IDT_telefonoDomicilio, IDT_TelefonoCelular, IDT_AvisoEmergenciaTelefono, "
							+ "IDT_AvisoEmergenciaTelefonoCelular, fechaDeDiligenciamiento, fechaDeModificacion, firma) "
							+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,PutAs(?, 'JPEG'))";
				} else if (!foto.equals("") && firma.equals("")) {
					consulta = "insert into paciente(" + "documento, tipodocumento, IDT_Nombres, "
							+ "IDT_Apellidos, IDT_Sexo, IDT_fechaNacimiento, "
							+ "IDT_LugarNacimiento, IDT_DireccionDomicilio, IDT_DomicilioCiudad,"
							+ "IDT_CorreoElectronico, IDT_Escolaridad, IDT_EPS, "
							+ "IDT_ARL, IDT_AFP, IDT_AvisoEmergenciaNombres, "
							+ "IDT_AvisoEmergenciaApellidos, IDT_AvisoEmergenciaParentesco, GrupoSanguineo, "
							+ "RH, cargo, antiguedad,"
							+ "IDT_telefonoDomicilio, IDT_TelefonoCelular, IDT_AvisoEmergenciaTelefono, "
							+ "IDT_AvisoEmergenciaTelefonoCelular, fechaDeDiligenciamiento, fechaDeModificacion, "
							+ "foto) " + "values(" + "?,?,?" + ",?,?,?" + ",?,?,?" + ",?,?,?" + ",?,?,?" + ",?,?,?"
							+ ",?,?,?" + ",?,?,?" + ",?,?,?,PutAs(?, 'JPEG'))";
				} else {
					consulta = "insert into paciente(documento, tipodocumento, IDT_Nombres, IDT_Apellidos, IDT_Sexo, IDT_fechaNacimiento, "
							+ "IDT_LugarNacimiento, IDT_DireccionDomicilio, IDT_DomicilioCiudad,"
							+ "IDT_CorreoElectronico, IDT_Escolaridad, IDT_EPS, IDT_ARL, IDT_AFP,"
							+ "IDT_AvisoEmergenciaNombres, IDT_AvisoEmergenciaApellidos, IDT_AvisoEmergenciaParentesco, "
							+ "GrupoSanguineo, RH, cargo, antiguedad,IDT_telefonoDomicilio, IDT_TelefonoCelular, IDT_AvisoEmergenciaTelefono, "
							+ "IDT_AvisoEmergenciaTelefonoCelular, fechaDeDiligenciamiento, fechaDeModificacion) "
							+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				}

				PreparedStatement preparedStatement = connection.prepareStatement(consulta);
				preparedStatement.setString(1, paciente.getDocumento());
				preparedStatement.setString(2, paciente.getTipodocumento());
				preparedStatement.setString(3, paciente.getIDT_Nombres());
				preparedStatement.setString(4, paciente.getIDT_Apellidos());
				preparedStatement.setString(5, paciente.getIDT_sexo());
				preparedStatement.setString(6, paciente.getIDT_fechaNacimiento());
				preparedStatement.setString(7, paciente.getIDT_LugarNacimiento());
				preparedStatement.setString(8, paciente.getIDT_DireccionDomicilio());
				preparedStatement.setString(9, paciente.getIDT_DomicilioCiudad());
				preparedStatement.setString(10, paciente.getIDT_CorreoElectronico());
				preparedStatement.setString(11, paciente.getIDT_Escolaridad());
				preparedStatement.setString(12, paciente.getIDT_EPS());
				preparedStatement.setString(13, paciente.getIDT_ARL());
				preparedStatement.setString(14, paciente.getIDT_AFP());
				preparedStatement.setString(15, paciente.getIDT_AvisoEmergenciaNombres());
				preparedStatement.setString(16, paciente.getIDT_AvisoEmergenciaApellidos());
				preparedStatement.setString(17, paciente.getIDT_AvisoEmergenciaParentesco());
				preparedStatement.setString(18, paciente.getGrupoSanguineo());
				preparedStatement.setString(19, paciente.getRH());
				preparedStatement.setString(20, paciente.getCargo());
				preparedStatement.setString(21, paciente.getAntiguedad());
				preparedStatement.setString(22, paciente.getIDT_telefonoDomicilio());
				preparedStatement.setString(23, paciente.getIDT_TelefonoCelular());
				preparedStatement.setString(24, paciente.getIDT_AvisoEmergenciaTelefono());
				preparedStatement.setString(25, paciente.getIDT_AvisoEmergenciaTelefonoCelular());
				preparedStatement.setTimestamp(26, new Timestamp(Calendar.getInstance().getTimeInMillis()));
				preparedStatement.setTimestamp(27, new Timestamp(Calendar.getInstance().getTimeInMillis()));

				if (!foto.equals("") && !firma.equals("")) {
					preparedStatement.setBytes(28, foto.getBytes());
					preparedStatement.setBytes(29, firma.getBytes());
				} else if (foto.equals("") && !firma.equals("")) {
					preparedStatement.setBytes(28, firma.getBytes());
				} else if (!foto.equals("") && firma.equals("")) {
					preparedStatement.setBytes(28, foto.getBytes());
				}

				preparedStatement.execute();

				conexion.cerrarConexion();

			}
		} catch (Exception e) {
			System.out.println("Error en orden P: " + e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public int obtenerID(String documento) {

		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "Select pk_IDT_DocumentoID from paciente where documento = ?";

				PreparedStatement preparedStatement = connection.prepareStatement(consulta);
				preparedStatement.setString(1, documento);
				ResultSet resultSet = preparedStatement.executeQuery();

				if (resultSet.next()) {
					return resultSet.getInt(1);
				}
				conexion.cerrarConexion();
			}
		} catch (Exception e) {
			System.out.println("Error en orden ObtenerID P: " + e.getLocalizedMessage());
			return -1;
		}
		return -1;
	}

}
