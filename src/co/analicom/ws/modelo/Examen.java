package co.analicom.ws.modelo;

import java.util.List;

public class Examen {

	private int id;
	private String sigla;
	private String descripcion, dias_proceso, sinonimo, tipoMuestra, instrucciones, tiempo_proceso, hora_toma, tecnica,
			significado, significado_clinico, preparacion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		if (descripcion == null)
			descripcion = "";
		this.descripcion = descripcion;
	}

	public String getDias_proceso() {
		return dias_proceso;
	}

	public void setDias_proceso(String dias_proceso) {

		if (dias_proceso == null)
			dias_proceso = "";
		this.dias_proceso = dias_proceso;

	}

	public String getSinonimo() {
		return sinonimo;
	}

	public void setSinonimo(String sinonimo) {
		if (sinonimo == null)
			sinonimo = "";
		this.sinonimo = sinonimo;
	}

	public String getTipoMuestra() {
		return tipoMuestra;
	}

	public void setTipoMuestra(String tipoMuestra) {
		if (tipoMuestra == null)
			tipoMuestra = "";
		this.tipoMuestra = tipoMuestra;
	}

	public String getInstrucciones() {
		return instrucciones;
	}

	public void setInstrucciones(String instrucciones) {
		if (instrucciones == null)
			instrucciones = "";
		this.instrucciones = instrucciones;
	}

	public String getTiempo_proceso() {
		return tiempo_proceso;
	}

	public void setTiempo_proceso(String tiempo_proceso) {
		if (tiempo_proceso == null)
			tiempo_proceso = "";
		this.tiempo_proceso = tiempo_proceso;
	}

	public String getHora_toma() {
		return hora_toma;
	}

	public void setHora_toma(String hora_toma) {
		if (hora_toma == null)
			hora_toma = "";
		this.hora_toma = hora_toma;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		if (tecnica == null)
			tecnica = "";
		this.tecnica = tecnica;
	}

	public String getSignificado() {
		return significado;
	}

	public void setSignificado(String significado) {
		if (significado == null)
			significado = "";
		this.significado = significado;
	}

	public String getSignificado_clinico() {
		return significado_clinico;
	}

	public void setSignificado_clinico(String significado_clinico) {
		if (significado_clinico == null)
			significado_clinico = "";
		this.significado_clinico = significado_clinico;
	}

	private int recordId;
	private List<String> sufijo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNombre() {
		return descripcion;
	}

	public void setNombre(String nombre) {
		this.descripcion = nombre;
	}

	

	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public List<String> getSufijo() {
		return sufijo;
	}

	public void setSufijo(List<String> sufijo) {
		this.sufijo = sufijo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sigla + " - " + descripcion;
	}

	public String getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(String preparacion) {
		this.preparacion = preparacion;
	}

}
