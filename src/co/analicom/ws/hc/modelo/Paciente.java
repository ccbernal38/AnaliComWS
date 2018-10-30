package co.analicom.ws.hc.modelo;

import java.util.Date;

import com.mysql.jdbc.Blob;

public class Paciente {
	
	private String documento;
	private String tipodocumento;
	private String IDT_Nombres, IDT_Apellidos, IDT_sexo, IDT_fechaNacimiento, 
				IDT_LugarNacimiento, IDT_DireccionDomicilio, IDT_DomicilioCiudad, 
				IDT_CorreoElectronico, IDT_Escolaridad, IDT_EPS, IDT_ARL, IDT_AFP,
				IDT_AvisoEmergenciaNombres, IDT_AvisoEmergenciaApellidos, IDT_AvisoEmergenciaParentesco, 
				GrupoSanguineo, RH, cargo, antiguedad;
	
	private int IDT_telefonoDomicilio, IDT_TelefonoCelular, IDT_AvisoEmergenciaTelefono, 
	IDT_AvisoEmergenciaTelefonoCelular;
	
	private Blob foto, firma;
	
	private Date fechaDeDiligenciamiento, fechaDeModificacion;

	
	/**
	 * @param documento
	 * @param tipodocumento
	 * @param iDT_Nombres
	 * @param iDT_Apellidos
	 * @param iDT_sexo
	 * @param iDT_fechaNacimiento
	 * @param iDT_LugarNacimiento
	 * @param iDT_DireccionDomicilio
	 * @param iDT_DomicilioCiudad
	 * @param iDT_CorreoElectronico
	 * @param iDT_Escolaridad
	 * @param iDT_EPS
	 * @param iDT_ARL
	 * @param iDT_AFP
	 * @param iDT_AvisoEmergenciaNombres
	 * @param iDT_AvisoEmergenciaApellidos
	 * @param iDT_AvisoEmergenciaParentesco
	 * @param grupoSanguineo
	 * @param rH
	 * @param cargo
	 * @param antiguedad
	 * @param iDT_telefonoDomicilio
	 * @param iDT_TelefonoCelular
	 * @param iDT_AvisoEmergenciaTelefono
	 * @param iDT_AvisoEmergenciaTelefonoCelular
	 * @param foto
	 * @param firma
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public Paciente(String documento, String tipodocumento, String iDT_Nombres, String iDT_Apellidos, String iDT_sexo,
			String iDT_fechaNacimiento, String iDT_LugarNacimiento, String iDT_DireccionDomicilio,
			String iDT_DomicilioCiudad, String iDT_CorreoElectronico, String iDT_Escolaridad, String iDT_EPS,
			String iDT_ARL, String iDT_AFP, String iDT_AvisoEmergenciaNombres, String iDT_AvisoEmergenciaApellidos,
			String iDT_AvisoEmergenciaParentesco, String grupoSanguineo, String rH, String cargo, String antiguedad,
			int iDT_telefonoDomicilio, int iDT_TelefonoCelular, int iDT_AvisoEmergenciaTelefono,
			int iDT_AvisoEmergenciaTelefonoCelular, Blob foto, Blob firma, Date fechaDeDiligenciamiento,
			Date fechaDeModificacion) {
		super();
		this.documento = documento;
		this.tipodocumento = tipodocumento;
		IDT_Nombres = iDT_Nombres;
		IDT_Apellidos = iDT_Apellidos;
		IDT_sexo = iDT_sexo;
		IDT_fechaNacimiento = iDT_fechaNacimiento;
		IDT_LugarNacimiento = iDT_LugarNacimiento;
		IDT_DireccionDomicilio = iDT_DireccionDomicilio;
		IDT_DomicilioCiudad = iDT_DomicilioCiudad;
		IDT_CorreoElectronico = iDT_CorreoElectronico;
		IDT_Escolaridad = iDT_Escolaridad;
		IDT_EPS = iDT_EPS;
		IDT_ARL = iDT_ARL;
		IDT_AFP = iDT_AFP;
		IDT_AvisoEmergenciaNombres = iDT_AvisoEmergenciaNombres;
		IDT_AvisoEmergenciaApellidos = iDT_AvisoEmergenciaApellidos;
		IDT_AvisoEmergenciaParentesco = iDT_AvisoEmergenciaParentesco;
		GrupoSanguineo = grupoSanguineo;
		RH = rH;
		this.cargo = cargo;
		this.antiguedad = antiguedad;
		IDT_telefonoDomicilio = iDT_telefonoDomicilio;
		IDT_TelefonoCelular = iDT_TelefonoCelular;
		IDT_AvisoEmergenciaTelefono = iDT_AvisoEmergenciaTelefono;
		IDT_AvisoEmergenciaTelefonoCelular = iDT_AvisoEmergenciaTelefonoCelular;
		this.foto = foto;
		this.firma = firma;
		this.fechaDeDiligenciamiento = fechaDeDiligenciamiento;
		this.fechaDeModificacion = fechaDeModificacion;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipodocumento() {
		return tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public String getIDT_Nombres() {
		return IDT_Nombres;
	}

	public void setIDT_Nombres(String iDT_Nombres) {
		IDT_Nombres = iDT_Nombres;
	}

	public String getIDT_Apellidos() {
		return IDT_Apellidos;
	}

	public void setIDT_Apellidos(String iDT_Apellidos) {
		IDT_Apellidos = iDT_Apellidos;
	}

	public String getIDT_sexo() {
		return IDT_sexo;
	}

	public void setIDT_sexo(String iDT_sexo) {
		IDT_sexo = iDT_sexo;
	}

	public String getIDT_fechaNacimiento() {
		return IDT_fechaNacimiento;
	}

	public void setIDT_fechaNacimiento(String iDT_fechaNacimiento) {
		IDT_fechaNacimiento = iDT_fechaNacimiento;
	}

	public String getIDT_LugarNacimiento() {
		return IDT_LugarNacimiento;
	}

	public void setIDT_LugarNacimiento(String iDT_LugarNacimiento) {
		IDT_LugarNacimiento = iDT_LugarNacimiento;
	}

	public String getIDT_DireccionDomicilio() {
		return IDT_DireccionDomicilio;
	}

	public void setIDT_DireccionDomicilio(String iDT_DireccionDomicilio) {
		IDT_DireccionDomicilio = iDT_DireccionDomicilio;
	}

	public String getIDT_DomicilioCiudad() {
		return IDT_DomicilioCiudad;
	}

	public void setIDT_DomicilioCiudad(String iDT_DomicilioCiudad) {
		IDT_DomicilioCiudad = iDT_DomicilioCiudad;
	}

	public String getIDT_CorreoElectronico() {
		return IDT_CorreoElectronico;
	}

	public void setIDT_CorreoElectronico(String iDT_CorreoElectronico) {
		IDT_CorreoElectronico = iDT_CorreoElectronico;
	}

	public String getIDT_Escolaridad() {
		return IDT_Escolaridad;
	}

	public void setIDT_Escolaridad(String iDT_Escolaridad) {
		IDT_Escolaridad = iDT_Escolaridad;
	}

	public String getIDT_EPS() {
		return IDT_EPS;
	}

	public void setIDT_EPS(String iDT_EPS) {
		IDT_EPS = iDT_EPS;
	}

	public String getIDT_ARL() {
		return IDT_ARL;
	}

	public void setIDT_ARL(String iDT_ARL) {
		IDT_ARL = iDT_ARL;
	}

	public String getIDT_AFP() {
		return IDT_AFP;
	}

	public void setIDT_AFP(String iDT_AFP) {
		IDT_AFP = iDT_AFP;
	}

	public String getIDT_AvisoEmergenciaNombres() {
		return IDT_AvisoEmergenciaNombres;
	}

	public void setIDT_AvisoEmergenciaNombres(String iDT_AvisoEmergenciaNombres) {
		IDT_AvisoEmergenciaNombres = iDT_AvisoEmergenciaNombres;
	}

	public String getIDT_AvisoEmergenciaApellidos() {
		return IDT_AvisoEmergenciaApellidos;
	}

	public void setIDT_AvisoEmergenciaApellidos(String iDT_AvisoEmergenciaApellidos) {
		IDT_AvisoEmergenciaApellidos = iDT_AvisoEmergenciaApellidos;
	}

	public String getIDT_AvisoEmergenciaParentesco() {
		return IDT_AvisoEmergenciaParentesco;
	}

	public void setIDT_AvisoEmergenciaParentesco(String iDT_AvisoEmergenciaParentesco) {
		IDT_AvisoEmergenciaParentesco = iDT_AvisoEmergenciaParentesco;
	}

	public String getGrupoSanguineo() {
		return GrupoSanguineo;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		GrupoSanguineo = grupoSanguineo;
	}

	public String getRH() {
		return RH;
	}

	public void setRH(String rH) {
		RH = rH;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getIDT_telefonoDomicilio() {
		return IDT_telefonoDomicilio;
	}

	public void setIDT_telefonoDomicilio(int iDT_telefonoDomicilio) {
		IDT_telefonoDomicilio = iDT_telefonoDomicilio;
	}

	public int getIDT_TelefonoCelular() {
		return IDT_TelefonoCelular;
	}

	public void setIDT_TelefonoCelular(int iDT_TelefonoCelular) {
		IDT_TelefonoCelular = iDT_TelefonoCelular;
	}

	public int getIDT_AvisoEmergenciaTelefono() {
		return IDT_AvisoEmergenciaTelefono;
	}

	public void setIDT_AvisoEmergenciaTelefono(int iDT_AvisoEmergenciaTelefono) {
		IDT_AvisoEmergenciaTelefono = iDT_AvisoEmergenciaTelefono;
	}

	public int getIDT_AvisoEmergenciaTelefonoCelular() {
		return IDT_AvisoEmergenciaTelefonoCelular;
	}

	public void setIDT_AvisoEmergenciaTelefonoCelular(int iDT_AvisoEmergenciaTelefonoCelular) {
		IDT_AvisoEmergenciaTelefonoCelular = iDT_AvisoEmergenciaTelefonoCelular;
	}

	public Blob getFoto() {
		return foto;
	}

	public void setFoto(Blob foto) {
		this.foto = foto;
	}

	public Blob getFirma() {
		return firma;
	}

	public void setFirma(Blob firma) {
		this.firma = firma;
	}

	public Date getFechaDeDiligenciamiento() {
		return fechaDeDiligenciamiento;
	}

	public void setFechaDeDiligenciamiento(Date fechaDeDiligenciamiento) {
		this.fechaDeDiligenciamiento = fechaDeDiligenciamiento;
	}

	public Date getFechaDeModificacion() {
		return fechaDeModificacion;
	}

	public void setFechaDeModificacion(Date fechaDeModificacion) {
		this.fechaDeModificacion = fechaDeModificacion;
	}
	
	
	
}
