/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.AntecedentesDaoInterface;
import co.analicom.ws.hc.modelo.Antecedente;

/**
 * @author Cristian Cruz
 */
public class AntecedenteDao implements AntecedentesDaoInterface {

	Conexion conexion;

	public AntecedenteDao() {
		conexion = new Conexion();
	}

	@Override
	public boolean insertAntecedentes(Antecedente antecedente) {

		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO ANTECEDENTES (AF_Patologia_Alergias, AF_Patologia_Alergias_Parentesco, AF_Patologia_Artitis,"
						+ "AF_Patologia_Artitis_Parentesco, AF_Patologia_Asma, AF_Patologia_Asma_Parentesco, AF_Patologia_Cancer,"
						+ "AF_Patologia_Cancer_Parentesco, AF_Patologia_cardiaco, AF_Patologia_Diabetes,"
						+ "AF_Patologia_Diabetes_Parentesco, AF_Patologia_Dislipidemia, AF_Patologia_Dislipidemia_Parentesco,"
						+ "AF_Patologia_EAP, AF_Patologia_EAP_Parentesco, AF_Patologia_ECV, AF_Patologia_ECV_Parentesco,"
						+ "AF_Patologia_EnfermedadColagenosis, AF_Patologia_EnfermedadColagenosis_Parentesco,"
						+ "AF_Patologia_EnfermedadCoronaria, AF_Patologia_EnfermedadCoronaria_Parentesco, AF_Patologia_EnfermedadRenal,"
						+ "AF_Patologia_EnfermedadRenal_Parentesco, AF_Patologia_EnfermedadTiroidea,"
						+ "AF_Patologia_EnfermedadTiroidea_Parentesco, AF_Patologia_hipertension, AF_Patologia_HTA,"
						+ "AF_Patologia_HTA_Parentesco, AF_Patologia_Otra, AF_Patologia_Otra_Cual, AF_Patologia_TBC,"
						+ "AF_Patologia_TBC_Parentesco, AF_Patologia_Varices, AF_Patologia_Varices_Parentesco, AG_Ciclos,"
						+ "AG_MetodoPlanificacion, AG_UltimaCitologia_Resultado, AI_CarnetVacunacion, AI_FiebreAmarilla,"
						+ "AI_Hepatitis_A, AI_Hepatitis_B, AI_Influenza, AI_Otros, AI_Tetano, AI_TripleViral, AI_Varicela,"
						+ "AO_FOtologicos, AO_OActual, AO_OActual_T, AO_OAnterior, AO_OAnterior_T, AO_OJornadaLaboral, AO_OLabores,"
						+ "AO_OLabores_Horario, AO_OProteccion, AO_OProteccion_Tipo, AO_OProteccion_Tipo_Tiempo,"
						+ "AO_OTiempoExposicionRuido, AO_PExtraLaboral_Audifonos, AO_PExtraLaboral_Cuales, AO_PExtraLaboral_Moto,"
						+ "AO_PExtraLaboral_MusicaAlta, AO_PExtraLaboral_Otros, AO_PExtraLaboral_ServicioMilitar,"
						+ "AO_PExtraLaboral_Tejo, AO_POtologicos_Cual, AO_POtologicos_Otalgia, AO_POtologicos_Otitis,"
						+ "AO_POtologicos_Otorrea, AO_POtologicos_Otros, AO_POtologicos_Prurito, AO_POtologicos_Sensacion,"
						+ "AO_POtologicos_Tinitus, AO_POtologicos_Vertigo, AO_PPatologicos_Cuales, AO_PPatologicos_Diabetes,"
						+ "AO_PPatologicos_Hipertension, AO_PPatologicos_Otros, AO_PPatologicos_Parotiditis,"
						+ "AO_PPatologicos_Rinitis_Sinusitis, AO_PPatologicos_Rubeola, AO_PPatologicos_Sarampion,"
						+ "AO_PQuirurgicos_Cirugia_Oido, AO_PQuirurgicos_Cuales, AO_PQuirurgicos_Otros, AO_PQuirurgicos_Timpanoplastia,"
						+ "AO_PToxicos_Farmacos, AO_PToxicos_Industriales, AO_PTraumaticos_Acustico, AO_PTraumaticos_Craneo,"
						+ "AO_PTraumaticos_Cuales, AO_PTraumaticos_Otros, AP_Catarata, AP_Catarata_escribir, AP_Esquirlas,"
						+ "AP_Esquirlas_escribir, AP_Farmacologicos_Alergicos, AP_Farmacologicos_Alergicos_escribir, AP_Galucoma,"
						+ "AP_Galucoma_escribir, AP_Otros, AP_Otros_escribir, AP_Patologicos, AP_Patologicos_escribir, AP_Quimicos,"
						+ "AP_Quimicos_escribir, AP_Quirurgicos, AP_Quirurgicos_escribir, AP_RehabilitacionVisual,"
						+ "AP_RehabilitacionVisual_escribir, AP_Transfusionales, AP_Transfusionales_escribir, AP_Traumaticos,"
						+ "AP_Traumaticos_escribir, AP_UsuariosRx, AP_UsuariosRx_escribir, OtrosOculares, OtrosOcularesEscribir, "
						+ "fk_IDT_DocumentoID, AG_Dias, AG_FObstetrica_A, AG_FObstetrica_C, AG_FObstetrica_E, AG_FObstetrica_G,"
						+ "AG_FObstetrica_P, AG_FObstetrica_V, AG_Menarquia) "
						+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, antecedente.getAF_Patologia_Alergias());
				statement.setString(2, antecedente.getAF_Patologia_Alergias_Parentesco());
				statement.setString(3, antecedente.getAF_Patologia_Artitis());
				statement.setString(4, antecedente.getAF_Patologia_Artitis_Parentesco());
				statement.setString(5, antecedente.getAF_Patologia_Asma());
				statement.setString(6, antecedente.getAF_Patologia_Asma_Parentesco());
				statement.setString(7, antecedente.getAF_Patologia_Cancer());
				statement.setString(8, antecedente.getAF_Patologia_Cancer_Parentesco());
				statement.setString(9, antecedente.getAF_Patologia_cardiaco());
				statement.setString(10, antecedente.getAF_Patologia_Diabetes());
				statement.setString(11, antecedente.getAF_Patologia_Diabetes_Parentesco());
				statement.setString(12, antecedente.getAF_Patologia_Dislipidemia());
				statement.setString(13, antecedente.getAF_Patologia_Dislipidemia_Parentesco());
				statement.setString(14, antecedente.getAF_Patologia_EAP());
				statement.setString(15, antecedente.getAF_Patologia_EAP_Parentesco());
				statement.setString(16, antecedente.getAF_Patologia_ECV());
				statement.setString(17, antecedente.getAF_Patologia_ECV_Parentesco());
				statement.setString(18, antecedente.getAF_Patologia_EnfermedadColagenosis());
				statement.setString(19, antecedente.getAF_Patologia_EnfermedadColagenosis_Parentesco());
				statement.setString(20, antecedente.getAF_Patologia_EnfermedadCoronaria());
				statement.setString(21, antecedente.getAF_Patologia_EnfermedadCoronaria_Parentesco());
				statement.setString(22, antecedente.getAF_Patologia_EnfermedadRenal());
				statement.setString(23, antecedente.getAF_Patologia_EnfermedadRenal_Parentesco());
				statement.setString(24, antecedente.getAF_Patologia_EnfermedadTiroidea());
				statement.setString(25, antecedente.getAF_Patologia_EnfermedadTiroidea_Parentesco());
				statement.setString(26, antecedente.getAF_Patologia_hipertension());
				statement.setString(27, antecedente.getAF_Patologia_HTA());
				statement.setString(28, antecedente.getAF_Patologia_HTA_Parentesco());
				statement.setString(29, antecedente.getAF_Patologia_Otra());
				statement.setString(30, antecedente.getAF_Patologia_Otra_Cual());
				statement.setString(31, antecedente.getAF_Patologia_TBC());
				statement.setString(32, antecedente.getAF_Patologia_TBC_Parentesco());
				statement.setString(33, antecedente.getAF_Patologia_Varices());
				statement.setString(34, antecedente.getAF_Patologia_Varices_Parentesco());
				statement.setString(35, antecedente.getAG_Ciclos());
				statement.setString(36, antecedente.getAG_MetodoPlanificacion());
				statement.setString(37, antecedente.getAG_UltimaCitologia_Resultado());
				statement.setString(38, antecedente.getAI_CarnetVacunacion());
				statement.setString(39, antecedente.getAI_FiebreAmarilla());
				statement.setString(40, antecedente.getAI_Hepatitis_A());
				statement.setString(41, antecedente.getAI_Hepatitis_B());
				statement.setString(42, antecedente.getAI_Influenza());
				statement.setString(43, antecedente.getAI_Otros());
				statement.setString(44, antecedente.getAI_Tetano());
				statement.setString(45, antecedente.getAI_TripleViral());
				statement.setString(46, antecedente.getAI_Varicela());
				statement.setString(47, antecedente.getAO_FOtologicos());
				statement.setString(48, antecedente.getAO_OActual());
				statement.setString(49, antecedente.getAO_OActual_T());
				statement.setString(50, antecedente.getAO_OAnterior());
				statement.setString(51, antecedente.getAO_OAnterior_T());
				statement.setString(52, antecedente.getAO_OJornadaLaboral());
				statement.setString(53, antecedente.getAO_OLabores());
				statement.setString(54, antecedente.getAO_OLabores_Horario());
				statement.setString(55, antecedente.getAO_OProteccion());
				statement.setString(56, antecedente.getAO_OProteccion_Tipo());
				statement.setString(57, antecedente.getAO_OProteccion_Tipo_Tiempo());
				statement.setString(58, antecedente.getAO_OTiempoExposicionRuido());
				statement.setString(59, antecedente.getAO_PExtraLaboral_Audifonos());
				statement.setString(60, antecedente.getAO_PExtraLaboral_Cuales());
				statement.setString(61, antecedente.getAO_PExtraLaboral_Moto());
				statement.setString(62, antecedente.getAO_PExtraLaboral_MusicaAlta());
				statement.setString(63, antecedente.getAO_PExtraLaboral_Otros());
				statement.setString(64, antecedente.getAO_PExtraLaboral_ServicioMilitar());
				statement.setString(65, antecedente.getAO_PExtraLaboral_Tejo());
				statement.setString(66, antecedente.getAO_POtologicos_Cual());
				statement.setString(67, antecedente.getAO_POtologicos_Otalgia());
				statement.setString(68, antecedente.getAO_POtologicos_Otitis());
				statement.setString(69, antecedente.getAO_POtologicos_Otorrea());
				statement.setString(70, antecedente.getAO_POtologicos_Otros());
				statement.setString(71, antecedente.getAO_POtologicos_Prurito());
				statement.setString(72, antecedente.getAO_POtologicos_Sensacion());
				statement.setString(73, antecedente.getAO_POtologicos_Tinitus());
				statement.setString(74, antecedente.getAO_POtologicos_Vertigo());
				statement.setString(75, antecedente.getAO_PPatologicos_Cuales());
				statement.setString(76, antecedente.getAO_PPatologicos_Diabetes());
				statement.setString(77, antecedente.getAO_PPatologicos_Hipertension());
				statement.setString(78, antecedente.getAO_PPatologicos_Otros());
				statement.setString(79, antecedente.getAO_PPatologicos_Parotiditis());
				statement.setString(80, antecedente.getAO_PPatologicos_Rinitis_Sinusitis());
				statement.setString(81, antecedente.getAO_PPatologicos_Rubeola());
				statement.setString(82, antecedente.getAO_PPatologicos_Sarampion());
				statement.setString(83, antecedente.getAO_PQuirurgicos_Cirugia_Oido());
				statement.setString(84, antecedente.getAO_PQuirurgicos_Cuales());
				statement.setString(85, antecedente.getAO_PQuirurgicos_Otros());
				statement.setString(86, antecedente.getAO_PQuirurgicos_Timpanoplastia());
				statement.setString(87, antecedente.getAO_PToxicos_Farmacos());
				statement.setString(88, antecedente.getAO_PToxicos_Industriales());
				statement.setString(89, antecedente.getAO_PTraumaticos_Acustico());
				statement.setString(90, antecedente.getAO_PTraumaticos_Craneo());
				statement.setString(91, antecedente.getAO_PTraumaticos_Cuales());
				statement.setString(92, antecedente.getAO_PTraumaticos_Otros());
				statement.setString(93, antecedente.getAP_Catarata());
				statement.setString(94, antecedente.getAP_Catarata_escribir());
				statement.setString(95, antecedente.getAP_Esquirlas());
				statement.setString(96, antecedente.getAP_Esquirlas_escribir());
				statement.setString(97, antecedente.getAP_Farmacologicos_Alergicos());
				statement.setString(98, antecedente.getAP_Farmacologicos_Alergicos_escribir());
				statement.setString(99, antecedente.getAP_Galucoma());
				statement.setString(100, antecedente.getAP_Galucoma_escribir());
				statement.setString(101, antecedente.getAP_Otros());
				statement.setString(102, antecedente.getAP_Otros_escribir());
				statement.setString(103, antecedente.getAP_Patologicos());
				statement.setString(104, antecedente.getAP_Patologicos_escribir());
				statement.setString(105, antecedente.getAP_Quimicos());
				statement.setString(106, antecedente.getAP_Quimicos_escribir());
				statement.setString(107, antecedente.getAP_Quirurgicos());
				statement.setString(108, antecedente.getAP_Quirurgicos_escribir());
				statement.setString(109, antecedente.getAP_RehabilitacionVisual());
				statement.setString(110, antecedente.getAP_RehabilitacionVisual_escribir());
				statement.setString(111, antecedente.getAP_Transfusionales());
				statement.setString(112, antecedente.getAP_Transfusionales_escribir());
				statement.setString(113, antecedente.getAP_Traumaticos());
				statement.setString(114, antecedente.getAP_Traumaticos_escribir());
				statement.setString(115, antecedente.getAP_UsuariosRx());
				statement.setString(116, antecedente.getAP_UsuariosRx_escribir());
				statement.setString(117, antecedente.getOtrosOculares());
				statement.setString(118, antecedente.getOtrosOcularesEscribir());
				statement.setInt(119, antecedente.getfk_IDT_DocumentoID());
				statement.setInt(120, antecedente.getAG_Dias());
				statement.setInt(121, antecedente.getAG_FObstetrica_A());
				statement.setInt(122, antecedente.getAG_FObstetrica_C());
				statement.setInt(123, antecedente.getAG_FObstetrica_E());
				statement.setInt(124, antecedente.getAG_FObstetrica_G());
				statement.setInt(125, antecedente.getAG_FObstetrica_P());
				statement.setInt(126, antecedente.getAG_FObstetrica_V());
				statement.setInt(127, antecedente.getAG_Menarquia());

				if (!statement.execute()) {
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

	@Override
	public boolean updateAntecedentes(Antecedente antecedente) {
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "Update ANTECEDENTES set AF_Patologia_Alergias = ?, AF_Patologia_Alergias_Parentesco = ?, AF_Patologia_Artitis = ?, "
						+ "AF_Patologia_Artitis_Parentesco = ?, AF_Patologia_Asma = ?, AF_Patologia_Asma_Parentesco = ?, AF_Patologia_Cancer = ?, "
						+ "AF_Patologia_Cancer_Parentesco = ?, AF_Patologia_cardiaco = ?, AF_Patologia_Diabetes = ?, AF_Patologia_Diabetes_Parentesco = ?, "
						+ "AF_Patologia_Dislipidemia = ?, AF_Patologia_Dislipidemia_Parentesco = ?, AF_Patologia_EAP = ?, AF_Patologia_EAP_Parentesco = ?, "
						+ "AF_Patologia_ECV = ?, AF_Patologia_ECV_Parentesco = ?, AF_Patologia_EnfermedadColagenosis = ?, "
						+ "AF_Patologia_EnfermedadColagenosis_Parentesco = ?, AF_Patologia_EnfermedadCoronaria = ?, AF_Patologia_EnfermedadCoronaria_Parentesco = ?, "
						+ "AF_Patologia_EnfermedadRenal = ?, AF_Patologia_EnfermedadRenal_Parentesco = ?, AF_Patologia_EnfermedadTiroidea = ?, "
						+ "AF_Patologia_EnfermedadTiroidea_Parentesco = ?, AF_Patologia_hipertension = ?, AF_Patologia_HTA = ?, AF_Patologia_HTA_Parentesco = ?, "
						+ "AF_Patologia_Otra = ?, AF_Patologia_Otra_Cual = ?, AF_Patologia_TBC = ?, AF_Patologia_TBC_Parentesco = ?, AF_Patologia_Varices = ?, "
						+ "AF_Patologia_Varices_Parentesco = ?, AG_Ciclos = ?, AG_MetodoPlanificacion = ?, AG_UltimaCitologia_Resultado = ?, "
						+ "AI_CarnetVacunacion = ?, AI_FiebreAmarilla = ?, AI_Hepatitis_A = ?, AI_Hepatitis_B = ?, AI_Influenza = ?, AI_Otros = ?, "
						+ "AI_Tetano = ?, AI_TripleViral = ?, AI_Varicela = ?, AO_FOtologicos = ?, AO_OActual = ?, AO_OActual_T = ?, AO_OAnterior = ?, "
						+ "AO_OAnterior_T = ?, AO_OJornadaLaboral = ?, AO_OLabores = ?, AO_OLabores_Horario = ?, AO_OProteccion = ?, AO_OProteccion_Tipo = ?, "
						+ "AO_OProteccion_Tipo_Tiempo = ?, AO_OTiempoExposicionRuido = ?, AO_PExtraLaboral_Audifonos = ?, AO_PExtraLaboral_Cuales = ?, "
						+ "AO_PExtraLaboral_Moto = ?, AO_PExtraLaboral_MusicaAlta = ?, AO_PExtraLaboral_Otros = ?, AO_PExtraLaboral_ServicioMilitar = ?, "
						+ "AO_PExtraLaboral_Tejo = ?, AO_POtologicos_Cual = ?, AO_POtologicos_Otalgia = ?, AO_POtologicos_Otitis = ?, AO_POtologicos_Otorrea = ?, "
						+ "AO_POtologicos_Otros = ?, AO_POtologicos_Prurito = ?, AO_POtologicos_Sensacion = ?, AO_POtologicos_Tinitus = ?, "
						+ "AO_POtologicos_Vertigo = ?, AO_PPatologicos_Cuales = ?, AO_PPatologicos_Diabetes = ?, AO_PPatologicos_Hipertension = ?, "
						+ "AO_PPatologicos_Otros = ?, AO_PPatologicos_Parotiditis = ?, AO_PPatologicos_Rinitis_Sinusitis = ?, AO_PPatologicos_Rubeola = ?, "
						+ "AO_PPatologicos_Sarampion = ?, AO_PQuirurgicos_Cirugia_Oido = ?, AO_PQuirurgicos_Cuales = ?, AO_PQuirurgicos_Otros = ?, "
						+ "AO_PQuirurgicos_Timpanoplastia = ?, AO_PToxicos_Farmacos = ?, AO_PToxicos_Industriales = ?, AO_PTraumaticos_Acustico = ?, "
						+ "AO_PTraumaticos_Craneo = ?, AO_PTraumaticos_Cuales = ?, AO_PTraumaticos_Otros = ?, AP_Catarata = ?, AP_Catarata_escribir = ?, "
						+ "AP_Esquirlas = ?, AP_Esquirlas_escribir = ?, AP_Farmacologicos_Alergicos = ?, AP_Farmacologicos_Alergicos_escribir = ?, "
						+ "AP_Galucoma = ?, AP_Galucoma_escribir = ?, AP_Otros = ?, AP_Otros_escribir = ?, AP_Patologicos = ?, AP_Patologicos_escribir = ?, "
						+ "AP_Quimicos = ?, AP_Quimicos_escribir = ?, AP_Quirurgicos = ?, AP_Quirurgicos_escribir = ?, AP_RehabilitacionVisual = ?, "
						+ "AP_RehabilitacionVisual_escribir = ?, AP_Transfusionales = ?, AP_Transfusionales_escribir = ?, AP_Traumaticos = ?, "
						+ "AP_Traumaticos_escribir = ?, AP_UsuariosRx = ?, AP_UsuariosRx_escribir = ?, OtrosOculares = ?, OtrosOcularesEscribir = ?, "
						+ " AG_Dias = ?, AG_FObstetrica_A = ?, AG_FObstetrica_C = ?, AG_FObstetrica_E = ?, AG_FObstetrica_G = ?, "
						+ "AG_FObstetrica_P = ?, AG_FObstetrica_V = ?, AG_Menarquia = ? where fk_IDT_DocumentoID = ?";

				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, antecedente.getAF_Patologia_Alergias());
				statement.setString(2, antecedente.getAF_Patologia_Alergias_Parentesco());
				statement.setString(3, antecedente.getAF_Patologia_Artitis());
				statement.setString(4, antecedente.getAF_Patologia_Artitis_Parentesco());
				statement.setString(5, antecedente.getAF_Patologia_Asma());
				statement.setString(6, antecedente.getAF_Patologia_Asma_Parentesco());
				statement.setString(7, antecedente.getAF_Patologia_Cancer());
				statement.setString(8, antecedente.getAF_Patologia_Cancer_Parentesco());
				statement.setString(9, antecedente.getAF_Patologia_cardiaco());
				statement.setString(10, antecedente.getAF_Patologia_Diabetes());
				statement.setString(11, antecedente.getAF_Patologia_Diabetes_Parentesco());
				statement.setString(12, antecedente.getAF_Patologia_Dislipidemia());
				statement.setString(13, antecedente.getAF_Patologia_Dislipidemia_Parentesco());
				statement.setString(14, antecedente.getAF_Patologia_EAP());
				statement.setString(15, antecedente.getAF_Patologia_EAP_Parentesco());
				statement.setString(16, antecedente.getAF_Patologia_ECV());
				statement.setString(17, antecedente.getAF_Patologia_ECV_Parentesco());
				statement.setString(18, antecedente.getAF_Patologia_EnfermedadColagenosis());
				statement.setString(19, antecedente.getAF_Patologia_EnfermedadColagenosis_Parentesco());
				statement.setString(20, antecedente.getAF_Patologia_EnfermedadCoronaria());
				statement.setString(21, antecedente.getAF_Patologia_EnfermedadCoronaria_Parentesco());
				statement.setString(22, antecedente.getAF_Patologia_EnfermedadRenal());
				statement.setString(23, antecedente.getAF_Patologia_EnfermedadRenal_Parentesco());
				statement.setString(24, antecedente.getAF_Patologia_EnfermedadTiroidea());
				statement.setString(25, antecedente.getAF_Patologia_EnfermedadTiroidea_Parentesco());
				statement.setString(26, antecedente.getAF_Patologia_hipertension());
				statement.setString(27, antecedente.getAF_Patologia_HTA());
				statement.setString(28, antecedente.getAF_Patologia_HTA_Parentesco());
				statement.setString(29, antecedente.getAF_Patologia_Otra());
				statement.setString(30, antecedente.getAF_Patologia_Otra_Cual());
				statement.setString(31, antecedente.getAF_Patologia_TBC());
				statement.setString(32, antecedente.getAF_Patologia_TBC_Parentesco());
				statement.setString(33, antecedente.getAF_Patologia_Varices());
				statement.setString(34, antecedente.getAF_Patologia_Varices_Parentesco());
				statement.setString(35, antecedente.getAG_Ciclos());
				statement.setString(36, antecedente.getAG_MetodoPlanificacion());
				statement.setString(37, antecedente.getAG_UltimaCitologia_Resultado());
				statement.setString(38, antecedente.getAI_CarnetVacunacion());
				statement.setString(39, antecedente.getAI_FiebreAmarilla());
				statement.setString(40, antecedente.getAI_Hepatitis_A());
				statement.setString(41, antecedente.getAI_Hepatitis_B());
				statement.setString(42, antecedente.getAI_Influenza());
				statement.setString(43, antecedente.getAI_Otros());
				statement.setString(44, antecedente.getAI_Tetano());
				statement.setString(45, antecedente.getAI_TripleViral());
				statement.setString(46, antecedente.getAI_Varicela());
				statement.setString(47, antecedente.getAO_FOtologicos());
				statement.setString(48, antecedente.getAO_OActual());
				statement.setString(49, antecedente.getAO_OActual_T());
				statement.setString(50, antecedente.getAO_OAnterior());
				statement.setString(51, antecedente.getAO_OAnterior_T());
				statement.setString(52, antecedente.getAO_OJornadaLaboral());
				statement.setString(53, antecedente.getAO_OLabores());
				statement.setString(54, antecedente.getAO_OLabores_Horario());
				statement.setString(55, antecedente.getAO_OProteccion());
				statement.setString(56, antecedente.getAO_OProteccion_Tipo());
				statement.setString(57, antecedente.getAO_OProteccion_Tipo_Tiempo());
				statement.setString(58, antecedente.getAO_OTiempoExposicionRuido());
				statement.setString(59, antecedente.getAO_PExtraLaboral_Audifonos());
				statement.setString(60, antecedente.getAO_PExtraLaboral_Cuales());
				statement.setString(61, antecedente.getAO_PExtraLaboral_Moto());
				statement.setString(62, antecedente.getAO_PExtraLaboral_MusicaAlta());
				statement.setString(63, antecedente.getAO_PExtraLaboral_Otros());
				statement.setString(64, antecedente.getAO_PExtraLaboral_ServicioMilitar());
				statement.setString(65, antecedente.getAO_PExtraLaboral_Tejo());
				statement.setString(66, antecedente.getAO_POtologicos_Cual());
				statement.setString(67, antecedente.getAO_POtologicos_Otalgia());
				statement.setString(68, antecedente.getAO_POtologicos_Otitis());
				statement.setString(69, antecedente.getAO_POtologicos_Otorrea());
				statement.setString(70, antecedente.getAO_POtologicos_Otros());
				statement.setString(71, antecedente.getAO_POtologicos_Prurito());
				statement.setString(72, antecedente.getAO_POtologicos_Sensacion());
				statement.setString(73, antecedente.getAO_POtologicos_Tinitus());
				statement.setString(74, antecedente.getAO_POtologicos_Vertigo());
				statement.setString(75, antecedente.getAO_PPatologicos_Cuales());
				statement.setString(76, antecedente.getAO_PPatologicos_Diabetes());
				statement.setString(77, antecedente.getAO_PPatologicos_Hipertension());
				statement.setString(78, antecedente.getAO_PPatologicos_Otros());
				statement.setString(79, antecedente.getAO_PPatologicos_Parotiditis());
				statement.setString(80, antecedente.getAO_PPatologicos_Rinitis_Sinusitis());
				statement.setString(81, antecedente.getAO_PPatologicos_Rubeola());
				statement.setString(82, antecedente.getAO_PPatologicos_Sarampion());
				statement.setString(83, antecedente.getAO_PQuirurgicos_Cirugia_Oido());
				statement.setString(84, antecedente.getAO_PQuirurgicos_Cuales());
				statement.setString(85, antecedente.getAO_PQuirurgicos_Otros());
				statement.setString(86, antecedente.getAO_PQuirurgicos_Timpanoplastia());
				statement.setString(87, antecedente.getAO_PToxicos_Farmacos());
				statement.setString(88, antecedente.getAO_PToxicos_Industriales());
				statement.setString(89, antecedente.getAO_PTraumaticos_Acustico());
				statement.setString(90, antecedente.getAO_PTraumaticos_Craneo());
				statement.setString(91, antecedente.getAO_PTraumaticos_Cuales());
				statement.setString(92, antecedente.getAO_PTraumaticos_Otros());
				statement.setString(93, antecedente.getAP_Catarata());
				statement.setString(94, antecedente.getAP_Catarata_escribir());
				statement.setString(95, antecedente.getAP_Esquirlas());
				statement.setString(96, antecedente.getAP_Esquirlas_escribir());
				statement.setString(97, antecedente.getAP_Farmacologicos_Alergicos());
				statement.setString(98, antecedente.getAP_Farmacologicos_Alergicos_escribir());
				statement.setString(99, antecedente.getAP_Galucoma());
				statement.setString(100, antecedente.getAP_Galucoma_escribir());
				statement.setString(101, antecedente.getAP_Otros());
				statement.setString(102, antecedente.getAP_Otros_escribir());
				statement.setString(103, antecedente.getAP_Patologicos());
				statement.setString(104, antecedente.getAP_Patologicos_escribir());
				statement.setString(105, antecedente.getAP_Quimicos());
				statement.setString(106, antecedente.getAP_Quimicos_escribir());
				statement.setString(107, antecedente.getAP_Quirurgicos());
				statement.setString(108, antecedente.getAP_Quirurgicos_escribir());
				statement.setString(109, antecedente.getAP_RehabilitacionVisual());
				statement.setString(110, antecedente.getAP_RehabilitacionVisual_escribir());
				statement.setString(111, antecedente.getAP_Transfusionales());
				statement.setString(112, antecedente.getAP_Transfusionales_escribir());
				statement.setString(113, antecedente.getAP_Traumaticos());
				statement.setString(114, antecedente.getAP_Traumaticos_escribir());
				statement.setString(115, antecedente.getAP_UsuariosRx());
				statement.setString(116, antecedente.getAP_UsuariosRx_escribir());
				statement.setString(117, antecedente.getOtrosOculares());
				statement.setString(118, antecedente.getOtrosOcularesEscribir());
				statement.setInt(119, antecedente.getAG_Dias());
				statement.setInt(120, antecedente.getAG_FObstetrica_A());
				statement.setInt(121, antecedente.getAG_FObstetrica_C());
				statement.setInt(122, antecedente.getAG_FObstetrica_E());
				statement.setInt(123, antecedente.getAG_FObstetrica_G());
				statement.setInt(124, antecedente.getAG_FObstetrica_P());
				statement.setInt(125, antecedente.getAG_FObstetrica_V());
				statement.setInt(126, antecedente.getAG_Menarquia());
				statement.setInt(127, antecedente.getfk_IDT_DocumentoID());

				if (!statement.execute()) {
					System.out.println();
					System.out.println("updated!!");
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
