package co.analicom.ws.hc.modelo;

import java.util.Date;

public class Cargo {
	
	private String Area, Cargo, CargoEvaluar,  ElementosDeProteccion, Empresa, JornadaDeTrabajo, unidad;
	private int Antiguedad, CargoTiempo, fk_IDT_DocumentoID, fk_NIT, HorasTrabajadas;
	private Date FechaIngreso, FechaRetiro, FechaDeDiligenciamiento, FechaDeModificacion;
	
	/**
	 * @param area
	 * @param cargo
	 * @param cargoEvaluar
	 * @param elementosDeProteccion
	 * @param empresa
	 * @param jornadaDeTrabajo
	 * @param unidad
	 * @param antiguedad
	 * @param cargoTiempo
	 * @param fk_IDT_DocumentoID
	 * @param fk_NIT
	 * @param horasTrabajadas
	 * @param fechaIngreso
	 * @param fechaRetiro
	 * @param fechaDeDiligenciamiento
	 * @param fechaDeModificacion
	 */
	public Cargo(String area, String cargo, String cargoEvaluar, String elementosDeProteccion, String empresa,
			String jornadaDeTrabajo, String unidad, int antiguedad, int cargoTiempo, int fk_IDT_DocumentoID, int fk_NIT,
			int horasTrabajadas, Date fechaIngreso, Date fechaRetiro, Date fechaDeDiligenciamiento,
			Date fechaDeModificacion) {
		super();
		Area = area;
		Cargo = cargo;
		CargoEvaluar = cargoEvaluar;
		ElementosDeProteccion = elementosDeProteccion;
		Empresa = empresa;
		JornadaDeTrabajo = jornadaDeTrabajo;
		this.unidad = unidad;
		Antiguedad = antiguedad;
		CargoTiempo = cargoTiempo;
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
		this.fk_NIT = fk_NIT;
		HorasTrabajadas = horasTrabajadas;
		FechaIngreso = fechaIngreso;
		FechaRetiro = fechaRetiro;
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
		FechaDeModificacion = fechaDeModificacion;
	}

	
	public Cargo() {
		// TODO Auto-generated constructor stub
	}


	public String getArea() {
		return Area;
	}


	public void setArea(String area) {
		Area = area;
	}


	public String getCargo() {
		return Cargo;
	}


	public void setCargo(String cargo) {
		Cargo = cargo;
	}


	public String getCargoEvaluar() {
		return CargoEvaluar;
	}


	public void setCargoEvaluar(String cargoEvaluar) {
		CargoEvaluar = cargoEvaluar;
	}


	public String getElementosDeProteccion() {
		return ElementosDeProteccion;
	}


	public void setElementosDeProteccion(String elementosDeProteccion) {
		ElementosDeProteccion = elementosDeProteccion;
	}


	public String getEmpresa() {
		return Empresa;
	}


	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}


	public String getJornadaDeTrabajo() {
		return JornadaDeTrabajo;
	}


	public void setJornadaDeTrabajo(String jornadaDeTrabajo) {
		JornadaDeTrabajo = jornadaDeTrabajo;
	}


	public String getUnidad() {
		return unidad;
	}


	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}


	public int getAntiguedad() {
		return Antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		Antiguedad = antiguedad;
	}


	public int getCargoTiempo() {
		return CargoTiempo;
	}


	public void setCargoTiempo(int cargoTiempo) {
		CargoTiempo = cargoTiempo;
	}


	public int getFk_IDT_DocumentoID() {
		return fk_IDT_DocumentoID;
	}


	public void setFk_IDT_DocumentoID(int fk_IDT_DocumentoID) {
		this.fk_IDT_DocumentoID = fk_IDT_DocumentoID;
	}


	public int getFk_NIT() {
		return fk_NIT;
	}


	public void setFk_NIT(int fk_NIT) {
		this.fk_NIT = fk_NIT;
	}


	public int getHorasTrabajadas() {
		return HorasTrabajadas;
	}


	public void setHorasTrabajadas(int horasTrabajadas) {
		HorasTrabajadas = horasTrabajadas;
	}


	public Date getFechaIngreso() {
		return FechaIngreso;
	}


	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}


	public Date getFechaRetiro() {
		return FechaRetiro;
	}


	public void setFechaRetiro(Date fechaRetiro) {
		FechaRetiro = fechaRetiro;
	}


	public Date getFechaDeDiligenciamiento() {
		return FechaDeDiligenciamiento;
	}


	public void setFechaDeDiligenciamiento(Date fechaDeDiligenciamiento) {
		FechaDeDiligenciamiento = fechaDeDiligenciamiento;
	}


	public Date getFechaDeModificacion() {
		return FechaDeModificacion;
	}


	public void setFechaDeModificacion(Date fechaDeModificacion) {
		FechaDeModificacion = fechaDeModificacion;
	}
	
	
	

}
