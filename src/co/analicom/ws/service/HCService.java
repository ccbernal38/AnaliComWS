package co.analicom.ws.service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import co.analicom.ws.hc.dao.implementsdao.AntecedenteDao;
import co.analicom.ws.hc.dao.implementsdao.HistoriaClinicaDao;
import co.analicom.ws.hc.dao.implementsdao.PacienteDao;
import co.analicom.ws.hc.dao.implementsdao.RecomendacionDao;
import co.analicom.ws.hc.modelo.Antecedente;
import co.analicom.ws.hc.modelo.HistoriaClinica;
import co.analicom.ws.hc.modelo.Paciente;
import co.analicom.ws.hc.modelo.Recomendacion;
import co.analicom.ws.util.Util;

@Path("/hc")
public class HCService {

	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response insertPaciente(String json) throws Exception {
		JSONObject jsonPaciente = new JSONObject(json);
		String documento = jsonPaciente.getString("documento");
		String tipodocumento = jsonPaciente.getString("tipodocumento");
		String iDT_Nombres = jsonPaciente.getString("iDT_Nombres");
		String iDT_Apellidos = jsonPaciente.getString("iDT_Apellidos");
		String iDT_sexo = jsonPaciente.getString("iDT_sexo");
		String iDT_fechaNacimiento = jsonPaciente.getString("iDT_fechaNacimiento");
		String iDT_LugarNacimiento = jsonPaciente.getString("iDT_LugarNacimiento");
		String iDT_DireccionDomicilio = jsonPaciente.getString("iDT_DireccionDomicilio");
		String iDT_DomicilioCiudad = jsonPaciente.getString("iDT_DomicilioCiudad");
		String iDT_CorreoElectronico = jsonPaciente.getString("iDT_CorreoElectronico");
		String iDT_Escolaridad = jsonPaciente.getString("iDT_Escolaridad");
		String iDT_EPS = jsonPaciente.getString("iDT_EPS");
		String iDT_ARL = jsonPaciente.getString("iDT_ARL");
		String iDT_AFP = jsonPaciente.getString("iDT_AFP");
		String iDT_AvisoEmergenciaNombres = jsonPaciente.getString("iDT_AvisoEmergenciaNombres");
		String iDT_AvisoEmergenciaApellidos = jsonPaciente.getString("iDT_AvisoEmergenciaApellidos");
		String iDT_AvisoEmergenciaParentesco = jsonPaciente.getString("iDT_AvisoEmergenciaParentesco");
		String grupoSanguineo = jsonPaciente.getString("grupoSanguineo");
		String rH = jsonPaciente.getString("rH");
		String cargo = jsonPaciente.getString("cargo");
		String antiguedad = jsonPaciente.getString("antiguedad");
		String iDT_telefonoDomicilio = jsonPaciente.getString("iDT_telefonoDomicilio");
		String iDT_TelefonoCelular = jsonPaciente.getString("iDT_TelefonoCelular");
		String iDT_AvisoEmergenciaTelefono = jsonPaciente.getString("iDT_AvisoEmergenciaTelefono");
		String iDT_AvisoEmergenciaTelefonoCelular = jsonPaciente.getString("iDT_AvisoEmergenciaTelefonoCelular");
		String foto = jsonPaciente.getString("foto");
		String firma = jsonPaciente.getString("firma");
		String fechaDeDiligenciamiento = jsonPaciente.getString("fechaDeDiligenciamiento").replace(".", "");
		String fechaDeModificacion = jsonPaciente.getString("fechaDeModificacion").replace(".", "");
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(fechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(fechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(fechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(fechaDeModificacion);
		}
		 

		Paciente paciente = new Paciente(documento, tipodocumento, iDT_Nombres, iDT_Apellidos, iDT_sexo,
				iDT_fechaNacimiento, iDT_LugarNacimiento, iDT_DireccionDomicilio, iDT_DomicilioCiudad,
				iDT_CorreoElectronico, iDT_Escolaridad, iDT_EPS, iDT_ARL, iDT_AFP, iDT_AvisoEmergenciaNombres,
				iDT_AvisoEmergenciaApellidos, iDT_AvisoEmergenciaParentesco, grupoSanguineo, rH, cargo, antiguedad,
				(iDT_telefonoDomicilio), (iDT_TelefonoCelular), (iDT_AvisoEmergenciaTelefono),
				(iDT_AvisoEmergenciaTelefonoCelular), Util.convertirABytes(foto), Util.convertirABytes(firma),
				dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		PacienteDao dao = new PacienteDao();
		boolean result = dao.insertPaciente(paciente);
		JSONObject jsonObject = new JSONObject();
		if(result) {
			jsonObject.put("code", 1);
		}else {
			jsonObject.put("code", 0);
		}
		return Response.status(200).entity("" + jsonObject).build();
	}
	
	@POST
	@Path("/historiaclinica")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response insertHC(String json) throws Exception {

		
		JSONObject jsonHC = new JSONObject(json);
		String accidenteTrabajo = jsonHC.getString("accidenteTrabajo");
		String anular = jsonHC.getString("anular");
		String enfermedadProfesional = jsonHC.getString("enfermedadProfesional");
		String estado = jsonHC.getString("estado");
		String fk_DocumentoMD = jsonHC.getString("fk_DocumentoMD");
		String fk_IDT_DocumentoID = jsonHC.getString("fk_IDT_DocumentoID");
		String impreso = jsonHC.getString("impreso");
		String lugar = jsonHC.getString("lugar");
		String medico_cierre = jsonHC.getString("medico_cierre");
		String quienModifico = jsonHC.getString("quienModifico");
		String revisionPorSistema = jsonHC.getString("revisionPorSistema");
		String tipoDeExamen = jsonHC.getString("tipoDeExamen");
		String tipoDeExamenExtra = jsonHC.getString("tipoDeExamenExtra");
		String userCierre = jsonHC.getString("userCierre");
		String userModifico = jsonHC.getString("userModifico");
		String firmaMedico = jsonHC.getString("firmaMedico");
		String firmaPaciente = jsonHC.getString("firmaPaciente");
		String cantImpresiones = jsonHC.getString("cantImpresiones");
		String id_empresa = jsonHC.getString("id_empresa");
		String fechaDeDiligenciamiento = jsonHC.getString("fechaDeDiligenciamiento");
		String fechaCDeDiligenciamiento = jsonHC.getString("fechaCDeDiligenciamiento").replace(".", "");
		String fechaDeModificacion = jsonHC.getString("fechaDeModificacion").replace(".", "");
		JSONObject jsonRecomendacion = jsonHC.getJSONObject("recomendacion");
		JSONObject jsonAntecedentes = jsonHC.getJSONObject("antecedente");
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(fechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(fechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(fechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(fechaDeModificacion);
		}
		java.util.Date dateFechaCDeDiligenciamiento = null;
		try {
			dateFechaCDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(fechaCDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaCDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(fechaCDeDiligenciamiento);
		}
		
		HistoriaClinica historiaClinica = new HistoriaClinica(accidenteTrabajo, anular, enfermedadProfesional, estado, fk_DocumentoMD, 
				fk_IDT_DocumentoID, impreso, lugar, medico_cierre, quienModifico, revisionPorSistema, tipoDeExamen, tipoDeExamenExtra, 
				userCierre, userModifico, firmaMedico, firmaPaciente, Integer.parseInt(cantImpresiones), Integer.parseInt(id_empresa), 
				dateFechaDeDiligenciamiento, dateFechaCDeDiligenciamiento, dateFechaDeModificacion);
		HistoriaClinicaDao historiaClinicaDao = new HistoriaClinicaDao();
		boolean result = historiaClinicaDao.insertHistoriaClinica(historiaClinica);
		int IDHC = historiaClinicaDao.obtenerID(fk_IDT_DocumentoID);
		boolean recomendacion = generarJsonRecomendacion(jsonRecomendacion, IDHC);
		JSONObject jsonObject = new JSONObject();
		if(result) {
			jsonObject.put("Historia Clinica", 1);
		}else {
			jsonObject.put("Historia Clinica", 0);
		}
		if(recomendacion) {
			jsonObject.put("Recomendaciones", 1);
		}else {
			jsonObject.put("Recomendaciones", 0);
		}
		return Response.status(200).entity("" + jsonObject).build();
	}
	
	/**
	 * 
	 * @param jsonRecomendacion
	 * @return
	 * @throws ParseException 
	 */
	public boolean generarJsonRecomendacion(JSONObject jsonRecomendacion, int IDHC) throws ParseException {
		
		String 	HabitosEVS = jsonRecomendacion.getString("HabitosEVS");
		String  HabitosEVS_ConducirVentanaCerrada = jsonRecomendacion.getString("HabitosEVS_ConducirVentanaCerrada");
		String  HabitosEVS_ControlNutricionalPeso = jsonRecomendacion.getString("HabitosEVS_ControlNutricionalPeso");
		String  HabitosEVS_DejarDeFumar = jsonRecomendacion.getString("HabitosEVS_DejarDeFumar");
		String  HabitosEVS_InicioActividadFisica = jsonRecomendacion.getString("HabitosEVS_InicioActividadFisica");
		String  HabitosEVS_ReducirConsumoAlcohol = jsonRecomendacion.getString("HabitosEVS_ReducirConsumoAlcohol");
		String  IngresoPVE = jsonRecomendacion.getString("IngresoPVE");
		String  IngresoSVE = jsonRecomendacion.getString("IngresoSVE");
		String  IngresoSVE_Biologico = jsonRecomendacion.getString("IngresoSVE_Biologico");
		String  IngresoSVE_CardiovascularMetabolico = jsonRecomendacion.getString("IngresoSVE_CardiovascularMetabolico");
		String  IngresoSVE_Ergonomico = jsonRecomendacion.getString("IngresoSVE_Ergonomico");
		String  IngresoSVE_Psicolaboral = jsonRecomendacion.getString("IngresoSVE_Psicolaboral");
		String  IngresoSVE_Ruido = jsonRecomendacion.getString("IngresoSVE_Ruido");
		String  IngresoSVE_Visual = jsonRecomendacion.getString("IngresoSVE_Visual");
		String  Medicas = jsonRecomendacion.getString("Medicas");
		String  Medicas_AudiometriaConfirmatoria = jsonRecomendacion.getString("Medicas_AudiometriaConfirmatoria");
		String  Medicas_CitologiaCervicoVaginal = jsonRecomendacion.getString("Medicas_CitologiaCervicoVaginal");
		String  Medicas_ContinuarManejoMedico = jsonRecomendacion.getString("Medicas_ContinuarManejoMedico");
		String  Medicas_ControlAnualOptometrico = jsonRecomendacion.getString("Medicas_ControlAnualOptometrico");
		String  Medicas_ControlAudilogicoAnual = jsonRecomendacion.getString("Medicas_ControlAudilogicoAnual");
		String  Medicas_ControlAudilogicoPeriodico = jsonRecomendacion.getString("Medicas_ControlAudilogicoPeriodico");
		String  Medicas_ControlAudilogicoSemestral = jsonRecomendacion.getString("Medicas_ControlAudilogicoSemestral");
		String  Medicas_ControlOdontologicoPeriodico = jsonRecomendacion.getString("Medicas_ControlOdontologicoPeriodico");
		String  Medicas_EsquemaVacunacionAdulto = jsonRecomendacion.getString("Medicas_EsquemaVacunacionAdulto");
		String  Medicas_ExamenesComplementarios = jsonRecomendacion.getString("Medicas_ExamenesComplementarios");
		String  Medicas_Otros = jsonRecomendacion.getString("Medicas_Otros");
		String  Medicas_RemisionaEPS = jsonRecomendacion.getString("Medicas_RemisionaEPS");
		String  Medicas_RemisionARP = jsonRecomendacion.getString("Medicas_RemisionARP");
		String  Medicas_RemisionEPS = jsonRecomendacion.getString("Medicas_RemisionEPS");
		String  Medicas_SeguimientoCasoxARP = jsonRecomendacion.getString("Medicas_SeguimientoCasoxARP");
		String  Medicas_TamizajeProstatico = jsonRecomendacion.getString("Medicas_TamizajeProstatico");
		String  Medicas_Valoracion_ControlORL = jsonRecomendacion.getString("Medicas_Valoracion_ControlORL");
		String  Ocupacionales = jsonRecomendacion.getString("Ocupacionales");
		String  Ocupacionales_DistribucionFuerzasCargas = jsonRecomendacion.getString("Ocupacionales_DistribucionFuerzasCargas");
		String  Ocupacionales_EPPAuditivo = jsonRecomendacion.getString("Ocupacionales_EPPAuditivo");
		String  Ocupacionales_HigienePostural = jsonRecomendacion.getString("Ocupacionales_HigienePostural");
		String  Ocupacionales_PausasActivas45min = jsonRecomendacion.getString("Ocupacionales_PausasActivas45min");
		String  Ocupacionales_ReposoAuditivoExtralaboral = jsonRecomendacion.getString("Ocupacionales_ReposoAuditivoExtralaboral");
		String  Ocupacionales_RotaDiademaTelefonica = jsonRecomendacion.getString("Ocupacionales_RotaDiademaTelefonica");
		String  Ocupacionales_UsoDeEPP = jsonRecomendacion.getString("Ocupacionales_UsoDeEPP");
		String  ProductosPracticos = jsonRecomendacion.getString("ProductosPracticos");
		String  PruebasComplementarias = jsonRecomendacion.getString("PruebasComplementarias");
		String  RecomendacionesAdicionales = jsonRecomendacion.getString("RecomendacionesAdicionales");
		String  Restricciones = jsonRecomendacion.getString("Restricciones");
		String  _fk_DocumentoMD = jsonRecomendacion.getString("_fk_DocumentoMD");
		String  _fk_IDT_DocumentoID = jsonRecomendacion.getString("_fk_IDT_DocumentoID");
		String  FechaDeDiligenciamiento = jsonRecomendacion.getString("FechaDeDiligenciamiento");
		String  FechaDeModificacion = jsonRecomendacion.getString("FechaDeModificacion");
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion = null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeModificacion);
		}
		
		Recomendacion recomendacion = new Recomendacion(HabitosEVS, HabitosEVS_ConducirVentanaCerrada, HabitosEVS_ControlNutricionalPeso, 
				HabitosEVS_DejarDeFumar, HabitosEVS_InicioActividadFisica, HabitosEVS_ReducirConsumoAlcohol, IngresoPVE, IngresoSVE, 
				IngresoSVE_Biologico, IngresoSVE_CardiovascularMetabolico, IngresoSVE_Ergonomico, IngresoSVE_Psicolaboral, IngresoSVE_Ruido, 
				IngresoSVE_Visual, Medicas, Medicas_AudiometriaConfirmatoria, Medicas_CitologiaCervicoVaginal, Medicas_ContinuarManejoMedico, 
				Medicas_ControlAnualOptometrico, Medicas_ControlAudilogicoAnual, Medicas_ControlAudilogicoPeriodico, Medicas_ControlAudilogicoSemestral, 
				Medicas_ControlOdontologicoPeriodico, Medicas_EsquemaVacunacionAdulto, Medicas_ExamenesComplementarios, Medicas_Otros, 
				Medicas_RemisionaEPS, Medicas_RemisionARP, Medicas_RemisionEPS, Medicas_SeguimientoCasoxARP, Medicas_TamizajeProstatico, 
				Medicas_Valoracion_ControlORL, Ocupacionales, Ocupacionales_DistribucionFuerzasCargas, Ocupacionales_EPPAuditivo, Ocupacionales_HigienePostural, 
				Ocupacionales_PausasActivas45min, Ocupacionales_ReposoAuditivoExtralaboral, Ocupacionales_RotaDiademaTelefonica, Ocupacionales_UsoDeEPP, 
				ProductosPracticos, PruebasComplementarias, RecomendacionesAdicionales, Restricciones, Integer.parseInt(_fk_DocumentoMD), 
				Integer.parseInt(_fk_IDT_DocumentoID), dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		RecomendacionDao dao = new RecomendacionDao();
		boolean result = dao.insertRecomendacion(recomendacion);
		return result;
	}
	
	public boolean generarJsonAntecedentes(JSONObject jsonAntecedentes, int IDHC) throws ParseException {
		
		String AF_Patologia_Alergias = jsonAntecedentes.getString("AF_Patologia_Alergias");
		String AF_Patologia_Alergias_Parentesco = jsonAntecedentes.getString("AF_Patologia_Alergias_Parentesco");
		String AF_Patologia_Artitis = jsonAntecedentes.getString("AF_Patologia_Artitis");
		String AF_Patologia_Artitis_Parentesco = jsonAntecedentes.getString("AF_Patologia_Artitis_Parentesco");
		String AF_Patologia_Asma = jsonAntecedentes.getString("AF_Patologia_Asma");
		String AF_Patologia_Asma_Parentesco = jsonAntecedentes.getString("AF_Patologia_Asma_Parentesco");
		String AF_Patologia_Cancer = jsonAntecedentes.getString("AF_Patologia_Cancer");
		String AF_Patologia_Cancer_Parentesco = jsonAntecedentes.getString("AF_Patologia_Cancer_Parentesco");
		String AF_Patologia_cardiaco = jsonAntecedentes.getString("AF_Patologia_cardiaco");
		String AF_Patologia_Diabetes = jsonAntecedentes.getString("AF_Patologia_Diabetes");
		String AF_Patologia_Diabetes_Parentesco = jsonAntecedentes.getString("AF_Patologia_Diabetes_Parentesco");
		String AF_Patologia_Dislipidemia = jsonAntecedentes.getString("AF_Patologia_Dislipidemia");
		String AF_Patologia_Dislipidemia_Parentesco = jsonAntecedentes.getString("AF_Patologia_Dislipidemia_Parentesco");
		String AF_Patologia_EAP = jsonAntecedentes.getString("AF_Patologia_EAP");
		String AF_Patologia_EAP_Parentesco = jsonAntecedentes.getString("AF_Patologia_EAP_Parentesco");
		String AF_Patologia_ECV = jsonAntecedentes.getString("AF_Patologia_ECV");
		String AF_Patologia_ECV_Parentesco = jsonAntecedentes.getString("AF_Patologia_ECV_Parentesco");
		String AF_Patologia_EnfermedadColagenosis = jsonAntecedentes.getString("AF_Patologia_EnfermedadColagenosis");
		String AF_Patologia_EnfermedadColagenosis_Parentesco = jsonAntecedentes.getString("AF_Patologia_EnfermedadColagenosis_Parentesco");
		String AF_Patologia_EnfermedadCoronaria = jsonAntecedentes.getString("AF_Patologia_EnfermedadCoronaria");
		String AF_Patologia_EnfermedadCoronaria_Parentesco = jsonAntecedentes.getString("AF_Patologia_EnfermedadCoronaria_Parentesco");
		String AF_Patologia_EnfermedadRenal = jsonAntecedentes.getString("AF_Patologia_EnfermedadRenal");
		String AF_Patologia_EnfermedadRenal_Parentesco = jsonAntecedentes.getString("AF_Patologia_EnfermedadRenal_Parentesco");
		String AF_Patologia_EnfermedadTiroidea = jsonAntecedentes.getString("AF_Patologia_EnfermedadTiroidea");
		String AF_Patologia_EnfermedadTiroidea_Parentesco = jsonAntecedentes.getString("AF_Patologia_EnfermedadTiroidea_Parentesco");
		String AF_Patologia_hipertension = jsonAntecedentes.getString("AF_Patologia_hipertension");
		String AF_Patologia_HTA = jsonAntecedentes.getString("AF_Patologia_HTA");
		String AF_Patologia_HTA_Parentesco = jsonAntecedentes.getString("AF_Patologia_HTA_Parentesco");
		String AF_Patologia_Otra = jsonAntecedentes.getString("AF_Patologia_Otra");
		String AF_Patologia_Otra_Cual = jsonAntecedentes.getString("AF_Patologia_Otra_Cual");
		String AF_Patologia_TBC = jsonAntecedentes.getString("AF_Patologia_TBC");
		String AF_Patologia_TBC_Parentesco = jsonAntecedentes.getString("AF_Patologia_TBC_Parentesco");
		String AF_Patologia_Varices = jsonAntecedentes.getString("AF_Patologia_Varices");
		String AF_Patologia_Varices_Parentesco = jsonAntecedentes.getString("AF_Patologia_Varices_Parentesco");
		String AG_Ciclos = jsonAntecedentes.getString("AG_Ciclos");
		String AG_MetodoPlanificacion = jsonAntecedentes.getString("AG_MetodoPlanificacion");
		String AG_UltimaCitologia_Resultado = jsonAntecedentes.getString("AG_UltimaCitologia_Resultado");
		String AI_CarnetVacunacion = jsonAntecedentes.getString("AI_CarnetVacunacion");
		String AI_FiebreAmarilla = jsonAntecedentes.getString("AI_FiebreAmarilla");
		String AI_Hepatitis_A = jsonAntecedentes.getString("AI_Hepatitis_A");
		String AI_Hepatitis_B = jsonAntecedentes.getString("AI_Hepatitis_B");
		String AI_Influenza = jsonAntecedentes.getString("AI_Influenza");
		String AI_Otros = jsonAntecedentes.getString("AI_Otros");
		String AI_Tetano = jsonAntecedentes.getString("AI_Tetano");
		String AI_TripleViral = jsonAntecedentes.getString("AI_TripleViral");
		String AI_Varicela = jsonAntecedentes.getString("AI_Varicela");
		String AO_FOtologicos = jsonAntecedentes.getString("AO_FOtologicos");
		String AO_OActual = jsonAntecedentes.getString("AO_OActual");
		String AO_OActual_T = jsonAntecedentes.getString("AO_OActual_T");
		String AO_OAnterior = jsonAntecedentes.getString("AO_OAnterior");
		String AO_OAnterior_T = jsonAntecedentes.getString("AO_OAnterior_T");
		String AO_OJornadaLaboral = jsonAntecedentes.getString("AO_OJornadaLaboral");
		String AO_OLabores = jsonAntecedentes.getString("AO_OLabores");
		String AO_OLabores_Horario = jsonAntecedentes.getString("AO_OLabores_Horario");
		String AO_OProteccion = jsonAntecedentes.getString("AO_OProteccion");
		String AO_OProteccion_Tipo = jsonAntecedentes.getString("AO_OProteccion_Tipo");
		String AO_OProteccion_Tipo_Tiempo = jsonAntecedentes.getString("AO_OProteccion_Tipo_Tiempo");
		String AO_OTiempoExposicionRuido = jsonAntecedentes.getString("AO_OTiempoExposicionRuido");
		String AO_PExtraLaboral_Audifonos = jsonAntecedentes.getString("AO_PExtraLaboral_Audifonos");
		String AO_PExtraLaboral_Cuales = jsonAntecedentes.getString("AO_PExtraLaboral_Cuales");
		String AO_PExtraLaboral_Moto = jsonAntecedentes.getString("AO_PExtraLaboral_Moto");
		String AO_PExtraLaboral_MusicaAlta = jsonAntecedentes.getString("AO_PExtraLaboral_MusicaAlta");
		String AO_PExtraLaboral_Otros = jsonAntecedentes.getString("AO_PExtraLaboral_Otros");
		String AO_PExtraLaboral_ServicioMilitar = jsonAntecedentes.getString("AO_PExtraLaboral_ServicioMilitar");
		String AO_PExtraLaboral_Tejo = jsonAntecedentes.getString("AO_PExtraLaboral_Tejo");
		String AO_POtologicos_Cual = jsonAntecedentes.getString("AO_POtologicos_Cual");
		String AO_POtologicos_Otalgia = jsonAntecedentes.getString("AO_POtologicos_Otalgia");
		String AO_POtologicos_Otitis = jsonAntecedentes.getString("AO_POtologicos_Otitis");
		String AO_POtologicos_Otorrea = jsonAntecedentes.getString("AO_POtologicos_Otorrea");
		String AO_POtologicos_Otros = jsonAntecedentes.getString("AO_POtologicos_Otros");
		String AO_POtologicos_Prurito = jsonAntecedentes.getString("AO_POtologicos_Prurito");
		String AO_POtologicos_Sensacion = jsonAntecedentes.getString("AO_POtologicos_Sensacion");
		String AO_POtologicos_Tinitus = jsonAntecedentes.getString("AO_POtologicos_Tinitus");
		String AO_POtologicos_Vertigo = jsonAntecedentes.getString("AO_POtologicos_Vertigo");
		String AO_PPatologicos_Cuales = jsonAntecedentes.getString("AO_PPatologicos_Cuales");
		String AO_PPatologicos_Diabetes = jsonAntecedentes.getString("AO_PPatologicos_Diabetes");
		String AO_PPatologicos_Hipertension = jsonAntecedentes.getString("AO_PPatologicos_Hipertension");
		String AO_PPatologicos_Otros = jsonAntecedentes.getString("AO_PPatologicos_Otros");
		String AO_PPatologicos_Parotiditis = jsonAntecedentes.getString("AO_PPatologicos_Parotiditis");
		String AO_PPatologicos_Rinitis_Sinusitis = jsonAntecedentes.getString("AO_PPatologicos_Rinitis_Sinusitis");
		String AO_PPatologicos_Rubeola = jsonAntecedentes.getString("AO_PPatologicos_Rubeola");
		String AO_PPatologicos_Sarampion = jsonAntecedentes.getString("AO_PPatologicos_Sarampion");
		String AO_PQuirurgicos_Cirugia_Oido = jsonAntecedentes.getString("AO_PQuirurgicos_Cirugia_Oido");
		String AO_PQuirurgicos_Cuales = jsonAntecedentes.getString("AO_PQuirurgicos_Cuales");
		String AO_PQuirurgicos_Otros = jsonAntecedentes.getString("AO_PQuirurgicos_Otros");
		String AO_PQuirurgicos_Timpanoplastia = jsonAntecedentes.getString("AO_PQuirurgicos_Timpanoplastia");
		String AO_PToxicos_Farmacos = jsonAntecedentes.getString("AO_PToxicos_Farmacos");
		String AO_PToxicos_Industriales = jsonAntecedentes.getString("AO_PToxicos_Industriales");
		String AO_PTraumaticos_Acustico = jsonAntecedentes.getString("AO_PTraumaticos_Acustico");
		String AO_PTraumaticos_Craneo = jsonAntecedentes.getString("AO_PTraumaticos_Craneo");
		String AO_PTraumaticos_Cuales = jsonAntecedentes.getString("AO_PTraumaticos_Cuales");
		String AO_PTraumaticos_Otros = jsonAntecedentes.getString("AO_PTraumaticos_Otros");
		String AP_Catarata = jsonAntecedentes.getString("AP_Catarata");
		String AP_Catarata_escribir = jsonAntecedentes.getString("AP_Catarata_escribir");
		String AP_Esquirlas = jsonAntecedentes.getString("AP_Esquirlas");
		String AP_Esquirlas_escribir = jsonAntecedentes.getString("AP_Esquirlas_escribir");
		String AP_Farmacologicos_Alergicos = jsonAntecedentes.getString("AP_Farmacologicos_Alergicos");
		String AP_Farmacologicos_Alergicos_escribir = jsonAntecedentes.getString("AP_Farmacologicos_Alergicos_escribir");
		String AP_Galucoma = jsonAntecedentes.getString("AP_Galucoma");
		String AP_Galucoma_escribir = jsonAntecedentes.getString("AP_Galucoma_escribir");
		String AP_Otros = jsonAntecedentes.getString("AP_Otros");
		String AP_Otros_escribir = jsonAntecedentes.getString("AP_Otros_escribir");
		String AP_Patologicos = jsonAntecedentes.getString("AP_Patologicos");
		String AP_Patologicos_escribir = jsonAntecedentes.getString("AP_Patologicos_escribir");
		String AP_Quimicos = jsonAntecedentes.getString("AP_Quimicos");
		String AP_Quimicos_escribir = jsonAntecedentes.getString("AP_Quimicos_escribir");
		String AP_Quirurgicos = jsonAntecedentes.getString("AP_Quirurgicos");
		String AP_Quirurgicos_escribir = jsonAntecedentes.getString("AP_Quirurgicos_escribir");
		String AP_RehabilitacionVisual = jsonAntecedentes.getString("AP_RehabilitacionVisual");
		String AP_RehabilitacionVisual_escribir = jsonAntecedentes.getString("AP_RehabilitacionVisual_escribir");
		String AP_Transfusionales = jsonAntecedentes.getString("AP_Transfusionales");
		String AP_Transfusionales_escribir = jsonAntecedentes.getString("AP_Transfusionales_escribir");
		String AP_Traumaticos = jsonAntecedentes.getString("AP_Traumaticos");
		String AP_Traumaticos_escribir = jsonAntecedentes.getString("AP_Traumaticos_escribir");
		String AP_UsuariosRx = jsonAntecedentes.getString("AP_UsuariosRx");
		String AP_UsuariosRx_escribir = jsonAntecedentes.getString("AP_UsuariosRx_escribir");
		String OtrosOculares = jsonAntecedentes.getString("OtrosOculares");
		String OtrosOcularesEscribir = jsonAntecedentes.getString("OtrosOcularesEscribir");
		String _fk_IDT_DocumentoID = jsonAntecedentes.getString("_fk_IDT_DocumentoID");
		String AG_Dias = jsonAntecedentes.getString("AG_Dias");
		String AG_FObstetrica_A = jsonAntecedentes.getString("AG_FObstetrica_A");
		String AG_FObstetrica_C = jsonAntecedentes.getString("AG_FObstetrica_C");
		String AG_FObstetrica_E = jsonAntecedentes.getString("AG_FObstetrica_E");
		String AG_FObstetrica_G = jsonAntecedentes.getString("AG_FObstetrica_G");
		String AG_FObstetrica_P = jsonAntecedentes.getString("AG_FObstetrica_P");
		String AG_FObstetrica_V = jsonAntecedentes.getString("AG_FObstetrica_V");
		String AG_Menarquia = jsonAntecedentes.getString("AG_Menarquia");
		String AG_FUP = jsonAntecedentes.getString("AG_FUP");
		String AG_FUR = jsonAntecedentes.getString("AG_FUR");
		String AG_UltimaCitologia_Fecha = jsonAntecedentes.getString("AG_UltimaCitologia_Fecha");
		String FechaDeDiligenciamiento = jsonAntecedentes.getString("FechaDeDiligenciamiento");
		String FechaDeModificacion = jsonAntecedentes.getString("FechaDeModificacion");
		java.util.Date dateAG_UltimaCitologia_Fecha = null;
		try {
			dateAG_UltimaCitologia_Fecha = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(AG_UltimaCitologia_Fecha);
		} catch (Exception e) {
			dateAG_UltimaCitologia_Fecha = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(AG_UltimaCitologia_Fecha);
		}
		java.util.Date dateAG_FUR = null;
		try {
			dateAG_FUR = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(AG_FUR);
		} catch (Exception e) {
			dateAG_FUR = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(AG_FUR);
		}
		java.util.Date dateAG_FUP = null;
		try {
			dateAG_FUP = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(AG_FUP);
		} catch (Exception e) {
			dateAG_FUP = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(AG_FUP);
		}
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion = null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeModificacion);
		}
		
		Antecedente antecedente = new Antecedente(AF_Patologia_Alergias, AF_Patologia_Alergias_Parentesco, AF_Patologia_Artitis, AF_Patologia_Artitis_Parentesco, 
				AF_Patologia_Asma, AF_Patologia_Asma_Parentesco, AF_Patologia_Cancer, AF_Patologia_Cancer_Parentesco, AF_Patologia_cardiaco, 
				AF_Patologia_Diabetes, AF_Patologia_Diabetes_Parentesco, AF_Patologia_Dislipidemia, AF_Patologia_Dislipidemia_Parentesco, AF_Patologia_EAP, 
				AF_Patologia_EAP_Parentesco, AF_Patologia_ECV, AF_Patologia_ECV_Parentesco, AF_Patologia_EnfermedadColagenosis, 
				AF_Patologia_EnfermedadColagenosis_Parentesco, AF_Patologia_EnfermedadCoronaria, AF_Patologia_EnfermedadCoronaria_Parentesco, 
				AF_Patologia_EnfermedadRenal, AF_Patologia_EnfermedadRenal_Parentesco, AF_Patologia_EnfermedadTiroidea, AF_Patologia_EnfermedadTiroidea_Parentesco, 
				AF_Patologia_hipertension, AF_Patologia_HTA, AF_Patologia_HTA_Parentesco, AF_Patologia_Otra, AF_Patologia_Otra_Cual, AF_Patologia_TBC, 
				AF_Patologia_TBC_Parentesco, AF_Patologia_Varices, AF_Patologia_Varices_Parentesco, AG_Ciclos, AG_MetodoPlanificacion, 
				AG_UltimaCitologia_Resultado, AI_CarnetVacunacion, AI_FiebreAmarilla, AI_Hepatitis_A, AI_Hepatitis_B, AI_Influenza, AI_Otros, 
				AI_Tetano, AI_TripleViral, AI_Varicela, AO_FOtologicos, AO_OActual, AO_OActual_T, AO_OAnterior, AO_OAnterior_T, AO_OJornadaLaboral, 
				AO_OLabores, AO_OLabores_Horario, AO_OProteccion, AO_OProteccion_Tipo, AO_OProteccion_Tipo_Tiempo, AO_OTiempoExposicionRuido, 
				AO_PExtraLaboral_Audifonos, AO_PExtraLaboral_Cuales, AO_PExtraLaboral_Moto, AO_PExtraLaboral_MusicaAlta, AO_PExtraLaboral_Otros, 
				AO_PExtraLaboral_ServicioMilitar, AO_PExtraLaboral_Tejo, AO_POtologicos_Cual, AO_POtologicos_Otalgia, AO_POtologicos_Otitis, 
				AO_POtologicos_Otorrea, AO_POtologicos_Otros, AO_POtologicos_Prurito, AO_POtologicos_Sensacion, AO_POtologicos_Tinitus, 
				AO_POtologicos_Vertigo, AO_PPatologicos_Cuales, AO_PPatologicos_Diabetes, AO_PPatologicos_Hipertension, AO_PPatologicos_Otros, 
				AO_PPatologicos_Parotiditis, AO_PPatologicos_Rinitis_Sinusitis, AO_PPatologicos_Rubeola, AO_PPatologicos_Sarampion, 
				AO_PQuirurgicos_Cirugia_Oido, AO_PQuirurgicos_Cuales, AO_PQuirurgicos_Otros, AO_PQuirurgicos_Timpanoplastia, AO_PToxicos_Farmacos, 
				AO_PToxicos_Industriales, AO_PTraumaticos_Acustico, AO_PTraumaticos_Craneo, AO_PTraumaticos_Cuales, AO_PTraumaticos_Otros, 
				AP_Catarata, AP_Catarata_escribir, AP_Esquirlas, AP_Esquirlas_escribir, AP_Farmacologicos_Alergicos, AP_Farmacologicos_Alergicos_escribir, 
				AP_Galucoma, AP_Galucoma_escribir, AP_Otros, AP_Otros_escribir, AP_Patologicos, AP_Patologicos_escribir, AP_Quimicos, AP_Quimicos_escribir, 
				AP_Quirurgicos, AP_Quirurgicos_escribir, AP_RehabilitacionVisual, AP_RehabilitacionVisual_escribir, AP_Transfusionales, AP_Transfusionales_escribir, 
				AP_Traumaticos, AP_Traumaticos_escribir, AP_UsuariosRx, AP_UsuariosRx_escribir, OtrosOculares, OtrosOcularesEscribir, Integer.parseInt(_fk_IDT_DocumentoID), 
				Integer.parseInt(AG_Dias), Integer.parseInt(AG_FObstetrica_A), Integer.parseInt(AG_FObstetrica_C), Integer.parseInt(AG_FObstetrica_E), 
				Integer.parseInt(AG_FObstetrica_G), Integer.parseInt(AG_FObstetrica_P), Integer.parseInt(AG_FObstetrica_V), Integer.parseInt(AG_Menarquia), dateAG_FUP, 
				dateAG_FUR, dateAG_UltimaCitologia_Fecha, dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		AntecedenteDao antecedenteDao = new AntecedenteDao();
		boolean result = antecedenteDao.insertAntecedentes(antecedente);
		
		return result;
	}
	
	//public boolean 
}
