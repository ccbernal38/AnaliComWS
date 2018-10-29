package co.analicom.ws.modelo.hc;

/**
 * 
 * @author Christian Bernal
 */
public class Audiograma {

	private int _fk_DocumentoFrecuencia, _fk_DocumentosHA, oidoDerecho, oidoIzquierdo;

	public Audiograma() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param _fk_DocumentoFrecuencia
	 * @param _fk_DocumentosHA
	 * @param oidoDerecho
	 * @param oidoIzquierdo
	 */
	public Audiograma(int _fk_DocumentoFrecuencia, int _fk_DocumentosHA, int oidoDerecho, int oidoIzquierdo) {
		super();
		this._fk_DocumentoFrecuencia = _fk_DocumentoFrecuencia;
		this._fk_DocumentosHA = _fk_DocumentosHA;
		this.oidoDerecho = oidoDerecho;
		this.oidoIzquierdo = oidoIzquierdo;
	}

	/**
	 * @return the _fk_DocumentoFrecuencia
	 */
	public int get_fk_DocumentoFrecuencia() {
		return _fk_DocumentoFrecuencia;
	}

	/**
	 * @param _fk_DocumentoFrecuencia
	 *            the _fk_DocumentoFrecuencia to set
	 */
	public void set_fk_DocumentoFrecuencia(int _fk_DocumentoFrecuencia) {
		this._fk_DocumentoFrecuencia = _fk_DocumentoFrecuencia;
	}

	/**
	 * @return the _fk_DocumentosHA
	 */
	public int get_fk_DocumentosHA() {
		return _fk_DocumentosHA;
	}

	/**
	 * @param _fk_DocumentosHA
	 *            the _fk_DocumentosHA to set
	 */
	public void set_fk_DocumentosHA(int _fk_DocumentosHA) {
		this._fk_DocumentosHA = _fk_DocumentosHA;
	}

	/**
	 * @return the oidoDerecho
	 */
	public int getOidoDerecho() {
		return oidoDerecho;
	}

	/**
	 * @param oidoDerecho
	 *            the oidoDerecho to set
	 */
	public void setOidoDerecho(int oidoDerecho) {
		this.oidoDerecho = oidoDerecho;
	}

	/**
	 * @return the oidoIzquierdo
	 */
	public int getOidoIzquierdo() {
		return oidoIzquierdo;
	}

	/**
	 * @param oidoIzquierdo
	 *            the oidoIzquierdo to set
	 */
	public void setOidoIzquierdo(int oidoIzquierdo) {
		this.oidoIzquierdo = oidoIzquierdo;
	}

}
