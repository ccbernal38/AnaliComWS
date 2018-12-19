/**
 * 
 */
package co.analicom.ws.hc.dao.interfacedao;

import co.analicom.ws.hc.modelo.HistoriaOptometria;

/**
 * @author Cristian Cruz
 */
public interface HistoriaOptometriaDaoInterface {

	public boolean insertHistoriaOptometria(HistoriaOptometria historiaOptometria);

	public int obtenerID();

}
