package co.analicom.ws.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONObject;
import co.analicom.ws.hc.dao.implementsdao.AccidenteDao;
import co.analicom.ws.hc.dao.implementsdao.AgudezaVisualDao;
import co.analicom.ws.hc.dao.implementsdao.AntecedenteDao;
import co.analicom.ws.hc.dao.implementsdao.CargoDao;
import co.analicom.ws.hc.dao.implementsdao.DatoOcupacionalDao;
import co.analicom.ws.hc.dao.implementsdao.EmpresaDao;
import co.analicom.ws.hc.dao.implementsdao.EnfermedadProfesionalDao;
import co.analicom.ws.hc.dao.implementsdao.ExamenFisicoDao;
import co.analicom.ws.hc.dao.implementsdao.HabitoDao;
import co.analicom.ws.hc.dao.implementsdao.HistoriaClinicaDao;
import co.analicom.ws.hc.dao.implementsdao.HistoriaVisiometriaDao;
import co.analicom.ws.hc.dao.implementsdao.ImpresionDiagnosticaDao;
import co.analicom.ws.hc.dao.implementsdao.ManipulacionAlimentoDao;
import co.analicom.ws.hc.dao.implementsdao.PacienteDao;
import co.analicom.ws.hc.dao.implementsdao.ParaclinicoDao;
import co.analicom.ws.hc.dao.implementsdao.RecomendacionDao;
import co.analicom.ws.hc.dao.implementsdao.ResultadoDao;
import co.analicom.ws.hc.dao.implementsdao.RevisionPorSistemaDao;
import co.analicom.ws.hc.dao.implementsdao.RiesgoCargoEvaluarDao;
import co.analicom.ws.hc.dao.implementsdao.SintomaDao;
import co.analicom.ws.hc.modelo.Accidente;
import co.analicom.ws.hc.modelo.AgudezaVisual;
import co.analicom.ws.hc.modelo.Antecedente;
import co.analicom.ws.hc.modelo.Cargo;
import co.analicom.ws.hc.modelo.DatoOcupacional;
import co.analicom.ws.hc.modelo.Empresa;
import co.analicom.ws.hc.modelo.EnfermedadProfesional;
import co.analicom.ws.hc.modelo.ExamenFisico;
import co.analicom.ws.hc.modelo.Habito;
import co.analicom.ws.hc.modelo.HistoriaClinica;
import co.analicom.ws.hc.modelo.HistoriaVisiometria;
import co.analicom.ws.hc.modelo.ImpresionDiagnostica;
import co.analicom.ws.hc.modelo.ManipulacionAlimentos;
import co.analicom.ws.hc.modelo.Paciente;
import co.analicom.ws.hc.modelo.Paraclinico;
import co.analicom.ws.hc.modelo.Recomendacion;
import co.analicom.ws.hc.modelo.Resultado;
import co.analicom.ws.hc.modelo.RevisionPorSistemas;
import co.analicom.ws.hc.modelo.RiesgoCargoEvaluar;
import co.analicom.ws.hc.modelo.Sintoma;
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

		JSONObject jsonEnfermedadP = jsonPaciente.getJSONObject("enfermedadProfesional");
		JSONObject jsonAccidente = jsonPaciente.getJSONObject("accidentes");
		PacienteDao dao = new PacienteDao();
		boolean result = dao.insertPaciente(paciente);
		int IDP = dao.obtenerID(documento);
		boolean resultEnfermedadP = generarJsonEnfermedadProfesional(jsonEnfermedadP, IDP);
		boolean resultAccidente = generarJsonAccidente(jsonAccidente, IDP);
		JSONObject jsonObject = new JSONObject();
		if(result) {
			jsonObject.put("code", 1);
		}else {
			jsonObject.put("code", 0);
		}
		if (resultEnfermedadP) {
			jsonObject.put("Enfermedad", 1);
		} else {
			jsonObject.put("Enfermedad", 0);
		}
		if (resultAccidente) {
			jsonObject.put("Accidente", 1);
		}else {
			jsonObject.put("Accidente", 0);
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
		
		//Creacion de JSONTablas
		JSONObject jsonRecomendacion = jsonHC.getJSONObject("recomendacion");
		JSONObject jsonAntecedentes = jsonHC.getJSONObject("antecedente");
		JSONObject jsonExamenFisico = jsonHC.getJSONObject("examenfisico");
		JSONObject jsonManipulacionA = jsonHC.getJSONObject("manipulacionalimentos");
		JSONObject jsonRevisionS = jsonHC.getJSONObject("revisionPorSistema");
		JSONObject jsonHabitos = jsonHC.getJSONObject("habito");
		JSONObject jsonResultado = jsonHC.getJSONObject("resultado");
		JSONObject jsonImpresionD = jsonHC.getJSONObject("impresiondiagnostica");
		JSONObject jsonParaclinicos = jsonHC.getJSONObject("paraclinicos");
		JSONObject jsonEmpresa = jsonHC.getJSONObject("empresa");
		
		//Se insertan los datos a la BD principal
		boolean result = historiaClinicaDao.insertHistoriaClinica(historiaClinica);
		int IDHC = historiaClinicaDao.obtenerID();
		boolean recomendacion = generarJsonRecomendacion(jsonRecomendacion, IDHC);
		boolean antecedentes = generarJsonAntecedentes(jsonAntecedentes, IDHC);
		boolean examenFisico = generarJsonExamenFisico(jsonExamenFisico, IDHC);
		boolean manipulacionA = generarJsonManipulacionAlimentos(jsonManipulacionA, IDHC);
		boolean RevisionS = generarJsonRevisionSistema(jsonRevisionS, IDHC);
		boolean habito = generarJsonHabito(jsonHabitos, IDHC);
		boolean resultado = generarJsonResultados(jsonResultado, IDHC);
		boolean impresionD = generarJsonImpresionDiag(jsonImpresionD, IDHC);
		boolean paraclinico = generarJsonParaclinicos(jsonParaclinicos, IDHC);
		JSONObject empresa = generarJsonEmpresa(jsonEmpresa, IDHC);
		
		//JSON de retorno de transacción satisfactoria
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
		if (antecedentes) {
			jsonObject.put("Antecedentes", 1);
		}else {
			jsonObject.put("Antecedentes", 0);
		}
		if (examenFisico) {
			jsonObject.put("Examen Fisico", 1);
		}else {
			jsonObject.put("Examen Fisico", 0);
		}
		if (manipulacionA) {
			jsonObject.put("Manipulacion de alimentos", 1);
		}else {
			jsonObject.put("Manipulacion de alimentos", 0);
		}
		if (RevisionS) {
			jsonObject.put("Revision Sistema", 1);
		}else {
			jsonObject.put("Revision Sistema", 0);
		}
		if (habito) {
			jsonObject.put("Habitos", 1);
		}else {
			jsonObject.put("Habitos", 0);
		}
		if (resultado) {
			jsonObject.put("Resultado", 1);
		}else {
			jsonObject.put("Resultado", 0);
		}
		if (impresionD) {
			jsonObject.put("Impresion diagnostica", 1);
		}else {
			jsonObject.put("Impresion diagnostica", 0);
		}
		if (paraclinico) {
			jsonObject.put("Paraclinico", 1);
		}else {
			jsonObject.put("Paraclinico", 0);
		}
		jsonObject.put("Empresa, Cargo, DatosOcupacionales", empresa);
		return Response.status(200).entity("" + jsonObject).build();
	}
	
	@POST
	@Path("/historiavisiometria")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response insertHV(String json) throws Exception{
		
		JSONObject jsonHV = new JSONObject(json);
		String fk_empresa = jsonHV.getString("fk_empresa");
		String fk_medico = jsonHV.getString("fk_medico");
		String fk_paciente = jsonHV.getString("fk_paciente");
		String tipoExamen = jsonHV.getString("tipoExamen");
		String tipoExamenOtro = jsonHV.getString("tipoExamenOtro");
		String fechaDiligenciamiento = jsonHV.getString("fechaDiligenciamiento");
		String fechaModificacion = jsonHV.getString("fechaModificacion");
		String impresionDiagnostica = jsonHV.getString("impresionDiagnostica");
		String impresionDiagnosticaObservacion = jsonHV.getString("impresionDiagnosticaObservacion");
		String userModifica = jsonHV.getString("userModifica");
		String impreso = jsonHV.getString("impreso");
		String cantImpresiones = jsonHV.getString("cantImpresiones");
		String estado = jsonHV.getString("estado");
		String PacienteCompatibleLabor = jsonHV.getString("PacienteCompatibleLabor");
		String PacienteCompatibleLabor_Observacion = jsonHV.getString("PacienteCompatibleLabor_Observacion");
		String RequiereNuevaValoracion = jsonHV.getString("RequiereNuevaValoracion");
		String RequiereNuevaValoracion_Observacion = jsonHV.getString("RequiereNuevaValoracion_Observacion");
		String RequiereRemisionEspecialista = jsonHV.getString("RequiereRemisionEspecialista");
		String RequiereRemisionEspecialista_Observacion = jsonHV.getString("RequiereRemisionEspecialista_Observacion");
		String firmaPaciente = jsonHV.getString("firmaPaciente");
		String firmaMedico = jsonHV.getString("firmaMedico");
		
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(fechaDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(fechaDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(fechaModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(fechaModificacion);
		}
		
		HistoriaVisiometria historiaVisiometria = new HistoriaVisiometria(Integer.parseInt(fk_empresa), Integer.parseInt(fk_medico), 
				Integer.parseInt(fk_paciente), tipoExamen, tipoExamenOtro, dateFechaDeDiligenciamiento, dateFechaDeModificacion, 
				impresionDiagnostica, impresionDiagnosticaObservacion, userModifica, impreso, Integer.parseInt(cantImpresiones), 
				estado, PacienteCompatibleLabor, PacienteCompatibleLabor_Observacion, RequiereNuevaValoracion, RequiereNuevaValoracion_Observacion,
				RequiereRemisionEspecialista, RequiereRemisionEspecialista_Observacion, firmaPaciente, firmaMedico);
		HistoriaVisiometriaDao dao = new HistoriaVisiometriaDao();
		
		//Creacion de JSONTablas
		JSONObject jsonSintoma = jsonHV.getJSONObject("sintomas");
		JSONObject jsonAgudezaV = jsonHV.getJSONObject("agudezavisual");
		JSONObject jsonRiesgoCE = jsonHV.getJSONObject("riesgocargoevaluar");
//		
//		//Se insertan los datos a la BD principal
		boolean result = dao.insertarHistoriaVisiometria(historiaVisiometria);
		int IDHV = dao.obtenerID();
		boolean sintomas = generarJsonSintomas(jsonSintoma, IDHV);
		boolean agudezaV = generarJsonAgudezaVisual(jsonAgudezaV, IDHV);
		boolean riesgoCE = generarJsonRiesgoCE(jsonRiesgoCE, IDHV);
		
		boolean resultHV = dao.insertarHistoriaVisiometria(historiaVisiometria);
		JSONObject jsonObject = new JSONObject();
		if(resultHV) {
			jsonObject.put("Historia Visiometria", 1);
		}else {
			jsonObject.put("Historia Visiometria", 0);
		}
		if (sintomas) {
			jsonObject.put("Sintomas", 1);
		}else {
			jsonObject.put("Sintomas", 0);
		}
		if (agudezaV) {
			jsonObject.put("Agudeza visual", 1);
		}else {
			jsonObject.put("Agudeza visual", 0);
		}
		if (riesgoCE) {
			jsonObject.put("Riesgo Cargo Evaluar", 1);
		}else {
			jsonObject.put("Riesgo Cargo Evaluar", 0);
		}
		
		return Response.status(200).entity("" + jsonObject).build();
	}
	
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
		int  _fk_IDT_DocumentoID = IDHC;
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
				_fk_IDT_DocumentoID, dateFechaDeDiligenciamiento, dateFechaDeModificacion);
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
		int _fk_IDT_DocumentoID = IDHC;
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
				AP_Traumaticos, AP_Traumaticos_escribir, AP_UsuariosRx, AP_UsuariosRx_escribir, OtrosOculares, OtrosOcularesEscribir, _fk_IDT_DocumentoID, 
				Integer.parseInt(AG_Dias), Integer.parseInt(AG_FObstetrica_A), Integer.parseInt(AG_FObstetrica_C), Integer.parseInt(AG_FObstetrica_E), 
				Integer.parseInt(AG_FObstetrica_G), Integer.parseInt(AG_FObstetrica_P), Integer.parseInt(AG_FObstetrica_V), Integer.parseInt(AG_Menarquia), dateAG_FUP, 
				dateAG_FUR, dateAG_UltimaCitologia_Fecha, dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		AntecedenteDao antecedenteDao = new AntecedenteDao();
		boolean result = antecedenteDao.insertAntecedentes(antecedente);
		
		return result;
	}
	
	public boolean generarJsonEnfermedadProfesional(JSONObject jsonEnfermedadP, int IDP) throws ParseException {
		
		String AccidentesDeTrabajo = jsonEnfermedadP.getString("AccidentesDeTrabajo");
		String ARL = jsonEnfermedadP.getString("ARL");
		String Descripcion = jsonEnfermedadP.getString("Descripcion");
		String Diagnostico = jsonEnfermedadP.getString("Diagnostico");
		String empresa = jsonEnfermedadP.getString("empresa");
		String enfermedadProfesional = jsonEnfermedadP.getString("enfermedadProfesional");
		String reubicacion = jsonEnfermedadP.getString("reubicacion");
		int _fk_IDT_DocumentoID = IDP;
		String fechaDeDiligenciamiento = jsonEnfermedadP.getString("fechaDeDiligenciamiento");
		String FechaDeModificacion = jsonEnfermedadP.getString("FechaDeModificacion");
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(fechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(fechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion = null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeModificacion);
		}
		EnfermedadProfesional enfermedadProfesional2 = new EnfermedadProfesional(AccidentesDeTrabajo, ARL, Descripcion, Diagnostico, empresa, enfermedadProfesional, reubicacion, _fk_IDT_DocumentoID, dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		EnfermedadProfesionalDao dao = new EnfermedadProfesionalDao();
		boolean result = dao.insertEnfermedadProfesional(enfermedadProfesional2);
		
		return result;
	}
	
	public boolean generarJsonAccidente(JSONObject jsonAccidente, int IDP) throws ParseException {
		
		String AccidentesDeTrabajo = jsonAccidente.getString("AccidentesDeTrabajo");
		String ARL = jsonAccidente.getString("ARL");
		String Descripcion = jsonAccidente.getString("Descripcion");
		String Diagnostico = jsonAccidente.getString("Diagnostico");
		String Empresa = jsonAccidente.getString("Empresa");
		String EnfermedadProfesional = jsonAccidente.getString("EnfermedadProfesional");
		String Lesion = jsonAccidente.getString("Lesion");
		String Reubicacion = jsonAccidente.getString("Reubicacion");
		String Secuelas = jsonAccidente.getString("Secuelas");
		String DiasIncapacidad = jsonAccidente.getString("DiasIncapacidad");
		int _fk_IDT_DocumentoID = IDP;
		String FechaDeDiligenciamiento = jsonAccidente.getString("FechaDeDiligenciamiento");
		String FechaDeModificacion = jsonAccidente.getString("FechaDeModificacion");
		
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(FechaDeModificacion);
		}
		
		Accidente accidente = new Accidente(AccidentesDeTrabajo, ARL, Descripcion, Diagnostico, Empresa, EnfermedadProfesional, Lesion, Reubicacion, Secuelas, Integer.parseInt(DiasIncapacidad), _fk_IDT_DocumentoID, dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		AccidenteDao accidenteDao = new AccidenteDao();
		boolean result = accidenteDao.insertAccidente(accidente);
		
		return result;
	}
	
	public boolean generarJsonExamenFisico(JSONObject jsonExamenFisico, int IDHC) throws ParseException {
		
		String Abdomen = jsonExamenFisico.getString("Abdomen");
		String Abdomen_Descripcion = jsonExamenFisico.getString("Abdomen_Descripcion");
		String Abdomen_Hernias = jsonExamenFisico.getString("Abdomen_Hernias");
		String BA_Calor_Cadera_D = jsonExamenFisico.getString("BA_Calor_Cadera_D");
		String BA_Calor_Cadera_I = jsonExamenFisico.getString("BA_Calor_Cadera_I");
		String BA_Calor_Codos_D = jsonExamenFisico.getString("BA_Calor_Codos_D");
		String BA_Calor_Codos_I = jsonExamenFisico.getString("BA_Calor_Codos_I");
		String BA_Calor_Dedos_Mano_D = jsonExamenFisico.getString("BA_Calor_Dedos_Mano_D");
		String BA_Calor_Dedos_Mano_I = jsonExamenFisico.getString("BA_Calor_Dedos_Mano_I");
		String BA_Calor_Dedos_Pie_D = jsonExamenFisico.getString("BA_Calor_Dedos_Pie_D");
		String BA_Calor_Dedos_Pie_I = jsonExamenFisico.getString("BA_Calor_Dedos_Pie_I");
		String BA_Calor_Hombros_D = jsonExamenFisico.getString("BA_Calor_Hombros_D");
		String BA_Calor_Hombros_I = jsonExamenFisico.getString("BA_Calor_Hombros_I");
		String BA_Calor_Munecas_D = jsonExamenFisico.getString("BA_Calor_Munecas_D");
		String BA_Calor_Munecas_I = jsonExamenFisico.getString("BA_Calor_Munecas_I");
		String BA_Calor_Rodilla_D = jsonExamenFisico.getString("BA_Calor_Rodilla_D");
		String BA_Calor_Rodilla_I = jsonExamenFisico.getString("BA_Calor_Rodilla_I");
		String BA_Calor_Tobillos_D = jsonExamenFisico.getString("BA_Calor_Tobillos_D");
		String BA_Calor_Tobillos_I = jsonExamenFisico.getString("BA_Calor_Tobillos_I");
		String BA_Deformidad_Cadera_D = jsonExamenFisico.getString("BA_Deformidad_Cadera_D");
		String BA_Deformidad_Cadera_I = jsonExamenFisico.getString("BA_Deformidad_Cadera_I");
		String BA_Deformidad_Codos_D = jsonExamenFisico.getString("BA_Deformidad_Codos_D");
		String BA_Deformidad_Codos_I = jsonExamenFisico.getString("BA_Deformidad_Codos_I");
		String BA_Deformidad_Dedos_Mano_D = jsonExamenFisico.getString("BA_Deformidad_Dedos_Mano_D");
		String BA_Deformidad_Dedos_Mano_I = jsonExamenFisico.getString("BA_Deformidad_Dedos_Mano_I");
		String BA_Deformidad_Dedos_Pie_D = jsonExamenFisico.getString("BA_Deformidad_Dedos_Pie_D");
		String BA_Deformidad_Dedos_Pie_I = jsonExamenFisico.getString("BA_Deformidad_Dedos_Pie_I");
		String BA_Deformidad_Hombros_D = jsonExamenFisico.getString("BA_Deformidad_Hombros_D");
		String BA_Deformidad_Hombros_I = jsonExamenFisico.getString("BA_Deformidad_Hombros_I");
		String BA_Deformidad_Munecas_D = jsonExamenFisico.getString("BA_Deformidad_Munecas_D");
		String BA_Deformidad_Munecas_I = jsonExamenFisico.getString("BA_Deformidad_Munecas_I");
		String BA_Deformidad_Rodilla_D = jsonExamenFisico.getString("BA_Deformidad_Rodilla_D");
		String BA_Deformidad_Rodilla_I = jsonExamenFisico.getString("BA_Deformidad_Rodilla_I");
		String BA_Deformidad_Tobillos_D = jsonExamenFisico.getString("BA_Deformidad_Tobillos_D");
		String BA_Deformidad_Tobillos_I = jsonExamenFisico.getString("BA_Deformidad_Tobillos_I");
		String BA_Dolor_Cadera_D = jsonExamenFisico.getString("BA_Dolor_Cadera_D");
		String BA_Dolor_Cadera_I = jsonExamenFisico.getString("BA_Dolor_Cadera_I");
		String BA_Dolor_Codos_D = jsonExamenFisico.getString("BA_Dolor_Codos_D");
		String BA_Dolor_Codos_I = jsonExamenFisico.getString("BA_Dolor_Codos_I");
		String BA_Dolor_Dedos_Mano_D = jsonExamenFisico.getString("BA_Dolor_Dedos_Mano_D");
		String BA_Dolor_Dedos_Mano_I = jsonExamenFisico.getString("BA_Dolor_Dedos_Mano_I");
		String BA_Dolor_Dedos_Pie_D = jsonExamenFisico.getString("BA_Dolor_Dedos_Pie_D");
		String BA_Dolor_Dedos_Pie_I = jsonExamenFisico.getString("BA_Dolor_Dedos_Pie_I");
		String BA_Dolor_Hombros_D = jsonExamenFisico.getString("BA_Dolor_Hombros_D");
		String BA_Dolor_Hombros_I = jsonExamenFisico.getString("BA_Dolor_Hombros_I");
		String BA_Dolor_Munecas_D = jsonExamenFisico.getString("BA_Dolor_Munecas_D");
		String BA_Dolor_Munecas_I = jsonExamenFisico.getString("BA_Dolor_Munecas_I");
		String BA_Dolor_Rodilla_D = jsonExamenFisico.getString("BA_Dolor_Rodilla_D");
		String BA_Dolor_Rodilla_I = jsonExamenFisico.getString("BA_Dolor_Rodilla_I");
		String BA_Dolor_Tobillos_D = jsonExamenFisico.getString("BA_Dolor_Tobillos_D");
		String BA_Dolor_Tobillos_I = jsonExamenFisico.getString("BA_Dolor_Tobillos_I");
		String BA_Edema_Cadera_D = jsonExamenFisico.getString("BA_Edema_Cadera_D");
		String BA_Edema_Cadera_I = jsonExamenFisico.getString("BA_Edema_Cadera_I");
		String BA_Edema_Codos_D = jsonExamenFisico.getString("BA_Edema_Codos_D");
		String BA_Edema_Codos_I = jsonExamenFisico.getString("BA_Edema_Codos_I");
		String BA_Edema_Dedos_Mano_D = jsonExamenFisico.getString("BA_Edema_Dedos_Mano_D");
		String BA_Edema_Dedos_Mano_I = jsonExamenFisico.getString("BA_Edema_Dedos_Mano_I");
		String BA_Edema_Dedos_Pie_D = jsonExamenFisico.getString("BA_Edema_Dedos_Pie_D");
		String BA_Edema_Dedos_Pie_I = jsonExamenFisico.getString("BA_Edema_Dedos_Pie_I");
		String BA_Edema_Hombros_D = jsonExamenFisico.getString("BA_Edema_Hombros_D");
		String BA_Edema_Hombros_I = jsonExamenFisico.getString("BA_Edema_Hombros_I");
		String BA_Edema_Munecas_D = jsonExamenFisico.getString("BA_Edema_Munecas_D");
		String BA_Edema_Munecas_I = jsonExamenFisico.getString("BA_Edema_Munecas_I");
		String BA_Edema_Rodilla_D = jsonExamenFisico.getString("BA_Edema_Rodilla_D");
		String BA_Edema_Rodilla_I = jsonExamenFisico.getString("BA_Edema_Rodilla_I");
		String BA_Edema_Tobillos_D = jsonExamenFisico.getString("BA_Edema_Tobillos_D");
		String BA_Edema_Tobillos_I = jsonExamenFisico.getString("BA_Edema_Tobillos_I");
		String BA_Explicacion = jsonExamenFisico.getString("BA_Explicacion");
		String BA_Limitacion_Arcos_Cadera_D = jsonExamenFisico.getString("BA_Limitacion_Arcos_Cadera_D");
		String BA_Limitacion_Arcos_Cadera_I = jsonExamenFisico.getString("BA_Limitacion_Arcos_Cadera_I");
		String BA_Limitacion_Arcos_Codos_D = jsonExamenFisico.getString("BA_Limitacion_Arcos_Codos_D");
		String BA_Limitacion_Arcos_Codos_I = jsonExamenFisico.getString("BA_Limitacion_Arcos_Codos_I");
		String BA_Limitacion_Arcos_Dedos_Mano_D = jsonExamenFisico.getString("BA_Limitacion_Arcos_Dedos_Mano_D");
		String BA_Limitacion_Arcos_Dedos_Mano_I = jsonExamenFisico.getString("BA_Limitacion_Arcos_Dedos_Mano_I");
		String BA_Limitacion_Arcos_Dedos_Pie_D = jsonExamenFisico.getString("BA_Limitacion_Arcos_Dedos_Pie_D");
		String BA_Limitacion_Arcos_Dedos_Pie_I = jsonExamenFisico.getString("BA_Limitacion_Arcos_Dedos_Pie_I");
		String BA_Limitacion_Arcos_Hombros_D = jsonExamenFisico.getString("BA_Limitacion_Arcos_Hombros_D");
		String BA_Limitacion_Arcos_Hombros_I = jsonExamenFisico.getString("BA_Limitacion_Arcos_Hombros_I");
		String BA_Limitacion_Arcos_Munecas_D = jsonExamenFisico.getString("BA_Limitacion_Arcos_Munecas_D");
		String BA_Limitacion_Arcos_Munecas_I = jsonExamenFisico.getString("BA_Limitacion_Arcos_Munecas_I");
		String BA_Limitacion_Arcos_Rodilla_D = jsonExamenFisico.getString("BA_Limitacion_Arcos_Rodilla_D");
		String BA_Limitacion_Arcos_Rodilla_I = jsonExamenFisico.getString("BA_Limitacion_Arcos_Rodilla_I");
		String BA_Limitacion_Arcos_Tobillos_D = jsonExamenFisico.getString("BA_Limitacion_Arcos_Tobillos_D");
		String BA_Limitacion_Arcos_Tobillos_I = jsonExamenFisico.getString("BA_Limitacion_Arcos_Tobillos_I");
		String BA_Rubor_Cadera_D = jsonExamenFisico.getString("BA_Rubor_Cadera_D");
		String BA_Rubor_Cadera_I = jsonExamenFisico.getString("BA_Rubor_Cadera_I");
		String BA_Rubor_Codos_D = jsonExamenFisico.getString("BA_Rubor_Codos_D");
		String BA_Rubor_Codos_I = jsonExamenFisico.getString("BA_Rubor_Codos_I");
		String BA_Rubor_Dedos_Mano_D = jsonExamenFisico.getString("BA_Rubor_Dedos_Mano_D");
		String BA_Rubor_Dedos_Mano_I = jsonExamenFisico.getString("BA_Rubor_Dedos_Mano_I");
		String BA_Rubor_Dedos_Pie_D = jsonExamenFisico.getString("BA_Rubor_Dedos_Pie_D");
		String BA_Rubor_Dedos_Pie_I = jsonExamenFisico.getString("BA_Rubor_Dedos_Pie_I");
		String BA_Rubor_Hombros_D = jsonExamenFisico.getString("BA_Rubor_Hombros_D");
		String BA_Rubor_Hombros_I = jsonExamenFisico.getString("BA_Rubor_Hombros_I");
		String BA_Rubor_Munecas_D = jsonExamenFisico.getString("BA_Rubor_Munecas_D");
		String BA_Rubor_Munecas_I = jsonExamenFisico.getString("BA_Rubor_Munecas_I");
		String BA_Rubor_Rodilla_D = jsonExamenFisico.getString("BA_Rubor_Rodilla_D");
		String BA_Rubor_Rodilla_I = jsonExamenFisico.getString("BA_Rubor_Rodilla_I");
		String BA_Rubor_Tobillos_D = jsonExamenFisico.getString("BA_Rubor_Tobillos_D");
		String BA_Rubor_Tobillos_I = jsonExamenFisico.getString("BA_Rubor_Tobillos_I");
		String BA_Sensibilidad_Cadera_D = jsonExamenFisico.getString("BA_Sensibilidad_Cadera_D");
		String BA_Sensibilidad_Cadera_I = jsonExamenFisico.getString("BA_Sensibilidad_Cadera_I");
		String BA_Sensibilidad_Codos_D = jsonExamenFisico.getString("BA_Sensibilidad_Codos_D");
		String BA_Sensibilidad_Codos_I = jsonExamenFisico.getString("BA_Sensibilidad_Codos_I");
		String BA_Sensibilidad_Dedos_Mano_D = jsonExamenFisico.getString("BA_Sensibilidad_Dedos_Mano_D");
		String BA_Sensibilidad_Dedos_Mano_I = jsonExamenFisico.getString("BA_Sensibilidad_Dedos_Mano_I");
		String BA_Sensibilidad_Dedos_Pie_D = jsonExamenFisico.getString("BA_Sensibilidad_Dedos_Pie_D");
		String BA_Sensibilidad_Dedos_Pie_I = jsonExamenFisico.getString("BA_Sensibilidad_Dedos_Pie_I");
		String BA_Sensibilidad_Hombros_D = jsonExamenFisico.getString("BA_Sensibilidad_Hombros_D");
		String BA_Sensibilidad_Hombros_I = jsonExamenFisico.getString("BA_Sensibilidad_Hombros_I");
		String BA_Sensibilidad_Munecas_D = jsonExamenFisico.getString("BA_Sensibilidad_Munecas_D");
		String BA_Sensibilidad_Munecas_I = jsonExamenFisico.getString("BA_Sensibilidad_Munecas_I");
		String BA_Sensibilidad_Rodilla_D = jsonExamenFisico.getString("BA_Sensibilidad_Rodilla_D");
		String BA_Sensibilidad_Rodilla_I = jsonExamenFisico.getString("BA_Sensibilidad_Rodilla_I");
		String BA_Sensibilidad_Tobillos_D = jsonExamenFisico.getString("BA_Sensibilidad_Tobillos_D");
		String BA_Sensibilidad_Tobillos_I = jsonExamenFisico.getString("BA_Sensibilidad_Tobillos_I");
		String BM_Antebrazo = jsonExamenFisico.getString("BM_Antebrazo");
		String BM_Antebrazo_Observaciones = jsonExamenFisico.getString("BM_Antebrazo_Observaciones");
		String BM_Brazo = jsonExamenFisico.getString("BM_Brazo");
		String BM_Brazo_Observaciones = jsonExamenFisico.getString("BM_Brazo_Observaciones");
		String BM_Cadera_Gluteo = jsonExamenFisico.getString("BM_Cadera_Gluteo");
		String BM_Cadera_Gluteo_Observaciones = jsonExamenFisico.getString("BM_Cadera_Gluteo_Observaciones");
		String BM_Cintura_Escapular = jsonExamenFisico.getString("BM_Cintura_Escapular");
		String BM_Cintura_Escapular_Observaciones = jsonExamenFisico.getString("BM_Cintura_Escapular_Observaciones");
		String BM_Explicacion = jsonExamenFisico.getString("BM_Explicacion");
		String BM_Muslos = jsonExamenFisico.getString("BM_Muslos");
		String BM_Muslos_Observaciones = jsonExamenFisico.getString("BM_Muslos_Observaciones");
		String BM_Pectoral = jsonExamenFisico.getString("BM_Pectoral");
		String BM_Pectoral_Observaciones = jsonExamenFisico.getString("BM_Pectoral_Observaciones");
		String BM_Piernas = jsonExamenFisico.getString("BM_Piernas");
		String BM_Piernas_Observaciones = jsonExamenFisico.getString("BM_Piernas_Observaciones");
		String CabezaCuello = jsonExamenFisico.getString("CabezaCuello");
		String CabezaCuello_Descripcion = jsonExamenFisico.getString("CabezaCuello_Descripcion");
		String Columna = jsonExamenFisico.getString("Columna");
		String ColumnaInspeccionCurvatura = jsonExamenFisico.getString("ColumnaInspeccionCurvatura");
		String ColumnaInspeccionCurvatura_Descripcion = jsonExamenFisico.getString("ColumnaInspeccionCurvatura_Descripcion");
		String ColumnaInspeccionSimetria = jsonExamenFisico.getString("ColumnaInspeccionSimetria");
		String ColumnaInspeccionSimetria_Descripcion = jsonExamenFisico.getString("ColumnaInspeccionSimetria_Descripcion");
		String ColumnaMarchaPuntas = jsonExamenFisico.getString("ColumnaMarchaPuntas");
		String ColumnaMarchaPuntas_Descripcion = jsonExamenFisico.getString("ColumnaMarchaPuntas_Descripcion");
		String ColumnaMarchaTalones = jsonExamenFisico.getString("ColumnaMarchaTalones");
		String ColumnaMarchaTalones_Descripcion = jsonExamenFisico.getString("ColumnaMarchaTalones_Descripcion");
		String ColumnaMovilidadExtension = jsonExamenFisico.getString("ColumnaMovilidadExtension");
		String ColumnaMovilidadExtension_Descripcion = jsonExamenFisico.getString("ColumnaMovilidadExtension_Descripcion");
		String ColumnaMovilidadFlexion = jsonExamenFisico.getString("ColumnaMovilidadFlexion");
		String ColumnaMovilidadFlexion_Descripcion = jsonExamenFisico.getString("ColumnaMovilidadFlexion_Descripcion");
		String ColumnaMovilidadFlexionLateral = jsonExamenFisico.getString("ColumnaMovilidadFlexionLateral");
		String ColumnaMovilidadFlexionLateral_Descripcion = jsonExamenFisico.getString("ColumnaMovilidadFlexionLateral_Descripcion");
		String ColumnaMovilidadRotacion = jsonExamenFisico.getString("ColumnaMovilidadRotacion");
		String ColumnaMovilidadRotacion_Descripcion = jsonExamenFisico.getString("ColumnaMovilidadRotacion_Descripcion");
		String ColumnaPalpacionDolor = jsonExamenFisico.getString("ColumnaPalpacionDolor");
		String ColumnaPalpacionDolor_Descripcion = jsonExamenFisico.getString("ColumnaPalpacionDolor_Descripcion");
		String ColumnaPalpacionEspasmo = jsonExamenFisico.getString("ColumnaPalpacionEspasmo");
		String ColumnaPalpacionEspasmo_Descripcion = jsonExamenFisico.getString("ColumnaPalpacionEspasmo_Descripcion");
		String ColumnaTrofismoMuscular = jsonExamenFisico.getString("ColumnaTrofismoMuscular");
		String ColumnaTrofismoMuscular_Descripcion = jsonExamenFisico.getString("ColumnaTrofismoMuscular_Descripcion");
		String Dominancia = jsonExamenFisico.getString("Dominancia");
		String EstadoGeneral = jsonExamenFisico.getString("EstadoGeneral");
		String ExtremidadInferior = jsonExamenFisico.getString("ExtremidadInferior");
		String ExtremidadInferior_Descripcion = jsonExamenFisico.getString("ExtremidadInferior_Descripcion");
		String ExtremidadInferior_Juanetes = jsonExamenFisico.getString("ExtremidadInferior_Juanetes");
		String ExtremidadInferior_Observaciones = jsonExamenFisico.getString("ExtremidadInferior_Observaciones");
		String ExtremidadInferior_Varices = jsonExamenFisico.getString("ExtremidadInferior_Varices");
		String ExtremidadSuperior = jsonExamenFisico.getString("ExtremidadSuperior");
		String ExtremidadSuperior_Descripcion = jsonExamenFisico.getString("ExtremidadSuperior_Descripcion");
		String ExtremidadSuperior_FinkelsteinDerecho = jsonExamenFisico.getString("ExtremidadSuperior_FinkelsteinDerecho");
		String ExtremidadSuperior_FinkelsteinIzquierdo = jsonExamenFisico.getString("ExtremidadSuperior_FinkelsteinIzquierdo");
		String ExtremidadSuperior_PhalenDerecho = jsonExamenFisico.getString("ExtremidadSuperior_PhalenDerecho");
		String ExtremidadSuperior_PhalenIzquierdo = jsonExamenFisico.getString("ExtremidadSuperior_PhalenIzquierdo");
		String ExtremidadSuperior_TinelDerecho = jsonExamenFisico.getString("ExtremidadSuperior_TinelDerecho");
		String ExtremidadSuperior_TinelIzquierdo = jsonExamenFisico.getString("ExtremidadSuperior_TinelIzquierdo");
		String FondoOjoDerecho = jsonExamenFisico.getString("FondoOjoDerecho");
		String FondoOjoIzquierdo = jsonExamenFisico.getString("FondoOjoIzquierdo");
		String FondoOjos_Descripcion = jsonExamenFisico.getString("FondoOjos_Descripcion");
		String GenitalesExternos = jsonExamenFisico.getString("GenitalesExternos");
		String GenitalesExternos_Descripcion = jsonExamenFisico.getString("GenitalesExternos_Descripcion");
		String GenitalesExternos_Hernias = jsonExamenFisico.getString("GenitalesExternos_Hernias");
		String Neurologico = jsonExamenFisico.getString("Neurologico");
		String Neurologico_Cordinacion_MarchaEnLinea = jsonExamenFisico.getString("Neurologico_Cordinacion_MarchaEnLinea");
		String Neurologico_Cordinacion_Observaciones = jsonExamenFisico.getString("Neurologico_Cordinacion_Observaciones");
		String Neurologico_Cordinacion_Romberg = jsonExamenFisico.getString("Neurologico_Cordinacion_Romberg");
		String Neurologico_EsferaMental = jsonExamenFisico.getString("Neurologico_EsferaMental");
		String Neurologico_ParesCraneanos = jsonExamenFisico.getString("Neurologico_ParesCraneanos");
		String Neurologico_Reflejos = jsonExamenFisico.getString("Neurologico_Reflejos");
		String Neurologico_Sensibilidad = jsonExamenFisico.getString("Neurologico_Sensibilidad");
		String Oidos = jsonExamenFisico.getString("Oidos");
		String Oidos_Descripcion = jsonExamenFisico.getString("Oidos_Descripcion");
		String Ojos = jsonExamenFisico.getString("Ojos");
		String Ojos_Descripcion = jsonExamenFisico.getString("Ojos_Descripcion");
		String Piel = jsonExamenFisico.getString("Piel");
		String Piel_Descripcion = jsonExamenFisico.getString("Piel_Descripcion");
		String PruebaVertibular = jsonExamenFisico.getString("PruebaVertibular");
		String PruebaVertibular_descripcion = jsonExamenFisico.getString("PruebaVertibular_descripcion");
		String Psicologico = jsonExamenFisico.getString("Psicologico");
		String Psicometrico = jsonExamenFisico.getString("Psicometrico");
		String PsicometricosObservaciones = jsonExamenFisico.getString("PsicometricosObservaciones");
		String RayosX = jsonExamenFisico.getString("RayosX");
		String RayosX2 = jsonExamenFisico.getString("RayosX2");
		String RayosXObservaciones = jsonExamenFisico.getString("RayosXObservaciones");
		String RayosXObservaciones2 = jsonExamenFisico.getString("RayosXObservaciones2");
		String Reflejos_Osteotendinosos_1 = jsonExamenFisico.getString("Reflejos_Osteotendinosos_1");
		String Reflejos_Osteotendinosos_2 = jsonExamenFisico.getString("Reflejos_Osteotendinosos_2");
		String Reflejos_Osteotendinosos_3 = jsonExamenFisico.getString("Reflejos_Osteotendinosos_3");
		String Reflejos_Osteotendinosos_4 = jsonExamenFisico.getString("Reflejos_Osteotendinosos_4");
		String Reflejos_Osteotendinosos_5 = jsonExamenFisico.getString("Reflejos_Osteotendinosos_5");
		String Reflejos_Osteotendinosos_6 = jsonExamenFisico.getString("Reflejos_Osteotendinosos_6");
		String Reflejos_Osteotendinosos_7 = jsonExamenFisico.getString("Reflejos_Osteotendinosos_7");
		String Reflejos_Osteotendinosos_8 = jsonExamenFisico.getString("Reflejos_Osteotendinosos_8");
		String RsCs = jsonExamenFisico.getString("RsCs");
		String RsCs_Descripcion = jsonExamenFisico.getString("RsCs_Descripcion");
		String RsRs = jsonExamenFisico.getString("RsRs");
		String Senos = jsonExamenFisico.getString("Senos");
		String Shober = jsonExamenFisico.getString("Shober");
		String Shower_Descripcion = jsonExamenFisico.getString("Shower_Descripcion");
		String Torax = jsonExamenFisico.getString("Torax");
		String Wells = jsonExamenFisico.getString("Wells");
		String Wells_Descripcion = jsonExamenFisico.getString("Wells_Descripcion");
		String FC = jsonExamenFisico.getString("FC");
		String fk_DocumentoMD = jsonExamenFisico.getString("fk_DocumentoMD");
		int fk_IDT_DocumentoID = IDHC;
		String FR = jsonExamenFisico.getString("FR");
		String Fuerza_1 = jsonExamenFisico.getString("Fuerza_1");
		String Fuerza_2 = jsonExamenFisico.getString("Fuerza_2");
		String Fuerza_3 = jsonExamenFisico.getString("Fuerza_3");
		String Fuerza_4 = jsonExamenFisico.getString("Fuerza_4");
		String Fuerza_5 = jsonExamenFisico.getString("Fuerza_5");
		String Fuerza_6 = jsonExamenFisico.getString("Fuerza_6");
		String Fuerza_7 = jsonExamenFisico.getString("Fuerza_7");
		String Fuerza_8 = jsonExamenFisico.getString("Fuerza_8");
		String PerimetroAbdominal = jsonExamenFisico.getString("PerimetroAbdominal");
		String Peso = jsonExamenFisico.getString("Peso");
		String T = jsonExamenFisico.getString("T");
		String TAD = jsonExamenFisico.getString("TAD");
		String Talla = jsonExamenFisico.getString("Talla");
		String TAS = jsonExamenFisico.getString("TAS");
		String FechaDeDiligenciamiento = jsonExamenFisico.getString("FechaDeDiligenciamiento");
		String FechaDeModificacion = jsonExamenFisico.getString("FechaDeModificacion");
		
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(FechaDeModificacion);
		}
		
		ExamenFisico examenFisico = new ExamenFisico(Abdomen, Abdomen_Descripcion, Abdomen_Hernias, BA_Calor_Cadera_D, BA_Calor_Cadera_I, 
				BA_Calor_Codos_D, BA_Calor_Codos_I, BA_Calor_Dedos_Mano_D, BA_Calor_Dedos_Mano_I, BA_Calor_Dedos_Pie_D, BA_Calor_Dedos_Pie_I, 
				BA_Calor_Hombros_D, BA_Calor_Hombros_I, BA_Calor_Munecas_D, BA_Calor_Munecas_I, BA_Calor_Rodilla_D, BA_Calor_Rodilla_I, 
				BA_Calor_Tobillos_D, BA_Calor_Tobillos_I, BA_Deformidad_Cadera_D, BA_Deformidad_Cadera_I, BA_Deformidad_Codos_D, 
				BA_Deformidad_Codos_I, BA_Deformidad_Dedos_Mano_D, BA_Deformidad_Dedos_Mano_I, BA_Deformidad_Dedos_Pie_D, 
				BA_Deformidad_Dedos_Pie_I, BA_Deformidad_Hombros_D, BA_Deformidad_Hombros_I, BA_Deformidad_Munecas_D, BA_Deformidad_Munecas_I,
				BA_Deformidad_Rodilla_D, BA_Deformidad_Rodilla_I, BA_Deformidad_Tobillos_D, BA_Deformidad_Tobillos_I, BA_Dolor_Cadera_D, BA_Dolor_Cadera_I,
				BA_Dolor_Codos_D, BA_Dolor_Codos_I, BA_Dolor_Dedos_Mano_D, BA_Dolor_Dedos_Mano_I, BA_Dolor_Dedos_Pie_D, BA_Dolor_Dedos_Pie_I, 
				BA_Dolor_Hombros_D, BA_Dolor_Hombros_I, BA_Dolor_Munecas_D, BA_Dolor_Munecas_I, BA_Dolor_Rodilla_D, BA_Dolor_Rodilla_I, 
				BA_Dolor_Tobillos_D, BA_Dolor_Tobillos_I, BA_Edema_Cadera_D, BA_Edema_Cadera_I, BA_Edema_Codos_D, BA_Edema_Codos_I, 
				BA_Edema_Dedos_Mano_D, BA_Edema_Dedos_Mano_I, BA_Edema_Dedos_Pie_D, BA_Edema_Dedos_Pie_I, BA_Edema_Hombros_D, 
				BA_Edema_Hombros_I, BA_Edema_Munecas_D, BA_Edema_Munecas_I, BA_Edema_Rodilla_D, BA_Edema_Rodilla_I, BA_Edema_Tobillos_D, 
				BA_Edema_Tobillos_I, BA_Explicacion, BA_Limitacion_Arcos_Cadera_D, BA_Limitacion_Arcos_Cadera_I, BA_Limitacion_Arcos_Codos_D,
				BA_Limitacion_Arcos_Codos_I, BA_Limitacion_Arcos_Dedos_Mano_D, BA_Limitacion_Arcos_Dedos_Mano_I, BA_Limitacion_Arcos_Dedos_Pie_D, 
				BA_Limitacion_Arcos_Dedos_Pie_I, BA_Limitacion_Arcos_Hombros_D, BA_Limitacion_Arcos_Hombros_I, BA_Limitacion_Arcos_Munecas_D, 
				BA_Limitacion_Arcos_Munecas_I, BA_Limitacion_Arcos_Rodilla_D, BA_Limitacion_Arcos_Rodilla_I, BA_Limitacion_Arcos_Tobillos_D, 
				BA_Limitacion_Arcos_Tobillos_I, BA_Rubor_Cadera_D, BA_Rubor_Cadera_I, BA_Rubor_Codos_D, BA_Rubor_Codos_I, BA_Rubor_Dedos_Mano_D, 
				BA_Rubor_Dedos_Mano_I, BA_Rubor_Dedos_Pie_D, BA_Rubor_Dedos_Pie_I, BA_Rubor_Hombros_D, BA_Rubor_Hombros_I, BA_Rubor_Munecas_D, 
				BA_Rubor_Munecas_I, BA_Rubor_Rodilla_D, BA_Rubor_Rodilla_I, BA_Rubor_Tobillos_D, BA_Rubor_Tobillos_I, BA_Sensibilidad_Cadera_D, 
				BA_Sensibilidad_Cadera_I, BA_Sensibilidad_Codos_D, BA_Sensibilidad_Codos_I, BA_Sensibilidad_Dedos_Mano_D, BA_Sensibilidad_Dedos_Mano_I,
				BA_Sensibilidad_Dedos_Pie_D, BA_Sensibilidad_Dedos_Pie_I, BA_Sensibilidad_Hombros_D, BA_Sensibilidad_Hombros_I,
				BA_Sensibilidad_Munecas_D, BA_Sensibilidad_Munecas_I, BA_Sensibilidad_Rodilla_D, BA_Sensibilidad_Rodilla_I, BA_Sensibilidad_Tobillos_D, 
				BA_Sensibilidad_Tobillos_I, BM_Antebrazo, BM_Antebrazo_Observaciones, BM_Brazo, BM_Brazo_Observaciones, BM_Cadera_Gluteo, 
				BM_Cadera_Gluteo_Observaciones, BM_Cintura_Escapular, BM_Cintura_Escapular_Observaciones, BM_Explicacion, BM_Muslos, 
				BM_Muslos_Observaciones, BM_Pectoral, BM_Pectoral_Observaciones, BM_Piernas, BM_Piernas_Observaciones, CabezaCuello, 
				CabezaCuello_Descripcion, Columna, ColumnaInspeccionCurvatura, ColumnaInspeccionCurvatura_Descripcion, ColumnaInspeccionSimetria, 
				ColumnaInspeccionSimetria_Descripcion, ColumnaMarchaPuntas, ColumnaMarchaPuntas_Descripcion, ColumnaMarchaTalones, 
				ColumnaMarchaTalones_Descripcion, ColumnaMovilidadExtension, ColumnaMovilidadExtension_Descripcion, ColumnaMovilidadFlexion, 
				ColumnaMovilidadFlexion_Descripcion, ColumnaMovilidadFlexionLateral, ColumnaMovilidadFlexionLateral_Descripcion, 
				ColumnaMovilidadRotacion, ColumnaMovilidadRotacion_Descripcion, ColumnaPalpacionDolor, ColumnaPalpacionDolor_Descripcion, 
				ColumnaPalpacionEspasmo, ColumnaPalpacionEspasmo_Descripcion, ColumnaTrofismoMuscular, ColumnaTrofismoMuscular_Descripcion, Dominancia, 
				EstadoGeneral, ExtremidadInferior, ExtremidadInferior_Descripcion, ExtremidadInferior_Juanetes, ExtremidadInferior_Observaciones, 
				ExtremidadInferior_Varices, ExtremidadSuperior, ExtremidadSuperior_Descripcion, ExtremidadSuperior_FinkelsteinDerecho, 
				ExtremidadSuperior_FinkelsteinIzquierdo, ExtremidadSuperior_PhalenDerecho, ExtremidadSuperior_PhalenIzquierdo, 
				ExtremidadSuperior_TinelDerecho, ExtremidadSuperior_TinelIzquierdo, FondoOjoDerecho, FondoOjoIzquierdo, FondoOjos_Descripcion, 
				GenitalesExternos, GenitalesExternos_Descripcion, GenitalesExternos_Hernias, Neurologico, Neurologico_Cordinacion_MarchaEnLinea, 
				Neurologico_Cordinacion_Observaciones, Neurologico_Cordinacion_Romberg, Neurologico_EsferaMental, Neurologico_ParesCraneanos, 
				Neurologico_Reflejos, Neurologico_Sensibilidad, Oidos, Oidos_Descripcion, Ojos, Ojos_Descripcion, Piel, Piel_Descripcion, 
				PruebaVertibular, PruebaVertibular_descripcion, Psicologico, Psicometrico, PsicometricosObservaciones, RayosX, RayosX2, 
				RayosXObservaciones, RayosXObservaciones2, Reflejos_Osteotendinosos_1, Reflejos_Osteotendinosos_2, Reflejos_Osteotendinosos_3, 
				Reflejos_Osteotendinosos_4, Reflejos_Osteotendinosos_5, Reflejos_Osteotendinosos_6, Reflejos_Osteotendinosos_7, 
				Reflejos_Osteotendinosos_8, RsCs, RsCs_Descripcion, RsRs, Senos, Shober, Shower_Descripcion, Torax, Wells, Wells_Descripcion,
				Integer.parseInt(FC), Integer.parseInt(fk_DocumentoMD), fk_IDT_DocumentoID, Integer.parseInt(FR), Integer.parseInt(Fuerza_1), 
				Integer.parseInt(Fuerza_2), Integer.parseInt(Fuerza_3), Integer.parseInt(Fuerza_4), Integer.parseInt(Fuerza_5), 
				Integer.parseInt(Fuerza_6), Integer.parseInt(Fuerza_7), Integer.parseInt(Fuerza_8), Integer.parseInt(PerimetroAbdominal), 
				Integer.parseInt(Peso), Integer.parseInt(T), Integer.parseInt(TAD), Integer.parseInt(Talla), Integer.parseInt(TAS), 
				dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		ExamenFisicoDao dao = new ExamenFisicoDao();
		boolean result = dao.insertExamenFisico(examenFisico);
		return result;
	}
	
	public boolean generarJsonManipulacionAlimentos(JSONObject jsonManipulacionA, int IDHC) throws ParseException{
		
		String DermatologicoA = jsonManipulacionA.getString("DermatologicoA");
		String DermatologicoB = jsonManipulacionA.getString("DermatologicoB");
		String DermatologicoBCual = jsonManipulacionA.getString("DermatologicoBCual");
		String Lesiones = jsonManipulacionA.getString("Lesiones");
		String Observaciones = jsonManipulacionA.getString("Observaciones");
		String Respiratorio = jsonManipulacionA.getString("Respiratorio");
		String Respiratorio_Ascultacion = jsonManipulacionA.getString("Respiratorio_Ascultacion");
		String Respiratorio_Inspeccion = jsonManipulacionA.getString("Respiratorio_Inspeccion");
		String Solicitado = jsonManipulacionA.getString("Solicitado");
		int _fk_IDT_DocumentoID = IDHC;
		String FechaDeDiligenciamiento = jsonManipulacionA.getString("FechaDeDiligenciamiento");
		String FechaDeModificacion = jsonManipulacionA.getString("FechaDeModificacion");
		
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(FechaDeModificacion);
		}
		ManipulacionAlimentos manipulacionAlimentos = new ManipulacionAlimentos(DermatologicoA, DermatologicoB, DermatologicoBCual, Lesiones, 
				Observaciones, Respiratorio, Respiratorio_Ascultacion, Respiratorio_Inspeccion, Solicitado, _fk_IDT_DocumentoID, 
				dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		ManipulacionAlimentoDao alimentoDao = new ManipulacionAlimentoDao();
		boolean result = alimentoDao.insertManipulacionAlimento(manipulacionAlimentos);
		
		return result;
	}
	
	public boolean generarJsonRevisionSistema(JSONObject jsonRevisionS, int IDHC) throws ParseException{
		
		String Cardiovascular = jsonRevisionS.getString("Cardiovascular");
		String Desmatologico = jsonRevisionS.getString("Dermatologico");
		String Diagnostico = jsonRevisionS.getString("Diagnostico");
		String Digestivo = jsonRevisionS.getString("Digestivo");
		String Genitourinario = jsonRevisionS.getString("Genitourinario");
		String Hematologico = jsonRevisionS.getString("Hematologico");
		String Neurologico = jsonRevisionS.getString("Neurologico");
		String Observaciones = jsonRevisionS.getString("Observaciones");
		String Osteomuscular = jsonRevisionS.getString("Osteomuscular");
		String Osteomuscular_Otras = jsonRevisionS.getString("Osteomuscular_Otras");
		String Psiquiatrico = jsonRevisionS.getString("Psiquiatrico");
		String Respiratorio = jsonRevisionS.getString("Respiratorio");
		String _fk_DocumentoMD = jsonRevisionS.getString("_fk_DocumentoMD");
		int _fk_IDT_DocumentoID = IDHC;
		String FechaDeDiligenciamiento = jsonRevisionS.getString("FechaDeDiligenciamiento");
		String FechaDeModificacion = jsonRevisionS.getString("FechaDeModificacion");
		
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(FechaDeModificacion);
		}
		
		RevisionPorSistemas revisionPorSistemas = new RevisionPorSistemas(Cardiovascular, Desmatologico, Diagnostico, Digestivo, Genitourinario,
				Hematologico, Neurologico, Observaciones, Osteomuscular, Osteomuscular_Otras, Psiquiatrico, Respiratorio, 
				Integer.parseInt(_fk_DocumentoMD), _fk_IDT_DocumentoID, dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		RevisionPorSistemaDao dao = new RevisionPorSistemaDao();
		boolean result = dao.insertRevisionSistema(revisionPorSistemas);
		
		return result;
	}
	
	public boolean generarJsonHabito(JSONObject jsonRevisionS, int iDHC) throws ParseException {
		
		String Alcohol = jsonRevisionS.getString("Alcohol");
		String AlcoholCantidad = jsonRevisionS.getString("AlcoholCantidad");
		String AlcoholFrecuencia = jsonRevisionS.getString("AlcoholFrecuencia");
		String Deporte = jsonRevisionS.getString("Deporte");
		String DeporteCual = jsonRevisionS.getString("DeporteCual");
		String DeporteFrecuencia = jsonRevisionS.getString("DeporteFrecuencia");
		String DeporteLesiones = jsonRevisionS.getString("DeporteLesiones");
		String DeporteLesionesCual = jsonRevisionS.getString("DeporteLesionesCual");
		String ExFumador = jsonRevisionS.getString("ExFumador");
		String Fumador = jsonRevisionS.getString("Fumador");
		String Sedentarismo = jsonRevisionS.getString("Sedentarismo");
		String SedentarismoFrecuencia = jsonRevisionS.getString("SedentarismoFrecuencia");
		String SustanciasPsicoactivas = jsonRevisionS.getString("SustanciasPsicoactivas");
		String SustanciasPsicoactivasCual = jsonRevisionS.getString("SustanciasPsicoactivasCual");
		String SustanciasPsicoactivasFrecuencia = jsonRevisionS.getString("SustanciasPsicoactivasFrecuencia");
		String CantidadCigarrillosDia = jsonRevisionS.getString("CantidadCigarrillosDia");
		int fk_IDT_DocumentoID = iDHC;
		String TiempoFumador = jsonRevisionS.getString("TiempoFumador");
		String FechaDeDiligenciamiento = jsonRevisionS.getString("FechaDeDiligenciamiento");
		String FechaDeModificacion = jsonRevisionS.getString("FechaDeModificacion");
		
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(FechaDeModificacion);
		}
		
		Habito habito = new Habito(Alcohol, AlcoholCantidad, AlcoholFrecuencia, Deporte, DeporteCual, DeporteFrecuencia, DeporteLesiones, 
				DeporteLesionesCual, ExFumador, Fumador, Sedentarismo, SedentarismoFrecuencia, SustanciasPsicoactivas, 
				SustanciasPsicoactivasCual, SustanciasPsicoactivasFrecuencia, Integer.parseInt(CantidadCigarrillosDia), 
				fk_IDT_DocumentoID, Integer.parseInt(TiempoFumador), dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		HabitoDao dao = new HabitoDao();
		boolean result = dao.insertHabito(habito);
		return result;
	}
	
	public boolean generarJsonResultados(JSONObject jsonResultado, int IDHC) throws ParseException{
		
		String Aplazado = jsonResultado.getString("Aplazado");
		String Aplazado_Motivo = jsonResultado.getString("Aplazado_Motivo");
		String AptoConRestriccion = jsonResultado.getString("AptoConRestriccion");
		String AptoConRestriccion_Motivo = jsonResultado.getString("AptoConRestriccion_Motivo");
		String AptoParaElCargo = jsonResultado.getString("AptoParaElCargo");
		String ConPatologiaQueNoLimitaLabor = jsonResultado.getString("ConPatologiaQueNoLimitaLabor");
		String NoApto = jsonResultado.getString("NoApto");
		String NoApto_Motivo = jsonResultado.getString("NoApto_Motivo");
		String Otros_escribir = jsonResultado.getString("Otros_escribir");
		String PuedoContinuarConSuLabor = jsonResultado.getString("PuedoContinuarConSuLabor");
		String SeSugiereReubicacionLaboral = jsonResultado.getString("SeSugiereReubicacionLaboral");
		String SinPatologiaAparente = jsonResultado.getString("SinPatologiaAparente");
		int _fk_IDT_DocumentoID = IDHC;
		String _fk_IDT_DocumentoMD = jsonResultado.getString("_fk_IDT_DocumentoMD");
		String FechaDeDiligenciamiento = jsonResultado.getString("FechaDeDiligenciamiento");
		String FechaDeModificacion = jsonResultado.getString("FechaDeModificacion");
		
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(FechaDeModificacion);
		}
		
		Resultado resultado = new Resultado(Aplazado, Aplazado_Motivo, AptoConRestriccion, AptoConRestriccion_Motivo, AptoParaElCargo, 
				ConPatologiaQueNoLimitaLabor, NoApto, NoApto_Motivo, Otros_escribir, PuedoContinuarConSuLabor, SeSugiereReubicacionLaboral, 
				SinPatologiaAparente, _fk_IDT_DocumentoID, Integer.parseInt(_fk_IDT_DocumentoMD), dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		ResultadoDao dao = new ResultadoDao();
		boolean result = dao.insertResultado(resultado);
		return result;
	}
	
	public boolean generarJsonImpresionDiag(JSONObject jsonImpresionD, int IDHC)throws ParseException{
		
		String Diagnostico = jsonImpresionD.getString("Diagnostico");
		String SospechaDeOrigen = jsonImpresionD.getString("SospechaDeOrigen");
		String TipoDeDiagnostico = jsonImpresionD.getString("TipoDeDiagnostico");
		String _fk_CIE10 = jsonImpresionD.getString("_fk_CIE10");
		int _fk_IDT_DocumentoID = IDHC;
		String FechaDeDiligenciamiento = jsonImpresionD.getString("FechaDeDiligenciamiento");
		String FechaDeModificacion = jsonImpresionD.getString("FechaDeModificacion");
		
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(FechaDeModificacion);
		}
		ImpresionDiagnostica impresionDiagnostica = new ImpresionDiagnostica(Diagnostico, SospechaDeOrigen, TipoDeDiagnostico, 
				Integer.parseInt(_fk_CIE10), _fk_IDT_DocumentoID, dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		ImpresionDiagnosticaDao dao = new ImpresionDiagnosticaDao();
		boolean result = dao.insertImpresionDiagnostica(impresionDiagnostica);
		return result;
	}
	
	public boolean generarJsonParaclinicos(JSONObject jsonParaclinicos, int IDHC)throws ParseException{
		
		String AlteracionCorregida = jsonParaclinicos.getString("AlteracionCorregida");
		String Audiometria = jsonParaclinicos.getString("Audiometria");
		String Audiometria_Resultado = jsonParaclinicos.getString("Audiometria_Resultado");
		String Audiometria_Resultado_Observaciones = jsonParaclinicos.getString("Audiometria_Resultado_Observaciones");
		String Espirometria = jsonParaclinicos.getString("Espirometria");
		String Espirometria_Resultado = jsonParaclinicos.getString("Espirometria_Resultado");
		String Espirometria_Resultado_Observaciones = jsonParaclinicos.getString("Espirometria_Resultado_Observaciones");
		String ExamenLaboratorioDX = jsonParaclinicos.getString("ExamenLaboratorioDX");
		String Observaciones = jsonParaclinicos.getString("Observaciones");
		String Optometria = jsonParaclinicos.getString("Optometria");
		String Optometria_Visiometria_Diagnostico = jsonParaclinicos.getString("Optometria_Visiometria_Diagnostico");
		String Visiometria = jsonParaclinicos.getString("Visiometria");
		String _fk_CodigoExamen = jsonParaclinicos.getString("_fk_CodigoExamen");
		int _fk_IDT_DocumentoID = IDHC;
		String FechaDeDiligenciamiento = jsonParaclinicos.getString("FechaDeDiligenciamiento");
		String FechaDeModificacion = jsonParaclinicos.getString("FechaDeModificacion");
		
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(FechaDeModificacion);
		}
		
		Paraclinico paraclinico = new Paraclinico(AlteracionCorregida, Audiometria, Audiometria_Resultado, Audiometria_Resultado_Observaciones, 
				Espirometria, Espirometria_Resultado, Espirometria_Resultado_Observaciones, ExamenLaboratorioDX, Observaciones, Optometria, 
				Optometria_Visiometria_Diagnostico, Visiometria, Integer.parseInt(_fk_CodigoExamen), _fk_IDT_DocumentoID, dateFechaDeDiligenciamiento, 
				dateFechaDeModificacion);
		ParaclinicoDao dao = new ParaclinicoDao();
		boolean result = dao.insertParaclinico(paraclinico);
		return result;
	}
	
	public JSONObject generarJsonEmpresa(JSONObject jsonEmpresa, int IDHC) throws ParseException{
		
		String ActividadEconomica = jsonEmpresa.getString("ActividadEconomica");
		String direccion = jsonEmpresa.getString("direccion");
		String Nombre = jsonEmpresa.getString("Nombre");
		String  telefono = jsonEmpresa.getString(" telefono");
		int fk_IDT_DocumentoID = IDHC;
		String nit = jsonEmpresa.getString("nit");
		String  pk_nit = jsonEmpresa.getString(" pk_nit");
		String FechaDeDiligenciamiento = jsonEmpresa.getString("FechaDeDiligenciamiento");
		String FechaDeModificacion = jsonEmpresa.getString("FechaDeModificacion");
		
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(FechaDeModificacion);
		}
		
		Empresa empresa = new Empresa(ActividadEconomica, direccion, Nombre, telefono, fk_IDT_DocumentoID, Integer.parseInt(nit), 
				Integer.parseInt(pk_nit), dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		EmpresaDao dao = new EmpresaDao();
		boolean resultEmpresa = dao.insertEmpresa(empresa);
		JSONObject jsonResult = new JSONObject();
		if (resultEmpresa) {
			jsonResult.put("Empresa", 1);
			int IDE = dao.obtenerID();
			JSONObject jsonCargo = jsonEmpresa.getJSONObject("cargo");
			boolean cargo = generarJsonCargo(jsonCargo, IDE);
			if (cargo) {
				jsonResult.put("Cargo", 1);
			}else {
				jsonResult.put("Cargo", 0);
			}
				JSONObject jsonDatoOcupacional = jsonEmpresa.getJSONObject("datosocupacionales");
				boolean datoOcupacional = generarJsonDatosOcupacionales(jsonDatoOcupacional, IDE);
				if (datoOcupacional) {
					jsonResult.put("Dato ocupacional", 1);
				}else {
					jsonResult.put("Dato ocupacional", 0);
				}
		}else {
			jsonResult.put("Empresa", 0);
		}
		return jsonResult;
	}
	
	public boolean generarJsonDatosOcupacionales(JSONObject jsonDatosOcupacionales, int IDE) throws ParseException{
		
		String Biologicos = jsonDatosOcupacionales.getString("Biologicos");
		String Ergonomicos = jsonDatosOcupacionales.getString("Ergonomicos");
		String Fisicos = jsonDatosOcupacionales.getString("Fisicos");
		String Otros = jsonDatosOcupacionales.getString("Otros");
		String Psicosociales = jsonDatosOcupacionales.getString("Psicosociales");
		String Quimicos = jsonDatosOcupacionales.getString("Quimicos");
		String Seguridad = jsonDatosOcupacionales.getString("Seguridad");
		String fk_IDT_DocumentoID = jsonDatosOcupacionales.getString("fk_IDT_DocumentoID");
		int fk_NIT = IDE;
		String TiempoExposicion = jsonDatosOcupacionales.getString("TiempoExposicion");
		String FechaDeDiligenciamiento = jsonDatosOcupacionales.getString("FechaDeDiligenciamiento");
		String FechaDeModificacion = jsonDatosOcupacionales.getString("FechaDeModificacion");
		
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(FechaDeModificacion);
		}
		
		DatoOcupacional datoOcupacional = new DatoOcupacional(Biologicos, Ergonomicos, Fisicos, Otros, Psicosociales, Quimicos, Seguridad, 
				Integer.parseInt(fk_IDT_DocumentoID), fk_NIT, Integer.parseInt(TiempoExposicion), dateFechaDeDiligenciamiento, 
				dateFechaDeModificacion);
		DatoOcupacionalDao dao = new DatoOcupacionalDao();
		boolean result = dao.insertDatoOcupacional(datoOcupacional);
		return result;
	}
	
	public boolean generarJsonCargo(JSONObject jsonCargos, int IDE) throws ParseException{
		
		String Area = jsonCargos.getString("Area");
		String Cargo = jsonCargos.getString("Cargo");
		String CargoEvaluar = jsonCargos.getString("CargoEvaluar");
		String ElementosDeProteccion = jsonCargos.getString("ElementosDeProteccion");
		String Empresa = jsonCargos.getString("Empresa");
		String JornadaDeTrabajo = jsonCargos.getString("JornadaDeTrabajo");
		String unidad = jsonCargos.getString("unidad");
		String Antiguedad = jsonCargos.getString("Antiguedad");
		String CargoTiempo = jsonCargos.getString("CargoTiempo");
		String fk_IDT_DocumentoID = jsonCargos.getString("fk_IDT_DocumentoID");
		int fk_NIT = IDE;
		String HorasTrabajadas = jsonCargos.getString("HorasTrabajadas");
		String FechaIngreso = jsonCargos.getString("FechaIngreso");
		String FechaRetiro = jsonCargos.getString("FechaRetiro");
		String FechaDeDiligenciamiento = jsonCargos.getString("FechaDeDiligenciamiento");
		String FechaDeModificacion = jsonCargos.getString("FechaDeModificacion");
		
		java.util.Date dateFechaIngreso = null;
		try {
			dateFechaIngreso = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaIngreso);
		} catch (Exception e) {
			dateFechaIngreso = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaIngreso);
		}
		java.util.Date dateFechaRetiro =null;
		try {
			dateFechaRetiro = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaRetiro);
		} catch (Exception e) {
			dateFechaRetiro = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(FechaRetiro);
		}
		java.util.Date dateFechaDeDiligenciamiento = null;
		try {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse(FechaDeDiligenciamiento);
		} catch (Exception e) {
			dateFechaDeDiligenciamiento = new SimpleDateFormat("dd/MM/yyyy hh:mm a").parse(FechaDeDiligenciamiento);
		}
		java.util.Date dateFechaDeModificacion =null;
		try {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
					.parse(FechaDeModificacion);
		} catch (Exception e) {
			dateFechaDeModificacion = new SimpleDateFormat("dd/MM/yyyy hh:mm a")
					.parse(FechaDeModificacion);
		}
		
		Cargo cargo2 = new Cargo(Area, Cargo, CargoEvaluar, ElementosDeProteccion, Empresa, JornadaDeTrabajo, unidad, Integer.parseInt(Antiguedad), 
				Integer.parseInt(CargoTiempo), Integer.parseInt(fk_IDT_DocumentoID), fk_NIT, Integer.parseInt(HorasTrabajadas), 
				dateFechaIngreso, dateFechaRetiro, dateFechaDeDiligenciamiento, dateFechaDeModificacion);
		CargoDao cargoDao = new CargoDao();
		boolean result = cargoDao.insertCargo(cargo2);
		return result;
	}
	
	public boolean generarJsonSintomas(JSONObject jsonSintoma, int IDHV) throws ParseException{
		
		int fk_IDT_DocumentoID = IDHV;
		String visionBorrosaLejana = jsonSintoma.getString("visionBorrosaLejana");
		String visionBorrosaCercana = jsonSintoma.getString("visionBorrosaCercana");
		String fotofobia = jsonSintoma.getString("fotofobia");
		String dolorOcular = jsonSintoma.getString("dolorOcular");
		String VisionDoble = jsonSintoma.getString("VisionDoble");
		String cefalea = jsonSintoma.getString("cefalea");
		String saltoRenglon = jsonSintoma.getString("saltoRenglon");
		String epifora = jsonSintoma.getString("epifora");
		String enrojecimiento = jsonSintoma.getString("enrojecimiento");
		String suenioAlLeer = jsonSintoma.getString("suenioAlLeer");
		String ardor = jsonSintoma.getString("ardor");
		String noRefiere = jsonSintoma.getString("noRefiere");
		
		Sintoma sintoma = new Sintoma(fk_IDT_DocumentoID, visionBorrosaLejana, visionBorrosaCercana, fotofobia, dolorOcular, VisionDoble, cefalea, 
				saltoRenglon, epifora, enrojecimiento, suenioAlLeer, ardor, noRefiere);
		SintomaDao dao = new SintomaDao();
		boolean result = dao.insertSintomas(sintoma);
		return result;
	}
	
	public boolean generarJsonAgudezaVisual(JSONObject jsonAgudezaV, int IDHV)throws ParseException{
		
		int fk_IDT_DocumentoID = IDHV;
		String visionProfundidadEscribir = jsonAgudezaV.getString("visionProfundidadEscribir");
		String visionProfundidad = jsonAgudezaV.getString("visionProfundidad");
		String visionColorEscribir = jsonAgudezaV.getString("visionColorEscribir");
		String visionColor = jsonAgudezaV.getString("visionColor");
		String segmentoAnteriorEscribir = jsonAgudezaV.getString("segmentoAnteriorEscribir");
		String segmentoAnterior = jsonAgudezaV.getString("segmentoAnterior");
		String motilidadOcularEscribir = jsonAgudezaV.getString("motilidadOcularEscribir");
		String motilidadOcular = jsonAgudezaV.getString("motilidadOcular");
		String lS_OIObservacion = jsonAgudezaV.getString("lS_OIObservacion");
		String lS_OI20 = jsonAgudezaV.getString("lS_OI20");
		String lS_ODObservacion = jsonAgudezaV.getString("lS_ODObservacion");
		String lS_OD20 = jsonAgudezaV.getString("lS_OD20");
		String lS_BObservacion = jsonAgudezaV.getString("lS_BObservacion");
		String lS_Binocular20 = jsonAgudezaV.getString("lS_Binocular20");
		String lC_OIObservacion = jsonAgudezaV.getString("lC_OIObservacion");
		String lC_OI20 = jsonAgudezaV.getString("lC_OI20");
		String lC_ODObservacion = jsonAgudezaV.getString("lC_ODObservacion");
		String lC_OD20 = jsonAgudezaV.getString("lC_OD20");
		String lC_BObservacion = jsonAgudezaV.getString("lC_BObservacion");
		String lC_Binocular20 = jsonAgudezaV.getString("lC_Binocular20");
		String cS_OIObservacion = jsonAgudezaV.getString("cS_OIObservacion");
		String cS_OI20 = jsonAgudezaV.getString("cS_OI20");
		String cS_ODObservacion = jsonAgudezaV.getString("cS_ODObservacion");
		String cS_OD20 = jsonAgudezaV.getString("cS_OD20");
		String cS_BObservacion = jsonAgudezaV.getString("cS_BObservacion");
		String cS_Binocular20 = jsonAgudezaV.getString("cS_Binocular20");
		String cC_OIObservacion = jsonAgudezaV.getString("cC_OIObservacion");
		String cC_OI20 = jsonAgudezaV.getString("cC_OI20");
		String cC_ODObservacion = jsonAgudezaV.getString("cC_ODObservacion");
		String cC_OD20 = jsonAgudezaV.getString("cC_OD20");
		String cC_BObservacion = jsonAgudezaV.getString("cC_BObservacion");
		String cC_Binocular20 = jsonAgudezaV.getString("cC_Binocular20");
		String campoVisualEscribir = jsonAgudezaV.getString("campoVisualEscribir");
		String campoVisual = jsonAgudezaV.getString("campoVisual");
		
		AgudezaVisual agudezaVisual = new AgudezaVisual(fk_IDT_DocumentoID, visionProfundidadEscribir, visionProfundidad, visionColorEscribir, 
				visionColor, segmentoAnteriorEscribir, segmentoAnterior, motilidadOcularEscribir, motilidadOcular, lS_OIObservacion, lS_OI20, 
				lS_ODObservacion, lS_OD20, lS_BObservacion, lS_Binocular20, lC_OIObservacion, lC_OI20, lC_ODObservacion, lC_OD20, lC_BObservacion, 
				lC_Binocular20, cS_OIObservacion, cS_OI20, cS_ODObservacion, cS_OD20, cS_BObservacion, cS_Binocular20, cC_OIObservacion, cC_OI20, 
				cC_ODObservacion, cC_OD20, cC_BObservacion, cC_Binocular20, campoVisualEscribir, campoVisual);
		AgudezaVisualDao agudezaVisualDao = new AgudezaVisualDao();
		boolean result = agudezaVisualDao.insertarAgudezaVisual(agudezaVisual);
		return result;
	}
	
	public boolean generarJsonRiesgoCE(JSONObject jsonRiesgoCE, int IDHV) throws ParseException{
		
		int fk_IDT_DocumentoID = IDHV;
		String trauma = jsonRiesgoCE.getString("trauma");
		String eXPOSICIONMATERIALPARTICULADO = jsonRiesgoCE.getString("eXPOSICIONMATERIALPARTICULADO");
		String eXPOSICIONMATERIALENPROYECCION = jsonRiesgoCE.getString("eXPOSICIONMATERIALENPROYECCION");
		String iLUMINACION = jsonRiesgoCE.getString("iLUMINACION");
		String eXPOSICIONAVIDEOTERMINALES = jsonRiesgoCE.getString("eXPOSICIONAVIDEOTERMINALES");
		String eXPOSICIONQUIMICOSYOSOLVENTES = jsonRiesgoCE.getString("eXPOSICIONQUIMICOSYOSOLVENTES");
		String eXPOSICIONAGASESVAPORES = jsonRiesgoCE.getString("eXPOSICIONAGASESVAPORES");
		String rADIACIONESIONIZANTES = jsonRiesgoCE.getString("rADIACIONESIONIZANTES");
		String rADIACIONESNOIONIZANTES = jsonRiesgoCE.getString("rADIACIONESNOIONIZANTES");
		String oTROS = jsonRiesgoCE.getString("oTROS");
		
		RiesgoCargoEvaluar riesgoCargoEvaluar = new RiesgoCargoEvaluar(fk_IDT_DocumentoID, trauma, eXPOSICIONMATERIALPARTICULADO, eXPOSICIONMATERIALENPROYECCION, 
				iLUMINACION, eXPOSICIONAVIDEOTERMINALES, eXPOSICIONQUIMICOSYOSOLVENTES, eXPOSICIONAGASESVAPORES, rADIACIONESIONIZANTES, 
				rADIACIONESNOIONIZANTES, oTROS);
		RiesgoCargoEvaluarDao cargoEvaluarDao = new RiesgoCargoEvaluarDao();
		boolean result = cargoEvaluarDao.insertRiesgoCargoEvaluar(riesgoCargoEvaluar);
		return result;
	}
}
