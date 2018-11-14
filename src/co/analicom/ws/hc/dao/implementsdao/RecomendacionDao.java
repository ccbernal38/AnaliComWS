/**
 * 
 */
package co.analicom.ws.hc.dao.implementsdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import co.analicom.ws.database.Conexion;
import co.analicom.ws.hc.dao.interfacedao.RecomendacioDaoInterface;
import co.analicom.ws.hc.modelo.Recomendacion;

/**
 * @author Cristian Cruz
 */
public class RecomendacionDao implements RecomendacioDaoInterface {
	
	Conexion conexion;
	
	public RecomendacionDao() {
		conexion = new Conexion();
	}
	
	@Override
	public void insertRecomendacion(Recomendacion recomendacion) {
		
		try {
			Connection connection = conexion.getConexionHC();
			if (connection != null) {
				String consulta = "INSERT INTO Recomendacion (HabitosEVS, HabitosEVS_ConducirVentanaCerrada, HabitosEVS_ControlNutricionalPeso,"
						+ "HabitosEVS_DejarDeFumar, HabitosEVS_InicioActividadFisica,abitosEVS_ReducirConsumoAlcohol, IngresoPVE, IngresoSVE,"
						+ "IngresoSVE_Biologico, IngresoSVE_CardiovascularMetabolico, IngresoSVE_Ergonomico,IngresoSVE_Psicolaboral,"
						+ "IngresoSVE_Ruido, IngresoSVE_Visual, Medicas, Medicas_AudiometriaConfirmatoria,Medicas_CitologiaCervicoVaginal, "
						+ "Medicas_ContinuarManejoMedico, Medicas_ControlAnualOptometrico,Medicas_ControlAudilogicoAnual, "
						+ "Medicas_ControlAudilogicoPeriodico, Medicas_ControlAudilogicoSemestral,Medicas_ControlOdontologicoPeriodico, "
						+ "Medicas_EsquemaVacunacionAdulto, Medicas_ExamenesComplementarios,Medicas_Otros, Medicas_RemisionaEPS, "
						+ "Medicas_RemisionARP, Medicas_RemisionEPS, Medicas_SeguimientoCasoxARP,Medicas_TamizajeProstatico, "
						+ "Medicas_Valoracion_ControlORL, Ocupacionales,Ocupacionales_DistribucionFuerzasCargas, Ocupacionales_EPPAuditivo, "
						+ "Ocupacionales_HigienePostural,Ocupacionales_PausasActivas45min, Ocupacionales_ReposoAuditivoExtralaboral,"
						+ "Ocupacionales_RotaDiademaTelefonica, Ocupacionales_UsoDeEPP, ProductosPracticos, PruebasComplementarias,"
						+ "RecomendacionesAdicionales, Restricciones, _fk_DocumentoMD, _fk_IDT_DocumentoID, FechaDeDiligenciamiento, FechaDeModificacion"
						+ ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				PreparedStatement statement = connection.prepareStatement(consulta);
				statement.setString(1, recomendacion.getHabitosEVS());
				statement.setString(2, recomendacion.getHabitosEVS_ConducirVentanaCerrada());
				statement.setString(3, recomendacion.getHabitosEVS_ControlNutricionalPeso());
				statement.setString(4, recomendacion.getHabitosEVS_DejarDeFumar());
				statement.setString(5, recomendacion.getHabitosEVS_InicioActividadFisica());
				statement.setString(6, recomendacion.getHabitosEVS_ReducirConsumoAlcohol());
				statement.setString(7, recomendacion.getIngresoPVE());
				statement.setString(8, recomendacion.getIngresoSVE());
				statement.setString(9, recomendacion.getIngresoSVE_Biologico());
				statement.setString(10, recomendacion.getIngresoSVE_CardiovascularMetabolico());
				statement.setString(11, recomendacion.getIngresoSVE_Ergonomico());
				statement.setString(12, recomendacion.getIngresoSVE_Psicolaboral());
				statement.setString(13, recomendacion.getIngresoSVE_Ruido());
				statement.setString(14, recomendacion.getIngresoSVE_Visual());
				statement.setString(15, recomendacion.getMedicas());
				statement.setString(16, recomendacion.getMedicas_AudiometriaConfirmatoria());
				statement.setString(17, recomendacion.getMedicas_CitologiaCervicoVaginal());
				statement.setString(18, recomendacion.getMedicas_ContinuarManejoMedico());
				statement.setString(19, recomendacion.getMedicas_ControlAnualOptometrico());
				statement.setString(20, recomendacion.getMedicas_ControlAudilogicoAnual());
				statement.setString(21, recomendacion.getMedicas_ControlAudilogicoPeriodico());
				statement.setString(22, recomendacion.getMedicas_ControlAudilogicoSemestral());
				statement.setString(23, recomendacion.getMedicas_ControlOdontologicoPeriodico());
				statement.setString(24, recomendacion.getMedicas_EsquemaVacunacionAdulto());
				statement.setString(25, recomendacion.getMedicas_ExamenesComplementarios());
				statement.setString(26, recomendacion.getMedicas_Otros());
				statement.setString(27, recomendacion.getMedicas_RemisionaEPS());
				statement.setString(28, recomendacion.getMedicas_RemisionARP());
				statement.setString(29, recomendacion.getMedicas_RemisionEPS());
				statement.setString(30, recomendacion.getMedicas_SeguimientoCasoxARP());
				statement.setString(31, recomendacion.getMedicas_TamizajeProstatico());
				statement.setString(32, recomendacion.getMedicas_Valoracion_ControlORL());
				statement.setString(33, recomendacion.getOcupacionales());
				statement.setString(34, recomendacion.getOcupacionales_DistribucionFuerzasCargas());
				statement.setString(35, recomendacion.getOcupacionales_EPPAuditivo());
				statement.setString(36, recomendacion.getOcupacionales_HigienePostural());
				statement.setString(37, recomendacion.getOcupacionales_PausasActivas45min());
				statement.setString(38, recomendacion.getOcupacionales_ReposoAuditivoExtralaboral());
				statement.setString(39, recomendacion.getOcupacionales_RotaDiademaTelefonica());
				statement.setString(40, recomendacion.getOcupacionales_UsoDeEPP());
				statement.setString(41, recomendacion.getProductosPracticos());
				statement.setString(42, recomendacion.getPruebasComplementarias());
				statement.setString(43, recomendacion.getRecomendacionesAdicionales());
				statement.setString(44, recomendacion.getRestricciones());
				statement.setInt(45, recomendacion.get_fk_DocumentoMD());
				statement.setInt(46, recomendacion.get_fk_IDT_DocumentoID());
				statement.setTimestamp(47, new Timestamp(recomendacion.getFechaDeDiligenciamiento().getTime()));
				statement.setTimestamp(48, new Timestamp(recomendacion.getFechaDeModificacion().getTime()));

				if(!statement.execute()) {
					System.out.println("Insertado!!");
				}	
				conexion.cerrarConexion();
			}
		} catch (Exception e) {
			System.err.println("Error en la inserción " + e.getLocalizedMessage());
			e.printStackTrace();
		}
		
	}

}
