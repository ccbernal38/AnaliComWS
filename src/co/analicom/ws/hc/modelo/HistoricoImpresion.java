/**
 * 
 */
package co.analicom.ws.hc.modelo;

import java.sql.Date;

/**
 * @author Cristian Cruz
 */
public class HistoricoImpresion {
	
	private String usuario;
	private int historia_id;
	private Date fecha;
	
	/**
	 * @param usuario
	 * @param historia_id
	 * @param fecha
	 */
	public HistoricoImpresion(String usuario, int historia_id, Date fecha) {
		super();
		this.usuario = usuario;
		this.historia_id = historia_id;
		this.fecha = fecha;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @return the historia_id
	 */
	public int getHistoria_id() {
		return historia_id;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
}
