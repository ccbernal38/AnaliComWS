/**
 * 
 */
package co.analicom.ws.hc.dao.interfacedao;

import co.analicom.ws.hc.modelo.HistoriaAudiometria;

/**
 * @author Cristian Cruz
 */
public interface HistoriaAudiometriaDaoInterface {
	
	public boolean insertHistoriaAudiometria(HistoriaAudiometria historiaAudiometria);

	public int obtenerID();
}
