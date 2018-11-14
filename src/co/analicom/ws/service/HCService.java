package co.analicom.ws.service;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

import co.analicom.ws.hc.dao.implementsdao.PacienteDao;
import co.analicom.ws.hc.modelo.Paciente;
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
}
