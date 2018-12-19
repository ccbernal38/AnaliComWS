/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.ExamenFisicoDaoInterface;
import co.analicom.ws.hc.modelo.ExamenFisico;

/**
 * @author Cristian Cruz
 */
public class ExamenFisicoDao implements ExamenFisicoDaoInterface{
	
	Conexion conexion;
	
	public ExamenFisicoDao() {
		conexion = new Conexion();
	}
	
	@Override
	public boolean insertExamenFisico(ExamenFisico examenFisico) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO ExamenFisico(Abdomen, Abdomen_Descripcion, Abdomen_Hernias, BA_Calor_Cadera_D, BA_Calor_Cadera_I,"
						+ "BA_Calor_Codos_D, BA_Calor_Codos_I, BA_Calor_Dedos_Mano_D, BA_Calor_Dedos_Mano_I, BA_Calor_Dedos_Pie_D, "
						+ "BA_Calor_Dedos_Pie_I, BA_Calor_Hombros_D, BA_Calor_Hombros_I, BA_Calor_Munecas_D, BA_Calor_Munecas_I, "
						+ "BA_Calor_Rodilla_D, BA_Calor_Rodilla_I, BA_Calor_Tobillos_D, BA_Calor_Tobillos_I, BA_Deformidad_Cadera_D, "
						+ "BA_Deformidad_Cadera_I, BA_Deformidad_Codos_D, BA_Deformidad_Codos_I, BA_Deformidad_Dedos_Mano_D, BA_Deformidad_Dedos_Mano_I, "
						+ "BA_Deformidad_Dedos_Pie_D, BA_Deformidad_Dedos_Pie_I, BA_Deformidad_Hombros_D, BA_Deformidad_Hombros_I, "
						+ "BA_Deformidad_Munecas_D, BA_Deformidad_Munecas_I, BA_Deformidad_Rodilla_D, BA_Deformidad_Rodilla_I, BA_Deformidad_Tobillos_D, "
						+ "BA_Deformidad_Tobillos_I, BA_Dolor_Cadera_D, BA_Dolor_Cadera_I, BA_Dolor_Codos_D, BA_Dolor_Codos_I, BA_Dolor_Dedos_Mano_D, "
						+ "BA_Dolor_Dedos_Mano_I, BA_Dolor_Dedos_Pie_D, BA_Dolor_Dedos_Pie_I, BA_Dolor_Hombros_D, BA_Dolor_Hombros_I, BA_Dolor_Munecas_D, "
						+ "BA_Dolor_Munecas_I, BA_Dolor_Rodilla_D, BA_Dolor_Rodilla_I, BA_Dolor_Tobillos_D, BA_Dolor_Tobillos_I, BA_Edema_Cadera_D, "
						+ "BA_Edema_Cadera_I, BA_Edema_Codos_D, BA_Edema_Codos_I, BA_Edema_Dedos_Mano_D, BA_Edema_Dedos_Mano_I, BA_Edema_Dedos_Pie_D, "
						+ "BA_Edema_Dedos_Pie_I, BA_Edema_Hombros_D, BA_Edema_Hombros_I, BA_Edema_Munecas_D, BA_Edema_Munecas_I, BA_Edema_Rodilla_D, "
						+ "BA_Edema_Rodilla_I, BA_Edema_Tobillos_D, BA_Edema_Tobillos_I, BA_Explicacion, BA_Limitacion_Arcos_Cadera_D, "
						+ "BA_Limitacion_Arcos_Cadera_I, BA_Limitacion_Arcos_Codos_D, BA_Limitacion_Arcos_Codos_I, "
						+ "BA_Limitacion_Arcos_Dedos_Mano_D, BA_Limitacion_Arcos_Dedos_Mano_I, BA_Limitacion_Arcos_Dedos_Pie_D, "
						+ "BA_Limitacion_Arcos_Dedos_Pie_I, BA_Limitacion_Arcos_Hombros_D, BA_Limitacion_Arcos_Hombros_I, BA_Limitacion_Arcos_Munecas_D, "
						+ "BA_Limitacion_Arcos_Munecas_I, BA_Limitacion_Arcos_Rodilla_D, BA_Limitacion_Arcos_Rodilla_I, BA_Limitacion_Arcos_Tobillos_D, "
						+ "BA_Limitacion_Arcos_Tobillos_I, BA_Rubor_Cadera_D, BA_Rubor_Cadera_I, BA_Rubor_Codos_D, BA_Rubor_Codos_I, BA_Rubor_Dedos_Mano_D, "
						+ "BA_Rubor_Dedos_Mano_I, BA_Rubor_Dedos_Pie_D, BA_Rubor_Dedos_Pie_I, BA_Rubor_Hombros_D, BA_Rubor_Hombros_I, BA_Rubor_Munecas_D, "
						+ "BA_Rubor_Munecas_I, BA_Rubor_Rodilla_D, BA_Rubor_Rodilla_I, BA_Rubor_Tobillos_D, BA_Rubor_Tobillos_I, BA_Sensibilidad_Cadera_D, "
						+ "BA_Sensibilidad_Cadera_I, BA_Sensibilidad_Codos_D, BA_Sensibilidad_Codos_I, BA_Sensibilidad_Dedos_Mano_D, BA_Sensibilidad_Dedos_Mano_I, "
						+ "BA_Sensibilidad_Dedos_Pie_D, BA_Sensibilidad_Dedos_Pie_I, BA_Sensibilidad_Hombros_D, BA_Sensibilidad_Hombros_I, BA_Sensibilidad_Munecas_D, "
						+ "BA_Sensibilidad_Munecas_I, BA_Sensibilidad_Rodilla_D, BA_Sensibilidad_Rodilla_I, BA_Sensibilidad_Tobillos_D, BA_Sensibilidad_Tobillos_I, "
						+ "BM_Antebrazo, BM_Antebrazo_Observaciones, BM_Brazo, BM_Brazo_Observaciones, BM_Cadera_Gluteo, BM_Cadera_Gluteo_Observaciones, "
						+ "BM_Cintura_Escapular, BM_Cintura_Escapular_Observaciones, BM_Explicacion, BM_Muslos, BM_Muslos_Observaciones, BM_Pectoral, BM_Pectoral_Observaciones, "
						+ "BM_Piernas, BM_Piernas_Observaciones, CabezaCuello, CabezaCuello_Descripcion, Columna, ColumnaInspeccionCurvatura, ColumnaInspeccionCurvatura_Descripcion, "
						+ "ColumnaInspeccionSimetria, ColumnaInspeccionSimetria_Descripcion, ColumnaMarchaPuntas, ColumnaMarchaPuntas_Descripcion, ColumnaMarchaTalones, "
						+ "ColumnaMarchaTalones_Descripcion, ColumnaMovilidadExtension, ColumnaMovilidadExtension_Descripcion, ColumnaMovilidadFlexion, ColumnaMovilidadFlexion_Descripcion, "
						+ "ColumnaMovilidadFlexionLateral, ColumnaMovilidadFlexionLateral_Descripcion, ColumnaMovilidadRotacion, ColumnaMovilidadRotacion_Descripcion, ColumnaPalpacionDolor, "
						+ "ColumnaPalpacionDolor_Descripcion, ColumnaPalpacionEspasmo, ColumnaPalpacionEspasmo_Descripcion, ColumnaTrofismoMuscular, ColumnaTrofismoMuscular_Descripcion, "
						+ "Dominancia, EstadoGeneral, ExtremidadInferior, ExtremidadInferior_Descripcion, ExtremidadInferior_Juanetes, ExtremidadInferior_Observaciones, ExtremidadInferior_Varices, "
						+ "ExtremidadSuperior, ExtremidadSuperior_Descripcion, ExtremidadSuperior_FinkelsteinDerecho, ExtremidadSuperior_FinkelsteinIzquierdo, ExtremidadSuperior_PhalenDerecho, "
						+ "ExtremidadSuperior_PhalenIzquierdo, ExtremidadSuperior_TinelDerecho, ExtremidadSuperior_TinelIzquierdo, FondoOjoDerecho, FondoOjoIzquierdo, FondoOjos_Descripcion, "
						+ "GenitalesExternos, GenitalesExternos_Descripcion, GenitalesExternos_Hernias, Neurologico, Neurologico_Cordinacion_MarchaEnLinea, Neurologico_Cordinacion_Observaciones, "
						+ "Neurologico_Cordinacion_Romberg, Neurologico_EsferaMental, Neurologico_ParesCraneanos, Neurologico_Reflejos, Neurologico_Sensibilidad, Oidos, Oidos_Descripcion, Ojos, "
						+ "Ojos_Descripcion, Piel, Piel_Descripcion, PruebaVertibular, PruebaVertibular_descripcion, Psicologico, Psicometrico, PsicometricosObservaciones, RayosX, RayosX2, RayosXObservaciones, "
						+ "RayosXObservaciones2, Reflejos_Osteotendinosos_1, Reflejos_Osteotendinosos_2, Reflejos_Osteotendinosos_3, Reflejos_Osteotendinosos_4, Reflejos_Osteotendinosos_5, Reflejos_Osteotendinosos_6, "
						+ "Reflejos_Osteotendinosos_7, Reflejos_Osteotendinosos_8, RsCs, RsCs_Descripcion, RsRs, Senos, Shober, Shower_Descripcion, Torax, Wells, Wells_Descripcion, "
						+ "FC, fk_DocumentoMD, fk_IDT_DocumentoID, FR, Fuerza_1, Fuerza_2, Fuerza_3, Fuerza_4, Fuerza_5, Fuerza_6,Fuerza_7, Fuerza_8, PerimetroAbdominal, Peso, T, TAD, Talla, TAS, "
						+ "FechaDeDiligenciamiento, FechaDeModificacion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
						+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
						+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, examenFisico.getAbdomen());
				statement.setString(2, examenFisico.getAbdomen_Descripcion());
				statement.setString(3, examenFisico.getAbdomen_Hernias());
				statement.setString(4, examenFisico.getBA_Calor_Cadera_D());
				statement.setString(5, examenFisico.getBA_Calor_Cadera_I());
				statement.setString(6, examenFisico.getBA_Calor_Codos_D());
				statement.setString(7, examenFisico.getBA_Calor_Codos_I());
				statement.setString(8, examenFisico.getBA_Calor_Dedos_Mano_D());
				statement.setString(9, examenFisico.getBA_Calor_Dedos_Mano_I());
				statement.setString(10, examenFisico.getBA_Calor_Dedos_Pie_D());
				statement.setString(11, examenFisico.getBA_Calor_Dedos_Pie_I());
				statement.setString(12, examenFisico.getBA_Calor_Hombros_D());
				statement.setString(13, examenFisico.getBA_Calor_Hombros_I());
				statement.setString(14, examenFisico.getBA_Calor_Munecas_D());
				statement.setString(15, examenFisico.getBA_Calor_Munecas_I());
				statement.setString(16, examenFisico.getBA_Calor_Rodilla_D());
				statement.setString(17, examenFisico.getBA_Calor_Rodilla_I());
				statement.setString(18, examenFisico.getBA_Calor_Tobillos_D());
				statement.setString(19, examenFisico.getBA_Calor_Tobillos_I());
				statement.setString(20, examenFisico.getBA_Deformidad_Cadera_D());
				statement.setString(21, examenFisico.getBA_Deformidad_Cadera_I());
				statement.setString(22, examenFisico.getBA_Deformidad_Codos_D());
				statement.setString(23, examenFisico.getBA_Deformidad_Codos_I());
				statement.setString(24, examenFisico.getBA_Deformidad_Dedos_Mano_D());
				statement.setString(25, examenFisico.getBA_Deformidad_Dedos_Mano_I());
				statement.setString(26, examenFisico.getBA_Deformidad_Dedos_Pie_D());
				statement.setString(27, examenFisico.getBA_Deformidad_Dedos_Pie_I());
				statement.setString(28, examenFisico.getBA_Deformidad_Hombros_D());
				statement.setString(29, examenFisico.getBA_Deformidad_Hombros_I());
				statement.setString(30, examenFisico.getBA_Deformidad_Munecas_D());
				statement.setString(31, examenFisico.getBA_Deformidad_Munecas_I());
				statement.setString(32, examenFisico.getBA_Deformidad_Rodilla_D());
				statement.setString(33, examenFisico.getBA_Deformidad_Rodilla_I());
				statement.setString(34, examenFisico.getBA_Deformidad_Tobillos_D());
				statement.setString(35, examenFisico.getBA_Deformidad_Tobillos_I());
				statement.setString(36, examenFisico.getBA_Dolor_Cadera_D());
				statement.setString(37, examenFisico.getBA_Dolor_Cadera_I());
				statement.setString(38, examenFisico.getBA_Dolor_Codos_D());
				statement.setString(39, examenFisico.getBA_Dolor_Codos_I());
				statement.setString(40, examenFisico.getBA_Dolor_Dedos_Mano_D());
				statement.setString(41, examenFisico.getBA_Dolor_Dedos_Mano_I());
				statement.setString(42, examenFisico.getBA_Dolor_Dedos_Pie_D());
				statement.setString(43, examenFisico.getBA_Dolor_Dedos_Pie_I());
				statement.setString(44, examenFisico.getBA_Dolor_Hombros_D());
				statement.setString(45, examenFisico.getBA_Dolor_Hombros_I());
				statement.setString(46, examenFisico.getBA_Dolor_Munecas_D());
				statement.setString(47, examenFisico.getBA_Dolor_Munecas_I());
				statement.setString(48, examenFisico.getBA_Dolor_Rodilla_D());
				statement.setString(49, examenFisico.getBA_Dolor_Rodilla_I());
				statement.setString(50, examenFisico.getBA_Dolor_Tobillos_D());
				statement.setString(51, examenFisico.getBA_Dolor_Tobillos_I());
				statement.setString(52, examenFisico.getBA_Edema_Cadera_D());
				statement.setString(53, examenFisico.getBA_Edema_Cadera_I());
				statement.setString(54, examenFisico.getBA_Edema_Codos_D());
				statement.setString(55, examenFisico.getBA_Edema_Codos_I());
				statement.setString(56, examenFisico.getBA_Edema_Dedos_Mano_D());
				statement.setString(57, examenFisico.getBA_Edema_Dedos_Mano_I());
				statement.setString(58, examenFisico.getBA_Edema_Dedos_Pie_D());
				statement.setString(59, examenFisico.getBA_Edema_Dedos_Pie_I());
				statement.setString(60, examenFisico.getBA_Edema_Hombros_D());
				statement.setString(61, examenFisico.getBA_Edema_Hombros_I());
				statement.setString(62, examenFisico.getBA_Edema_Munecas_D());
				statement.setString(63, examenFisico.getBA_Edema_Munecas_I());
				statement.setString(64, examenFisico.getBA_Edema_Rodilla_D());
				statement.setString(65, examenFisico.getBA_Edema_Rodilla_I());
				statement.setString(66, examenFisico.getBA_Edema_Tobillos_D());
				statement.setString(67, examenFisico.getBA_Edema_Tobillos_I());
				statement.setString(68, examenFisico.getBA_Explicacion());
				statement.setString(69, examenFisico.getBA_Limitacion_Arcos_Cadera_D());
				statement.setString(70, examenFisico.getBA_Limitacion_Arcos_Cadera_I());
				statement.setString(71, examenFisico.getBA_Limitacion_Arcos_Codos_D());
				statement.setString(72, examenFisico.getBA_Limitacion_Arcos_Codos_I());
				statement.setString(73, examenFisico.getBA_Limitacion_Arcos_Dedos_Mano_D());
				statement.setString(74, examenFisico.getBA_Limitacion_Arcos_Dedos_Mano_I());
				statement.setString(75, examenFisico.getBA_Limitacion_Arcos_Dedos_Pie_D());
				statement.setString(76, examenFisico.getBA_Limitacion_Arcos_Dedos_Pie_I());
				statement.setString(77, examenFisico.getBA_Limitacion_Arcos_Hombros_D());
				statement.setString(78, examenFisico.getBA_Limitacion_Arcos_Hombros_I());
				statement.setString(79, examenFisico.getBA_Limitacion_Arcos_Munecas_D());
				statement.setString(80, examenFisico.getBA_Limitacion_Arcos_Munecas_I());
				statement.setString(81, examenFisico.getBA_Limitacion_Arcos_Rodilla_D());
				statement.setString(82, examenFisico.getBA_Limitacion_Arcos_Rodilla_I());
				statement.setString(83, examenFisico.getBA_Limitacion_Arcos_Tobillos_D());
				statement.setString(84, examenFisico.getBA_Limitacion_Arcos_Tobillos_I());
				statement.setString(85, examenFisico.getBA_Rubor_Cadera_D());
				statement.setString(86, examenFisico.getBA_Rubor_Cadera_I());
				statement.setString(87, examenFisico.getBA_Rubor_Codos_D());
				statement.setString(88, examenFisico.getBA_Rubor_Codos_I());
				statement.setString(89, examenFisico.getBA_Rubor_Dedos_Mano_D());
				statement.setString(90, examenFisico.getBA_Rubor_Dedos_Mano_I());
				statement.setString(91, examenFisico.getBA_Rubor_Dedos_Pie_D());
				statement.setString(92, examenFisico.getBA_Rubor_Dedos_Pie_I());
				statement.setString(93, examenFisico.getBA_Rubor_Hombros_D());
				statement.setString(94, examenFisico.getBA_Rubor_Hombros_I());
				statement.setString(95, examenFisico.getBA_Rubor_Munecas_D());
				statement.setString(96, examenFisico.getBA_Rubor_Munecas_I());
				statement.setString(97, examenFisico.getBA_Rubor_Rodilla_D());
				statement.setString(98, examenFisico.getBA_Rubor_Rodilla_I());
				statement.setString(99, examenFisico.getBA_Rubor_Tobillos_D());
				statement.setString(100, examenFisico.getBA_Rubor_Tobillos_I());
				statement.setString(101, examenFisico.getBA_Sensibilidad_Cadera_D());
				statement.setString(102, examenFisico.getBA_Sensibilidad_Cadera_I());
				statement.setString(103, examenFisico.getBA_Sensibilidad_Codos_D());
				statement.setString(104, examenFisico.getBA_Sensibilidad_Codos_I());
				statement.setString(105, examenFisico.getBA_Sensibilidad_Dedos_Mano_D());
				statement.setString(106, examenFisico.getBA_Sensibilidad_Dedos_Mano_I());
				statement.setString(107, examenFisico.getBA_Sensibilidad_Dedos_Pie_D());
				statement.setString(108, examenFisico.getBA_Sensibilidad_Dedos_Pie_I());
				statement.setString(109, examenFisico.getBA_Sensibilidad_Hombros_D());
				statement.setString(110, examenFisico.getBA_Sensibilidad_Hombros_I());
				statement.setString(111, examenFisico.getBA_Sensibilidad_Munecas_D());
				statement.setString(112, examenFisico.getBA_Sensibilidad_Munecas_I());
				statement.setString(113, examenFisico.getBA_Sensibilidad_Rodilla_D());
				statement.setString(114, examenFisico.getBA_Sensibilidad_Rodilla_I());
				statement.setString(115, examenFisico.getBA_Sensibilidad_Tobillos_D());
				statement.setString(116, examenFisico.getBA_Sensibilidad_Tobillos_I());
				statement.setString(117, examenFisico.getBM_Antebrazo());
				statement.setString(118, examenFisico.getBM_Antebrazo_Observaciones());
				statement.setString(119, examenFisico.getBM_Brazo());
				statement.setString(120, examenFisico.getBM_Brazo_Observaciones());
				statement.setString(121, examenFisico.getBM_Cadera_Gluteo());
				statement.setString(122, examenFisico.getBM_Cadera_Gluteo_Observaciones());
				statement.setString(123, examenFisico.getBM_Cintura_Escapular());
				statement.setString(124, examenFisico.getBM_Cintura_Escapular_Observaciones());
				statement.setString(125, examenFisico.getBM_Explicacion());
				statement.setString(126, examenFisico.getBM_Muslos());
				statement.setString(127, examenFisico.getBM_Muslos_Observaciones());
				statement.setString(128, examenFisico.getBM_Pectoral());
				statement.setString(129, examenFisico.getBM_Pectoral_Observaciones());
				statement.setString(130, examenFisico.getBM_Piernas());
				statement.setString(131, examenFisico.getBM_Piernas_Observaciones());
				statement.setString(132, examenFisico.getCabezaCuello());
				statement.setString(133, examenFisico.getCabezaCuello_Descripcion());
				statement.setString(134, examenFisico.getColumna());
				statement.setString(135, examenFisico.getColumnaInspeccionCurvatura());
				statement.setString(136, examenFisico.getColumnaInspeccionCurvatura_Descripcion());
				statement.setString(137, examenFisico.getColumnaInspeccionSimetria());
				statement.setString(138, examenFisico.getColumnaInspeccionSimetria_Descripcion());
				statement.setString(139, examenFisico.getColumnaMarchaPuntas());
				statement.setString(140, examenFisico.getColumnaMarchaPuntas_Descripcion());
				statement.setString(141, examenFisico.getColumnaMarchaTalones());
				statement.setString(142, examenFisico.getColumnaMarchaTalones_Descripcion());
				statement.setString(143, examenFisico.getColumnaMovilidadExtension());
				statement.setString(144, examenFisico.getColumnaMovilidadExtension_Descripcion());
				statement.setString(145, examenFisico.getColumnaMovilidadFlexion());
				statement.setString(146, examenFisico.getColumnaMovilidadFlexion_Descripcion());
				statement.setString(147, examenFisico.getColumnaMovilidadFlexionLateral());
				statement.setString(148, examenFisico.getColumnaMovilidadFlexionLateral_Descripcion());
				statement.setString(149, examenFisico.getColumnaMovilidadRotacion());
				statement.setString(150, examenFisico.getColumnaMovilidadRotacion_Descripcion());
				statement.setString(151, examenFisico.getColumnaPalpacionDolor());
				statement.setString(152, examenFisico.getColumnaPalpacionDolor_Descripcion());
				statement.setString(153, examenFisico.getColumnaPalpacionEspasmo());
				statement.setString(154, examenFisico.getColumnaPalpacionEspasmo_Descripcion());
				statement.setString(155, examenFisico.getColumnaTrofismoMuscular());
				statement.setString(156, examenFisico.getColumnaTrofismoMuscular_Descripcion());
				statement.setString(157, examenFisico.getDominancia());
				statement.setString(158, examenFisico.getEstadoGeneral());
				statement.setString(159, examenFisico.getExtremidadInferior());
				statement.setString(160, examenFisico.getExtremidadInferior_Descripcion());
				statement.setString(161, examenFisico.getExtremidadInferior_Juanetes());
				statement.setString(162, examenFisico.getExtremidadInferior_Observaciones());
				statement.setString(163, examenFisico.getExtremidadInferior_Varices());
				statement.setString(164, examenFisico.getExtremidadSuperior());
				statement.setString(165, examenFisico.getExtremidadSuperior_Descripcion());
				statement.setString(166, examenFisico.getExtremidadSuperior_FinkelsteinDerecho());
				statement.setString(167, examenFisico.getExtremidadSuperior_FinkelsteinIzquierdo());
				statement.setString(168, examenFisico.getExtremidadSuperior_PhalenDerecho());
				statement.setString(169, examenFisico.getExtremidadSuperior_PhalenIzquierdo());
				statement.setString(170, examenFisico.getExtremidadSuperior_TinelDerecho());
				statement.setString(171, examenFisico.getExtremidadSuperior_TinelIzquierdo());
				statement.setString(172, examenFisico.getFondoOjoDerecho());
				statement.setString(173, examenFisico.getFondoOjoIzquierdo());
				statement.setString(174, examenFisico.getFondoOjos_Descripcion());
				statement.setString(175, examenFisico.getGenitalesExternos());
				statement.setString(176, examenFisico.getGenitalesExternos_Descripcion());
				statement.setString(177, examenFisico.getGenitalesExternos_Hernias());
				statement.setString(178, examenFisico.getNeurologico());
				statement.setString(179, examenFisico.getNeurologico_Cordinacion_MarchaEnLinea());
				statement.setString(180, examenFisico.getNeurologico_Cordinacion_Observaciones());
				statement.setString(181, examenFisico.getNeurologico_Cordinacion_Romberg());
				statement.setString(182, examenFisico.getNeurologico_EsferaMental());
				statement.setString(183, examenFisico.getNeurologico_ParesCraneanos());
				statement.setString(184, examenFisico.getNeurologico_Reflejos());
				statement.setString(185, examenFisico.getNeurologico_Sensibilidad());
				statement.setString(186, examenFisico.getOidos());
				statement.setString(187, examenFisico.getOidos_Descripcion());
				statement.setString(188, examenFisico.getOjos());
				statement.setString(189, examenFisico.getOjos_Descripcion());
				statement.setString(190, examenFisico.getPiel());
				statement.setString(191, examenFisico.getPiel_Descripcion());
				statement.setString(192, examenFisico.getPruebaVertibular());
				statement.setString(193, examenFisico.getPruebaVertibular_descripcion());
				statement.setString(194, examenFisico.getPsicologico());
				statement.setString(195, examenFisico.getPsicometrico());
				statement.setString(196, examenFisico.getPsicometricosObservaciones());
				statement.setString(197, examenFisico.getRayosX());
				statement.setString(198, examenFisico.getRayosX2());
				statement.setString(199, examenFisico.getRayosXObservaciones());
				statement.setString(200, examenFisico.getRayosXObservaciones2());
				statement.setString(201, examenFisico.getReflejos_Osteotendinosos_1());
				statement.setString(202, examenFisico.getReflejos_Osteotendinosos_2());
				statement.setString(203, examenFisico.getReflejos_Osteotendinosos_3());
				statement.setString(204, examenFisico.getReflejos_Osteotendinosos_4());
				statement.setString(205, examenFisico.getReflejos_Osteotendinosos_5());
				statement.setString(206, examenFisico.getReflejos_Osteotendinosos_6());
				statement.setString(207, examenFisico.getReflejos_Osteotendinosos_7());
				statement.setString(208, examenFisico.getReflejos_Osteotendinosos_8());
				statement.setString(209, examenFisico.getRsCs());
				statement.setString(210, examenFisico.getRsCs_Descripcion());
				statement.setString(211, examenFisico.getRsRs());
				statement.setString(212, examenFisico.getSenos());
				statement.setString(213, examenFisico.getShober());
				statement.setString(214, examenFisico.getShower_Descripcion());
				statement.setString(215, examenFisico.getTorax());
				statement.setString(216, examenFisico.getWells());
				statement.setString(217, examenFisico.getWells_Descripcion());
				statement.setInt(218, examenFisico.getFC());
				statement.setInt(219, examenFisico.getFk_DocumentoMD());
				statement.setInt(220, examenFisico.getFk_IDT_DocumentoID());
				statement.setInt(221, examenFisico.getFR());
				statement.setInt(222, examenFisico.getFuerza_1());
				statement.setInt(223, examenFisico.getFuerza_2());
				statement.setInt(224, examenFisico.getFuerza_3());
				statement.setInt(225, examenFisico.getFuerza_4());
				statement.setInt(226, examenFisico.getFuerza_5());
				statement.setInt(227, examenFisico.getFuerza_6());
				statement.setInt(228, examenFisico.getFuerza_7());
				statement.setInt(229, examenFisico.getFuerza_8());
				statement.setInt(230, examenFisico.getPerimetroAbdominal());
				statement.setInt(231, examenFisico.getPeso());
				statement.setInt(232, examenFisico.getT());
				statement.setInt(233, examenFisico.getTAD());
				statement.setInt(234, examenFisico.getTalla());
				statement.setInt(235, examenFisico.getTAS());
				statement.setTimestamp(236, new Timestamp(examenFisico.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(237, new Timestamp(examenFisico.getFechaDeModificacion().getTime()));
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
