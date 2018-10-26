package co.analicom.ws.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import co.analicom.ws.dao.interfaces.ExamenInterface;
import co.analicom.ws.database.Conexion;
import co.analicom.ws.modelo.Examen;


public class ExamenDao implements ExamenInterface {
	Conexion conexion;

	public ExamenDao() {
		conexion = new Conexion();
	}

	

	@Override
	public List<String> listaParametrosExamenCadena(int examen) {
		List<String> list = new ArrayList<String>();
		try {
			Connection connection = conexion.getConexionFM();
			String consulta = "SELECT equivalencia FROM Examen_PARAMETRO where id_examen = ? and equivalencia IS NOT NULL";
			PreparedStatement preparedStatement = connection.prepareStatement(consulta);
			preparedStatement.setInt(1, examen);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				list.add(resultSet.getString("equivalencia"));
			}
			conexion.cerrarConexion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<String> buscarSufijos(int id_examen) {
		try {
			List<String> list = new ArrayList<String>();
			Connection connection = conexion.getConexionFM();
			String consulta = "SELECT codigo FROM Examen_SUFIJO WHERE id_examen = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(consulta);

			preparedStatement.setInt(1, id_examen);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				list.add(resultSet.getString("codigo"));
			}
			conexion.cerrarConexion();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Integer> listaExamenesOrdenPorAnalizador(String orden, int analizador) {
		try {
			List<Integer> list = new ArrayList<Integer>();
			Connection connection = conexion.getConexionFM();
			String consulta = "SELECT e.id as id FROM Orden o " + "JOIN Orden_DATOS_ORDEN do ON do.id_orden = o.id "
					+ "JOIN Examen e ON e.id = do.id_examen "
					+ "JOIN Examen_ANALIZADOREXAMEN ae ON ae.id_examen = e.id "
					+ "WHERE ae.id_analizador = ? AND o.codigoFinal = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(consulta);

			preparedStatement.setInt(1, analizador);
			preparedStatement.setString(2, orden);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				list.add(resultSet.getInt("id"));
			}
			conexion.cerrarConexion();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Examen> listExamenesFM() {
		List<Examen> list = new ArrayList<Examen>();
		try {
			Connection connection = conexion.getConexionFM();
			String consulta = "SELECT id, siglaVC as sigla, descripcion, diasProcesoConsulta as dias_proceso, sinonimo, tipo_muestra as tipoMuestra, "
					+ "instrucciones_toma_muestra as instrucciones, tiempoProceso as tiempo_proceso, horaToma as hora_toma, tecnica, "
					+ "que_es as significado, significado_clinico, preparacion_paciente as preparacion FROM Examen where catalogoweb  = 'Si'";
			PreparedStatement preparedStatement = connection.prepareStatement(consulta);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Examen exam = new Examen();
				exam.setId(resultSet.getInt("id"));
				exam.setSigla(resultSet.getString("sigla"));
				exam.setDescripcion(resultSet.getString("descripcion"));
				exam.setDias_proceso(resultSet.getString("dias_proceso"));
				exam.setSinonimo(resultSet.getString("sinonimo"));
				exam.setTipoMuestra(resultSet.getString("tipoMuestra"));
				exam.setInstrucciones(resultSet.getString("instrucciones"));
				exam.setTiempo_proceso(resultSet.getString("tiempo_proceso"));
				exam.setHora_toma(resultSet.getString("hora_toma"));
				exam.setTecnica(resultSet.getString("tecnica"));
				exam.setSignificado(resultSet.getString("significado"));
				exam.setSignificado_clinico(resultSet.getString("significado_clinico"));
				exam.setPreparacion(resultSet.getString("preparacion"));
				list.add(exam);
			}
			conexion.cerrarConexion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Examen> listExamenesMySQL() {
		List<Examen> list = new ArrayList<Examen>();
		try {
			Connection connection = conexion.getConexionMySQL();
			String consulta = "SELECT id, sigla, descripcion, dias_proceso, sinonimo, tipoMuestra, "
					+ "instrucciones, tiempo_proceso, hora_toma, tecnica, "
					+ "significado, significado_clinico, preparacion FROM Exams";
			PreparedStatement preparedStatement = connection.prepareStatement(consulta);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				Examen exam = new Examen();
				exam.setId(resultSet.getInt("id"));
				exam.setSigla(resultSet.getString("sigla"));
				exam.setDescripcion(resultSet.getString("descripcion"));
				exam.setDias_proceso(resultSet.getString("dias_proceso"));
				exam.setSinonimo(resultSet.getString("sinonimo"));
				exam.setTipoMuestra(resultSet.getString("tipoMuestra"));
				exam.setInstrucciones(resultSet.getString("instrucciones"));
				exam.setTiempo_proceso(resultSet.getString("tiempo_proceso"));
				exam.setHora_toma(resultSet.getString("hora_toma"));
				exam.setTecnica(resultSet.getString("tecnica"));
				exam.setSignificado(resultSet.getString("significado"));
				exam.setSignificado_clinico(resultSet.getString("significado_clinico"));
				exam.setPreparacion(resultSet.getString("preparacion"));
				list.add(exam);
			}
			conexion.cerrarConexion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public void updateCatalogoWeb(Examen examen) {
		
		try {
			Connection connection = conexion.getConexionMySQL();
			String consulta = "UPDATE Exams set descripcion = ?, dias_proceso = ?, sinonimo = ?, tipoMuestra = ?, "
					+ "instrucciones = ?, tiempo_proceso = ?, hora_toma = ?, tecnica = ?, "
					+ "significado = ?, significado_clinico = ?, preparacion = ? where id = ?";
			PreparedStatement ps = connection.prepareStatement(consulta);
			ps.setString(1, examen.getDescripcion());
			ps.setString(2, examen.getDias_proceso());
			ps.setString(3, examen.getSinonimo());
			ps.setString(4, examen.getTipoMuestra());
			ps.setString(5, examen.getInstrucciones());
			ps.setString(6, examen.getTiempo_proceso());
			ps.setString(7, examen.getHora_toma());
			ps.setString(8, examen.getTecnica());
			ps.setString(9, examen.getSignificado());
			ps.setString(10, examen.getSignificado_clinico());
			ps.setString(11, examen.getPreparacion());
			ps.setInt(12, examen.getId());			
			ps.execute();			
			conexion.cerrarConexion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCatalogoWeb() {
		
		try {
			Connection connection = conexion.getConexionMySQL();
			String consulta = "DELETE FROM EXAMS";
			PreparedStatement ps = connection.prepareStatement(consulta);
			ps.execute();			
			conexion.cerrarConexion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insertCatalogoWEB(Examen examen) {
		try {
			Connection connection = conexion.getConexionMySQL();
			String consulta = "insert into Exams (descripcion, dias_proceso, sinonimo, tipoMuestra, "
					+ "instrucciones, tiempo_proceso, hora_toma, tecnica, "
					+ "significado, significado_clinico, preparacion, sigla) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(consulta);
			ps.setString(1, examen.getDescripcion());
			ps.setString(2, examen.getDias_proceso());
			ps.setString(3, examen.getSinonimo());
			ps.setString(4, examen.getTipoMuestra());
			ps.setString(5, examen.getInstrucciones());
			ps.setString(6, examen.getTiempo_proceso());
			ps.setString(7, examen.getHora_toma());
			ps.setString(8, examen.getTecnica());
			ps.setString(9, examen.getSignificado());
			ps.setString(10, examen.getSignificado_clinico());
			ps.setString(11, examen.getPreparacion());
			ps.setString(12, examen.getSigla());
			ps.execute();			
			conexion.cerrarConexion();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}