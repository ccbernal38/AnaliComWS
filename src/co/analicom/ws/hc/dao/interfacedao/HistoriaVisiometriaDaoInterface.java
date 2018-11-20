/**
 * 
 */
package co.analicom.ws.hc.dao.interfacedao;

import co.analicom.ws.hc.modelo.HistoriaVisiometria;

/**
 * @author Christian Bernal
 */
public interface HistoriaVisiometriaDaoInterface {
	
	public boolean insertarHistoriaVisiometria(HistoriaVisiometria historiaVisiometria);
	public boolean verificarHistoriaVisioExiste(String fecha, String documento);
	int obtenerID();

}
