/**
 * 
 */
package co.analicom.ws.hc.dao.interfacedao;

import co.analicom.ws.hc.modelo.Otoscopia;

/**
 * @author Cristian Cruz
 */
public interface OtoscopiaDaoInterface {
	
	public boolean insertOtoscopia(Otoscopia otoscopia);

	public int obtenerID();
}
